import Environment.Environment;
import Environment.Symbol;
import Environment.Symbol.SymbolType;
import Gramatica.GramaticasBaseVisitor;
import Gramatica.GramaticasParser;
import Environment.Error;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Stack;
import java.util.ArrayList;

public class Visitor extends GramaticasBaseVisitor<Object> {
    Stack<Environment> Entry_stack;
    boolean is3d;
    Environment global;
    ArrayList<Error> errors = new ArrayList<Error>();
    Translator c3d = new Translator();
    ArrayList<String> output = new ArrayList<String>();


    public Visitor(Environment env, Stack<Environment> Entry_stack, boolean is3d){
        this.Entry_stack = Entry_stack;
        this.Entry_stack.push(env);
        this.is3d = is3d;
        this.global = env;
    }

    @Override
    public Object visitInit(GramaticasParser.InitContext ctx){
        return visitList_instructions(ctx.list_instructions());
    }

    @Override
    public Object visitList_instructions(GramaticasParser.List_instructionsContext ctx){
        for (GramaticasParser.InstructionsContext contextI: ctx.instructions()){
            visitInstructions(contextI);
        }
        return true;
    }

    @Override
    public Object visitInstructions(GramaticasParser.InstructionsContext ctx){
        if (ctx.subroutine() != null){
            visitSubroutine(ctx.subroutine());
        }else if (ctx.declaration() != null){
            visit(ctx.declaration());
        }else if (ctx.imprimir() != null){
            visitImprimir(ctx.imprimir());
        }else if (ctx.asignacion() != null){
            visit(ctx.asignacion());
        }else if (ctx.program() != null){
            visitProgram(ctx.program());
        }else if (ctx.call() != null){
            visitCall(ctx.call());
        }else if(ctx.subroutine_sin_params()!=null){
            visitSubroutine_sin_params(ctx.subroutine_sin_params());
        }else if (ctx.function_sin_params()!= null){
            visitFunction_sin_params(ctx.function_sin_params());
        }else if (ctx.call_sin_params()!= null){
            visitCall_sin_params(ctx.call_sin_params());
        }else if(ctx.function() !=null){
            visitFunction(ctx.function());
        }else if (ctx.decla_array()!=null){
            visit(ctx.decla_array());
        }else if (ctx.asignacion_array()!=null){
            visit(ctx.asignacion_array());
        }else if(ctx.sentes_if()!=null){
            visit(ctx.sentes_if());
        }else if(ctx.sentes_do()!=null){
            visit(ctx.sentes_do());
        }else if (ctx.sentes_do_while()!=null){
            visitSentes_do_while(ctx.sentes_do_while());
        }
        return true;
    }

    @Override
    public String visitInstruct(GramaticasParser.InstructContext ctx){
        String command = "";
        if (ctx.imprimir() != null){
            visitImprimir(ctx.imprimir());
        }else if (ctx.declaration()!=null){
            visit(ctx.declaration());
        } else if (ctx.asignacion()!=null) {
            visit(ctx.asignacion());
        } else if (ctx.sentes_if()!=null) {
            command = (String) visit(ctx.sentes_if());
        } else if (ctx.sentes_do()!=null) {
            visit(ctx.sentes_do());
        } else if (ctx.call()!=null) {
            visitCall(ctx.call());
        }else if (ctx.sentes_do_while()!=null){
            visitSentes_do_while(ctx.sentes_do_while());
        }else if (ctx.control_cicle()!=null){
            visitControl_cicle(ctx.control_cicle());
        }else if (ctx.cycle_tag() != null){
            visitCycle_tag(ctx.cycle_tag());
        }else if (ctx.decla_array()!=null){
            visit(ctx.decla_array());
        }else if(ctx.asignacion_array()!=null){
            visit(ctx.asignacion_array());
        }else if(ctx.call_sin_params()!=null){
            visitCall_sin_params(ctx.call_sin_params());
        }else if (ctx.cc!=null) {
            if (ctx.cc.getText().equals("exit")){
                return "exit";
            } else if (ctx.cc.getText().equals("cycle")) {
                return "cycle";
            }
        }
        if (command==null)
            command="";
        return command;
    }

    @Override
    public String visitIntElse(GramaticasParser.IntElseContext ctx){
        String command = "";
        if (ctx.imprimir() != null){
            visitImprimir(ctx.imprimir());
        }else if (ctx.declaration()!=null){
            visit(ctx.declaration());
        } else if (ctx.asignacion()!=null) {
            visit(ctx.asignacion());
        } else if (ctx.sentes_if()!=null) {
            command = (String) visit(ctx.sentes_if());
        } else if (ctx.sentes_do()!=null) {
            visit(ctx.sentes_do());
        } else if (ctx.call()!=null) {
            visitCall(ctx.call());
        }else if (ctx.sentes_do_while()!=null){
            visitSentes_do_while(ctx.sentes_do_while());
        }else if (ctx.control_cicle()!=null){
            visitControl_cicle(ctx.control_cicle());
        }else if (ctx.cycle_tag() != null){
            visitCycle_tag(ctx.cycle_tag());
        }else if (ctx.decla_array()!=null){
            visit(ctx.decla_array());
        }else if(ctx.asignacion_array()!=null){
            visit(ctx.asignacion_array());
        }else if(ctx.call_sin_params()!=null){
            visitCall_sin_params(ctx.call_sin_params());
        }else if (ctx.cc!=null) {
            if (ctx.cc.getText().equals("exit")){
                return "exit";
            } else if (ctx.cc.getText().equals("cycle")) {
                return "cycle";
            }
        }
        if (command==null)
            command="";
        return command;
    }

    @Override
    public Object visitProgram(GramaticasParser.ProgramContext ctx){
        Environment program;
        if (!is3d) {
            program = new Environment(Entry_stack.peek());
            Entry_stack.peek().sig = program;
        }else{
            program = Entry_stack.peek().sig;
        }
        Entry_stack.push(program);
        if (is3d) c3d.Code3D.add("int main(){\n");
        visitList_instructions(ctx.list_instructions());
        if (is3d) c3d.Code3D.add("\n    return 0;\n}");
        return true;
    }

    //Subrutinas
    @Override
    public Object visitSubroutine(GramaticasParser.SubroutineContext ctx){
        if (!is3d) {
            if (ctx.idsub1.getText().equals(ctx.idsub2.getText())) {
                if (!Entry_stack.peek().SymbolTable.containsKey((ctx.idsub1.getText() + SymbolType.Subroutine.name().toUpperCase()))) {
                    ArrayList<Symbol> params_Sub = new ArrayList<Symbol>();
                    int cont = -1;
                    for (GramaticasParser.ExprContext exp : ctx.params().expr())
                        params_Sub.add(new Symbol(exp.getText(), "", null, SymbolType.Params, cont++));
                    Subroutine sbr = new Subroutine(ctx.idsub1.getText(), params_Sub, ctx.list_instructions(), ctx.paramsub());
                    Entry_stack.peek().newSymbol(ctx.idsub1.getText() + SymbolType.Subroutine.name(), new Symbol(ctx.idsub1.getText(), "Subrutina", sbr, SymbolType.Subroutine, Entry_stack.peek().last_position));
                    return true;
                }
            }
            errors.add(new Error(ctx.idsub1.getLine(), ctx.idsub1.getCharPositionInLine(), "Los identificadores son diferentes", Error.TypeError.Semantic));
        }else{
            Symbol Sc3d = Entry_stack.peek().find(ctx.idsub1.getText()+SymbolType.Subroutine.name().toUpperCase());
            if (Sc3d != null){
                Subroutine sub3d = (Subroutine)Sc3d.Symbol_value;
                c3d.Code3D.add("void "+sub3d.sub_name.toLowerCase()+"()\n{");
                Entry_stack.push(sub3d.environment_Subroutine);
                visitList_instructions((GramaticasParser.List_instructionsContext) sub3d.listInstruct);
                Entry_stack.pop();
                c3d.Code3D.add("return; \n}\n");
            }
        }
        return true;
    }

    @Override
    public Object visitSubroutine_sin_params(GramaticasParser.Subroutine_sin_paramsContext ctx){
        if (!is3d) {
            if (ctx.idsub1.getText().equals(ctx.idsub2.getText())) {
                if (!Entry_stack.peek().SymbolTable.containsKey((ctx.idsub1.getText() + SymbolType.Subroutine.name().toUpperCase()))) {
                    ArrayList<Symbol> params_Sub = new ArrayList<Symbol>();
                    //int cont = -1;
                    Subroutine sbr = new Subroutine(ctx.idsub1.getText(), params_Sub, ctx.list_instructions(), null);
                    Entry_stack.peek().newSymbol(ctx.idsub1.getText() + SymbolType.Subroutine.name(),
                            new Symbol(ctx.idsub1.getText(), "Subrutina", sbr, SymbolType.Subroutine,
                                    Entry_stack.peek().last_position));
                    return true;
                }
            }
            errors.add(new Error(ctx.idsub1.getLine(), ctx.idsub1.getCharPositionInLine(), "Los identificadores son diferentes", Error.TypeError.Semantic));
        }else{
            Symbol Scsp3d = Entry_stack.peek().find(ctx.idsub1.getText()+SymbolType.Subroutine.name().toUpperCase());
            if (Scsp3d != null){
                Subroutine sub3d = (Subroutine)Scsp3d.Symbol_value;
                c3d.Code3D.add("void "+sub3d.sub_name.toLowerCase()+"()\n{");
                Entry_stack.push(sub3d.environment_Subroutine);
                visitList_instructions((GramaticasParser.List_instructionsContext) sub3d.listInstruct);
                Entry_stack.pop();
                c3d.Code3D.add("return; \n}\n");
            }
        }
        return true;
    }

    @Override
    public Object visitFunction(GramaticasParser.FunctionContext ctx){
        if (!is3d){
            if (ctx.idfun1.getText().equals(ctx.idfun2.getText())){
                if (!Entry_stack.peek().SymbolTable.containsKey((ctx.idfun1.getText()+SymbolType.Subroutine.name().toUpperCase()))){
                    ArrayList<Symbol> params_function = new ArrayList<Symbol>();
                    Symbol response = null;
                    int position = -1;
                    if ((ctx.rest.getText().equals(ctx.res.getText())) && (ctx.rest.getText().equals(ctx.rest1.getText()))){
                        response = new Symbol(ctx.rest.getText().toUpperCase(), ctx.type().getText(), ctx.expr(), SymbolType.Return, position++);

                    }
                    for (GramaticasParser.ExprContext gpi: ctx.params().expr()){
                        params_function.add(new Symbol(gpi.getText(), "", null, SymbolType.Params, position++));
                    }
                    Function fun = new Function(ctx.idfun1.getText(), params_function, ctx.list_instructions(), ctx.paramsub(), response);
                    Entry_stack.peek().newSymbol(ctx.idfun1.getText()+SymbolType.Function.name().toUpperCase(),
                            new Symbol(ctx.idfun1.getText(), "Function", fun, SymbolType.Function,
                                    Entry_stack.peek().last_position));
                    return true;

                }
            }else{
                errors.add(new Error(ctx.idfun1.getLine(), ctx.idfun1.getCharPositionInLine(), "Los identificadores de la funcion no coinciden", Error.TypeError.Semantic));
            }
        }else{
            Symbol sim_function = Entry_stack.peek().find(ctx.idfun1.getText()+SymbolType.Function.name().toUpperCase());
            if (sim_function!=null){
                Function func3d = (Function)sim_function.Symbol_value;
                if (func3d.result_instruct.Symbol_type.equals("character")){
                    c3d.Code3D.add("char "+func3d.name_function.toLowerCase()+"()\n{");
                }else if (func3d.result_instruct.Symbol_type.equals("real")){
                    c3d.Code3D.add("float "+func3d.name_function.toLowerCase()+"()\n{");
                }else if (func3d.result_instruct.Symbol_type.equals("integer")){
                    c3d.Code3D.add("int "+func3d.name_function.toLowerCase()+"()\n{");
                }
                Entry_stack.push(func3d.environment_function);
                visitList_instructions((GramaticasParser.List_instructionsContext) func3d.list_instruction_function);
                Symbol response = (Symbol)visit(ctx.expr());
                Entry_stack.pop();
                c3d.Code3D.add(c3d.generate_temporal()+" = STACK[(int)P]");
                c3d.Code3D.add("return "+c3d.last_temporal()+";\n}\n");
            }
        }
        return true;
    }

    @Override
    public Object visitFunction_sin_params(GramaticasParser.Function_sin_paramsContext ctx){
        if (!is3d){
            if (ctx.idfun1.getText().equals(ctx.idfun2.getText())){
                if (!Entry_stack.peek().SymbolTable.containsKey((ctx.idfun1.getText()+SymbolType.Subroutine.name().toUpperCase()))){
                    ArrayList<Symbol> pa_fun = new ArrayList<Symbol>();
                    Symbol response = null;
                    int position = -1;
                    if ((ctx.rest.getText().equals(ctx.res.getText())) && (ctx.rest.getText().equals(ctx.rest1.getText()))){
                        response = new Symbol(ctx.rest.getText().toUpperCase(), ctx.type().getText(), ctx.expr(), SymbolType.Return, position++);

                    }
                    Function fun = new Function(ctx.idfun1.getText(), pa_fun, ctx.list_instructions(), null, response);
                    Entry_stack.peek().newSymbol(ctx.idfun1.getText()+SymbolType.Function.name().toUpperCase(),
                            new Symbol(ctx.idfun1.getText(), "Function", fun, SymbolType.Function, Entry_stack.peek().last_position));
                    return true;

                }
            }else{
                errors.add(new Error(ctx.idfun1.getLine(), ctx.idfun1.getCharPositionInLine(), "Los identificadores de la funcion no coinciden", Error.TypeError.Semantic));
            }
        }else{
            Symbol sfsp = Entry_stack.peek().find(ctx.idfun1.getText()+SymbolType.Function.name().toUpperCase());
            if (sfsp != null){
                Function fsp3 = (Function)sfsp.Symbol_value;
                if (fsp3.result_instruct.Symbol_type.equals("integer")){
                    c3d.Code3D.add("int "+fsp3.name_function.toLowerCase()+"()\n{");
                }else if (fsp3.result_instruct.Symbol_type.equals("real")){
                    c3d.Code3D.add("float "+fsp3.name_function.toLowerCase()+"()\n{");
                }else if (fsp3.result_instruct.Symbol_type.equals("character")){
                    c3d.Code3D.add("char "+fsp3.name_function.toLowerCase()+"()\n{");
                }
                Entry_stack.push(fsp3.environment_function);
                visitList_instructions((GramaticasParser.List_instructionsContext) fsp3.list_instruction_function);
                Symbol response = (Symbol)visit(ctx.expr());
                Entry_stack.pop();
                c3d.Code3D.add("return "+c3d.last_temporal()+";\n}\n");
            }
        }
        return true;
    }

    //Parametros
    @Override
    public Object visitParams(GramaticasParser.ParamsContext ctx){
        for (GramaticasParser.ExprContext param_expr: ctx.expr())
            visit(param_expr);
        return true;
    }

    //Print
    @Override
    public Object visitImprimir(GramaticasParser.ImprimirContext ctx){
        Windows vent = new Windows();
        String cad = "";
        if (!is3d) {
            for (GramaticasParser.ExprContext comment : ctx.expr()) {
                Symbol nuevo = (Symbol) visit(comment);
                if (nuevo != null) {
                    cad = cad + nuevo.Symbol_value;
                }
            }
            System.out.println(cad);
            output.add(cad+'\n');
        }else{
            Environment envi = Entry_stack.peek();
            for (GramaticasParser.ExprContext gpi: ctx.expr()){
                Symbol nuevo = (Symbol)visit(gpi);
                Symbol im3d = null;
                if (nuevo.Symbol_type.toUpperCase().equals("IDSTR") || nuevo.Symbol_type.toUpperCase().equals("IDFLOAT")){
                    im3d = envi.find(nuevo.Symbol_id+SymbolType.variable.name());
                }

                switch (nuevo.Symbol_type){
                    case "IDSTR":
                        if (im3d!=null){
                            c3d.Code3D.add(c3d.generate_temporal()+" = "+envi.getSize()+" + "+im3d.Symbol_position+";");
                            c3d.Code3D.add("P = "+c3d.last_temporal()+";");
                            c3d.Code3D.add("imprimir_variable();");
                        }
                        break;
                    case "IDFLOAT":
                        if (im3d!=null){
                            c3d.Code3D.add(c3d.generate_temporal()+" = "+envi.getSize()+" + "+im3d.Symbol_position+";");
                            c3d.Code3D.add("P = "+c3d.last_temporal()+";");
                            c3d.Code3D.add("imprimir_var_int();");
                        }
                        break;
                    case "FLOAT":
                        c3d.Code3D.add("printf(\"%f\\n\", "+nuevo.Symbol_value+");");
                        break;
                    case "STR":
                        c3d.Code3D.add("P = "+nuevo.Symbol_value+";");
                        c3d.Code3D.add("imprimir_string();");
                        break;
                }
            }
        }
        return true;
    }

    //Call
    @Override
    public Object visitCall(GramaticasParser.CallContext ctx){
        Environment envi = Entry_stack.peek();
        Symbol symbol_call = envi.find(ctx.ID().getText() + SymbolType.Subroutine.name());
        if (!is3d) {
            if (symbol_call == null)
                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "El identificador de la rutina " + ctx.ID().getText() + " no existe", Error.TypeError.Semantic));
            else {
                Environment sub = new Environment(envi);
                Subroutine subroutine = (Subroutine) symbol_call.Symbol_value;
                if (subroutine.sub_params.size() == ctx.e().expr().size() && subroutine.sub_params.size() == subroutine.declaration_params.getChildCount()) {
                    for (int i = 0; i < ctx.e().expr().size(); i++) {
                        subroutine.sub_params.get(i).Symbol_value = visit(ctx.e().expr().get(i));
                        subroutine.sub_params.get(i).Symbol_type = subroutine.declaration_params.g(i).type().getText();
                        sub.newSymbol(subroutine.sub_params.get(i).Symbol_id + SymbolType.variable.name(), subroutine.sub_params.get(i));
                    }
                    sub.last_position = subroutine.sub_params.size();
                    Entry_stack.push(sub);
                    visitList_instructions((GramaticasParser.List_instructionsContext) subroutine.listInstruct);
                    subroutine.environment_Subroutine = Entry_stack.peek();
                    Entry_stack.pop();
                } else
                    errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "Los parametros no coinciden", Error.TypeError.Semantic));
            }
        }else{
            if (symbol_call != null){
                Subroutine sbr = (Subroutine)symbol_call.Symbol_value;
                Environment enviCall = sbr.environment_Subroutine;
                if (sbr.sub_params.size() == ctx.e().expr().size() && sbr.sub_params.size() == sbr.declaration_params.getChildCount()){
                    for (int i =0; i<ctx.e().expr().size(); i++){
                        Symbol sc3d = (Symbol)visit(ctx.e().expr().get(i));
                        c3d.Code3D.add(c3d.generate_temporal()+" = "+enviCall.getSize()+" + "+sbr.sub_params.get(i).Symbol_position+";");
                        c3d.Code3D.add("P = "+c3d.last_temporal()+";");
                        c3d.Code3D.add("STACK[(int)P] = "+sc3d.Symbol_value+";");
                    }
                    c3d.Code3D.add(sbr.sub_name.toLowerCase()+"();");
                }
            }
        }
        return true;
    }

    @Override
    public Object visitCall_sin_params(GramaticasParser.Call_sin_paramsContext ctx){
        Environment envi = Entry_stack.peek();
        Symbol symbol_call = envi.find(ctx.ID().getText() + SymbolType.Subroutine.name());
        if (!is3d) {
            if (symbol_call == null)
                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "El identificador de la rutina " + ctx.ID().getText() + " no existe", Error.TypeError.Semantic));
            else {
                Environment sub = new Environment(envi);
                Subroutine subroutine = (Subroutine) symbol_call.Symbol_value;
                sub.last_position = subroutine.sub_params.size();
                Entry_stack.push(sub);
                visitList_instructions((GramaticasParser.List_instructionsContext) subroutine.listInstruct);
                subroutine.environment_Subroutine = Entry_stack.peek();
                Entry_stack.pop();
                }
        }else {
            if (symbol_call != null) {
                Subroutine sbr = (Subroutine) symbol_call.Symbol_value;
                c3d.Code3D.add(sbr.sub_name.toLowerCase() + "();");
            }
        }
        return true;
    }

    @Override
    public Object visitFconparams(GramaticasParser.FconparamsContext ctx){
        Environment envi = Entry_stack.peek();
        Symbol result = null;
        Symbol function_sim = envi.find(ctx.ID().getText()+SymbolType.Function.name());
        if (!is3d){
            if (function_sim == null){
                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "La funcion "+ctx.ID().getText()+" no existe", Error.TypeError.Semantic));
            }else{
                Environment env = new Environment(envi);
                Function function = (Function)function_sim.Symbol_value;
                if (function.param_function.size() == ctx.params().expr().size() && function.param_function.size() == function.instruct_params.getChildCount()){
                    for (int i = 0; i<ctx.params().expr().size(); i++){
                        function.param_function.get(i).Symbol_value = visit(ctx.params().expr().get(i));
                        function.param_function.get(i).Symbol_type = function.instruct_params.g(i).type().getText();
                        env.newSymbol(function.param_function.get(i).Symbol_id+SymbolType.variable.name(), function.param_function.get(i));
                    }
                    env.last_position = function.param_function.size();
                    Entry_stack.push(env);
                    visitList_instructions((GramaticasParser.List_instructionsContext) function.list_instruction_function);
                    function.environment_function = Entry_stack.peek();
                    Symbol retorno = function.result_instruct;
                    result = (Symbol)visit((ParseTree) retorno.Symbol_value);
                    env.newSymbol(retorno.Symbol_id+SymbolType.variable, result);
                    Entry_stack.pop();
                    return  result;
                }else{
                    errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "La cantidad de paramentros no es la misma", Error.TypeError.Semantic));
                }
            }
        }else{
            if (function_sim != null){
                Function f = (Function)function_sim.Symbol_value;
                Environment f3d = f.environment_function;
                if (f.param_function.size() == ctx.params().expr().size() && f.param_function.size() == f.instruct_params.getChildCount()){
                    for (int i =0; i <ctx.params().expr().size(); i++){
                        Symbol f3 = (Symbol)visit(ctx.params().expr().get(i));
                        c3d.Code3D.add(c3d.generate_temporal()+" = "+f3d.getSize()+" + "+f.param_function.get(i).Symbol_position+";");
                        c3d.Code3D.add("P = "+c3d.last_temporal()+";");
                        c3d.Code3D.add("STACK[(int)P] = "+f3.Symbol_value+";");
                    }
                    return new Symbol(SymbolType.C3D, f.name_function.toLowerCase()+"()", "");
                }
            }
        }
        return true;
    }

    @Override
    public Object visitFsinparams(GramaticasParser.FsinparamsContext ctx){
        Environment envi = Entry_stack.peek();
        Symbol result = null;
        Symbol function_sim = envi.find(ctx.ID().getText()+SymbolType.Function.name());
        if (!is3d){
            if (function_sim == null){
                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "La funcion "+ctx.ID().getText()+" no existe", Error.TypeError.Semantic));
            }else{
                Environment env = new Environment(envi);
                Function function = (Function)function_sim.Symbol_value;
                    env.last_position = function.param_function.size();
                    Entry_stack.push(env);
                    visitList_instructions((GramaticasParser.List_instructionsContext) function.list_instruction_function);
                    function.environment_function = Entry_stack.peek();
                    Symbol retorno = function.result_instruct;
                    result = (Symbol)visit((ParseTree) retorno.Symbol_value);
                    env.newSymbol(retorno.Symbol_id+SymbolType.variable, result);
                    Entry_stack.pop();
                    return  result;
                }
            }else{
            if (function_sim != null){
                Function f = (Function)function_sim.Symbol_value;
                return new Symbol(SymbolType.C3D, f.name_function.toLowerCase()+"()", "");
            }
        }
        return true;
    }

    //Asignacion de variables falta c3d
    @Override
    public Object visitNormalAsig(GramaticasParser.NormalAsigContext ctx){
        Environment envi = Entry_stack.peek();
        if (!is3d) {
            Symbol date = (Symbol) visit(ctx.expr());
            Symbol typo = envi.find(ctx.ID().getText() + SymbolType.variable.name());
            if (typo != null) {
                if (typo.Symbol_type.equals(date.Symbol_type)) {
                    envi.actualiseishon(ctx.ID().getText() + SymbolType.variable.name(), date);
                } else
                    errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "No coinciden los tipos", Error.TypeError.Semantic));
                return true;
            } else
                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "No se ha encontrado la variable", Error.TypeError.Semantic));
        }
        return false;
    }

    //Declaration type, type :: id = expr
    @Override
    public Object visitDeclaNorm(GramaticasParser.DeclaNormContext ctx){
        Environment ent = Entry_stack.peek();
        if (!this.is3d) {
            if (!ent.SymbolTable.containsKey(ctx.ID().getText().toLowerCase())) {
                Symbol data = (Symbol) visit(ctx.expr());
                String tipo = ctx.type().getText().toLowerCase();
                if (tipo.equals(data.Symbol_type)) {
                    Symbol nuevo = new Symbol(ctx.ID().getText(), ctx.type().getText(), data, SymbolType.variable, ent.last_position++);
                    ent.newSymbol(ctx.ID().getText() + SymbolType.variable.name(), nuevo);
                } else
                    errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(),
                            "El tipo no coincide con el valor", Error.TypeError.Semantic));
                return true;
            } else
                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "Esta variable ya existe", Error.TypeError.Semantic));
        }else{
            if (ent.SymbolTable.containsKey((ctx.ID().getText()+SymbolType.variable.name()).toUpperCase())){
                Symbol deSim = ent.SymbolTable.get((ctx.ID().getText()+SymbolType.variable.name()).toUpperCase());
                Symbol local = (Symbol)visit(ctx.expr());
                c3d.Code3D.add(c3d.generate_temporal()+" = "+ent.getSize()+ " + "+deSim.Symbol_position+";");
                c3d.Code3D.add("P = "+c3d.last_temporal() + ";");
                c3d.Code3D.add("STACK[(int)P] = "+local.Symbol_value+" ;");
            }
        }
        return false;
    }

    //Declaration type, type :: id
    @Override
    public Object visitDeclaNormSinVal(GramaticasParser.DeclaNormSinValContext ctx) {
        Environment ent = Entry_stack.peek();
        if (!is3d) {
            if (!ent.SymbolTable.containsKey(ctx.ID().getText().toUpperCase())) {
                String tipo = ctx.type().getText().toLowerCase();
                if (tipo.equals("integer")) {
                    Symbol nuevo = new Symbol(ctx.ID().getText(), ctx.type().getText(), new Symbol("", "integer", 0, SymbolType.Native, ent.last_position++), SymbolType.variable, ent.last_position);
                    ent.newSymbol(ctx.ID().getText() + SymbolType.variable.name(), nuevo);
                } else if (tipo.equals("real")) {
                    Symbol nuevo = new Symbol(ctx.ID().getText(), ctx.type().getText(), new Symbol("", "real", (double) 0, SymbolType.Native, ent.last_position++), SymbolType.variable, ent.last_position);
                    ent.newSymbol(ctx.ID().getText() + SymbolType.variable.name(), nuevo);
                } else if (tipo.equals("complex")) {
                    Symbol nuevo = new Symbol(ctx.ID().getText(), ctx.type().getText(), new Symbol("", "complex", "(" + (double)0 + "," + (double) 0 + ")", SymbolType.Native, ent.last_position++), SymbolType.variable, ent.last_position);
                    ent.newSymbol(ctx.ID().getText() + SymbolType.variable.name(), nuevo);
                } else if (tipo.equals("character")) {
                    Symbol nuevo = new Symbol(ctx.ID().getText(), ctx.type().getText(), new Symbol("", "character", ' ', SymbolType.Native, ent.last_position++), SymbolType.variable, ent.last_position);
                    ent.newSymbol(ctx.ID().getText() + SymbolType.variable.name(), nuevo);
                } else if (tipo.equals("logical")) {
                    Symbol nuevo = new Symbol(ctx.ID().getText(), ctx.type().getText(), new Symbol("", "logical", ".false.", SymbolType.Native, ent.last_position++), SymbolType.variable, ent.last_position);
                    ent.newSymbol(ctx.ID().getText() + SymbolType.variable.name(), nuevo);
                } else
                    errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "No coinciden los datos", Error.TypeError.Semantic));
                return true;
            } else
                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "Ya existe en este enorno", Error.TypeError.Semantic));
        }else{
            if (ent.SymbolTable.containsKey((ctx.ID().getText()+SymbolType.variable.name()).toUpperCase())){
                Symbol var3d = ent.SymbolTable.get((ctx.ID().getText()+SymbolType.variable.name()).toUpperCase());
                c3d.Code3D.add(c3d.generate_temporal()+" = "+ent.getSize()+" + "+var3d.Symbol_position+";");
                c3d.Code3D.add("P = "+c3d.last_temporal()+";");
                if (var3d.Symbol_type.equals("integer") || var3d.Symbol_type.equals("real") || var3d.Symbol_type.equals("complex")){
                    c3d.Code3D.add("STACK[(int)P] = "+0+";");
                }else if (var3d.Symbol_type.equals("character")){
                    c3d.Code3D.add("STACK[(int)P] = "+48+";");
                }else if (var3d.Symbol_type.equals("logical")){
                    c3d.Code3D.add("STACK[(int)P] = "+0+";");
                }
            }
        }
        return false;
    }

    //Varias variables falta c3d
    @Override
    public Object visitDeclaVarias(GramaticasParser.DeclaVariasContext ctx){
        Environment envi = Entry_stack.peek();
        if (!is3d){
            for (GramaticasParser.ExprContext gpi: ctx.expr()){
                String name = gpi.getText();
                if (!envi.SymbolTable.containsKey(name.toUpperCase())){
                    String type = ctx.type().getText().toLowerCase();
                    if (type.equals("integer")){
                        Symbol nuevo = new Symbol(name, ctx.type().getText(), new Symbol("", "integer", 0, SymbolType.Native, envi.last_position++), SymbolType.variable, envi.last_position);
                        envi.newSymbol(name+SymbolType.variable, nuevo);
                    }else if (type.equals("real")){
                        Symbol nuevo = new Symbol(name, ctx.type().getText(), new Symbol("", "float", (double)0, SymbolType.Native, envi.last_position++), SymbolType.variable, envi.last_position);
                        envi.newSymbol(name+SymbolType.variable, nuevo);
                    }else if (type.equals("complex")){
                        Symbol nuevo = new Symbol(name, ctx.type().getText(), new Symbol("", "complex", "(" + (double)0 + "," + (double)0 + ")", SymbolType.Native, envi.last_position++), SymbolType.variable, envi.last_position);
                        envi.newSymbol(name+SymbolType.variable, nuevo);
                    }else if (type.equals("character")){
                        Symbol nuevo = new Symbol(name, ctx.type().getText(), new Symbol("", "character", " ", SymbolType.Native, envi.last_position++), SymbolType.variable, envi.last_position);
                        envi.newSymbol(name+SymbolType.variable, nuevo);
                    }else if (type.equals("logical")){
                        Symbol nuevo = new Symbol(name, ctx.type().getText(), new Symbol("", "logical", ".false.", SymbolType.Native, envi.last_position++), SymbolType.variable, envi.last_position);
                        envi.newSymbol(name+SymbolType.variable, nuevo);
                    }else{
                        errors.add(new Error(0,0, "No coinciden los tipos", Error.TypeError.Semantic));
                        return true;
                    }
                }else{
                    errors.add(new Error(0,0, "Ya existe la variable", Error.TypeError.Semantic));
                }
            }
        }else{
            for (GramaticasParser.ExprContext gpi: ctx.expr()){
                if (envi.SymbolTable.containsKey(gpi.getText()+SymbolType.variable.name().toUpperCase())){
                    Symbol vv3d = envi.SymbolTable.get(gpi.getText()+SymbolType.variable.name().toUpperCase());
                    c3d.Code3D.add(c3d.generate_temporal()+envi.getSize()+" + "+vv3d.Symbol_position+";");
                    c3d.Code3D.add("P = "+c3d.last_temporal()+";");
                    if (vv3d.Symbol_type.equals("integer") || vv3d.Symbol_type.equals("real") || vv3d.Symbol_type.equals("complex")){
                        c3d.Code3D.add("STACK[(int)P] = "+0+";");
                    }else if (vv3d.Symbol_type.equals("character")){
                        c3d.Code3D.add("STACK[(int)P] = "+48+";");
                    }else if(vv3d.Symbol_type.equals("logical")){
                        c3d.Code3D.add("STACK[(int)P] = "+0+";");
                    }
                }
            }
        }
        return null;
    }

    //Declaration Array falta c3d
    @Override
    public Object visitVector(GramaticasParser.VectorContext ctx){
        Environment envi = Entry_stack.peek();
        Symbol nuevo = null;
        if (!is3d) {
            if (!envi.SymbolTable.containsKey(ctx.ID().getText().toLowerCase())) {
                String type = ctx.type().getText();
                Symbol dimension = (Symbol)visit(ctx.expr());
                int cant = (int)dimension.Symbol_value;
                String name = ctx.ID().getText();

                if (type.equals("integer")) {
                    int[] arr = new int[cant];
                    nuevo = new Symbol(name, ctx.type().getText(), arr, SymbolType.Array, envi.last_position++);
                    envi.newSymbol(ctx.ID().getText() + SymbolType.Array + 1, nuevo);
                } else if (type.equals("real")) {
                    float[] arr = new float[cant];
                    nuevo = new Symbol(name, ctx.type().getText(), arr, SymbolType.Array, envi.last_position++);
                    envi.newSymbol(ctx.ID().getText() + SymbolType.Array + 1, nuevo);
                } else if (type.equals("character")) {
                    char[] arr = new char[cant];
                    nuevo = new Symbol(name, ctx.type().getText(), arr, SymbolType.Array, envi.last_position++);
                    envi.newSymbol(ctx.ID().getText() + SymbolType.Array + 1, nuevo);
                } else {
                    errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "No se puede generar el arreglo", Error.TypeError.Semantic));
                }
            } else {
                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "Arreglo ya existente", Error.TypeError.Semantic));
            }
        }
        return null;
    }

    //Declaration Matrix falta c3d
    @Override
    public Object visitArray(GramaticasParser.ArrayContext ctx){
        Environment envi = Entry_stack.peek();
        Symbol nuevo = null;
        if (!is3d) {
            if (!envi.SymbolTable.containsKey(ctx.ID().getText().toLowerCase())) {
                String type = ctx.type().getText();
                int row = Integer.parseInt(ctx.f.getText());
                int columns = Integer.parseInt(ctx.c.getText());
                String name = ctx.ID().getText();

                if (type.equals("integer")){
                    int[][] matrix = new int[row][columns];
                    nuevo = new Symbol(name, ctx.type().getText(), matrix, SymbolType.Array, envi.last_position++);
                    envi.newSymbol(ctx.ID().getText() + SymbolType.Array + 2, nuevo);
                }else if (type.equals("real")){
                    float[][] matrix_f = new float[row][columns];
                    nuevo = new Symbol(name, ctx.type().getText(), matrix_f, SymbolType.Array, envi.last_position++);
                    envi.newSymbol(ctx.ID().getText() + SymbolType.Array + 2, nuevo);
                }else if (type.equals("character")){
                    char[][] matrix_c = new char[row][columns];
                    nuevo = new Symbol(name, ctx.type().getText(), matrix_c, SymbolType.Array, envi.last_position++);
                    envi.newSymbol(ctx.ID().getText() + SymbolType.Array + 2, nuevo);
                }else{
                    errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "No se puede generar la matriz", Error.TypeError.Semantic));
                }
            } else {
                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "Ya exsite esta matriz", Error.TypeError.Semantic));
            }
        }
        return null;
    }

    //Acceso Vector falta c3d
    @Override
    public Object visitAVector(GramaticasParser.AVectorContext ctx){
        Environment envi = Entry_stack.peek();
        if (!is3d) {
            Symbol data = (Symbol) visit(ctx.expr(1));
            Symbol type = envi.find(ctx.ID().getText() + SymbolType.Array.name() + 1);
            Symbol pos = (Symbol)visit(ctx.tam);
            int position = (int)pos.Symbol_value;
            if (type != null) {
                if (type.Symbol_type.equals(data.Symbol_type)) {
                    if (type.Symbol_type.equals("integer")) {
                        int[] vector = (int[]) type.Symbol_value;
                        try {
                            vector[position - 1] = (int) data.Symbol_value;
                        } catch (Exception e) {
                            errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "Wey, te pasaste un cachito", Error.TypeError.Semantic));
                        }
                    } else if (type.Symbol_type.equals("real")) {
                        float[] vector = (float[]) type.Symbol_value;
                        try {
                            vector[position - 1] = (float) data.Symbol_value;
                        } catch (Exception e) {
                            errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "Wey, te pasaste un cachito", Error.TypeError.Semantic));
                        }
                    } else if (type.Symbol_type.equals("character")) {
                        char[] vector = (char[]) type.Symbol_value;
                        try {
                            vector[position - 1] = (char) data.Symbol_value;
                        } catch (Exception e) {
                            errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "Wey, te pasaste un cachito", Error.TypeError.Semantic));
                        }
                    }
                } else {
                    errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "Tiene dislexia compa?", Error.TypeError.Semantic));
                }
            } else {
                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "No existe, como ella :v", Error.TypeError.Semantic));
            }
        }
        return null;
    }

    //Aceeso Matrix falta c3d
    @Override
    public Object visitAMatrix(GramaticasParser.AMatrixContext ctx){
        Environment envi = Entry_stack.peek();
        if (!is3d) {
            Symbol data = (Symbol) visit(ctx.expr(2));
            Symbol type = envi.find(ctx.ID().getText() + SymbolType.Array.name() + 2);
            Symbol row1 = (Symbol)visit(ctx.f);
            Symbol columns1 = (Symbol)visit(ctx.c);
            int row = (int)row1.Symbol_value;
            int column = (int)columns1.Symbol_value;
            if (type != null) {
                if (type.Symbol_type.equals(data.Symbol_type)) {
                    if (type.Symbol_type.equals("integer")) {
                        int[][] vector = (int[][]) type.Symbol_value;
                        try {
                            vector[row - 1][column - 1] = (int) data.Symbol_value;
                        } catch (Exception e) {
                            errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "Wey, te pasaste un cachito", Error.TypeError.Semantic));
                        }
                    } else if (type.Symbol_type.equals("real")) {
                        float[][] vector = (float[][]) type.Symbol_value;
                        try {
                            vector[row - 1][column - 1] = (float) data.Symbol_value;
                        } catch (Exception e) {
                            errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "Wey, te pasaste un cachito", Error.TypeError.Semantic));
                        }
                    } else if (type.Symbol_type.equals("character")) {
                        char[][] vector = (char[][]) type.Symbol_value;
                        try {
                            vector[row - 1][column - 1] = (char) data.Symbol_value;
                        } catch (Exception e) {
                            errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "Wey, te pasaste un cachito", Error.TypeError.Semantic));
                        }
                    }
                } else {
                    errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "Tiene dislexia compa?", Error.TypeError.Semantic));
                }
            } else {
                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "No existe, como ella :v", Error.TypeError.Semantic));
            }
        }
        return null;
    }

    private char separeishon(String Id){
        char rescue = Id.charAt(Id.length()-1);
        return  rescue;
    }

    @Override
    public Object visitTamVec(GramaticasParser.TamVecContext ctx){
        Environment envi = Entry_stack.peek();
        if (!is3d) {
            String name;
            Symbol id;
            id = envi.find(ctx.ID().getText() + SymbolType.Array.name() + 1);
            name = ctx.ID().getText() + SymbolType.Array.name() + 1;
            if (id == null) {
                id = envi.find(ctx.ID().getText() + SymbolType.Array.name() + 2);
                name = ctx.ID().getText() + SymbolType.Array.name() + 2;
            }
            if (id != null) {
                char dimen = separeishon(name);
                if (id.Symbol_value != null) {
                    if (id.Symbol_type.equals("integer")) {
                        if (dimen == '1') {
                            int[] vector = (int[]) id.Symbol_value;
                            return new Symbol("", "integer", vector.length, SymbolType.Native, -1);
                        } else if (dimen == '2') {
                            int[][] matrix = (int[][]) id.Symbol_value;
                            return new Symbol("", "integer", matrix.length * matrix[0].length, SymbolType.Native, -1);
                        }
                    } else if (id.Symbol_type.equals("real")) {
                        if (dimen == '1') {
                            float[] vector = (float[]) id.Symbol_value;
                            return new Symbol("", "real", vector.length, SymbolType.Native, -1);
                        } else if (dimen == '2') {
                            float[][] matrix = (float[][]) id.Symbol_value;
                            return new Symbol("", "real", matrix.length * matrix[0].length, SymbolType.Native, -1);
                        }
                    } else if (id.Symbol_type.equals("character")) {
                        if (dimen == '1') {
                            char[] vector = (char[]) id.Symbol_value;
                            return new Symbol("", "character", vector.length, SymbolType.Native, -1);
                        } else if (dimen == '2') {
                            char[][] matrix = (char[][]) id.Symbol_value;
                            return new Symbol("", "character", matrix.length * matrix[0].length, SymbolType.Native, -1);
                        }
                    }
                }else{
                    errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "No se ha podido dimensionar", Error.TypeError.Semantic));
                }
            } else {
                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "La variable " + ctx.ID().getText() + " no existe", Error.TypeError.Semantic));
            }
        }
        return null;
    }

    //Asignacion vector falta c3d
    @Override
    public Object  visitAsigVector(GramaticasParser.AsigVectorContext ctx){
        Environment envi = Entry_stack.peek();
        if (!is3d) {
            Symbol data = envi.find(ctx.ID().getText() + SymbolType.Array + 1);
            if (data != null) {
                int a = 0;
                for (GramaticasParser.ExprContext gpi : ctx.expr()) {
                    Symbol date = (Symbol) visit(gpi);
                    if (data.Symbol_type.equals("integer")) {
                        int[] array = (int[]) data.Symbol_value;
                        if (data.Symbol_type.equals(date.Symbol_type)) {
                            try {
                                array[a] = (int) date.Symbol_value;
                                a = a + 1;
                            } catch (Exception e) {
                                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "Wey, te pasaste un poquito", Error.TypeError.Semantic));
                            }
                        } else {
                            errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "Los tipos no son compatibles", Error.TypeError.Semantic));
                        }
                    } else if (data.Symbol_type.equals("real")) {
                        float[] array = (float[]) data.Symbol_value;
                        if (data.Symbol_type.equals(date.Symbol_type)) {
                            try {
                                array[a] = (float) date.Symbol_value;
                                a = a + 1;
                            } catch (Exception e) {
                                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "Wey, te pasaste un poquito", Error.TypeError.Semantic));
                            }
                        } else {
                            errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "Los tipos no son compatibles", Error.TypeError.Semantic));
                        }
                    }
                    if (data.Symbol_type.equals("character")) {
                        char[] array = (char[]) data.Symbol_value;
                        if (data.Symbol_type.equals(date.Symbol_type)) {
                            try {
                                array[a] = (char) date.Symbol_value;
                                a = a + 1;
                            } catch (Exception e) {
                                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "Wey, te pasaste un poquito", Error.TypeError.Semantic));
                            }
                        } else {
                            errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "Los tipos no son compatibles", Error.TypeError.Semantic));
                        }
                    }
                }
            }else{
                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "No existe la varibale", Error.TypeError.Semantic));
            }
        }
        return null;
    }





    //---------------------------------------------------------------------------------
    //Asignacion dynamic vector
    @Override
    public Object visitAsigVectorDin(GramaticasParser.AsigVectorDinContext ctx){
        Environment envi = Entry_stack.peek();
        if (!is3d){
            Symbol data = envi.find(ctx.ID().getText()+SymbolType.Array+1);
            if (data!=null){
                Symbol cant = (Symbol)visit(ctx.expr());
                int position = (int)cant.Symbol_value;
                if (data.Symbol_type.equals("integer")){
                    int[] array = new int[position];
                    data.Symbol_value = array;
                }else if ((data.Symbol_type.equals("real")) || (data.Symbol_type.equals("integer"))){
                    float[] array = new float[position];
                    data.Symbol_value = array;
                }else if (data.Symbol_type.equals("character")){
                    char[] array = new char[position];
                    data.Symbol_value = array;
                }
            }else{
                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "La variable no existe", Error.TypeError.Semantic));
            }
        }
        return null;
    }

    //Asignacion dynamic Matrix
    @Override
    public Object visitAsigMatrixDin(GramaticasParser.AsigMatrixDinContext ctx){
        Environment envi = Entry_stack.peek();
        if (!is3d){
            Symbol data = envi.find(ctx.ID().getText()+SymbolType.Array+2);
            if (data!=null){
                Symbol row1 = (Symbol)visit(ctx.f);
                Symbol columns1 = (Symbol)visit(ctx.c);
                int row = (int)row1.Symbol_value;
                int columns = (int)columns1.Symbol_value;
                if (data.Symbol_type.equals("integer")){
                    int[][] array = new int[row][columns];
                    data.Symbol_value = array;
                }else if (data.Symbol_type.equals("real") || data.Symbol_type.equals("integer")){
                    float[][] array = new float[row][columns];
                    data.Symbol_value = array;
                }else if (data.Symbol_type.equals("character")){
                    char[][] array = new char[row][columns];
                    data.Symbol_value = array;
                }
            }else{
                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "La variable no existe", Error.TypeError.Semantic));
            }
        }
        return null;
    }

    //-----------------------------------------------------------------------------------




    //Desasignar vector/matrix
    @Override
    public Object visitDesasignar(GramaticasParser.DesasignarContext ctx){
        Environment envi = Entry_stack.peek();
        if (!is3d){
            Symbol data = envi.find(ctx.ID().getText()+SymbolType.Array+1);
            if (data!=null){
                data.Symbol_value = null;
            }else{
                data = envi.find(ctx.ID().getText()+SymbolType.Array+2);
                if (data!=null){
                    data.Symbol_value = null;
                }else{
                    errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "No existe la variable", Error.TypeError.Semantic));
                }
            }
        }
        return null;
    }




    //Acesso a vector
    @Override
    public Object visitAccesoV(GramaticasParser.AccesoVContext ctx){
        Environment envi = Entry_stack.peek();
        if (!is3d) {
            Symbol id = envi.find(ctx.ID().getText() + SymbolType.Array.name() + 1);
            Symbol tam = (Symbol)visit(ctx.expr());
            int number = (int)tam.Symbol_value;
            if (id != null) {
                if (id.Symbol_value != null) {
                    if (id.Symbol_type.equals("integer")) {
                        try {
                            int[] array = (int[]) id.Symbol_value;
                            int data = array[number - 1];
                            return new Symbol("", "integer", data, SymbolType.Native, -1);
                        } catch (Exception e) {
                            errors.add(new Error(0, 0, "Wey, te pasate", Error.TypeError.Semantic));
                        }
                    } else if ((id.Symbol_type.equals("real")) || (id.Symbol_type.equals("integer"))) {
                        try {
                            float[] array = (float[]) id.Symbol_value;
                            float data = array[number - 1];
                            return new Symbol("", "real", data, SymbolType.Native, -1);
                        } catch (Exception e) {
                            errors.add(new Error(0, 0, "Wey, te pasate", Error.TypeError.Semantic));
                        }
                    } else if (id.Symbol_type.equals("character")) {
                        try {
                            char[] array = (char[]) id.Symbol_value;
                            char data = array[number - 1];
                            return new Symbol("", "character", data, SymbolType.Native, -1);
                        } catch (Exception e) {
                            errors.add(new Error(0, 0, "Wey, te pasate", Error.TypeError.Semantic));
                        }
                    }
                }else{
                    errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "No se pudo agregar la dimension", Error.TypeError.Semantic));
                }
            } else {
                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "No existe la variable", Error.TypeError.Semantic));
            }
        }
        return null;
    }

    //Acceso a matrix
    @Override
    public Object visitAccesoM(GramaticasParser.AccesoMContext ctx){
        Environment envi = Entry_stack.peek();
        if (!is3d) {
            Symbol id = envi.find(ctx.ID().getText() + SymbolType.Array.name() + 2);
            Symbol row1 = (Symbol)visit(ctx.f);
            int row = (int)row1.Symbol_value;
            Symbol columns1 = (Symbol)visit(ctx.c);
            int columns = (int)columns1.Symbol_value;
            if (id != null) {
                if (id.Symbol_value != null) {
                    if (id.Symbol_type.equals("integer")) {
                        try {
                            int[][] array = (int[][]) id.Symbol_value;
                            int data = array[row - 1][columns - 1];
                            return new Symbol("", "integer", data, SymbolType.Native, -1);
                        } catch (Exception e) {
                            errors.add(new Error(0, 0, "Wey, te pasate", Error.TypeError.Semantic));
                        }
                    } else if (id.Symbol_type.equals("real") || id.Symbol_type.equals("integer")) {
                        try {
                            float[][] array = (float[][]) id.Symbol_value;
                            float data = array[row - 1][columns - 1];
                            return new Symbol("", "real", data, SymbolType.Native, -1);
                        } catch (Exception e) {
                            errors.add(new Error(0, 0, "Wey, te pasate", Error.TypeError.Semantic));
                        }
                    } else if (id.Symbol_type.equals("character")) {
                        try {
                            char[][] array = (char[][]) id.Symbol_value;
                            char data = array[row - 1][columns - 1];
                            return new Symbol("", "character", data, SymbolType.Native, -1);
                        } catch (Exception e) {
                            errors.add(new Error(0, 0, "Wey, te pasate", Error.TypeError.Semantic));
                        }
                    }
                }else{
                    errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "No se pudo dimensionar la matriz", Error.TypeError.Semantic));
                }
            } else {
                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "No existe la variable", Error.TypeError.Semantic));
            }
        }
        return null;
    }

    //Array Dynamic falta c3d
    @Override
    public Object visitVdinamic(GramaticasParser.VdinamicContext ctx){
        Environment envi = Entry_stack.peek();
        if (!is3d){
            if (!envi.SymbolTable.containsKey(ctx.ID().getText().toLowerCase())){
                String type = ctx.type().getText();
                String name = ctx.ID().getText();
                Symbol nuevo = new Symbol(name, type, null, SymbolType.Array, envi.last_position++);
                envi.newSymbol(ctx.ID().getText()+SymbolType.Array+1, nuevo);
            }else{
                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "Ya existe dentro del entorno", Error.TypeError.Semantic));
            }
        }
        return null;
    }

    //Dynamic Matrix falta c3d
    @Override
    public Object visitMdinamic(GramaticasParser.MdinamicContext ctx){
        Environment envi = Entry_stack.peek();
        if (!is3d){
            if (!envi.SymbolTable.containsKey(ctx.ID().getText().toLowerCase())){
                String type = ctx.type().getText();
                String name = ctx.ID().getText();
                Symbol nuevo = new Symbol(name, type, null, SymbolType.Array, envi.last_position++);
                envi.newSymbol(ctx.ID().getText()+SymbolType.Array + 2, nuevo);
            }else{
                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "Ya existe dentro del entorno", Error.TypeError.Semantic));
            }
        }
        return null;
    }

    @Override
    public Object visitOpExpr(GramaticasParser.OpExprContext ctx){
        Symbol izq = (Symbol)visit(ctx.left);
        Symbol der = (Symbol)visit(ctx.right);
        String operation = ctx.op.getText();

        if (is3d){
            Symbol var3d = new Symbol(SymbolType.C3D, c3d.generate_temporal(), "FLOAT");
            if (!operation.equals("**"))
                c3d.Code3D.add(var3d.Symbol_value+" = "+izq.Symbol_value+operation+der.Symbol_value+";");
            else
                c3d.Code3D.add(var3d.Symbol_value+" = pow("+izq.Symbol_value+","+der.Symbol_value+");");
            return var3d;
        }

        switch (operation){
            //Pow
            case "**":
                if (izq.Symbol_type.equals("integer") && der.Symbol_type.equals("integer"))
                    return new Symbol("", "integer", (int)Math.pow((int)izq.Symbol_value, (int)der.Symbol_value), SymbolType.Native, -1);
                else if(izq.Symbol_type.equals("integer") && der.Symbol_type.equals("real"))
                    return new Symbol("", "real", Math.pow((int)izq.Symbol_value, (double)der.Symbol_value), SymbolType.Native,-1);
                else if(izq.Symbol_type.equals("real") && der.Symbol_type.equals("integer"))
                    return new Symbol("", "real", Math.pow((double)izq.Symbol_value, (int)der.Symbol_value), SymbolType.Native,-1);
                else if(izq.Symbol_type.equals("real") && der.Symbol_type.equals("real"))
                    return new Symbol("", "real", Math.pow((double)izq.Symbol_value, (double)der.Symbol_value), SymbolType.Native, -1);
                else errors.add(new Error(ctx.op.getLine(), ctx.op.getCharPositionInLine(), "Invalid Operation", Error.TypeError.Semantic));
                //multiplication
            case "*":
                if(izq.Symbol_type.equals("integer") && der.Symbol_type.equals("integer"))
                    return new Symbol("", "integer", (int)izq.Symbol_value * (int)der.Symbol_value, SymbolType.Native, -1);
                else if (izq.Symbol_type.equals("integer") && der.Symbol_type.equals("real"))
                    return new Symbol("", "real", (int)izq.Symbol_value * (double)der.Symbol_value, SymbolType.Native, -1);
                else if (izq.Symbol_type.equals("real") && der.Symbol_type.equals("integer"))
                    return new Symbol("","real", (double)izq.Symbol_value * (int)der.Symbol_value, SymbolType.Native, -1);
                else if (izq.Symbol_type.equals("real") && der.Symbol_type.equals("real"))
                    return new Symbol("", "real", (double)izq.Symbol_value * (double)der.Symbol_value, SymbolType.Native, -1);
                else errors.add(new Error(ctx.op.getLine(), ctx.op.getCharPositionInLine(), "Invalid Operation", Error.TypeError.Semantic));
                //div
            case "/":
                if (izq.Symbol_type.equals("integer") && der.Symbol_type.equals("integer")){
                    if ((int)der.Symbol_value == 0){
                        errors.add(new Error(ctx.op.getLine(), ctx.op.getCharPositionInLine(), "Compa como gano mate 1", Error.TypeError.Semantic));
                    }else{
                        return new Symbol("", "integer", (int)izq.Symbol_value / (int)der.Symbol_value, SymbolType.Native, -1);
                    }
                }else if (izq.Symbol_type.equals("integer") && der.Symbol_type.equals("real")){
                    if ((int)der.Symbol_value == 0){
                        errors.add(new Error(ctx.op.getLine(), ctx.op.getCharPositionInLine(), "Compa como gano mate 1", Error.TypeError.Semantic));
                    }else{
                        return new Symbol("", "real", (int)izq.Symbol_value / (double)der.Symbol_value, SymbolType.Native, -1);
                    }
                }else if (izq.Symbol_type.equals("real") && der.Symbol_type.equals("integer")){
                    if ((int)der.Symbol_value == 0){
                        errors.add(new Error(ctx.op.getLine(), ctx.op.getCharPositionInLine(), "Compa como gano mate 1", Error.TypeError.Semantic));
                    }else{
                        return new Symbol("", "real", (double)izq.Symbol_value / (int)der.Symbol_value, SymbolType.Native, -1);
                    }
                }else if (izq.Symbol_type.equals("real") && der.Symbol_type.equals("real")){
                    if ((int)der.Symbol_value == 0){
                        errors.add(new Error(ctx.op.getLine(), ctx.op.getCharPositionInLine(), "Compa como gano mate 1", Error.TypeError.Semantic));
                    }else{
                        return new Symbol("", "real", (double)izq.Symbol_value / (double)der.Symbol_value, SymbolType.Native, -1);
                    }
                }else errors.add(new Error(ctx.op.getLine(), ctx.op.getCharPositionInLine(), "Invalid Operation", Error.TypeError.Semantic));
                //rest
            case "-":
                if (izq.Symbol_type.equals("integer") && der.Symbol_type.equals("integer"))
                    return new Symbol("", "integer", (int)izq.Symbol_value - (int)der.Symbol_value, SymbolType.Native, -1);
                else if (izq.Symbol_type.equals("integer") && der.Symbol_type.equals("real"))
                    return new Symbol("", "real", (int)izq.Symbol_value - (double)der.Symbol_value, SymbolType.Native, -1);
                else if (izq.Symbol_type.equals("real") && der.Symbol_type.equals("integer"))
                    return new Symbol("", "real", (double)izq.Symbol_value - (int)der.Symbol_value, SymbolType.Native, -1);
                else if (izq.Symbol_type.equals("real") && der.Symbol_type.equals("real"))
                    return new Symbol("", "real", (double)izq.Symbol_value - (double)der.Symbol_value, SymbolType.Native, -1);
                else errors.add(new Error(ctx.op.getLine(), ctx.op.getCharPositionInLine(), "Invalid Operation", Error.TypeError.Semantic));
                //sum
            case "+":
                if (izq.Symbol_type.equals("integer") && der.Symbol_type.equals("integer"))
                    return new Symbol("", "integer", (int)izq.Symbol_value + (int)der.Symbol_value, SymbolType.Native, -1);
                else if (izq.Symbol_type.equals("integer") && der.Symbol_type.equals("real"))
                    return new Symbol("", "real", (int)izq.Symbol_value + (double)der.Symbol_value, SymbolType.Native, -1);
                else if (izq.Symbol_type.equals("real") && der.Symbol_type.equals("integer"))
                    return new Symbol("", "real", (double)izq.Symbol_value + (int)der.Symbol_value, SymbolType.Native, -1);
                else if (izq.Symbol_type.equals("real") && der.Symbol_type.equals("real"))
                    return new Symbol("", "real", (double)izq.Symbol_value + (double)der.Symbol_value, SymbolType.Native, -1);
                else errors.add(new Error(ctx.op.getLine(), ctx.op.getCharPositionInLine(), "Invalid Operation", Error.TypeError.Semantic));
            default: errors.add(new Error(ctx.op.getLine(), ctx.op.getCharPositionInLine(), "Invalid Operation", Error.TypeError.Semantic));
        }
        return null;
    }

    @Override
    public Object visitOpRela(GramaticasParser.OpRelaContext ctx){
        Symbol izq = (Symbol)visit(ctx.left);
        Symbol der = (Symbol)visit(ctx.right);
        String operation = ctx.op.getText();

        if (!is3d) {
            if (izq != null && der != null) {
                if (operation.equals("==") || operation.equals(".eq.")) {
                    if (izq.Symbol_type.equals(der.Symbol_type)) {
                        if ((izq.Symbol_value == der.Symbol_value) && (!izq.Symbol_type.equals("logical")) && (!izq.Symbol_type.equals("character"))) {
                            return new Symbol("", "logical", ".true.", SymbolType.Native, -1);
                        } else if ((izq.Symbol_value.equals(der.Symbol_value)) && ((izq.Symbol_type.equals("logical")) || (izq.Symbol_type.equals("character")))) {
                            return new Symbol("", "logical", ".true.", SymbolType.Native, -1);
                        } else {
                            return new Symbol("", "logical", ".false.", SymbolType.Native, -1);
                        }
                    } else {
                        return new Symbol("", "logical", ".false.", SymbolType.Native, -1);
                    }
                } else if (operation.equals("/=") || operation.equals(".ne.")) {
                    if (izq.Symbol_type.equals(der.Symbol_type)) {
                        if ((izq.Symbol_value != der.Symbol_value) && (!izq.Symbol_type.equals("logical")) && (!izq.Symbol_type.equals("character"))) {
                            return new Symbol("", "logical", ".true.", SymbolType.Native, -1);
                        } else if ((!izq.Symbol_value.equals(der.Symbol_value)) && ((izq.Symbol_type.equals("logical")) || (izq.Symbol_type.equals("character")))) {
                            return new Symbol("", "logical", ".true.", SymbolType.Native, -1);
                        } else {
                            return new Symbol("", "logical", ".false.", SymbolType.Native, -1);
                        }
                    } else {
                        return new Symbol("", "logical", ".false.", SymbolType.Native, -1);
                    }
                } else if (!(izq.Symbol_type.equals("character")) && !(der.Symbol_type.equals("character"))) {
                    if (operation.equals(">") || operation.equals(".gt.")) {
                        if (izq.Symbol_type.equals(der.Symbol_type) && !(izq.Symbol_type.equals("character")) && !(der.Symbol_type.equals("character"))) {
                            if ((int) izq.Symbol_value > (int) der.Symbol_value) {
                                return new Symbol("", "logical", ".true.", SymbolType.Native, -1);
                            } else {
                                return new Symbol("", "logical", ".false", SymbolType.Native, -1);
                            }
                        } else {
                            return new Symbol("", "logical", ".false", SymbolType.Native, -1);
                        }
                    } else if (operation.equals("<") || operation.equals(".lt.")) {
                        if (izq.Symbol_type.equals(der.Symbol_type)) {
                            if ((int) izq.Symbol_value < (int) der.Symbol_value) {
                                return new Symbol("", "logical", ".true.", SymbolType.Native, -1);
                            } else {
                                return new Symbol("", "logical", ".false", SymbolType.Native, -1);
                            }
                        } else {
                            return new Symbol("", "logical", ".false", SymbolType.Native, -1);
                        }
                    } else if (operation.equals(">=") || operation.equals(".ge.")) {
                        if (izq.Symbol_type.equals(der.Symbol_type)) {
                            if ((int) izq.Symbol_value >= (int) der.Symbol_value) {
                                return new Symbol("", "logical", ".true.", SymbolType.Native, -1);
                            } else {
                                return new Symbol("", "logical", ".false", SymbolType.Native, -1);
                            }
                        } else {
                            return new Symbol("", "logical", ".false", SymbolType.Native, -1);
                        }
                    } else if (operation.equals("<=") || operation.equals(".le.")) {
                        if (izq.Symbol_type.equals(der.Symbol_type)) {
                            if ((int) izq.Symbol_value <= (int) der.Symbol_value) {
                                return new Symbol("", "logical", ".true.", SymbolType.Native, -1);
                            } else {
                                return new Symbol("", "logical", ".false", SymbolType.Native, -1);
                            }
                        } else {
                            return new Symbol("", "logical", ".false", SymbolType.Native, -1);
                        }
                    }

                }
            }
        }
        return null;
    }

    @Override
    public Object visitOpLogica(GramaticasParser.OpLogicaContext ctx){
        Symbol izq = (Symbol)visit(ctx.left);
        Symbol der = (Symbol)visit(ctx.right);
        String operation = ctx.op.getText();

        switch (operation){
            case ".and.":
                if (izq.Symbol_value.equals(".true.") && der.Symbol_value.equals(".true.")){
                    return new Symbol("", "logical", ".true.", SymbolType.Native, -1);
                }else{
                    return new Symbol("", "logical", ".false.", SymbolType.Native, -1);
                }
            case ".or.":
                if (izq.Symbol_value.equals(".true.") || der.Symbol_value.equals(".true.")){
                    return new Symbol("", "logical", ".true.", SymbolType.Native, -1);
                }else{
                    return new Symbol("", "logical", ".false.", SymbolType.Native, -1);
                }
            /*case ".not.":
                if (!(izq.Symbol_value.equals(".true.") && der.Symbol_value.equals(".true."))){
                    return new Symbol("", "logical", ".false.", SymbolType.Native, -1);
                }else if (!(izq.Symbol_value.equals(".true") || der.Symbol_value.equals(".true."))){
                    return new Symbol("", "logical", ".false.", SymbolType.Native, -1);
                }else{
                    return new Symbol("", "logical", ".true.", SymbolType.Native, -1);
                }*/
            default: errors.add(new Error(ctx.op.getLine(), ctx.op.getCharPositionInLine(), "Esta operacion logica no se puede hacer", Error.TypeError.Semantic));
        }
        return true;
    }

    @Override
    public Object visitNotExpr(GramaticasParser.NotExprContext ctx){
        Environment envi = Entry_stack.peek();
        Symbol res = (Symbol)visit(ctx.expr());
        if (!is3d) {
            if (res != null) {
                if (res.Symbol_value.equals(".true.")) {
                    return new Symbol("", "logical", ".false.", SymbolType.Native, envi.last_position);
                } else if (res.Symbol_value.equals(".false.")) {
                    return new Symbol("", "logical", ".true.", SymbolType.Native, envi.last_position);
                }
            }
        }
        return true;
    }

    //------------------------------------------------Ifs----------------------------------------------------
    @Override
    public Object visitIf(GramaticasParser.IfContext ctx){
        Symbol resolve = (Symbol)visit(ctx.expr());
        if (!is3d) {
            if (resolve.Symbol_value.equals(".true.")) {
                for (GramaticasParser.InstructContext ifctx : ctx.instruct()) {
                    String cc = (String) visit(ifctx);
                    if (cc.equals("exit")) {
                        return "exit";
                    } else if (cc.equals("cycle")) {
                        return "cycle";
                    }
                }
            }
            Entry_stack.peek().newSymbol("", new Symbol("", "Sentence_If",
                    ctx.instruct(), SymbolType.If_Sentence, Entry_stack.peek().last_position++));
            Entry_stack.push(new Environment(Entry_stack.peek()));
        }else{
            Symbol res = (Symbol)visit(ctx.expr());
            c3d.Code3D.add("if( "+res.Symbol_value+" ) goto "+c3d.generate_tag()); //goto L1
            c3d.Code3D.add("goto "+c3d.generate_tag()+";"); //goto L2
            c3d.Code3D.add(c3d.firstTag()+":"); //L1
            for (GramaticasParser.InstructContext gpi: ctx.instruct()){
                String if3d = (String)visit(gpi);
                if (if3d.equals("exit")){
                    return "exit";
                }else if (if3d.equals("cycle")){
                    return "cycle";
                }
            }
            c3d.Code3D.add(c3d.last_tag()+":"); //L2
        }
        return null;
    }

    @Override
    public Object visitIfelse(GramaticasParser.IfelseContext ctx){
        Symbol resolve = (Symbol)visit(ctx.expr());
        if (!is3d) {
            if (resolve.Symbol_value.equals(".true.")) {
                for (GramaticasParser.InstructContext ifctx : ctx.instruct()) {
                    String cc = (String) visit(ifctx);
                    if (cc.equals("exit")) {
                        return "exit";
                    } else if (cc.equals("cycle")) {
                        return "cycle";
                    }
                }
            } else {
                for (GramaticasParser.IntElseContext contextE : ctx.intElse()) {
                    String cc = (String) visit(contextE);
                    if (cc.equals("exit")) {
                        return "exit";
                    } else if (cc.equals("cycle")) {
                        return "cycle";
                    }
                }
            }
            Entry_stack.peek().newSymbol("", new Symbol("", "Sentence_IfElse", ctx.instruct(), SymbolType.If_Sentence, Entry_stack.peek().last_position++));
            Entry_stack.push(new Environment(Entry_stack.peek()));
        }else{
            Symbol res = (Symbol) visit(ctx.expr());
            c3d.Code3D.add("if( " + res.Symbol_value + ") goto" + c3d.generate_tag()); //goto L3
            c3d.Code3D.add("goto " + c3d.generate_tag() + ";"); //goto L4
            c3d.Code3D.add(c3d.firstTag() + ":"); //L3:
            for (GramaticasParser.InstructContext gpi : ctx.instruct()){
                String ac = visitInstruct(gpi);
                if (ac.equals("exit")){
                    return "exit";
                } else if (ac.equals("cycle")) {
                    return "cycle";
                }
            }
            c3d.Code3D.add("goto " + c3d.generate_tag() + ";"); //goto L5
            c3d.Code3D.add(c3d.firstTag() + ":"); //L4:
            for (GramaticasParser.IntElseContext gpi2 : ctx.intElse()){
                String ac = visitIntElse(gpi2);
                if (ac.equals("exit")){
                    return "exit";
                } else if (ac.equals("cycle")) {
                    return "cycle";
                }
            }
            c3d.Code3D.add(c3d.last_tag() + ":"); //L5:
        }
        return null;
    }
    //---------------------------------------------------Ifs----------------------------------------------------

    //----------------------------Cycle Do-------------------------------------------
    @Override
    public Object visitDo(GramaticasParser.DoContext ctx){
        Environment do_envi = Entry_stack.peek();
        String name_do = ctx.ID().getText();
        Symbol cond1 = (Symbol)visit(ctx.number1);
        Symbol cond2 = (Symbol)visit(ctx.number2);
        if (!is3d) {
            Symbol a = (Symbol) do_envi.find(name_do + SymbolType.variable.name());
            doA(name_do, cond1, ctx);
            String control = "";
            if (a != null) {
                Symbol data = (Symbol) do_envi.find(name_do + SymbolType.variable).Symbol_value;
                while (((int) data.Symbol_value < (int) cond2.Symbol_value) && !(control.equals("exit"))) {
                    for (GramaticasParser.InstructContext indo : ctx.instruct()) {
                        String visitor = visitInstruct(indo);
                        if (visitor.equals("exit")) {
                            control = "exit";
                            break;
                        } else if (visitor.equals("cycle")) {
                            break;
                        }
                    }
                    doA(name_do, new Symbol("", "integer", (int) data.Symbol_value + 1,
                            SymbolType.Native, Entry_stack.peek().last_position++), ctx);
                    data = (Symbol) do_envi.find(name_do + SymbolType.variable).Symbol_value;
                }
            } else {
                errors.add(new Error(ctx.d.getLine(), ctx.d.getCharPositionInLine(), "No se ha declarado la variable principal", Error.TypeError.Semantic));
            }
        }else{
            Symbol data = (Symbol) do_envi.find(name_do + SymbolType.variable).Symbol_value;
            c3d.Code3D.add(c3d.generate_temporal() + " = "+ do_envi.getSize() + " + " + data.Symbol_position +";");
            c3d.Code3D.add("P =" + c3d.last_temporal()+";");
            c3d.Code3D.add(c3d.generate_tag() + ":"); //L1
            c3d.Code3D.add("STACK[(int)P] = " + cond1.Symbol_value +";"); //STACK[(int)P] = t1
            c3d.Code3D.add(c3d.generate_temporal() + " = " + "STACK[(int)P];");
            c3d.Code3D.add("if(" + c3d.last_temporal() + "<" + cond2.Symbol_value + ") goto " + c3d.generate_tag() + ";"); //L2
            c3d.Code3D.add("goto " + c3d.generate_tag() + ";"); //L3
            c3d.Code3D.add(c3d.firstTag() + ":"); //L2
            for (GramaticasParser.InstructContext gpi : ctx.instruct()){
                String ac = visitInstruct(gpi);
                if (ac.equals("exit")){
                    c3d.Code3D.add("break;");
                    break;
                } else if (ac.equals("cycle")) {
                    c3d.Code3D.add("continue;");
                }
            }
            c3d.Code3D.add(cond1.Symbol_value + " = " + cond1.Symbol_value + " + 1 ;");
            c3d.Code3D.add("goto L" + (c3d.tag() - 2) + ";"); //L1
            c3d.Code3D.add(c3d.last_tag() + ":");
        }
        return null;
    }

    public void doA(String nombre, Symbol ctx1, GramaticasParser.DoContext ctx){
        Environment envi = Entry_stack.peek();
        Symbol type = envi.find(nombre+SymbolType.variable.name());
        if (type != null){
            if (type.Symbol_type.equals(ctx1.Symbol_type)){
                envi.actualiseishon(ctx.ID().getText() + SymbolType.variable.name(), ctx1);
            }else{
                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "El tipo no coincide con el valor", Error.TypeError.Semantic));
            }
        }else errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "No se declaro esta variable", Error.TypeError.Semantic));
    }
    //----------------------------cycle Do--------------------------------------------

    //----------------------------cycle Do for----------------------------------------
    public void DoAct(String name, Symbol ctx1, GramaticasParser.DoforContext ctx){
        Environment doact = Entry_stack.peek();
        Symbol type = doact.find(name+SymbolType.variable.name());
        if (type!=null){
            if (type.Symbol_type.equals(ctx1.Symbol_type)){
                doact.actualiseishon(ctx.ID().getText() + SymbolType.variable.name(), ctx1);
            }else{
                errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "Los valores no coinciden", Error.TypeError.Semantic));
            }
        }else{
            errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "No existen las variables", Error.TypeError.Semantic));
        }
    }

    @Override
    public Object visitDofor(GramaticasParser.DoforContext ctx){
        String name = ctx.ID().getText();
        String control = "";
        Symbol d1 = (Symbol)visit(ctx.num1);
        Symbol d2 = (Symbol)visit(ctx.num2);
        Symbol p = (Symbol)visit(ctx.paso);

        if (!is3d) {
            Environment envi_do_for = Entry_stack.peek();
            Symbol date = (Symbol) envi_do_for.find(name + SymbolType.variable);
            if (date != null) {
                DoAct(name, d1, ctx);
                Symbol data = (Symbol) envi_do_for.find(name + SymbolType.variable).Symbol_value;

                while (((int) data.Symbol_value < (int) d2.Symbol_value) && !(control.equals("exit"))) {
                    for (GramaticasParser.InstructContext iso : ctx.instruct()) {
                        String cc = visitInstruct(iso);
                        if (cc.equals("exit")) {
                            control = "exit";
                            break;
                        } else if (cc.equals("cycle")) {
                            break;
                        }
                    }
                    DoAct(name, new Symbol("", "integer", (int) data.Symbol_value + (int) p.Symbol_value,
                            SymbolType.Native, Entry_stack.peek().last_position++), ctx);
                    data = (Symbol) envi_do_for.find(name + SymbolType.variable).Symbol_value;
                }
            } else {
                errors.add(new Error(ctx.d.getLine(), ctx.d.getCharPositionInLine(), "No esta declarada la variable", Error.TypeError.Semantic));
            }
        }else{
            Environment envi = Entry_stack.peek();
            Symbol data = (Symbol) envi.find(name + SymbolType.variable);
            c3d.Code3D.add(c3d.generate_temporal() + " = "+ envi.getSize() + " + " + data.Symbol_position +";");
            c3d.Code3D.add("P = " + c3d.last_temporal()+";");
            c3d.Code3D.add(c3d.generate_tag() + ":"); //L1
            c3d.Code3D.add("STACK[(int)P] = " + d1.Symbol_value +";"); //STACK[(int)P] = t1
            c3d.Code3D.add(c3d.generate_temporal() + " = " + "STACK[(int)P];");
            c3d.Code3D.add("if(" + c3d.last_temporal() + "<" + d2.Symbol_value + ") goto " + c3d.generate_tag() + ";"); //L2
            c3d.Code3D.add("goto " + c3d.generate_tag() + ";"); //L3
            c3d.Code3D.add(c3d.firstTag() + ":"); //L2
            for (GramaticasParser.InstructContext gpi : ctx.instruct()){
                String ac = visitInstruct(gpi);
                if (ac.equals("exit")){
                    c3d.Code3D.add("break;");
                    break;
                } else if (ac.equals("cycle")) {
                    c3d.Code3D.add("continue;");
                }
            }
            c3d.Code3D.add(d1.Symbol_value + " = " + d1.Symbol_value + " + " + d1.Symbol_value + ";");
            c3d.Code3D.add("goto L" + (c3d.tag() - 2) + ";"); //L1
            c3d.Code3D.add(c3d.last_tag() + ":");
        }
        return null;
    }
    //----------------------------cycle Do for----------------------------------------

    //----------------------------cycle do while--------------------------------------
    @Override
    public Object visitSentes_do_while(GramaticasParser.Sentes_do_whileContext ctx){
        Symbol response;
        String control = "";
        if (!is3d) {
            do {
                response = (Symbol) visit(ctx.ex);
                if (response == null) {
                    errors.add(new Error(ctx.d.getLine(), ctx.d.getCharPositionInLine(), "No se ha declarado ninguna variable", Error.TypeError.Semantic));
                    break;
                } else {
                    for (GramaticasParser.InstructContext gpi : ctx.instruct()) {
                        String cc = visitInstruct(gpi);
                        if (cc.equals("exit")) {
                            control = "exit";
                            break;
                        } else if (cc.equals("cycle")) {
                            break;
                        }
                    }
                }
            } while ((response.Symbol_value == ".true.") && !(control.equals("exit")));
        }else{
            response = (Symbol)visit(ctx.ex);
            c3d.Code3D.add(c3d.generate_tag()+" :"); //L6
            for (GramaticasParser.InstructContext gpi: ctx.instruct()){
                String dw = visitInstruct(gpi);
                if (dw.equals("exit")){
                    c3d.Code3D.add("break;");
                }else if (dw.equals("cycle")){
                    c3d.Code3D.add("continue");
                }
            }
            c3d.Code3D.add("if( "+response.Symbol_value+ " ) goto "+c3d.generate_tag()+";"); //L7
            c3d.Code3D.add("goto "+c3d.generate_tag()+";"); //L8
            c3d.Code3D.add(c3d.firstTag()+":"); //L7
            c3d.Code3D.add("goto L"+(c3d.tag()-2)+":"); //L6
            c3d.Code3D.add(c3d.last_tag()+":"); //L8
        }
        return null;
    }
    //----------------------------cycle do while--------------------------------------

    //Types
    @Override
    public Object visitType(GramaticasParser.TypeContext ctx){
        return ctx.getText();
    }

    @Override
    public Object visitCharExpr(GramaticasParser.CharExprContext ctx){
        if (!is3d)
            return new Symbol("", "character", ctx.char_.getText().charAt(1), SymbolType.Native, -1);
        Symbol char3D = new Symbol(SymbolType.C3D, c3d.generate_temporal(), "SRT");
        c3d.Code3D.add(char3D.Symbol_value+" = H;");
        c3d.Code3D.add("HEAP[(int)H] = "+(int)ctx.char_.getText().charAt(1)+";");
        c3d.Code3D.add("H = H + 1;");
        c3d.Code3D.add("HEAP[(int)H] = -1;");
        c3d.Code3D.add("H = H + 1;");
        return char3D;
    }

    @Override
    public Object visitEnteroExpr(GramaticasParser.EnteroExprContext ctx){
        if (!is3d)
            return new Symbol("", "integer", Integer.valueOf(ctx.getText()), SymbolType.Native, -1);
        Symbol ent3D = new Symbol(SymbolType.C3D, c3d.generate_temporal(), "FLOAT");
        c3d.Code3D.add(ent3D.Symbol_value+" = "+ ctx.getText() + ";");
        return ent3D;
    }

    @Override
    public Object visitBoolExpr(GramaticasParser.BoolExprContext ctx){
        if (!is3d)
            return new Symbol("", "logical", ctx.getText(), SymbolType.Native, -1);
        Symbol bool3D = new Symbol(SymbolType.C3D, c3d.generate_temporal(), "FLOAT");
        c3d.Code3D.add(bool3D.Symbol_value+" = "+"1"+";");
        return bool3D;
    }

    @Override
    public Object visitBoolfExpr(GramaticasParser.BoolfExprContext ctx){
        if (!is3d)
            return new Symbol("", "logical", ctx.getText(), SymbolType.Native, -1);
        Symbol bool3D = new Symbol(SymbolType.C3D, c3d.generate_temporal(), "FLOAT");
        c3d.Code3D.add(bool3D.Symbol_value+" = "+"0"+";");
        return bool3D;
    }

    @Override
    public Object visitDeciExpr(GramaticasParser.DeciExprContext ctx){
        if (!is3d)
            return new Symbol("", "real", Double.valueOf(ctx.getText()), SymbolType.Native, -1);
        Symbol deci3D = new Symbol(SymbolType.C3D, c3d.generate_temporal(), "FLOAT");
        c3d.Code3D.add(deci3D.Symbol_value+" = "+ctx.getText()+";");
        return deci3D;
    }

    @Override
    public Object visitImpStrExpr(GramaticasParser.ImpStrExprContext ctx){
        if (!is3d)
            return new Symbol("", "string", String.valueOf(ctx.getText().replace("\"", "")), SymbolType.Native, -1);
        Symbol str3d = new Symbol(SymbolType.C3D, c3d.generate_temporal(), "STR");
        c3d.Code3D.add(str3d.Symbol_value+" = H;");
        for (char i: String.valueOf(ctx.getText()).toCharArray()){
            c3d.Code3D.add("HEAP[(int)H] = "+(int)i+";");
            c3d.Code3D.add("H = H + 1;");
        }
        c3d.Code3D.add("HEAP[(int)H] = -1;");
        c3d.Code3D.add("H = H + 1;");
        return str3d;
    }

    @Override
    public Object visitIdExpr(GramaticasParser.IdExprContext ctx){
        Environment ent = Entry_stack.peek();
        Symbol id = ent.find(ctx.ID().getText() + SymbolType.variable.name());
        if (id == null && !is3d){
            errors.add(new Error(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "La variable "+ctx.ID().getText()+" no existe", Error.TypeError.Semantic));
            return null;
        }else {
            if (!is3d)
                return id.Symbol_value;
            Symbol id3d = new Symbol(SymbolType.C3D, c3d.generate_temporal(), id.Symbol_type.toUpperCase().equals("CHARACTER") ? "IDSTR":"IDFLOAT");
            id3d.Symbol_id = ctx.ID().getText();
            c3d.Code3D.add(c3d.generate_temporal()+" = "+ent.getSize()+" + "+id.Symbol_position+";");
            c3d.Code3D.add("P = "+c3d.last_temporal()+";");
            c3d.Code3D.add(id3d.Symbol_value+" = STACK[(int)P];");
            return  id3d;
        }
    }

    @Override
    public Object visitParenExpr(GramaticasParser.ParenExprContext ctx){
        return visit(ctx.expr());
    }

}
import Environment.Environment;
import Environment.Symbol;
import Gramatica.GramaticasParser;

import java.util.ArrayList;

public class Function {
    public String name_function;
    public ArrayList<Symbol> param_function;
    public Object list_instruction_function;
    public Environment environment_function;
    public GramaticasParser.ParamsubContext instruct_params;
    public Symbol result_instruct;

    public Function(String name_function, ArrayList<Symbol> param_function, Object list_instruction_function, GramaticasParser.ParamsubContext instruct_params, Symbol result_instruct) {
        this.name_function = name_function;
        this.param_function = param_function;
        this.list_instruction_function = list_instruction_function;
        this.instruct_params = instruct_params;
        this.result_instruct = result_instruct;
    }
}

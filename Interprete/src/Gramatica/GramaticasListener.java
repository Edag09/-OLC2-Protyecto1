// Generated from C:/Users/EduardoA/OneDrive/Documentos/Eduardo/[OLC2]P1/Proyecto 1/Interprete/src\Gramaticas.g4 by ANTLR 4.10.1
package Gramatica;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticasParser}.
 */
public interface GramaticasListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(GramaticasParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(GramaticasParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#list_instructions}.
	 * @param ctx the parse tree
	 */
	void enterList_instructions(GramaticasParser.List_instructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#list_instructions}.
	 * @param ctx the parse tree
	 */
	void exitList_instructions(GramaticasParser.List_instructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(GramaticasParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(GramaticasParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GramaticasParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GramaticasParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#subroutine}.
	 * @param ctx the parse tree
	 */
	void enterSubroutine(GramaticasParser.SubroutineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#subroutine}.
	 * @param ctx the parse tree
	 */
	void exitSubroutine(GramaticasParser.SubroutineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#subroutine_sin_params}.
	 * @param ctx the parse tree
	 */
	void enterSubroutine_sin_params(GramaticasParser.Subroutine_sin_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#subroutine_sin_params}.
	 * @param ctx the parse tree
	 */
	void exitSubroutine_sin_params(GramaticasParser.Subroutine_sin_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#paramsub}.
	 * @param ctx the parse tree
	 */
	void enterParamsub(GramaticasParser.ParamsubContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#paramsub}.
	 * @param ctx the parse tree
	 */
	void exitParamsub(GramaticasParser.ParamsubContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#g}.
	 * @param ctx the parse tree
	 */
	void enterG(GramaticasParser.GContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#g}.
	 * @param ctx the parse tree
	 */
	void exitG(GramaticasParser.GContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GramaticasParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GramaticasParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#function_sin_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_sin_params(GramaticasParser.Function_sin_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#function_sin_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_sin_params(GramaticasParser.Function_sin_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(GramaticasParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(GramaticasParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterImprimir(GramaticasParser.ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitImprimir(GramaticasParser.ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaNormSinVal}
	 * labeled alternative in {@link GramaticasParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaNormSinVal(GramaticasParser.DeclaNormSinValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaNormSinVal}
	 * labeled alternative in {@link GramaticasParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaNormSinVal(GramaticasParser.DeclaNormSinValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaVarias}
	 * labeled alternative in {@link GramaticasParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaVarias(GramaticasParser.DeclaVariasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaVarias}
	 * labeled alternative in {@link GramaticasParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaVarias(GramaticasParser.DeclaVariasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaNorm}
	 * labeled alternative in {@link GramaticasParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaNorm(GramaticasParser.DeclaNormContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaNorm}
	 * labeled alternative in {@link GramaticasParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaNorm(GramaticasParser.DeclaNormContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaVariasExpr}
	 * labeled alternative in {@link GramaticasParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaVariasExpr(GramaticasParser.DeclaVariasExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaVariasExpr}
	 * labeled alternative in {@link GramaticasParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaVariasExpr(GramaticasParser.DeclaVariasExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaFunc}
	 * labeled alternative in {@link GramaticasParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaFunc(GramaticasParser.DeclaFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaFunc}
	 * labeled alternative in {@link GramaticasParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaFunc(GramaticasParser.DeclaFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalAsig}
	 * labeled alternative in {@link GramaticasParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterNormalAsig(GramaticasParser.NormalAsigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalAsig}
	 * labeled alternative in {@link GramaticasParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitNormalAsig(GramaticasParser.NormalAsigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asdvector}
	 * labeled alternative in {@link GramaticasParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsdvector(GramaticasParser.AsdvectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asdvector}
	 * labeled alternative in {@link GramaticasParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsdvector(GramaticasParser.AsdvectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link GramaticasParser#sentes_if}.
	 * @param ctx the parse tree
	 */
	void enterIf(GramaticasParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link GramaticasParser#sentes_if}.
	 * @param ctx the parse tree
	 */
	void exitIf(GramaticasParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link GramaticasParser#sentes_if}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(GramaticasParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link GramaticasParser#sentes_if}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(GramaticasParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifanidado}
	 * labeled alternative in {@link GramaticasParser#sentes_if}.
	 * @param ctx the parse tree
	 */
	void enterIfanidado(GramaticasParser.IfanidadoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifanidado}
	 * labeled alternative in {@link GramaticasParser#sentes_if}.
	 * @param ctx the parse tree
	 */
	void exitIfanidado(GramaticasParser.IfanidadoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dofor}
	 * labeled alternative in {@link GramaticasParser#sentes_do}.
	 * @param ctx the parse tree
	 */
	void enterDofor(GramaticasParser.DoforContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dofor}
	 * labeled alternative in {@link GramaticasParser#sentes_do}.
	 * @param ctx the parse tree
	 */
	void exitDofor(GramaticasParser.DoforContext ctx);
	/**
	 * Enter a parse tree produced by the {@code do}
	 * labeled alternative in {@link GramaticasParser#sentes_do}.
	 * @param ctx the parse tree
	 */
	void enterDo(GramaticasParser.DoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code do}
	 * labeled alternative in {@link GramaticasParser#sentes_do}.
	 * @param ctx the parse tree
	 */
	void exitDo(GramaticasParser.DoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#sentes_do_while}.
	 * @param ctx the parse tree
	 */
	void enterSentes_do_while(GramaticasParser.Sentes_do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#sentes_do_while}.
	 * @param ctx the parse tree
	 */
	void exitSentes_do_while(GramaticasParser.Sentes_do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#control_cicle}.
	 * @param ctx the parse tree
	 */
	void enterControl_cicle(GramaticasParser.Control_cicleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#control_cicle}.
	 * @param ctx the parse tree
	 */
	void exitControl_cicle(GramaticasParser.Control_cicleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#cycle_tag}.
	 * @param ctx the parse tree
	 */
	void enterCycle_tag(GramaticasParser.Cycle_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#cycle_tag}.
	 * @param ctx the parse tree
	 */
	void exitCycle_tag(GramaticasParser.Cycle_tagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vector}
	 * labeled alternative in {@link GramaticasParser#decla_array}.
	 * @param ctx the parse tree
	 */
	void enterVector(GramaticasParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vector}
	 * labeled alternative in {@link GramaticasParser#decla_array}.
	 * @param ctx the parse tree
	 */
	void exitVector(GramaticasParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link GramaticasParser#decla_array}.
	 * @param ctx the parse tree
	 */
	void enterArray(GramaticasParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link GramaticasParser#decla_array}.
	 * @param ctx the parse tree
	 */
	void exitArray(GramaticasParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vdinamic}
	 * labeled alternative in {@link GramaticasParser#decla_array}.
	 * @param ctx the parse tree
	 */
	void enterVdinamic(GramaticasParser.VdinamicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vdinamic}
	 * labeled alternative in {@link GramaticasParser#decla_array}.
	 * @param ctx the parse tree
	 */
	void exitVdinamic(GramaticasParser.VdinamicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mdinamic}
	 * labeled alternative in {@link GramaticasParser#decla_array}.
	 * @param ctx the parse tree
	 */
	void enterMdinamic(GramaticasParser.MdinamicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mdinamic}
	 * labeled alternative in {@link GramaticasParser#decla_array}.
	 * @param ctx the parse tree
	 */
	void exitMdinamic(GramaticasParser.MdinamicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asigMatrix}
	 * labeled alternative in {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 */
	void enterAsigMatrix(GramaticasParser.AsigMatrixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asigMatrix}
	 * labeled alternative in {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 */
	void exitAsigMatrix(GramaticasParser.AsigMatrixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asigVector}
	 * labeled alternative in {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 */
	void enterAsigVector(GramaticasParser.AsigVectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asigVector}
	 * labeled alternative in {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 */
	void exitAsigVector(GramaticasParser.AsigVectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aVector}
	 * labeled alternative in {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 */
	void enterAVector(GramaticasParser.AVectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aVector}
	 * labeled alternative in {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 */
	void exitAVector(GramaticasParser.AVectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aMatrix}
	 * labeled alternative in {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 */
	void enterAMatrix(GramaticasParser.AMatrixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aMatrix}
	 * labeled alternative in {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 */
	void exitAMatrix(GramaticasParser.AMatrixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asigVectorDin}
	 * labeled alternative in {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 */
	void enterAsigVectorDin(GramaticasParser.AsigVectorDinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asigVectorDin}
	 * labeled alternative in {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 */
	void exitAsigVectorDin(GramaticasParser.AsigVectorDinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asigMatrixDin}
	 * labeled alternative in {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 */
	void enterAsigMatrixDin(GramaticasParser.AsigMatrixDinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asigMatrixDin}
	 * labeled alternative in {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 */
	void exitAsigMatrixDin(GramaticasParser.AsigMatrixDinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code desasignar}
	 * labeled alternative in {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 */
	void enterDesasignar(GramaticasParser.DesasignarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code desasignar}
	 * labeled alternative in {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 */
	void exitDesasignar(GramaticasParser.DesasignarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(GramaticasParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(GramaticasParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#call_sin_params}.
	 * @param ctx the parse tree
	 */
	void enterCall_sin_params(GramaticasParser.Call_sin_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#call_sin_params}.
	 * @param ctx the parse tree
	 */
	void exitCall_sin_params(GramaticasParser.Call_sin_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(GramaticasParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(GramaticasParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#a}.
	 * @param ctx the parse tree
	 */
	void enterA(GramaticasParser.AContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#a}.
	 * @param ctx the parse tree
	 */
	void exitA(GramaticasParser.AContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#instruct}.
	 * @param ctx the parse tree
	 */
	void enterInstruct(GramaticasParser.InstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#instruct}.
	 * @param ctx the parse tree
	 */
	void exitInstruct(GramaticasParser.InstructContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#intElse}.
	 * @param ctx the parse tree
	 */
	void enterIntElse(GramaticasParser.IntElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#intElse}.
	 * @param ctx the parse tree
	 */
	void exitIntElse(GramaticasParser.IntElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GramaticasParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GramaticasParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCharExpr(GramaticasParser.CharExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCharExpr(GramaticasParser.CharExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolfExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolfExpr(GramaticasParser.BoolfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolfExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolfExpr(GramaticasParser.BoolfExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accesoM}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAccesoM(GramaticasParser.AccesoMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accesoM}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAccesoM(GramaticasParser.AccesoMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpExpr(GramaticasParser.OpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpExpr(GramaticasParser.OpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enteroExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEnteroExpr(GramaticasParser.EnteroExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enteroExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEnteroExpr(GramaticasParser.EnteroExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fsinparams}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFsinparams(GramaticasParser.FsinparamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fsinparams}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFsinparams(GramaticasParser.FsinparamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(GramaticasParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(GramaticasParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tamVec}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTamVec(GramaticasParser.TamVecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tamVec}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTamVec(GramaticasParser.TamVecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opRela}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpRela(GramaticasParser.OpRelaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opRela}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpRela(GramaticasParser.OpRelaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(GramaticasParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(GramaticasParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fconparams}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFconparams(GramaticasParser.FconparamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fconparams}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFconparams(GramaticasParser.FconparamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accesoV}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAccesoV(GramaticasParser.AccesoVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accesoV}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAccesoV(GramaticasParser.AccesoVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(GramaticasParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(GramaticasParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opLogica}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpLogica(GramaticasParser.OpLogicaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opLogica}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpLogica(GramaticasParser.OpLogicaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deciExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDeciExpr(GramaticasParser.DeciExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deciExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDeciExpr(GramaticasParser.DeciExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code impStrExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterImpStrExpr(GramaticasParser.ImpStrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code impStrExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitImpStrExpr(GramaticasParser.ImpStrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(GramaticasParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(GramaticasParser.IdExprContext ctx);
}
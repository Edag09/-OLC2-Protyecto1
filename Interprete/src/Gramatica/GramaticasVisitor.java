// Generated from C:/Users/EduardoA/OneDrive/Documentos/Eduardo/[OLC2]P1/Proyecto 1/Interprete/src\Gramaticas.g4 by ANTLR 4.10.1
package Gramatica;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticasParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticasVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(GramaticasParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#list_instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_instructions(GramaticasParser.List_instructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(GramaticasParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GramaticasParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#subroutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutine(GramaticasParser.SubroutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#subroutine_sin_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutine_sin_params(GramaticasParser.Subroutine_sin_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#paramsub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamsub(GramaticasParser.ParamsubContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#g}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitG(GramaticasParser.GContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(GramaticasParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#function_sin_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_sin_params(GramaticasParser.Function_sin_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(GramaticasParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(GramaticasParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaNormSinVal}
	 * labeled alternative in {@link GramaticasParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaNormSinVal(GramaticasParser.DeclaNormSinValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaVarias}
	 * labeled alternative in {@link GramaticasParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaVarias(GramaticasParser.DeclaVariasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaNorm}
	 * labeled alternative in {@link GramaticasParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaNorm(GramaticasParser.DeclaNormContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaVariasExpr}
	 * labeled alternative in {@link GramaticasParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaVariasExpr(GramaticasParser.DeclaVariasExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaFunc}
	 * labeled alternative in {@link GramaticasParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaFunc(GramaticasParser.DeclaFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalAsig}
	 * labeled alternative in {@link GramaticasParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAsig(GramaticasParser.NormalAsigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asdvector}
	 * labeled alternative in {@link GramaticasParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsdvector(GramaticasParser.AsdvectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link GramaticasParser#sentes_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(GramaticasParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link GramaticasParser#sentes_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(GramaticasParser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifanidado}
	 * labeled alternative in {@link GramaticasParser#sentes_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfanidado(GramaticasParser.IfanidadoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dofor}
	 * labeled alternative in {@link GramaticasParser#sentes_do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDofor(GramaticasParser.DoforContext ctx);
	/**
	 * Visit a parse tree produced by the {@code do}
	 * labeled alternative in {@link GramaticasParser#sentes_do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo(GramaticasParser.DoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#sentes_do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentes_do_while(GramaticasParser.Sentes_do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#control_cicle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_cicle(GramaticasParser.Control_cicleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#cycle_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle_tag(GramaticasParser.Cycle_tagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vector}
	 * labeled alternative in {@link GramaticasParser#decla_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(GramaticasParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array}
	 * labeled alternative in {@link GramaticasParser#decla_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(GramaticasParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vdinamic}
	 * labeled alternative in {@link GramaticasParser#decla_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVdinamic(GramaticasParser.VdinamicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mdinamic}
	 * labeled alternative in {@link GramaticasParser#decla_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMdinamic(GramaticasParser.MdinamicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asigMatrix}
	 * labeled alternative in {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigMatrix(GramaticasParser.AsigMatrixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asigVector}
	 * labeled alternative in {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigVector(GramaticasParser.AsigVectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aVector}
	 * labeled alternative in {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAVector(GramaticasParser.AVectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aMatrix}
	 * labeled alternative in {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAMatrix(GramaticasParser.AMatrixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asigVectorDin}
	 * labeled alternative in {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigVectorDin(GramaticasParser.AsigVectorDinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asigMatrixDin}
	 * labeled alternative in {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigMatrixDin(GramaticasParser.AsigMatrixDinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code desasignar}
	 * labeled alternative in {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesasignar(GramaticasParser.DesasignarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(GramaticasParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#call_sin_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_sin_params(GramaticasParser.Call_sin_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(GramaticasParser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA(GramaticasParser.AContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#instruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruct(GramaticasParser.InstructContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#intElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntElse(GramaticasParser.IntElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GramaticasParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharExpr(GramaticasParser.CharExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolfExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolfExpr(GramaticasParser.BoolfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accesoM}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccesoM(GramaticasParser.AccesoMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExpr(GramaticasParser.OpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enteroExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnteroExpr(GramaticasParser.EnteroExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fsinparams}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFsinparams(GramaticasParser.FsinparamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(GramaticasParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tamVec}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTamVec(GramaticasParser.TamVecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opRela}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpRela(GramaticasParser.OpRelaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(GramaticasParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fconparams}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFconparams(GramaticasParser.FconparamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accesoV}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccesoV(GramaticasParser.AccesoVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(GramaticasParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opLogica}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpLogica(GramaticasParser.OpLogicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deciExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeciExpr(GramaticasParser.DeciExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impStrExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpStrExpr(GramaticasParser.ImpStrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(GramaticasParser.IdExprContext ctx);
}
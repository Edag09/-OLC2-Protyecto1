// Generated from C:/Users/EduardoA/OneDrive/Documentos/Eduardo/[OLC2]P1/Proyecto 1/Interprete/src\Gramaticas.g4 by ANTLR 4.10.1
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
	 * Enter a parse tree produced by {@link GramaticasParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(GramaticasParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(GramaticasParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(GramaticasParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(GramaticasParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#sentes_if}.
	 * @param ctx the parse tree
	 */
	void enterSentes_if(GramaticasParser.Sentes_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#sentes_if}.
	 * @param ctx the parse tree
	 */
	void exitSentes_if(GramaticasParser.Sentes_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#sentes_do}.
	 * @param ctx the parse tree
	 */
	void enterSentes_do(GramaticasParser.Sentes_doContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#sentes_do}.
	 * @param ctx the parse tree
	 */
	void exitSentes_do(GramaticasParser.Sentes_doContext ctx);
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
	 * Enter a parse tree produced by {@link GramaticasParser#decla_array}.
	 * @param ctx the parse tree
	 */
	void enterDecla_array(GramaticasParser.Decla_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#decla_array}.
	 * @param ctx the parse tree
	 */
	void exitDecla_array(GramaticasParser.Decla_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_array(GramaticasParser.Asignacion_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_array(GramaticasParser.Asignacion_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticasParser#llamada}.
	 * @param ctx the parse tree
	 */
	void enterLlamada(GramaticasParser.LlamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#llamada}.
	 * @param ctx the parse tree
	 */
	void exitLlamada(GramaticasParser.LlamadaContext ctx);
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
	 * Enter a parse tree produced by {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GramaticasParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GramaticasParser.ExprContext ctx);
}
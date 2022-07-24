import Environment.Environment;
import Environment.Error;
import Gramatica.*;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;


import static org.antlr.v4.runtime.CharStreams.fromString;

public class Main {
    public static void main(String[] args) throws IOException {
        /*String input ="" +
                "program prueba\n" +
                "implicit none\n" +
                "integer :: var1 = 4**3\n" +
                "print *, \"El valor de la variable es: \", var1\n" +
                "end program prueba"
                ;

        ArrayList<Error> Errors = new ArrayList<Error>();
        Errors.add(new Error(-1, -1, "Descriptions", null));

        CharStream cs = fromString(input);
        GramaticasLexer lexico = new GramaticasLexer(cs);

        lexico.removeErrorListeners();
        lexico.addErrorListener(new BaseErrorListener(){
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
            {
                Errors.add(new Error(line, charPositionInLine, msg, Error.TypeError.Lexico));
            }
        });

        CommonTokenStream tokens = new CommonTokenStream(lexico);
        GramaticasParser syntactic = new GramaticasParser(tokens);

        syntactic.removeErrorListeners();
        syntactic.addErrorListener(new BaseErrorListener(){
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
            {
                Errors.add(new Error(line, charPositionInLine, msg, Error.TypeError.Syntactic));
            }
        });

        GramaticasParser.InitContext startContext = syntactic.init();

        Visitor visit = new Visitor(new Environment(null), new Stack<Environment>(), false);
        visit.visit(startContext);

        Errors.addAll(visit.errors);

        List<String> instructions= Arrays.asList(syntactic.getRuleNames());
        TreeViewer CST = new TreeViewer(instructions, startContext);
        CST.open();

        String report = "digraph E { tabla [label=<<TABLE>";
        for (Error err : Errors ){
            report+=err.toString();
        }
        report +="</TABLE>>]; }";

        FileWriter file = new FileWriter("ErrorTable.dot");
        file.write(report);
        file.close();

        Runtime.getRuntime().exec("dot -Tpdf ErrorTable.dot -o ErrorTable.pdf");

        Visitor c3d = new Visitor(visit.global, visit.Entry_stack, true);
        c3d.visit(startContext);

        FileWriter escrito3d = new FileWriter("C3D.txt");
        escrito3d.write(c3d.c3d.getHeader()+'\n');
        for (String text: c3d.c3d.Code3D){
            escrito3d.write(text+'\n');
        }
        escrito3d.close();*/

        Windows vent = new Windows();
        vent.setVisible(true);
    }
}
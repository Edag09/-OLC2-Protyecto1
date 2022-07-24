import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import Environment.Environment;
import Environment.Error;
import Gramatica.*;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;

import java.io.File;
import java.io.IOException;
import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;


import static org.antlr.v4.runtime.CharStreams.fromString;

public class Windows extends JFrame{
    FileReader fr;
    BufferedReader br;

    private JButton Compiler, Open_File, Translator_Button, Report_AST, Report_CST, Report_SymbolTable, Report_ErrorTable, T_button, Delete;
    private Container canvas;
    JTextArea Edit, Output, Translator, Translator_R;
    private JScrollPane bar_scroll, output_scroll, translator_scroll, t_scroll;
    private JPanel panel;

    private JLabel In, Out, Translator_C, img;
    TreeViewer CST;
    Visitor visit;
    GramaticasParser.InitContext startContext;

    public Windows(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Interprete");
        this.setBounds(300, 130, 1500, 800);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);

        //Interprete
        ArrayList<Error> Errors = new ArrayList<Error>();
        Errors.add(new Error(-1, -1, "Descriptions", null));

//------------------------------------JLabel Area----------------------------------------------------------
        In = new JLabel("Entry");
        In.setBounds(210, 90, 140, 40);
        In.setFont(new Font("Monospaced", Font.BOLD, 36));
        In.setForeground(Color.WHITE);

        Out = new JLabel("Output");
        Out.setBounds(650, 90, 140, 40);
        Out.setFont(new Font("Monospaced", Font.BOLD, 36));
        Out.setForeground(Color.WHITE);

        Translator_C = new JLabel("Translator");
        Translator_C.setBounds(1050, 90, 250, 40);
        Translator_C.setFont(new Font("Monospaced", Font.BOLD, 36));
        Translator_C.setForeground(Color.WHITE);

        ImageIcon im = new ImageIcon("C:\\Users\\EduardoA\\OneDrive\\Documentos\\Eduardo\\[OLC2]P1\\Proyecto 1\\Gatito.jpg");
        img = new JLabel();
        img.setIcon(new ImageIcon(im.getImage().getScaledInstance(450, 400, Image.SCALE_SMOOTH)));
        img.setBounds(975, 200, 450, 400);
        img.setVisible(false);

//-----------------------------------------Buttons Area---------------------------------------------------
        Open_File = new JButton("Open File");
        Open_File.setBounds(20, 20, 150, 40);
        Open_File.setFont(new Font("Retrow Mentho", Font.PLAIN, 17));
        Open_File.setForeground(Color.WHITE);
        Open_File.setBackground(Color.BLACK);
        ActionListener open = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Files F90", "f90");
                JFileChooser open_file = new JFileChooser();
                open_file.setFileFilter(filter);
                open_file.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                open_file.showOpenDialog(open_file);
                File file = open_file.getSelectedFile();
                try {
                    fr = new FileReader(file);
                    br = new BufferedReader(fr);
                    String text;
                    String aux = "";
                    while ((text = br.readLine()) != null){
                        aux = aux+text+'\n';
                    }
                    Edit.setText(aux);
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "No se ha podido abrir el archivo");
                }
            }
        };
        Open_File.addActionListener(open);

        Compiler = new JButton("Compiler");
        Compiler.setBounds(185, 20, 150, 40);
        Compiler.setFont(new Font("Retrow Mentho", Font.PLAIN, 17));
        Compiler.setForeground(Color.WHITE);
        Compiler.setBackground(Color.BLACK);
        ActionListener compiler = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CharStream cs = fromString(Edit.getText());
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

                startContext = syntactic.init();

                visit = new Visitor(new Environment(null), new Stack<Environment>(), false);
                visit.visit(startContext);
                String a = String.valueOf(visit.output).replace("[", "");
                String b = a.replace("]", "");
                String c = b.replace(",", "");
                Output.setText(c);
                Errors.addAll(visit.errors);
                List<String> instructions= Arrays.asList(syntactic.getRuleNames());
                CST = new TreeViewer(instructions, startContext);
            }
        };
        Compiler.addActionListener(compiler);

        Translator_Button = new JButton("Translator");
        Translator_Button.setBounds(350, 20, 150, 40);
        Translator_Button.setFont(new Font("Retrow Mentho", Font.PLAIN, 17));
        Translator_Button.setForeground(Color.WHITE);
        Translator_Button.setBackground(Color.BLACK);
        ActionListener translator = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Translator.setVisible(true);
                translator_scroll.setVisible(true);
                Translator_R.setVisible(false);
                t_scroll.setVisible(false);
                Translator.setText("Yo habia ponido mi traduccion aqui");
                img.setVisible(true);
            }
        };
        Translator_Button.addActionListener(translator);

        Report_AST = new JButton("Report AST");
        Report_AST.setBounds(515, 20, 150, 40);
        Report_AST.setFont(new Font("Retrow Mentho", Font.PLAIN, 17));
        Report_AST.setForeground(Color.WHITE);
        Report_AST.setBackground(Color.BLACK);

        Report_CST = new JButton("Report CST");
        Report_CST.setBounds(680, 20, 150, 40);
        Report_CST.setFont(new Font("Retrow Mentho", Font.PLAIN, 17));
        Report_CST.setForeground(Color.WHITE);
        Report_CST.setBackground(Color.BLACK);
        ActionListener cst = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CST.open();
            }
        };
        Report_CST.addActionListener(cst);

        Report_SymbolTable = new JButton("Symbol Table");
        Report_SymbolTable.setBounds(845, 20, 150, 40);
        Report_SymbolTable.setFont(new Font("Retrow Mentho", Font.PLAIN, 17));
        Report_SymbolTable.setForeground(Color.WHITE);
        Report_SymbolTable.setBackground(Color.BLACK);

        Report_ErrorTable = new JButton("Error Table");
        Report_ErrorTable.setBounds(1010, 20, 150, 40);
        Report_ErrorTable.setFont(new Font("Retrow Mentho", Font.PLAIN, 17));
        Report_ErrorTable.setForeground(Color.WHITE);
        Report_ErrorTable.setBackground(Color.BLACK);
        ActionListener errors = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String report = "digraph E { tabla [label=<<TABLE>";
                for (Error err : Errors ){
                    report+=err.toString();
                }
                report +="</TABLE>>]; }";
                try {
                    FileWriter file = new FileWriter("ErrorTable.dot");
                    file.write(report);
                    file.close();

                    Runtime.getRuntime().exec("dot -Tpdf ErrorTable.dot -o ErrorTable.pdf");
                    File path = new File("C:\\Users\\EduardoA\\OneDrive\\Documentos\\Eduardo\\[OLC2]P1\\Proyecto 1\\ErrorTable.pdf");
                    Desktop.getDesktop().open(path);
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "No se ha podido generar la tabla");
                }
            }
        };
        Report_ErrorTable.addActionListener(errors);

        T_button = new JButton("Translator");
        T_button.setBounds(1175, 20, 150, 40);
        T_button.setFont(new Font("Retrow Mentho", Font.PLAIN, 17));
        T_button.setForeground(Color.WHITE);
        T_button.setBackground(Color.BLACK);
        ActionListener tra = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                img.setVisible(false);
                Translator.setVisible(false);
                translator_scroll.setVisible(false);
                Translator_R.setVisible(true);
                t_scroll.setVisible(true);

                Visitor c3d = new Visitor(visit.global, visit.Entry_stack, true);
                c3d.visit(startContext);

                try {
                    //FileWriter escrito3d = new FileWriter("c3d.txt");
                    String cad = "";
                    cad = c3d.c3d.getHeader()+'\n';
                    //escrito3d.write(c3d.c3d.getHeader() + '\n');
                    for (String text : c3d.c3d.Code3D) {
                        //escrito3d.write(text + '\n');
                        cad = cad + text+'\n';
                    }
                    //escrito3d.close();
                    Translator_R.setText(cad);
                    /*Translator_R.setText("Se genero la salida en txt");
                    File path = new File("C:\\Users\\EduardoA\\OneDrive\\Documentos\\Eduardo\\[OLC2]P1\\Proyecto 1\\c3d.txt");
                    Desktop.getDesktop().open(path);*/
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Nel vato");
                }
            }
        };
        T_button.addActionListener(tra);

        Delete = new JButton("Clear");
        Delete.setBounds(1350, 20, 120, 40);
        Delete.setFont(new Font("Retrow Mentho", Font.PLAIN, 17));
        Delete.setForeground(Color.WHITE);
        Delete.setBackground(Color.BLACK);
        ActionListener c = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Edit.setText("");
                Output.setText("");
                Translator_R.setText("");
            }
        };
        Delete.addActionListener(c);

//-----------------------------------------TextArea Area-----------------------------------------------------
        Edit = new JTextArea();
        Edit.setFont(new Font("Retrow Mentho", Font.PLAIN, 22));
        Edit.setForeground(Color.WHITE);
        Edit.setBackground(Color.BLACK);
        //Edit.setBounds(20, 80, 650, 750);
        //Edit.setEditable(false);
        bar_scroll = new JScrollPane(Edit);
        bar_scroll.setBounds(20, 140, 450, 600);

        Output = new JTextArea();
        Output.setFont(new Font("Retrow Mentho", Font.PLAIN, 22));
        Output.setForeground(Color.WHITE);
        Output.setBackground(Color.BLACK);
        Output.setEditable(false);
        output_scroll = new JScrollPane(Output);
        output_scroll.setBounds(495, 140, 450, 600);

        Translator = new JTextArea();
        Translator.setFont(new Font("Retrow Mentho", Font.PLAIN, 22));
        Translator.setForeground(Color.WHITE);
        Translator.setBackground(Color.BLACK);
        Translator.setEditable(false);
        translator_scroll = new JScrollPane(Translator);
        translator_scroll.setBounds(975, 140, 450, 50);
        translator_scroll.setVisible(false);

        Translator_R = new JTextArea();
        Translator_R.setFont(new Font("Retrow Mentho", Font.PLAIN, 22));
        Translator_R .setForeground(Color.WHITE);
        Translator_R .setBackground(Color.BLACK);
        Translator_R .setEditable(false);
        t_scroll = new JScrollPane(Translator_R);
        t_scroll.setBounds(975, 140, 450, 600);

//-------------------------------------------Panel Area----------------------------------------------------
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(25, 125, 700, 500);
        panel.setBackground(Color.DARK_GRAY);

        canvas = this.getContentPane();
        canvas.setBackground(Color.DARK_GRAY);
        canvas.add(Compiler);
        canvas.add(Open_File);
        canvas.add(Report_AST);
        canvas.add(Report_CST);
        canvas.add(Report_SymbolTable);
        canvas.add(Report_ErrorTable);
        //canvas.add(Edit);
        canvas.add(bar_scroll);
        canvas.add(output_scroll);
        canvas.add(translator_scroll);
        canvas.add(t_scroll);
        canvas.add(Translator_Button);
        canvas.add(In);
        canvas.add(Out);
        canvas.add(Translator_C);
        canvas.add(img);
        canvas.add(T_button);
        canvas.add(Delete);
    }

    public FileReader getFr() {
        return fr;
    }

    public void setFr(FileReader fr) {
        this.fr = fr;
    }

    public BufferedReader getBr() {
        return br;
    }

    public void setBr(BufferedReader br) {
        this.br = br;
    }

    public JButton getCompiler() {
        return Compiler;
    }

    public void setCompiler(JButton compiler) {
        Compiler = compiler;
    }

    public JButton getOpen_File() {
        return Open_File;
    }

    public void setOpen_File(JButton open_File) {
        Open_File = open_File;
    }

    public JButton getTranslator_Button() {
        return Translator_Button;
    }

    public void setTranslator_Button(JButton translator_Button) {
        Translator_Button = translator_Button;
    }

    public JButton getReport_AST() {
        return Report_AST;
    }

    public void setReport_AST(JButton report_AST) {
        Report_AST = report_AST;
    }

    public JButton getReport_CST() {
        return Report_CST;
    }

    public void setReport_CST(JButton report_CST) {
        Report_CST = report_CST;
    }

    public JButton getReport_SymbolTable() {
        return Report_SymbolTable;
    }

    public void setReport_SymbolTable(JButton report_SymbolTable) {
        Report_SymbolTable = report_SymbolTable;
    }

    public JButton getReport_ErrorTable() {
        return Report_ErrorTable;
    }

    public void setReport_ErrorTable(JButton report_ErrorTable) {
        Report_ErrorTable = report_ErrorTable;
    }

    public Container getCanvas() {
        return canvas;
    }

    public void setCanvas(Container canvas) {
        this.canvas = canvas;
    }

    public JTextArea getEdit() {
        return Edit;
    }

    public void setEdit(JTextArea edit) {
        Edit = edit;
    }

    public JTextArea getOutput() {
        return Output;
    }

    public void setOutput(JTextArea output) {
        Output = output;
    }

    public JTextArea getTranslator() {
        return Translator;
    }

    public void setTranslator(JTextArea translator) {
        Translator = translator;
    }

    public JScrollPane getBar_scroll() {
        return bar_scroll;
    }

    public void setBar_scroll(JScrollPane bar_scroll) {
        this.bar_scroll = bar_scroll;
    }

    public JScrollPane getOutput_scroll() {
        return output_scroll;
    }

    public void setOutput_scroll(JScrollPane output_scroll) {
        this.output_scroll = output_scroll;
    }

    public JScrollPane getTranslator_scroll() {
        return translator_scroll;
    }

    public void setTranslator_scroll(JScrollPane translator_scroll) {
        this.translator_scroll = translator_scroll;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getIn() {
        return In;
    }

    public void setIn(JLabel in) {
        In = in;
    }

    public JLabel getOut() {
        return Out;
    }

    public void setOut(JLabel out) {
        Out = out;
    }

    public JLabel getTranslator_C() {
        return Translator_C;
    }

    public void setTranslator_C(JLabel translator_C) {
        Translator_C = translator_C;
    }

    public JButton getT_button() {
        return T_button;
    }

    public void setT_button(JButton t_button) {
        T_button = t_button;
    }

    public JLabel getImg() {
        return img;
    }

    public void setImg(JLabel img) {
        this.img = img;
    }

    public JTextArea getTranslator_R() {
        return Translator_R;
    }

    public void setTranslator_R(JTextArea translator_R) {
        Translator_R = translator_R;
    }

    public JScrollPane getT_scroll() {
        return t_scroll;
    }

    public void setT_scroll(JScrollPane t_scroll) {
        this.t_scroll = t_scroll;
    }
}

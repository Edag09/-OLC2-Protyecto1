import java.util.ArrayList;
public class Translator {
    public ArrayList<String> Code3D;
    private int temp;
    private int tag;

    public Translator(){
        Code3D = new ArrayList<>();
        this.temp = -1;
        this.tag = -1;
    }

    public String generate_temporal(){
        this.temp++;
        return String.valueOf("t" + this.temp);
    }

    public String last_temporal(){
        return String.valueOf("t" + this.temp);
    }

    public String generate_tag(){
        this.tag++;
        return "L"+this.tag;
    }

    public String firstTag(){
        return String.valueOf("L"+this.tag);
    }

    public String last_tag(){
        return String.valueOf("L"+(this.tag-1));
    }

    public int tag(){
        return this.tag;
    }

    private String getPrintVars(){
        String tempStart = this.generate_temporal();
        String labelStart = this.generate_tag();
        return "void imprimir_variable(){\n" +
                tempStart + " = STACK[(int)P];\n" +
                labelStart + ":\n" +
                this.generate_temporal() + " = HEAP[(int)" + tempStart + "];\n" +
                "if (" + this.last_temporal() + " != -1) goto L" + (this.tag + 1) + ";\n" +
                "goto L" + (this.tag + 2) + ";\n" +
                this.generate_tag() + ":\n" +
                "printf(\"%c\", (char)" + this.last_temporal() + ");\n" +
                tempStart + "=" + tempStart + " + 1;\n" +
                "goto " + labelStart + ";\n" +
                this.generate_tag() + ":\n" +
                "printf(\"%c\\n\", (char)32);\n" +
                "return;\n" +
                "}\n\n";
    }

    private String getPrintStr(){
        String init_temp = this.generate_temporal();
        String init_tag = this.generate_tag();
        return "void imprimir_string(){\n" +
                init_temp + " = P;\n" +
                init_tag + ":\n" +
                this.generate_temporal() + " = HEAP[(int)" + init_temp + "];\n" +
                "if (" + this.last_temporal() + " != -1) goto L" + (this.tag + 1) + ";\n" +
                "goto L" + (this.tag + 2) + ";\n" +
                this.generate_tag() + ":\n" +
                "printf(\"%c\", (char)" + this.last_temporal() + ");\n" +
                init_temp + "=" + init_temp + " + 1;\n" +
                "goto " + init_tag + ";\n" +
                this.generate_tag() + ":\n" +
                "printf(\"%c\\n\", (char)32);\n" +
                "return;\n" +
                "}\n\n";
    }

    private String getPrintVarsInt(){
        return "void imprimir_var_int(){\n" +
                this.generate_temporal() + " = STACK[(int)P];\n" +
                "printf(\"%f\\n\", " + this.last_temporal() + ");" +
                "return;\n}\n\n";
    }


    public String getHeader(){
        String prints = this.getPrintVars() + this.getPrintVarsInt() + this.getPrintStr();
        // para obtener solo listado de temporales: t1, t2, t3, ... , tn;
        String temporales = "";
        for (int i = 0; i <= this.temp; i++)
            temporales += "t" + String.valueOf(i) + (i < this.temp ? "," : ";\n");

        return "#include <stdio.h>\n" +
                "#include <math.h>\n"+
                "double STACK[30101999];\n" +
                "double HEAP[30101999];\n" +
                "double P;\n" +
                "double H;\n" +
                "double " + temporales +
                "\n" + prints;
    }

}
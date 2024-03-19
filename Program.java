public class Program {
    //Private variables
    private DS ds; private SS ss;

    public Program() {
        ds = null;
        ss = null;
    }

    void parseProg(Tokenizer T) {
        //TODO: Error checking on program,begin,end tokens to verify bnf
        if (T.getToken() != 1) {
            System.out.println("Error on line " + T.getLine() + " Expected program token.");
            System.exit(-1);
        }
        T.skipToken(); //skip program

        ds = new DS(); //parse declaration sequence
        ds.parseDS(T);

        if (T.getToken() != 2) {
            System.out.println("Error on line " + T.getLine() + " Expected begin token.");
            System.exit(-1);
        }
        T.skipToken(); //skip begin

        ss = new SS(); //parse statement sequence
        ss.parseSS();

        T.skipToken(); //skip end
    }

    void printProg() {
        System.out.println("program");
        ds.printDS();
        System.out.println("begin");
        //ss.printSS(); //Pass indent level to printSS()??? TODO
        System.out.println("end");
    }

    void execProg() {
        //Do not need to execute ds
        ss.execSS();
    }
}


public class Declaration {
    //Private variables
    private IL il;

    public Declaration() {
        il = null;
    }

    public void parseDec(Tokenizer T) {
        if (T.getToken() != 4) {
            System.out.println("Error on line " + T.getLine() + " Expected int token.");
            System.exit(-1);
        }
        T.skipToken(); //skip int token

        il = new IL();
        il.parseIL(T);

        if (T.getToken() != 12) {
            System.out.println("Error on line " + T.getLine() + " Expected ; token.");
            System.exit(-1);
        }
        T.skipToken(); //skip ; token
    }

    public void printDec() {
        System.out.print("    int ");
        il.printIL();
        System.out.println(";");
    }
}

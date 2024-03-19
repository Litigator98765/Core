public class DS {
    //Private variables
    private Declaration d; private DS ds;

    public DS() {
        d = null;
        ds = null;
    }

    void parseDS(Tokenizer T) {
        d = new Declaration(); d.parseDec(T);
        //Check if next token is begin, if it is not, parse the rest of the DS
        if (T.getToken() != 2) {
            ds = new DS(); ds.parseDS(T);
        }
    }

    void printDS() {
        d.printDec();
        //if (ds != null) {ds.printDS();}
    }
}

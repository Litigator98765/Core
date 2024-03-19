public class SS {
    //Private variables
    private Stmt s; private SS ss;

    public SS() {
        s = null;
        ss = null;
    }

    void parseSS(Tokenizer T) {
        s = new Stmt(); s.parseStmt(T);
        //check if token is end. If not parse SS
        if (T.getToken() != 3) {
            ss = new SS(); ss.parseSS();
        }
    }

    void printSS() {
        s.printSS();
        if (ss != null) {ss.printSS();}
    }
}

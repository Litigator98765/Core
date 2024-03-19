public class Stmt {
    //Private variables
    private int altNo; private Assign s1; private If s2; private Loop s3;
    private Input s4; private Output s5;

    public Stmt() {
        altNo = 0;
        s1 = null;
        s2 = null;
        s3 = null;
        s4 = null;
        s5 = null;
    }

    public void parseStmt(Tokenizer T) {
        int tokNo = T.getToken();
        
        if (tokNo == 32) {
            //<assign>
            altNo = 1;
            s1 = new Assign(); s1.parseAssign();
        } else if (tokNo == 5) {
            //if
            altNo = 2;
            s2 = new If(); s2.parseIf();
        } else if (tokNo == 8) {
            //while
            altNo = 3;
            s3 = new Loop(); s3.parseLoop();
        } else if (tokNo == 10) {
            //input
            altNo = 4;
            s4 = new Input(); s4.parseInput();
        } else if (tokNo == 11) {
            //output
            altNo = 5;
            s5 = new Output(); s5.parseOutput();
        }
    }

    public void printStmt() {
        if (altNo == 32) {
            //<assign>
            altNo = 1;
            s1 = new Assign(); s1.parseAssign();
        } else if (altNo == 5) {
            //if
            altNo = 2;
            s2 = new If(); s2.parseIf();
        } else if (altNo == 8) {
            //while
            altNo = 3;
            s3 = new Loop(); s3.parseLoop();
        } else if (altNo == 10) {
            //input
            altNo = 4;
            s4 = new Input(); s4.parseInput();
        } else if (altNo == 11) {
            //output
            altNo = 5;
            s5 = new Output(); s5.parseOutput();
        }
    }
}

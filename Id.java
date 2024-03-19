import java.util.ArrayList;
import java.util.List;

public class Id {
    //Private variables
    private String name;
    private int val;
    private boolean initialized;
    //Static variables
    private static List<Id> idList = new ArrayList<>();
    private static int idCount = 0;

    private Id(String n) {
        name = n;
        //I don't think the next line is needed but it is in the notes
        //declared = false;
        initialized = false;
        val = 0; 
    }

    // Getter method for name
    //TODO SHOULD THIS BE PRIVATE??
    public String getName() {
        return name;
    }
    public int getVal() {
        return val;
    }
    public boolean getInit() {
        return initialized;
    }
    public static List<Id> getIdList() {
        return idList;
    }
    public void setVal(int num) {
        this.val = num;
    }

    //Used to parse <decl seq>
    public static void parseId1(Tokenizer T) {
        if (T.getToken() != 32) {
            System.out.println("Error on line " + T.getLine() + " Expected Id token.");
            System.exit(-1);
        }
        String n = T.idName();
        T.skipToken(); //skip the Id
        
        //Check if id exists yet
        boolean exists = false;
        for (int i = 0; i < idList.size(); i++) {
            if (idList.get(i).getName().equals(n)) {
                exists = true;
                break;
            }
        }
        //If Id already exists print error and exit
        if (exists) {
            System.out.println("ERROR: Double Declaration of ID: " + n);
            System.exit(-1);
        } else {
            Id id = new Id(n);
            idList.add(id);
        }
    }

    //Used to parse <stmt seq>
    public static void parseId2(Tokenizer T) {

    }

    public void printId() {
        System.out.print(this.getName());
    }
}

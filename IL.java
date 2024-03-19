// <id list> ::== <id> | <id>, <idlist>

import java.util.List;

public class IL {
    //Private variables
    //TODO How do I use the id variable if the constructor is private?
    //Don't need to because you can just access list.
    private Id id; private IL il;

    public IL() {
        id = null;
        il = null;
    }

    void parseIL(Tokenizer T) {
        Id.parseId1(T);
        //Check if next token is a comma, if so parse the following idlist
        if (T.getToken() == 13) {
            T.skipToken(); //skip , token
            il = new IL(); il.parseIL(T);
        }
    }

    void printIL() {
        List<Id> idList = Id.getIdList();
        //prints the whole Id list
        for (int i = 0; i < idList.size() - 1; i++) {
            idList.get(i).printId();
            System.out.print(", ");
        }
        idList.get(idList.size()-1).printId(); //Print last id with no ,
    }
}

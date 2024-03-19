import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//No token errors, but BNF, declaration errors
//IF BNF Error found, stop BEFORE execution begins
//One file with code, other with data to be read
//If data to be read is not there, stop execution with good error message
//If access uninitialized variable during execution stop with error message.
//If no errors, pretty print and execute

//write X, Y; should write X = 20\nY = 30

//Follow the principals of encapsilation. Or heavily penalized.


public class Core {
    public static void main(String[] args) 
        throws IOException
    {
            System.out.print("Enter input file: ");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            //TODO UNCOMMENT THIS
            //String inFile = in.readLine();

            Tokenizer T = new Tokenizer("in.txt");
            Program P = new Program();
            P.parseProg(T);
            P.printProg();
            //P.execProg();
    }
}
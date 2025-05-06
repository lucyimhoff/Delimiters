import java.util.ArrayList;
public class Delimiters{
    private String openDel;
    private String closeDel;

public Delimiters(String open, String close)
{
openDel = open;
closeDel = close;
}

public ArrayList<String> getDelimitersList(String[] tokens){
    ArrayList<String> delimiters = new ArrayList<String>();
    for(int i = 0; i < tokens.length; i++){
        if(tokens[i].equals(openDel) || tokens[i].equals(closeDel)){
            delimiters.add(tokens[i]);
        }
    }
    return delimiters;
}

public boolean isBalanced(ArrayList<String> delimiters){
    int opens = 0;
    int closes = 0;
    for(String s : delimiters){
        if(s.equals(openDel)) opens++;
        if(s.equals(closeDel)) closes++;
        if(closes > opens) return false;

    }
    return(closes == opens);

    }
}

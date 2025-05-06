import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
        Delimiters test = new Delimiters("(", ")");
       String[] test1 = {"(" ,"x + y", ")" ," * 5" };
        System.out.println(test.getDelimitersList(test1));

        Delimiters two = new Delimiters("<q>", "</q>");
        String[] test2 = {"<q>", "yy", "</q>", "zz", "</q>" };
         System.out.println(two.getDelimitersList(test2));

        String open = "<sup>";
        String close = "</sup>";
        test = new Delimiters(open, close);
        ArrayList<String> delimiters = new ArrayList<String>();
        String[] delims = {open, open, close, open, close, close};
        for(String s : delims) delimiters.add(s);
        System.out.println(test.isBalanced(delimiters));

        ArrayList<String> delimiters2 = new ArrayList<String>();
        String[] delims2 = {open, close, close, open};
        for(String s : delims2) delimiters2.add(s);
        System.out.println(test.isBalanced(delimiters2));

        ArrayList<String> delimiters3 = new ArrayList<String>();
        String[] delims3 = {close};
        for(String s : delims3) delimiters3.add(s);
        System.out.println(test.isBalanced(delimiters3));

        ArrayList<String> delimiters4 = new ArrayList<String>();
        String[] delims4 = {open, open, close};
        for(String s : delims4) delimiters4.add(s);
        System.out.println(test.isBalanced(delimiters4));


    }
}
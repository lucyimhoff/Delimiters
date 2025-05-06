import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
        Delimiters test = new Delimiters("(", ")");
       String[] test1 = {"(" ,"x + y", ")" ," * 5" };
        System.out.println(test.getDelimitersList(test1));

        Delimiters two = new Delimiters("<q>", "</q>");
        String[] test2 = {"<q>", "yy", "</q>", "zz", "</q>" };
         System.out.println(two.getDelimitersList(test2));
    }
}
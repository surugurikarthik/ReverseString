
import java.util.Scanner;

public class ReverseString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("");
       String k = sc.nextLine();
       String reverString = "";
       for(int i=k.length()-1;i>=0;i--) {
        reverString +=k.charAt(i);

       }
       System.out.println(reverString);
       sc.close();
    }
}

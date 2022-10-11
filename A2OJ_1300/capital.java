import java.util.Scanner;

public class capital {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        input=in.next();
        String s1,s2;
        s2=input.substring(1);
        s1=input.substring(0, 1);
        s1=s1.toUpperCase();
        String output = s1.concat(s2);
        System.out.println(output);
    }
}

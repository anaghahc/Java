import java.util.Scanner;

public class word {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int upper=0,lower=0;
        String output;
        String input = in.next();
        int l=input.length();
        for(int i=0;i<l;i++){
            if(Character.isUpperCase(input.charAt(i)))
                upper++;
            else
                lower++;
        }
        if(upper>lower)
           output = input.toUpperCase();
        else
            output = input.toLowerCase();
        
        System.out.println(output);
    }
}

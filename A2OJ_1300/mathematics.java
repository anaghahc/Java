import java.util.Scanner;

public class mathematics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1, s2;
        s1 = in.next();
        s2 = in.next();
        int l = s1.length();
        char arr[] = new char[l];
        for (int i = 0; i < l; i++) {
            if (s1.charAt(i) == s2.charAt(i))
                arr[i] = '0';
            else
                arr[i] = '1';
        }
        for (int i = 0; i < l; i++)
            System.out.print(arr[i]);
    }
}

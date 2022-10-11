import java.util.Scanner;

public class borze {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        input=in.next();
        int n=input.length();
        char arr[] = new char[n];
        for(int i=0;i<n;i++)
        arr[i]=input.charAt(i);
        for(int i=0;i<n;i++){
            if(arr[i]=='.')
                System.out.print("0");
            else if(arr[i]=='-'){
                i++;
                if(arr[i]=='.')
                    System.out.print('1');
                else
                    System.out.print('2');
            }
        }
    }
}

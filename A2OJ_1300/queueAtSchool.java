import java.util.Scanner;

public class queueAtSchool {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,t;
        n=in.nextInt();
        t=in.nextInt();
        String input = in.next();
        char arr[] = new char[n];
        for(int i=0;i<n;i++)
        arr[i]=input.charAt(i);
        for(int j=0;j<t;j++){
        for(int i=0;i<n-1;i++){
            if(arr[i] == 'B' && arr[i+1] == 'G'){
                arr[i]='G';
                arr[i+1]='B';
                i++;
            }
        }
    }
        for(int i=0;i<n;i++)
        System.out.print(arr[i]);
    }
    
}

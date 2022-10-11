import java.util.Scanner;

public class nearly {
    static boolean isLucky(int n){
         if(n==0)
             return false;
        while(n!=0){
            int d= n%10;
            n=n/10;
            if(d!=4 && d!=7)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.next();
        int l = s.length();
        int count=0;
        for(int i=0;i<l;i++){
            char ch = s.charAt(i);
            int d = ch-48;
            
            if(isLucky(d))
                count++;
        }
       
       if(isLucky(count))
            System.out.println("YES");
       else
           System.out.println("NO");
    }
    
}

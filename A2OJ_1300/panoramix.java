import java.util.Scanner;

public class panoramix{

    static Boolean isPrime(int n){

        int count = 0;
        for(int i = 1;i<=n;i++){
            if(n%i==0)
                count++;
        }
        
        if(count==2)
        return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,y,t;
        int flag=-1;
        x=in.nextInt();
        t=x;
        y=in.nextInt();
        if(isPrime(x))        
            flag++;
        while(true){
            t++;
            if(isPrime(t))
            break;
        }
        if(t==y)
            flag++;
        if(flag == 1)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}
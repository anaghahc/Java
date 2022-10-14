import java.util.*;
public class permutation {

    static int fact(int n){
        int ans = 1;
        for(int i =1; i<=n;i++){
            ans*=i;        
        }
        return ans;
    }

    static int perm (int n , int r){
        int perm = fact(n)/fact(n-r);
        return perm;
    }
    public static void main(String[] args) {
        int flag = -1;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1 ; i<=n ;i++){
            int perm = perm(n, perm(n, i));
            System.out.println(perm);
            // if(perm != i){
            // System.out.print(perm(n,i)+" ");
            // flag=1;
            // }
        }
        // if(flag == -1)
        // System.out.println(flag);
    }
}

import java.util.*;
public class stones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,count=0;
        String s;
        n = in.nextInt();
        s=in.next();
        int i=0;
        while(i<=n-2){
            if(s.charAt(i)==s.charAt(i+1)){
                String s1,s2;
                s1=s.substring(0,i);
                s2=s.substring(i+1);
                s=s1.concat(s2);
                count++;
                n--;
                continue;
            }
            i++;
        }
        System.out.println(count);
    }
}

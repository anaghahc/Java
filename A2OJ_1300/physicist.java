import java.util.*;;

public class physicist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        int sumx = 0;
        int sumy = 0;
        int sumz = 0;
        
        t = in.nextInt();
        int arrx[] = new int[t];
        int arry[] = new int[t];
        int arrz[] = new int[t];
        for (int i = 0; i < t; i++) {
            arrx[i] = in.nextInt();
            arry[i] = in.nextInt();
            arrz[i] = in.nextInt();
        }
        
        for (int i = 0; i < t; i++) {
            sumx += arrx[i];
            sumy += arry[i];
            sumz += arrz[i];
        }
       
        if (sumx == 0 && sumy == 0 && sumz == 0)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
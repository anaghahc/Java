import java.util.Scanner;

public class beautiful {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int d1,d2,d3,d4;
        while(true){
            year++;
            d1=year%10;
            d2=(year/10)%10;
            d3=(year/100)%10;
            d4=(year/1000)%10;

            if(d1!=d2 && d1!=d3 && d1!=d4 && d2!=d3 && d2!=d4 && d3!=d4){
                System.out.println(year);
                break;
            }
        }
    }
}

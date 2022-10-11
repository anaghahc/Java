import java.util.Scanner;

public class beatifulmat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=0,j=0;
        int ansx=0,ansy=0;
        int arr[][] = new int[5][5];
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                arr[i][j]=in.nextInt();
            }
        }
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                if(arr[i][j]==1){
                    ansx=i;
                    ansy=j;
                    break;
                }
            }
        }

        System.out.println(Math.abs(2-ansx)+Math.abs(2-ansy));
        
    }
}

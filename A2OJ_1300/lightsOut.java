import java.util.Scanner;

public class lightsOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int input[][] = new int[3][3];
        int output[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                input[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i + 1 < 3)
                    a = input[i + 1][j];
                if (i - 1 >= 0)
                    b = input[i - 1][j];
                if (j + 1 < 3)
                    c = input[i][j + 1];
                if (j - 1 >= 0)
                    d = input[i][j - 1];
                {
                    if ((input[i][j] + a + b + c + d) % 2 == 0)
                        output[i][j] = 1;
                    else
                        output[i][j] = 0;
                }
                a = 0;
                b = 0;
                c = 0;
                d = 0;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(output[i][j]);
            }
            System.out.println();
        }

    }

}

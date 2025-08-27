import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // jumlah test case
        System.out.print("Jumlah yang ingin dicoba: ");
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            try {
               System.out.print("Masukkan angka:  ");
               long n = sc.nextLong();
               System.out.println(n + " can be fitted in:");

               if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                  System.out.println("* byte");
               }
               if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                  System.out.println("* short");
               }
               if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                  System.out.println("* int");
               }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                  System.out.println("* long");
                }

            } catch (Exception e) {
                // kalau input lebih besar dari long, scanner akan error
                String tooBig = sc.next();
                System.out.println(tooBig + " can't be fitted anywhere.");
            }
        }

        sc.close();
    }
}

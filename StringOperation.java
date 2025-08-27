import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan String A: ");
        String A = sc.next(); 
        System.out.print("Masukkan String B: ");
        String B = sc.next(); 

        System.out.println(A.length() + B.length());

        if (A.compareTo(B) > 0) {
            System.out.println("Apakah A lebih Besar Dari B: Yes");
        } else {
            System.out.println("Apakah A lebih Besar Dari B: No");
        }

        String capA = A.substring(0,1).toUpperCase() + A.substring(1);
        String capB = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(capA + " " + capB);

        sc.close();
    }
}

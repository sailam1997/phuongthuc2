import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SumDigits sumDigits = new SumDigits();
        System.out.println("Moi Ban Nhap Vao So n");
        int n = scanner.nextInt();
        System.out.println("Tong cac chu so la " +getsumDigits(n));
    }

    public static int getsumDigits(int n) {
        int sumDigits=0;
        while (n != 0) {
            sumDigits+= n % 10;
            n /= 10;
        }
        return sumDigits;
    }


}

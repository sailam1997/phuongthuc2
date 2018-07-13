import java.util.Scanner;
 public class Pentagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pentagonal pentagonal = new Pentagonal();
        System.out.println("Moi ban nhap so n");
        int n = scanner.nextInt();
        System.out.println("Pentagonal is numner "+ getpentagonalNum(n));


    }
 public static  int getpentagonalNum(int n) {
        return (3 * n * n - n) / 2;
    }
}

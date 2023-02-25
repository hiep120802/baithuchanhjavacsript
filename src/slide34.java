import java.util.Scanner;

public class slide34 {
        private static Scanner scanner = new Scanner(System.in);
    /**
     * main
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Nhập hệ số bậc 2, a = ");
        float a = ((Scanner) slide34.scanner).nextFloat();
        System.out.print("Nhập hệ số bậc 1, b = ");
        float b = ((Scanner) slide34.scanner).nextFloat();
        System.out.print("Nhập hằng số tự do, c = ");
        float c = scanner.nextFloat();
        App.giaiPTBac2(a, b, c);
    }
     
    /**
     * @param a
     * @param b
     * @param c
     */
    public static void giaiPTBac2(final float a, final float b, final float c) {
    }

}
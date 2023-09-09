import java.util.Scanner;
public class pz_5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество испеченных пирожков (четное число): ");
        int tP = scanner.nextInt();

        if (tP % 2 == 0) {
            int piesForGrandma = tP / 2;
            System.out.println("Красная Шапочка сможет донести " + piesForGrandma + " пирожков до бабушки.");
        }
        else {
            int evenTotalPies = tP - 1;
            int piesForGrandma = evenTotalPies / 2;
            System.out.println("Красная Шапочка сможет донести " + piesForGrandma + " пирожков до бабушки.");
        }

    }
}


//С клавиатуры построчно вводятся три строки.
// Необходимо определить, все ли они равны.
// Если да, то вывести «Yes», в противном случае – «No».
import java.util.Scanner;
public class pz_3_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("введите первую строку: ");
        String s1 = sc.nextLine();
        System.out.print("введите вторую строку: ");
        String s2 = sc.nextLine();
        System.out.print("введите третью строку: ");
        String s3 = sc.nextLine();
        if (s1.equals(s2) && s2.equals(s3)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

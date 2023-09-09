
//Напишите программу, которая считывает два вещественных числа и выводит их частное.
import java.util.Scanner;
public class pz_5_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("введите первое число: ");
        double d1 = sc.nextDouble();
        System.out.print("введите второе число: ");
        double d2 = sc.nextDouble();
        double res = d1 / d2;
        System.out.println(res);
    }
}

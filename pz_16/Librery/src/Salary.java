import java.util.Objects;
import java.util.Scanner;
public interface Salary {
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    default void Selerys(){
        System.out.println("Введите должность сотрудника: ");
        String a = sc.nextLine();
        if(Objects.equals(a, "уборщик")) {
            System.out.println("Зарплата уборщика: 25000 руб. + премия 5000 руб");
        }
        else if(Objects.equals(a, "библиотекарь")) {
            System.out.println("Зарплата библиотекаря: 45000 руб. + премия 8000 руб");
        }
        else if(Objects.equals(a, "Старший библиотекарь")){
            System.out.println("Зарплата  старшего библиотекаря: 65000 руб. + премия 10000 руб");
        }
        else if(Objects.equals(a, "библиограф")) {
            System.out.println("Зарплата  библиографа: 54000 руб. + премия 8500 руб");
        }
        else if(Objects.equals(a, "Научный сотрудник")){
            System.out.println("Зарплата  научного сотрудника: 60000 руб. + премия 7500 руб");
        }
        else{
            System.out.println("Информации нет!");
        }
    }

}

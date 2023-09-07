/*import java.util.Scanner;
 public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("введите время");
        int time = s.nextInt();
        System.out.print("введите скорость");
        int speed = s.nextInt();
        int distanse = time*speed;
        System.out.println("пройденный путь(км):" + distanse);
        s.close();
    }
}
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("Число: ");
        int num = s.nextInt();
        int next = num + 1;
        int prev = num - 1;
        System.out.println("the next number for the number: " + num + " is " + next);
        System.out.println("the previous number for the number: " + num + " is " + prev);
        s.close();
	}
}

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("введите дину прямоугольника: ");
        int dl = s.nextInt();
        System.out.print("введите ширину прямоугольника: ");
        int sh = s.nextInt();
        int perim = dl*2 + sh*2;
        int plosh = dl * sh;
        System.out.println("периметр прямоугольника равен: " + perim);
        System.out.println("площадь прямоугольника: " + plosh);
	}
}

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("введите число: ");
        int num = s.nextInt();
        System.out.print("введите ширину прямоугольника: ");
        int next = (num/2+1)*2;
        System.out.println("следующее четное число: " + next);
	}
}


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("введите стоимость пирожка в рублях и копейках: ");
        int rub = s.nextInt();
        int kop = s.nextInt();
        System.out.print("кол-во пирожков: ");
        int pir = s.nextInt();
        System.out.println("стоимость всех пирожков " + rub*pir+ " руб "+ kop+pir+" коп ");
	}
}



import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("введите целое число: ");
        int n = s.nextInt();
        System.out.print("введите ширину прямоугольника: ");
        int lst = n % 10;
        System.out.println("последняя цифра вашего числа: " + lst);
	}
}

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("введите трехзнчное число: ");
        int n = s.nextInt();
        int ch1 = n/100;
        int ch2 = (n/10)%10;
        int ch3 = n%10;
        int summa = ch1+ch2+ch3;
        System.out.println("сумма цифр числа " + summa);
	}
}

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("введите скорость авто: ");
        int sk = s.nextInt();
        System.out.print("введите время(в чaсах): ");
        int t = s.nextInt();
        int dis = sk * t;
        int pos = (dis % 109 + 109) % 109;
        
        System.out.println("авто остановится на позиции " + pos);
	}
}

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("введите высоту шеста: ");
        int h = s.nextInt();
        System.out.print("введите расстояние вверх за 1 день : ");
        int a = s.nextInt();
        System.out.print("введите расстояние вниз за 1 ночь(меньше чем вверх!!!) : ");
        int b = s.nextInt();
        int winday = (h-b-1)/(a-b) +1;
        
        System.out.println("улитка доползет за  " + winday+ " дней");
	}
}
*/

1.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];


        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        
        System.out.println("Сумма всех элементов: " + sum);

        System.out.println("Элементы в обратном порядке:");
        for (int i = n - 1; i>= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

	
}
2.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        int evenSum = 0;
        Scanner userinput = new Scanner(System.in);
        int n = userinput.nextInt();
        int[] arr = new int[n];



        System.out.println("введите числа через enter: ");
        for(int i = 0; i<n; i++) {
                
                arr[i] = userinput.nextInt();
                
        }
        for(int i = 0; i<n; i++) {
            if(i % 2 == 0){
                
                System.out.println("числа, которые мы складываем: " + arr[i]);
                evenSum +=arr[i];
            }    
        }
        System.out.println("сумма чисел с четным индексом: " + evenSum);
        
    }
	
}

4.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Кол-во человек в строю: ");
        
        int n = scanner.nextInt();
        int[] heights = new int[n];

        System.out.println("рост каждого в строю: ");
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        System.out.println("рост Пети: ");
        int petyasHeight = scanner.nextInt();

        int position = 1;
        // while (position <= n && heights[position - 1] > petyasHeight) {
        //     position++;
        // }
        for(int i = 0; i < n; i++){
            if (petyasHeight <= heights[i]){
                position++;
            }
        }

        System.out.println("Петя должен встать на позицию: " + position);
    }
}

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        /*Напечатайте "лесенку" из чисел от единицы до n, n > 0.
Примечание. Каждая строка в "лесенке" заканчивается цифрой (не пробелом).
Sample Input:
3
Sample Output:
1
1 2
1 2 3
*/
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" "+(j+1));
            }
            System.out.println();

        }
        /*На вход подаётся несколько целых чисел. Выведите эти числа, возведённые в степени от двух до пяти.
        Формат вывода: для каждого введённого числа степени выводятся в отдельной строке через пробел.
        Sample Input:
1 2 3
Sample Output:
1 1 1 1
4 8 16 32
9 27 81 243
*/
        int[] arr=new int[3];
        arr[0]= sc.nextInt();
        arr[1]= sc.nextInt();
        arr[2]= sc.nextInt();
        for (int a:arr) {
            int result=a;
            for (int i = 2; i <=5; i++) {

                result*=a;
                System.out.print(result+" ");
                
            }
            System.out.println();
            
        }
        

    }
}

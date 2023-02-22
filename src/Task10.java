import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
/*На вход подаётся натуральное число n, затем несколько целых чисел, разделённых пробелом, а на следующей строке - натуральное число k.
Выведите k-е по счёту число по возрастанию. Если такого числа нет, выведите "Ошибка ввода".
Sample Input:
5
3 12 1 22 17
3
Sample Output:
12

*/
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        Arrays.sort(arr);
        System.out.println(k>n? "Ошибка ввода" : arr[k-1]);

/*На вход подаётся последовательность целых чисел.
Создайте из этой последовательности массив чисел, отсортированный по возрастанию, и выведите на печать.
Sample Input:
3 6 2 14 1
Sample Output:
[1, 2, 3, 6, 14]
*/
int[]arr2=new int[6];
        for (int i = 0; i < arr2.length; i++) {
             arr2[i]= sc.nextInt();

        }
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");

        }

    }
}
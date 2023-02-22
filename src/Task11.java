import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
   /* На ввод подаётся последовательность целых чисел.
   Поменяйте местами соседние элементы последовательности (второй с третьим, четвёртый с пятым и т.д.),
   кроме первого и последнего.
   Если находится "одинокий" элемент, который не с чем поменять - необходимо оставить его на месте.
   Sample Input:
1 2 3 4 5 6
Sample Output:
1 3 2 5 4 6
   */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length-1 ;i++) {
            if (i+1< arr.length){
            int x=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=x;
            i++;}
        }
        System.out.println(Arrays.toString(arr));
        /*Два индийских программиста, Махатма и Джавахарлал,
        вдруг обнаружили, что таблица умножения иногда весьма полезна для программистов, и решили её выучить.
        Помогите нашим индийским друзьям!
        На вход подаются числа n и m. Выведите таблицу умножения n * m (см. пример).
        Sample Input:
        3 4
        Sample Output:
        1 2 3 4
        2 4 6 8
        3 6 9 12

        */
        int n= sc.nextInt();
        int m= sc.nextInt();
        int [][] arr2=new int[n][m];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m ; j++) {
                arr2[i][j]=(i+1)*(j+1);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr2[i][j]+" ");


            }
            System.out.println();
        }





    }
}

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        /*На вход подаётся строка из элементов, разделённых запятой. Создайте из неё массив и выведите элементы массива каждый в отдельной строке.
 Sample Input:
1,2,3,4,5
Sample Output:
1
2
3
4
5
*/
        String s=sc.nextLine();
        String[] splitInt=s.split(",");
        for (String a:splitInt)
            System.out.println(a);

        /*На вход подаётся натуральное число n.
        Создайте массив натуральных чисел от единицы до n включительно и выведите его на печать (в одной строке, через пробел).
        Sample Input:
        5
        Sample Output:
        1 2 3 4 5
         */

         int n= sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < n; i++)
            arr[i]=i+1;

        for (int i = 0; i < arr.length; i++)
        System.out.print(arr[i]+" ");

        /*На вход подаётся натуральное число n > 0 (длина массива), а на следующей строке - последовательность целых чисел.
        Создайте из неё массив и выведите на печать значение последнего элемента массива.
        Sample Input:
            5
        1 2 3 4 5
        Sample Output:
        5
        */
        int arrLength= sc.nextInt();
        int [] arr2=new int[arrLength];
        for (int i = 0; i < arr2.length; i++)
            arr2[i]= sc.nextInt();
        System.out.println(arr2[arrLength-1]);
        }
    }


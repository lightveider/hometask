package hometask4;

import java.util.Arrays;

public class Hometask4Arrays {
    public static void main(String[] args) {

        //Задание1
        //
    /*    double[] arr = new double[20];
        double min = Double.MIN_VALUE;
        double max = Double.MAX_VALUE;
        double exchange;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 497 + 3;
            if (arr[i] < max) max = arr[i]; // поиск минимального
                {minInd = i};
            if (arr[i] > min) min = arr[i]; // поиск максимального
                {maxInd =i};

           min ==
           minInd =2;
           max = 67
           maxind =3;
           // как запомнить максимальный и минимальный индекс


        }
        System.out.println(Arrays.toString(arr));
        System.out.println(min);
        System.out.println(max);

*/
        // Вторая
        /*int counter = 0;
        int counterNeChet = 0;
        int array[] = {78, 32, 76, 100, 0, 6301, 331, 77, 24, 2, 90};


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter++;
            }


        }
        for (int i = 0; i < array.length; i++) {
            int

        }
        System.out.println(counter);
*/

        int abc[] = new int[10];
        int cba[] = new int[10];
        for (int i = 0, j = 9; i < abc.length; i++,j--) {
            abc[i] = i * 2 + 2;
            cba[j] = abc[i];

            }


        System.out.println(Arrays.toString(abc));
        System.out.println(Arrays.toString(cba));

        // пятая задача рандом -3 +1
    }
}

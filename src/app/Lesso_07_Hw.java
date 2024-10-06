package app;

import java.util.Arrays;
import java.util.Random;

public class Lesso_07_Hw {
    public static void main(String[]args){

        Random random = new Random();
        int[] array = new int[20];

        int numMin = 0;
        int in1 = 0;
        int numMax = 0;
        int in2 = 0;
        int sumNeg = 0;
        int numEven = 0;
        int numOdd = 0;


        int sum = 0;
        int minIndNeg = Integer.MAX_VALUE;
        int sum2 = array[0];
        double avgSum = 0;


        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(200) - 100;


            if (array[index] < 0) {
                sumNeg += array[index];
            }
            if (array[index] < numMin) {
                numMin = array[index];
                in1 = index;
            }
            if (array[index] > numMax) {
                numMax = array[index];
                in2 = index;
            }
            if (array[index] % 2 == 0) {
                numEven++;
            }
            if (array[index] % 2 != 0) {
                numOdd++;
            }
            if (array[index] < sum2) {
                minIndNeg = Math.min(minIndNeg, index + 1);
            }
            if (index >= minIndNeg) {
                sum += array[index];
                avgSum = (double) sum / array.length;
            }}


        System.out.println("Елементи масиву: " + Arrays.toString(array));
        System.out.println("Сума від'ємних чисел: " + sumNeg);

        System.out.println("Кількість парних чисел: " + numEven);
        System.out.println("Кількість ннепарних чисел: " + numOdd);

        System.out.println("Найменший елемент: " + numMin + " (з індексом " + in1 + ")");
        System.out.println("Найбільший елемент: " + numMax + " (з індексом " + in2 + ")");

        System.out.println("Середнє арифметичне чисел після першого від'ємного числа: " + avgSum);
    }
}

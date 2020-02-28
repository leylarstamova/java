package massivithebest;

import java.util.Arrays;

public class MAIN {

    public static void main(String[] args) {
        int[] cat = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] dog = becomeDog(cat);
        System.out.println(Arrays.toString(dog));

        int[] arr = new int[8];
        int[] arrFull = getFull(arr);
        System.out.println(Arrays.toString(arrFull));

        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arrayChange = changeArray(array);
        System.out.println(Arrays.toString(arrayChange));

        int[] box = {140, 50, 77, 134, 28, 89};
        int boxMax = getMax(box);
        int boxMin = getMin(box);
        System.out.println("Максимальное и минимальное значение: " + boxMax + " и " + boxMin);

        int[][] arr2 = new int[3][3];
        int n = 3;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if( i == j ) arr2[i][j] = 1;
            }

        }
        for (int i = 2; i >= 0 ; i--) {
            for (int j = 0; j < 3; j++) {
                if( j == n - i - 1) arr2[i][j] = 1;
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }




    }

    private static int[] becomeDog(int[] cat) {
        for (int i = 0; i < 10; i++) {
            if (cat[i] == 1) {
                cat[i] = 0;
            } else {
                cat[i] = 1;
            }
        }
        return cat;
    }

    private static int[] getFull(int[] arr) {
        for (int i = 0; i < 8; i++) {
            arr[i] = i * 3;
        }
        return arr;
    }


    private static int[] changeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            } else {
                array[i] = array[i];
            }
        }
        return array;
    }


    private static int getMin(int[] box) {
        int min = box[0];
        for (int i = 1; i < 6; i++) {
            if (box[i] < min) {
                min = box[i];
            }
        }
        return min;
    }

    private static int getMax(int[] box) {
        int max = box[0];
        for (int i = 1; i < 6; i++) {
            if (box[i] > max) {
                max = box[i];
            }
        }
        return max;
    }
}
















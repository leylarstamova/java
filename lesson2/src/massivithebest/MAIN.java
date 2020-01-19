package massivithebest;

import java.util.Arrays;

public class MAIN {

    public static void main(String[] args){
        int [] cat = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        int [] dog = becomeDog(cat);

        System.out.print(Arrays.toString(dog));
    }

    private static int[] becomeDog(int [] cat) {
        for(int i = 0; i < 10; i++){
            if(cat[i] == 1){
                cat[i] = 0;
            } else {
                cat[i] = 1;
            }
        }
        return cat;
    }
}
class MAIN2{
    public static void main(String[] args){
        int[] arr = new int[8];
        int[] arrFull = getFull(arr);
        System.out.print(Arrays.toString(arrFull));
    }
    private static int[] getFull(int[] arr) {
        for(int i = 0; i < 8; i++){
            arr[i] = 1 + i*3;
        }
        return arr;
    }
}

class MAIN3{
    public static void main(String[] args){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arrayChange = changeArray(array);
        System.out.print(Arrays.toString(arrayChange));
    }
    private static int[] changeArray(int[] array) {
        for(int i = 0; i < array.length; i++){
            if(array[i] < 6){
                array[i] = array[i] * 2;
            } else {
                array[i] = array [i];
            }
        }
        return array;
    }
}

class MAIN4{
    public static void main(String[] args){
        int[] box = {140, 50, 77, 134, 28, 89};
        int boxMax = getMax(box);
        int boxMin = getMin(box);
        System.out.print("Максимальное и минимальное значение: " + boxMax + " и " + boxMin);
    }
    private static int getMin(int[] box) {
        int min = box[0];
        for(int i = 1; i < 6; i++){
            if(box[i] < min){
                min = box[i];
            }
        }
        return min;
    }
    private static int getMax(int[] box) {
        int max = box[0];
        for(int i = 1; i < 6; i++){
            if(box[i] > max){
                max = box[i];
            }
        }
        return max;
    }


}












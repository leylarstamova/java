package massivithebest;

import java.util.Arrays;

public class MAIN {

    public static void main(String[] args){
        int [] korobka = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
            for(int i = 0; i < 10; i++){
                if(korobka[i] == 1){
                    korobka[i] = 0;
                } else {
                   korobka[i] = 1;
                }
            }
        System.out.print(Arrays.toString(korobka));
    }
}
class MAIN2{

    public static void main(String[] args){
        int[] arr = new int[8];
            for(int i = 0; i < 8; i++){
                arr[i] = 1 + i*3;
            }
        System.out.print(Arrays.toString(arr));
    }
}

class MAIN3{

    public static void main(String[] args){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < array.length; i++){
            if(array[i] < 6){
                array[i] = array[i] * 2;
            } else {
                array[i] = array [i];
            }
        }
        System.out.print(Arrays.toString(array));
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












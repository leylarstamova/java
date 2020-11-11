import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws MyArraySizeException {
        String memey[][] = new String[4][4];
        memey[0][0] = "1";
        memey[0][1] = "23";
        memey[0][2] = "14";
        memey[0][3] = "100";
        memey[1][0] = "15";
        memey[1][1] = "5";
        memey[1][2] = "4";
        memey[1][3] = "54";
        memey[2][0] = "18";
        memey[2][1] = "3";
        memey[2][2] = "54";
        memey[2][3] = "2";
        memey[3][0] = "5";
        memey[3][1] = "151";
        memey[3][2] = "55";
        memey[3][3] = "333";

        System.out.println("Общая сумма всех ячеек в массиве: " + sum(memey));

    }


    public static int sum(String[][] memey) throws MyArraySizeException
    {
        int sumeme = 0;
        int dv1 = memey.length;
        int dv2 = memey[0].length;
        if (dv1 != 4 || dv2 != 4){
            throw new MyArraySizeException("Должно быть 4х4. По факту " + dv1 + " на " + dv2);
        }

        for (int i = 0; i < dv1 ; i++) {
            for (int j = 0; j < dv2 ; j++) {
                try{
                    sumeme += Integer.parseInt(memey[i][j]);

                } catch (NumberFormatException s){
                    throw new MyArrayDataException("В ячейке " + i + "-" + j + " неверные данные: " + memey[i][j]);
                }

            }

        }
        return sumeme;
    }

}

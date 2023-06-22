import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task123();
        task4();


    }

    public static void task123(){
        System.out.println("Задание 1, 2, 3");
        int [] integerArray = new int[3];
        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;
        System.out.println("Целочисленный массив:");
        for (int i = 0; i < integerArray.length; i++) {
            if (i == integerArray.length - 1) {
                System.out.print(integerArray[i]);
            } else {
                System.out.print(integerArray[i] + ", ");
            }
        }
        System.out.println("\nЦелочисленный массив(обратный порядок):");
        for (int i = integerArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(integerArray[i]);
            } else {
                System.out.print(integerArray[i] + ", ");
            }
        }

        System.out.println("\nМассив с дробными числами: ");
        double [] floatArray = { 1.57, 7.654, 9.986};
        for (int i = 0; i < floatArray.length; i++) {
            if (i == floatArray.length - 1) {
                System.out.print(floatArray[i]);
            } else {
                System.out.print(floatArray[i] + ", ");
            }
        }
        System.out.println("\nМассив с дробными числами(обратный порядок):");
        for (int i = floatArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(floatArray[i]);
            } else {
                System.out.print(floatArray[i] + ", ");
            }
        }

        System.out.println("\nПроизвольный массив: ");
        int arbitrarilyArray[] = { 2, 0 , 0, 6, 2, 0, 2, 3};
        for (int i = 0; i < arbitrarilyArray.length; i++) {
            if (i == arbitrarilyArray.length - 1) {
                System.out.print(arbitrarilyArray[i]);
            } else {
                System.out.print(arbitrarilyArray[i] + ", ");
            }
        }
        System.out.println("\nПроизвольный массив(обратный порядок):");
        for (int i = arbitrarilyArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arbitrarilyArray[i]);
            } else {
                System.out.print(arbitrarilyArray[i] + ", ");
            }
        }
    }
    public static void task4(){
        System.out.println("\nЗадание 4");
        int [] integerArray = new int[3];
        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;
        System.out.println("Целочисленный массив:");
        System.out.println(Arrays.toString(integerArray));
        System.out.println("Целочисленный четный массив:");
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 != 0) {
                integerArray[i]++;
            }
        }
        System.out.println(Arrays.toString(integerArray));
    }
}
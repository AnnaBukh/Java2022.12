//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package HW_1;

import java.io.FileWriter;
import java.time.LocalDateTime;

public class HW_2_1 {

    public static void printArr(int[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void sort(int[] array){
        int count;
        do {
            count = 0; 
            for (int i = 0; i < array.length - 1; i++){
                if (array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                    String str = "Выполнена замена элемента " + i + " на элемент " + (i + 1); 
                    logger(str);
                }
            }
        }
        while (count > 0);
    }

        public static void logger(String text){
            try {
                FileWriter log = new FileWriter("log_2_1.txt", true);
                log.write(LocalDateTime.now() + " " + text + "\n");
                log.flush();
            }
            catch(Exception ex){
                System.out.println(ex);
            }
         }

    public static void main(String[] args){

        int[] arr = {3, 2, 1};

        printArr(arr);
        sort(arr);
        System.out.println();
        printArr(arr);

    }
}

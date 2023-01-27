/* 2) Реализуйте алгоритм сортировки пузырьком числового массива, 
результат после каждой итерации запишите в лог-файл. */

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class homeWork_2_1 {
    public static void main(String args[]) {
        int[] sortArr = {2, 6, 4, 1, 5, 9};
        try {
            bubbleSort(sortArr);
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + "\n");
        }
    }

    public static void bubbleSort(int[] sortArr) throws IOException {
        Logger loger = Logger.getLogger(homeWork_2_1.class.getName());
        FileHandler fHandler = new FileHandler("task2_log.txt");
        SimpleFormatter sFormatter = new SimpleFormatter();
        fHandler.setFormatter(sFormatter);
        loger.addHandler(fHandler);

        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
            loger.info(Arrays.toString(sortArr));
        }
        loger.info(Arrays.toString(sortArr));
    }

    public static void print(int[] sortArr) {
        for (int i = 0; i < sortArr.length; i++) {
            System.out.print(sortArr[i] + " ");
        }
    }

}
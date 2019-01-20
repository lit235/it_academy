package HW_Arrays;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

//Написать программу, удаляющую все повторяющиеся целые числа из массива и печатающую результат.
public class Arrays_2 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 1, 1, 3, 3, 5, 6, 5, 7};
        System.out.println(Arrays.toString(myArray));
        removeDuplicate(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void removeDuplicate(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] == myArray[i]) {
                    myArray[i] = 0;
                    break;
                }
            }
        }
    }
}

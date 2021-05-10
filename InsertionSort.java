import java.util.*;
import java.io.*;
class InsertionSort{

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        InsertionSort obj = new InsertionSort();
        int[] result = obj.insertionsort(arr);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);

        }

    }
    public int[] insertionsort(int[] array){
        // System.out.println(array.length);
        for(int j = 1;j<array.length;j++){

            int key = array[j];
            int i = j-1;
            while(i>=0 && array[i]>key){

                array[i+1] = array[i];
                i= i-1;
            }
            array[i+1] = key;

        }
        

        return array;
    }

}
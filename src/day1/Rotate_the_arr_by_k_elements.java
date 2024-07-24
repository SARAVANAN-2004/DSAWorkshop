package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Rotate_the_arr_by_k_elements {

        public static void main(String[] args) {
//              int[] arr = {1,2,3,4,5,6,7};

//
//        int n = 7;
            Scanner in = new Scanner(System.in);
            System.out.println("enter the size");
            int n = in.nextInt();
            int[] arr = new int[n];
            System.out.println("enter the element of the array");
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println("enter the r");
            int r = in.nextInt();

            int[] temp = new  int[r];
            for(int  i =0 ; i<r;i++){
                temp[i] = arr[i];
            }
            for (int i = 0; i < arr.length-r; i++) {
                arr[i] = arr[i+r];
            }
            int i = arr.length-r;
            for (int j = 0; j < r; j++) {
                arr[i++] = temp[j];
            }
            System.out.println(Arrays.toString(arr));
        }


}

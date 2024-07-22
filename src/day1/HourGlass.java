package day1;

import java.util.Stack;

public class HourGlass {
    public static void main(String[] args) {
        int r = 5;
        int c = 5;
        int sum  =Integer.MIN_VALUE ;
        int[][] arr = {
                {1,2,4,5,6},
                {7,5,2,3,6},
                {0,0,0,0,0,},
                {7,5,1,3,5},
                {0,0,0,0,0}
        };

        for (int i  = 0 ; i < r-2 ; i++) {
            for (int j = 0; j < c - 2; j++) {
                int ans = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                sum = Math.max(ans,sum);
            }
        }
        System.out.println(sum);

    }
}

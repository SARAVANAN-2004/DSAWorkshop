package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rat_In_a_maze {

    public static void main(String[] args) {

        /*
        Consider a rat placed at (0, 0) in a square matrix of order N * N. It has to reach the destination at (N – 1, N – 1). Find all possible paths that the rat can take to reach from source to destination. The directions in which the rat can move are ‘U'(up), ‘D'(down), ‘L’ (left), ‘R’ (right). Value 0 at a cell in the matrix represents that it is blocked and rat cannot move to it while value 1 at a cell in the matrix represents that rat can be travel through it. Return the list of paths in lexicographically increasing order.
Note: In a path, no cell can be visited more than one time. If the source cell is 0, the rat cannot move to any other cell.
         */

        /*
        Input: mat[][] = {{1, 0, 0, 0},
         {1, 1, 0, 1},
         {1, 1, 0, 0},
         {0, 1, 1, 1}}
Output:
DDRDRR DRDDRR
         */
        int[][] arr = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1,1,0,0},
                {0,1,1,1}
        };
        int n = arr.length;
        StringBuilder temp = new StringBuilder();
        List<String> res = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        if (arr[0][0] ==1){
            find(res,temp,arr,n,0,0,visited);
        }
        String mov = "A";
        mov+="B";
        System.out.println(mov);
        System.out.println(res);

    }
    public static void  find(List<String> res,StringBuilder temp,int[][] arr,int n,int i,int j,boolean[][] visited){
        if (i == n-1 && j == n-1){
            res.add(temp.toString());
            return;
        }
        // down
        if (i+1 < n && arr[i+1][j] == 1 && !visited[i+1][j] ){
            visited[i][j] = true;
            temp.append("D");
            find(res, temp, arr, n, i+1, j, visited);
            temp.deleteCharAt(temp.length()-1);
            visited[i][j] = false;
        }
        // left
        if (j-1 >= 0 && arr[i][j-1] == 1 && !visited[i][j-1] ){
            visited[i][j] = true;
            temp.append("L");
            find(res, temp, arr, n, i, j-1, visited);
            temp.deleteCharAt(temp.length()-1);
            visited[i][j] = false;
        }
        //right
        if (j+1 < n && arr[i][j+1] == 1 && !visited[i][j+1] ){
            visited[i][j] = true;
            temp.append("R");
            find(res, temp, arr, n, i, j+1, visited);
            temp.deleteCharAt(temp.length()-1);
            visited[i][j] = false;
        }
        // up
        if (i-1 >=0 && arr[i-1][j] == 1 && !visited[i-1][j] ){
            visited[i][j] = true;
            temp.append("U");
            find(res, temp, arr, n, i-1, j, visited);
            temp.deleteCharAt(temp.length()-1);
            visited[i][j] = false;
        }

    }
}

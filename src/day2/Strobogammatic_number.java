package day2;

import java.util.HashMap;
import java.util.Scanner;

public class Strobogammatic_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        HashMap<Character,Character> map = new HashMap<>();
        map.put('1','1');
        map.put('0','0');
        map.put('8','8');
        map.put('6','6');
        map.put('9','6');
        int i = 0;
        int j = n.length()-1;
        while (i<=j){
            if (!map.containsKey(n.charAt(i)) || !map.containsKey(n.charAt(j)) || map.get(n.charAt(i)) != map.get(n.charAt(j))){
                System.out.println(false);
                return;
            }
            i++;
            j--;
        }
        System.out.println(true);
    }
}

package day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {
    public static void main(String[] args) {
        /*
        Input:
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
         */
        String digits = "23";
        HashMap<String,String> number = new HashMap<>();
        number.put("2","abc");
        number.put("3","def");
        number.put("4","ghi");
        number.put("5","jkl");
        number.put("6","mno");
        number.put("7","pqrs");
        number.put("8","tuv");
        number.put("9","wxyz");

        List<String> res = new ArrayList<>();
        if(digits.length() == 0){
            System.out.println(res);
        }
        System.out.println(digits.charAt(0));
        find(res,new StringBuilder(),digits,number,0);
        System.out.println(res);
    }
    static  void find(List<String> res,StringBuilder temp,String digits,HashMap numbers,int st){
        if(temp.length() == digits.length()){
            res.add(temp.toString());
            return;
        }
        String cur = numbers.get(String.valueOf(digits.charAt(st))).toString();

        for(int i = st;i<cur.length();i++){
            temp.append(cur.charAt(i));
            find(res,temp,digits,numbers,st+1);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}

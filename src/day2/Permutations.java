package day2;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
//        Input: nums = [1,2,3]
//        Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

        int[] nums = {1,2,3};
//        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        find(res,new ArrayList<Integer>(),nums);
        System.out.println(res);
    }
    public static void find(List<List<Integer>> res,List<Integer> temp,int[] nums){
        if (temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
                                                                                                                                                                                                   if (!temp.contains(nums[i])){

                temp.add(nums[i]);

            find(res, temp, nums);
            temp.remove(temp.size()-1);}
        }
    }


}

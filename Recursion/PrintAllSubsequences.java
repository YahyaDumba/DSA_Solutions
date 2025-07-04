class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      List<Integer> subset = new ArrayList<>();
      List<List<Integer>> result = new ArrayList<>();

      generateSubsets(0,nums,subset,result);

      return result;

    }
    public static void generateSubsets(int i, int[] nums,List<Integer> subset,List<List<Integer>> result ){
        if(i==nums.length){
            result.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        generateSubsets(i+1,nums,subset,result);

        subset.remove(subset.size()-1);

        generateSubsets(i+1,nums,subset,result);
    }
}

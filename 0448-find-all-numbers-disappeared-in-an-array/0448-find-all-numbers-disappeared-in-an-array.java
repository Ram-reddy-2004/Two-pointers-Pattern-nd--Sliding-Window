class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] ar = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ar[nums[i]-1]=1;
        }
        List<Integer> res= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(ar[i] == 0 ) res.add(i+1);
        }
        return res;
    }
}
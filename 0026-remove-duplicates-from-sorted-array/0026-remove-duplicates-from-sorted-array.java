class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
                
            }
        }
        int[] res = new int[j];
        for(int i=0;i<j;i++){
            res[i]=nums[i];
        }

        System.out.println(Arrays.toString(res));
        return j+1;
    }
}
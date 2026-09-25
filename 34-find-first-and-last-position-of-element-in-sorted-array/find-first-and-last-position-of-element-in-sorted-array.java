class Solution {
    public int[] searchRange(int[] nums, int target) {

     int firstIndex=preBound(nums,target);
     int lastIndex=postBound(nums,target);   
       return new int[]{firstIndex,lastIndex};
    }

    public int preBound(int nums[],int target){

        int index=-1;
        int low=0;
        int high=nums.length-1;

        while(low<=high){

            int mid=(low+high)/2;
            if(nums[mid]==target){
                index=mid;
                high=mid-1;
            }else if(nums[low]<=target && target<=nums[mid]){
                   high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return index;
    }

    public int postBound(int nums[],int target){

        int index=-1;
        int low=0;
        int high=nums.length-1;

        while(low<=high){

            int mid=(low+high)/2;

            if(nums[mid]==target){
                index=mid;
                low=mid+1;
            }else if(target>=nums[mid] && target<=nums[high]){
                   low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return index;
    }
}
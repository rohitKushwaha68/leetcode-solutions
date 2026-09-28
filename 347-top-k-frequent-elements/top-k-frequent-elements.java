class Solution {
    public int[] topKFrequent(int[] nums, int k) {

      List<Integer>[] bucket= new List[nums.length+1];  
      Map<Integer, Integer> map= new HashMap<>();

      for(int i=0;i<nums.length;++i){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      }

      for(int num: map.keySet()){
        int freq= map.get(num);
           if(bucket[freq]==null){
            bucket[freq]= new ArrayList<>();
           }
           bucket[freq].add(num);
      }

      int ans[]= new int[k];
      int count=0;

      for(int i=bucket.length-1;i>=0 && count<k;--i){
           if(bucket[i]!=null){
               for(Integer num: bucket[i]){
                ans[count++]=num;
                if(count>=k){
                    break;
                }
               }
           }
      }

      return ans;
    }
}
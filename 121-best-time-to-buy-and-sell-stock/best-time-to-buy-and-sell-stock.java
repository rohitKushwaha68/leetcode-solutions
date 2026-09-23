class Solution {
    public int maxProfit(int[] prices) {
    
        int maxProfit=0;
        int currLow=prices[0];
        for(int i=0;i<prices.length;++i){
           
           if(currLow>=prices[i]){
            currLow=prices[i];
           }else{
            maxProfit=Math.max(maxProfit,prices[i]-currLow);
           }
        }

        return maxProfit;
    }
}
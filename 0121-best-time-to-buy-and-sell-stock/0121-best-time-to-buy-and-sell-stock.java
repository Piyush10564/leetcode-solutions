class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxi=0;
        int profit;
       
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
           }
           profit=prices[i]-min;
           if(profit>maxi){
            maxi=profit;
           }
            }
           
    return maxi;
    }
}
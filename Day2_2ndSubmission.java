class Day2_2ndSubmission {
    public int[] minCosts(int[] cost) {
        int prefixMin = cost[0];
        for(int i =1;i< cost.length;i++){
            if(prefixMin > cost[i]){
                prefixMin = cost[i];
            }else{
                cost[i] = prefixMin;
            }
        }
        return cost;
    }
}
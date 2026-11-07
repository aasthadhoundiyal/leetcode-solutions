class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
        int start=0 , end=1 ;
        ArrayList<int[]> answer = new ArrayList<>(); 
        answer.add(intervals[0]);

        for (int i=1 ; i<intervals.length ; i++){
            int[] last = answer.get(answer.size()-1);
            if (intervals[i][start] <= last[1]){
                
                int endInterval = Math.max(intervals[i][end] , last[1]);
                last[1] = endInterval;
                

            }
            else{
                answer.add(intervals[i]);
            }
        }
        return answer.toArray(new int[answer.size()][]);
        

        
        
    }
}
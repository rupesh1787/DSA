class Solution {
    public int[][] merge(int[][] intervals) {
          List< int[]>list = new ArrayList<>();
          Arrays.sort(intervals , (a,b)->Integer.compare(a[0],b[0]));
          int current[] = intervals[0];
          list.add(current);
         for(int i=1;i<intervals.length;i++){
                   int next[] = intervals[i];
                   if(current[1]>=next[0]){
                      current[1] = Math.max(current[1],next[1]);
                   }
                   else{
                       current = next;
                       list.add(current);
                   }
                      
                }
         return list.toArray(new int[list.size()][]);
    }
}
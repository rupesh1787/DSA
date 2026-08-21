class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
           HashMap<Integer,Integer>map = new HashMap<>();
           for(int i=0;i<matches.length;i++){
                int lost = matches[i][1];
                map.put(lost,map.getOrDefault(lost,0)+1);
           }
           List<Integer>NotLost = new ArrayList<>();
           List<Integer>LostOnce =new ArrayList<>();

           for(int i=0;i<matches.length;i++){
                 int winner = matches[i][0];
                 int loser = matches[i][1];

                 if(!map.containsKey(winner)){
                        NotLost.add(winner);
                        map.put(winner,2);
                 }
                 if(map.get(loser)==1){
                         LostOnce.add(loser);

                 }
           }
           Collections.sort(NotLost);
           Collections.sort(LostOnce);

           return Arrays.asList(NotLost,LostOnce);
    }

}
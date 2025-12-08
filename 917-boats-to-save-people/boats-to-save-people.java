class Solution {
    public int numRescueBoats(int[] people, int limit) {
          int i=0;
          int j = people.length-1;
          Arrays.sort(people);
          int boat = 0;
          while(i<=j){
             if(people[i]+people[j]<=limit){
                boat++;
                i++;
                j--;
             }
             else{
                j--;
                boat+=1;
             }
          }
          return boat;
    }
}
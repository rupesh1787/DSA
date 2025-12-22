class Solution {
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer>list = new ArrayList<>();
        int n = s.length();
        int last[] = new int[26];
        for(int i=0;i<n;i++){
            last[s.charAt(i)-'a'] = i;
        }
        int i = 0;
        while(i<n){
             int end = last[s.charAt(i)-'a'];
             int j = i;
             while(j<end){
                end = Math.max(end, last[s.charAt(j)-'a']);
                 j++;
             }
             list.add(j-i+1);
             i = j+1;
        }
        return list;
    }
}
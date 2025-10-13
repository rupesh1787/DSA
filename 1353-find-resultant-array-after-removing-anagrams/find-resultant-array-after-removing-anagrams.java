class Solution {
    public List<String> removeAnagrams(String[] words) {
        List <String> result = new ArrayList<>();
        for(String word:words){
            if(result.isEmpty()){
                result.add(word);
            }
            else{
                String previous = result.get(result.size()-1);
                if(!isAnagram(previous , word)){
                    result.add(word);
                }
            }
        }
        return result;
       

    }
        private boolean isAnagram(String s1 , String s2){
            if(s1.length()!=s2.length()){
                return false;
            }
            else{
                char [] a = s1.toCharArray();
                char [] b = s2.toCharArray();
                Arrays.sort(a);
                Arrays.sort(b);
                return Arrays.equals(a,b);
            }
        }
    
}
class Solution {
    public int numberOfSubstrings(String s) {
            int n = s.length();
            int result = 0;
            int arr[] = new int[3];
            int i = 0;
            int j = 0;
            while(j<n){
                char ch = s.charAt(j);
                arr[ch-'a']++;

                while(arr[0]>0 && arr[1]>0 && arr[2]>0)     {
                    result+=n-j;
                    arr[s.charAt(i)-'a']--;
                    i++;

                }
                j++;
            }
            return result;
    }
}
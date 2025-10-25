class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i=1;i<n;i++){
            prefix[i] = arr[i]+prefix[i-1];        
    }
    int totalsum = 0;
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
             int length = j-i+1;
             if(length%2!=0){
                int sub = (i==0)?prefix[j]:prefix[j]-prefix[i-1];
                totalsum+=sub;
             }
        }
    }
     return totalsum;
}
}
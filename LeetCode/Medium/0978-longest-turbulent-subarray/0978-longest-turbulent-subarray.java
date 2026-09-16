class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int i=2;
        int k=1;
        int maxlen=1;
        if(arr.length==1) return 1;
        if(arr.length==2){
            if(arr[0]==arr[1]) return 1;
            else return 2;
        }
        while(k<arr.length-1){
            if(arr[k]==arr[k-1] && arr[k+1]==arr[k]) i=1;
            else if((arr[k]> arr[k-1] && arr[k]>arr[k+1]) || (arr[k]< arr[k-1] && arr[k]<arr[k+1]))
            i++;
            else {
                i=2;
            }
            k++;
            maxlen=Math.max(maxlen,i);
            }
            return maxlen;
    }
}
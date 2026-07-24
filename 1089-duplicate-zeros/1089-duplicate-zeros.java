class Solution {
    public void duplicateZeros(int[] arr) {
        int [] res = new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0 && i<arr.length-1){
            if(k+1< arr.length)
            res[k+1]=0;
            
            k=k+2;
        }else{if(k<arr.length){
            res[k]=arr[i];
            k++;}
        }}
        for(int j=0; j<arr.length;j++){
            arr[j]=res[j];
        }
    }
}
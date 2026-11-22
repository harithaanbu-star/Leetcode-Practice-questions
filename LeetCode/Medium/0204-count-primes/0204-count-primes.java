class Solution {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        Arrays.fill(prime,true);
        if(n>0)prime[0]=false;
        if(n>1)prime[1]=false;
        for(int i=2;i*i<n;i++){
            if(prime[i])
            for(int j=i*i;j<n;j+=i){
                prime[j]=false;
            }
        }
        int cnt=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(prime[i]){
                cnt++;
                list.add(i);
            }
        }
       // System.out.println(list);
        return cnt;
    }
}
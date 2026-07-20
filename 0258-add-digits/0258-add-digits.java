class Solution {
    public int addDigits(int num) {
        if(num<10) return num;
        int sum=0;
        while(num!=0){
            int digit = num%10;
            num/=10;
            sum+=digit;
        }
       
       while(sum>=10){
        int tot=0;
        while(sum!=0){
        int didgit = sum%10;
        sum/=10;
        tot+=didgit;
        }
        sum=tot;
       }
    return sum;
    }
}
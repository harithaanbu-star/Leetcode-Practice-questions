class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> unique = new HashSet<>();
        for(String email:emails){
            int lindex=0;
            int aindex=email.indexOf("@");
            String local = email.substring(0,aindex);
            String domain = email.substring(aindex);
            if(local.contains("+")){
            local = local.substring(0,local.indexOf("+"));
            }
            
            local=local.replace(".","");
            String ans = local+"@"+domain;
           
            unique.add(ans);
            
}
System.out.print(unique);
        return unique.size();
    }
}
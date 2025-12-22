class Solution {
    public boolean isPalindrome(int x) {

        int newnum=0;
        int org=x;
        while(x>0)
        {
            newnum=newnum*10+(x%10);
            x=x/10;
        }

        boolean result= org == newnum? true:false;
        return result;
        
        
    }
}

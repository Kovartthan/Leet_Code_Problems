class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int reverseNumber = 0;
        int temp = x;
        while(temp != 0){
            int digit = temp % 10;
            reverseNumber = reverseNumber * 10 + digit;
            temp = temp / 10;
        }
        if(reverseNumber == x){
            return true;
        }else{
            return false;
        }
    }
}

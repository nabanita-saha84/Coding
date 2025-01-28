class Solution {
    public boolean isPalindrome(String s) {
        String reformattedString = s.replaceAll("[^A-Za-z]+", "").trim().toLowerCase();
        return palindrome(reformattedString);
    }

    public boolean palindrome(String s) {
        int len = s.length();
        if(len==0 || len==1){
            return true;
        }
        boolean res = (s.charAt(0)==s.charAt(len-1));
        return res && palindrome(s.substring(1,len-1));
    }
}
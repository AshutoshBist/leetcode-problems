
// https://leetcode.com/problems/longest-palindromic-substring/description/?envType=problem-list-v2&envId=rab78cw1

class Solution {
    public String longestPalindrome(String s) {
        String longestPalindrome = "";

        for(int index = 0; index < s.length(); index++){
            int left = index, right = index;
            while(right < s.length() - 1 && s.charAt(index) == s.charAt(right+1)){
                right++;
            }
            index = right;
            while(left > 0 && right < s.length()-1 && s.charAt(left-1) == s.charAt(right+1)){
                left --;
                right++;
            }
            if(longestPalindrome.length() < right - left + 1){
                longestPalindrome = s.substring(left, right+1);
            }
        }
        return longestPalindrome;
    }
}
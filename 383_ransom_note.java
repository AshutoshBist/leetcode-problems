// https://leetcode.com/problems/ransom-note/?envType=problem-list-v2&envId=rab78cw1

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
         for(int i =0; i < magazine.length(); i++){
            char c = magazine.charAt(i);
            int charCount = charCountMap.getOrDefault(c,0) + 1;
            charCountMap.put(c,charCount);
        }
        for(int i =0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            int charCount = charCountMap.getOrDefault(c,0) - 1;
            if(charCount > -1){
                charCountMap.put(c,charCount);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int maxLen = 0;
        Map<Character, Integer> map = new HashMap();
        for(int end = 0;end < s.length(); end++){
            char x = s.charAt(end);
            if(map.get(x) != null){
                start = Math.max(map.get(x),start);
            }
            maxLen = Math.max(maxLen, end - start + 1);
            map.put(x,end+1);
        }
        return maxLen;
    }
}

 
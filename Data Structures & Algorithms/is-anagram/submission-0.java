class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
           String s1 = s.toLowerCase();
           String s2 = t.toLowerCase();
           char[] sSort = s1.toCharArray();
           char[] tSort = s2.toCharArray();
           Arrays.sort(sSort);
           Arrays.sort(tSort);
           return Arrays.equals(sSort,tSort);
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        else {
            Hashtable<Character, Integer> sMap = new Hashtable<>();
            Hashtable<Character, Integer> tMap = new Hashtable<>();
            for (int i = 0; i < s.length(); i++) {
                sMap.merge(s.charAt(i), 1, Integer::sum);
                tMap.merge(t.charAt(i),1,Integer::sum);
            }
            return sMap.equals(tMap);
        }
    }
}

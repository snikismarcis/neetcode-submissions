class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] c = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(c);
        Arrays.sort(b);

        String string1 = new String(c);
        String string2 = new String(b);

        if (!string1.equals(string2)) return false;
        return true;
    }
}

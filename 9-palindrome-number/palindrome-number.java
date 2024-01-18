class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        StringBuilder a = new StringBuilder();
        a.append(s);
        a.reverse();
        String b = a.toString();
        if(s.equals(b))
        return true;
        else
        return false;
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder aza = new StringBuilder();
        StringBuilder kotok = new StringBuilder();
        for(int i = 0; i < s.length();i++){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
            aza.append(s.charAt(i));
            kotok.append(s.charAt(i));
            }
        }
        aza.reverse();
        String v = aza.toString().toLowerCase();
        String z = kotok.toString().toLowerCase();
        if(v.equals(z)){
             return true;
        }
        else{
        return false;
        }
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        
        String str = "";
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i)))
            str +=Character.toLowerCase(s.charAt(i));
        }
        int start = 0, end = str.length() - 1;

        if(str.isEmpty())
        return true;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
}
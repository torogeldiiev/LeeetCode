class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        char [] c = s.toCharArray(); 
        for(int i = 0 ; i < c.length ; i ++){
            if(c[i]== '6'){
              c[i] = '9';
              break;
            }
        }
        int num1 = Integer.parseInt(new String(c));
        return num1;
    }
}
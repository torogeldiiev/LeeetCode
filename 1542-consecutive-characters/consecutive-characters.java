class Solution {
    public int maxPower(String s) {
        int counter = 1,answer = 0; 
        for(int i = 0 ; i < s.length() - 1;i++){           
                if(s.charAt(i) == s.charAt(i + 1)){
                    counter++;
                }else{
                    answer = Math.max(counter,answer);
                    counter = 1;
                }
        }  
        answer = Math.max(answer,counter);
        return answer;
    }
}
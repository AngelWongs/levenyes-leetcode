class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals(""))
            return true;
        int j = s.length()-1;
        int i = 0;
        while(i<j){
            while(i<j&&!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j&&!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
                return false;
            i++;
            j--;
        }
        return true;
    }
}

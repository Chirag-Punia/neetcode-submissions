class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n - 1;
        while(i < j){
            char l = Character.toLowerCase(s.charAt(i));
            char r = Character.toLowerCase(s.charAt(j));
            if (!Character.isLetterOrDigit(l) || l == ' '){
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(r) || r == ' '){
                j--;
                continue;
            }
            
            if(l != r)return false;
            i++;
            j--;
        }
        return true;
    }
}

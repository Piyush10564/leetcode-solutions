class Solution {
    public boolean detectCapitalUse(String word) {
       if(word.equals(word.toUpperCase())){
    return true;
   }else if(word.equals(word.toLowerCase())){
    return true;
   }
   else {
    char ch = word.charAt(0);
    if(Character.toUpperCase(word.charAt(0)) == ch && word.substring(1).equals(word.      substring(1).toLowerCase())){
        return true;
    }
}
   return false;
    }
}
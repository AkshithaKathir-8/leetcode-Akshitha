// Last updated: 8/12/2026, 8:55:48 AM
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()==0||word.length()==1)
        return true;
        if(Character.isUpperCase(word.charAt(0))){
            boolean isFirstCharacter = Character.isUpperCase(word.charAt(1));
            for(int i=2;i<word.length();i++){
                boolean currChar = Character.isUpperCase(word.charAt(i));
                if(currChar!=isFirstCharacter)
                return false;
            }
        }else{
                for(int i=1;i<word.length();i++){
                    if(Character.isUpperCase(word.charAt(i)))
                    return false;
                }
            }
            return true;
    }
}
// Another Method
// class Solution {
//     public boolean detectCapitalUse(String word) {
// int capitalCount=0;
// int n = word.length();
// for(int i=0;i<n;i++){
//     if(Character.isUpperCase(word.charAt(i))){
//         capitalCount++;
//     }
// }
// if(capitalCount==n||capitalCount==0){
//     return true;
// }
// if(capitalCount==1 && Character.isUpperCase(word.charAt(0))){
//     return true;
// }
// return false;
// }
// }
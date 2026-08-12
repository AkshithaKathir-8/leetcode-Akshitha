// Last updated: 8/12/2026, 8:57:24 AM
class Solution {
     private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' ||ch == 'u'||
               ch == 'A' || ch == 'E' || ch == 'I' || ch =='O' || ch == 'U';
    }
    public String reverseVowels(String s) {
   char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (left < right && !isVowel(arr[left])) {
                left++;
            }
            while (left < right && !isVowel(arr[right])) {
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}
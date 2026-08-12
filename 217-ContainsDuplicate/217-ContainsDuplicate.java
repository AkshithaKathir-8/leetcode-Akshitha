// Last updated: 8/12/2026, 8:59:07 AM
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Set<Integer> s = new HashSet<>();//HashSet removes Duplicates
//         for(int ele: nums){
//             s.add(ele);
//         }
//         return s.size()!=nums.length;
//     }
// }
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();//HashSet removes Duplicates
        for(int ele: nums){
            if(!s.add(ele)){
                return true;
        }
        }
        return false;
    }
}
// Last updated: 9/14/2026, 7:12:51 PM
1class Solution {
2    public int maximumSetSize(int[] v1, int[] v2) {
3         Set<Integer> s1 = new HashSet<>();
4        Set<Integer> s2 = new HashSet<>();
5        for (int i : v1)
6            s1.add(i);
7        for (int i : v2)
8            s2.add(i);
9        int n = v1.length, m = v2.length;
10        int x = s1.size(), y = s2.size();
11        int ans = Math.min(n / 2, x);
12        int rem = x - ans;
13        int c = 0;
14        for (int i : s2) {
15            if (!s1.contains(i)) {
16                c++;
17            } else if (rem > 0) {
18                c++;
19                rem--;
20            }
21            if (c >= m / 2)
22                break;
23        }
24        return ans + c;
25    }
26}
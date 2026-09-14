// Last updated: 9/14/2026, 7:16:27 PM
1class Solution {
2    public List<List<Integer>> findWinners(int[][] matches) {
3        int[] losses = new int[100001];
4        for (int i = 0; i < matches.length; i++) {
5            int win = matches[i][0];
6            int loss = matches[i][1];
7            if (losses[win] == 0) {
8                losses[win] = -1;
9            } 
10            if (losses[loss] == -1) {
11                losses[loss] = 1;
12            } else {
13                losses[loss]++;
14            }
15        }
16        List<Integer> zeroLoss = new ArrayList<>();
17        List<Integer> oneLoss = new ArrayList<>();
18        List<List<Integer>> result = new ArrayList<>();
19        for (int i = 0; i < losses.length; i++) {
20            if (losses[i] == -1) {
21                zeroLoss.add(i);
22            } else if (losses[i] == 1) {
23                oneLoss.add(i);
24            }
25        }
26        result.add(zeroLoss);
27        result.add(oneLoss);
28        return result;
29    }
30}
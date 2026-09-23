// Last updated: 9/23/2026, 9:07:48 AM
1class RandomizedSet {
2
3    private List<Integer> values;
4    private Map<Integer, Integer> valuesIdx;
5
6    public RandomizedSet() {
7        this.values = new ArrayList<>();
8        this.valuesIdx = new HashMap<>();
9    }
10
11    public boolean insert(int val) {
12        if (valuesIdx.containsKey(val)) {
13            return false;
14        }
15
16        valuesIdx.put(val, values.size());
17        values.add(val);
18
19        return true;
20    }
21
22    public boolean remove(int val) {
23        if (!valuesIdx.containsKey(val)) {
24            return false;
25        }
26
27        int index = valuesIdx.get(val);
28        valuesIdx.put(values.get(values.size() - 1), index);
29        valuesIdx.remove(val);
30        values.set(index, values.get(values.size() - 1));
31        values.remove(values.size() - 1);
32
33        return true;
34    }
35
36    public int getRandom() {
37        int index = (int) (Math.random() * values.size());
38        return values.get(index);
39    }
40}
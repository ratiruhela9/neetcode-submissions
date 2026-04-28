class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> res = new HashMap<>();

        for(String s:strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String newSorted = new String(charArray);
            res.putIfAbsent(newSorted,new ArrayList<>());
            res.get(newSorted).add(s);
        }
        return new ArrayList<>(res.values());
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length == 0){
            return new ArrayList<>();
        }

        HashMap <String, List<String>> frequencymap = new HashMap<>();
        for(String str:strs){
            String frequencystring = getfrequencystring(str);

            if(frequencymap.containsKey(frequencystring)){
                frequencymap.get(frequencystring).add(str);
            }

            else{
                ArrayList<String> strList = new ArrayList<>();
                strList.add(str);
                frequencymap.put(frequencystring, strList);
            }
        }

        return new ArrayList<>(frequencymap.values());
        
    }

    private String getfrequencystring(String str){
        int[] freq = new int[26];

        for(char c:str.toCharArray()){
            freq[c-'a']++;
        }


        StringBuilder frequencystring = new StringBuilder("");
        char c ='a';
        for(int i:freq){
            frequencystring.append(c);
            frequencystring.append(i);
            c++;
        }

        return frequencystring.toString();
    }
}

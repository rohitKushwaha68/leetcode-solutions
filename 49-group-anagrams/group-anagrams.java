class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    
    Map<String,List<String>> map= new HashMap<>();

    for(int i=0;i<strs.length;++i){

        char curr[]=strs[i].toCharArray();
        Arrays.sort(curr);
        String currStr= new String(curr);
        
        if(map.containsKey(currStr)){
           map.get(currStr).add(strs[i]);
        }else{
             ArrayList<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(currStr, list);
        }
    }
      
       return  new ArrayList<>(map.values());

    //   for(String str : strs){

    //     int freq[]= new int[26];

    //     for(char ch :str.toCharArray()){
    //         ++freq[ch-'a'];
    //     }

    //      StringBuilder keyBuilder = new StringBuilder();

    //         for (int count : freq) {
    //             keyBuilder.append('#').append(count);
    //         }
         
    //      String key = keyBuilder.toString();

    //     if(map.containsKey(key)){
    //        map.get(key).add(str);
    //     }else{
    //          ArrayList<String> list = new ArrayList<>();
    //             list.add(str);
    //             map.put(key, list);
    //     }
    //   }
    //   return new ArrayList<>(map.values());
    }
}
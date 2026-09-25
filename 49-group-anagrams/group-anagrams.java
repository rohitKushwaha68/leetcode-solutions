class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

    List<List<String>> ans= new ArrayList<>();    
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
      
      for(Map.Entry<String,List<String>> entry: map.entrySet()){
          ans.add(entry.getValue());
      }

       return ans;
    }
}
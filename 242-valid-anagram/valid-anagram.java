class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length())
           return false;

        // Map<Character,Integer> map1= new HashMap<>();
        // Map<Character,Integer> map2= new HashMap<>(); 

        //   for(char ch: s.toCharArray()){
        //     map1.put(ch,map1.getOrDefault(ch,0)+1);
        //   }

        //   for(char ch: t.toCharArray()){
        //     map2.put(ch,map2.getOrDefault(ch,0)+1);
        //   }

        //   if(map1.equals(map2))
        //     return true;
        //    else
        //    return false;

       int charFre[]= new int[26];

       for(char ch:s.toCharArray()){
         charFre[ch-'a']=charFre[ch-'a']+1;
       }

        for(char ch:t.toCharArray()){
         charFre[ch-'a']=charFre[ch-'a']-1;
       }

       for(int i=0;i<charFre.length;++i){
             if(charFre[i]!=0)
              return false;
       }
         return true;
    }
}
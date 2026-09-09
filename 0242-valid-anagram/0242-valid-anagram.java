class Solution {
    public boolean isAnagram(String s, String t) {
         HashMap<Character,Integer>hm=new HashMap<>();
         for(int i=0;i<s.length();i++)
         {
            char x=s.charAt(i);
            hm.put(x,hm.getOrDefault(x,0)+1);
         }
         for(int j=0;j<t.length();j++)
         {
            char ch=t.charAt(j);
            hm.put(ch,hm.getOrDefault(ch,0)-1);
         }
         for(Character x:hm.keySet())
         {
            if(hm.get(x)!=0)
            return false;
         }
         return true;
    }
}
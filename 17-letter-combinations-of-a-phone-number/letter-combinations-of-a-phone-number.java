class Solution {
     public void digitiTochartacter (int i,String digits,String curStr,int len,List res,HashMap<Integer,List<Character>> hash)
    {

        //x letter ele 3leh el dor f el string
        if(curStr.length() == len )
            res.add(curStr);
        else

             for(char c :hash.get((Character.getNumericValue(digits.charAt(i)))))
            {

                digitiTochartacter(i+1,digits,curStr+c,len,res,hash);
            }


    }
    public List<String> letterCombinations(String digits) {


        if (digits.length() == 0)
            return List.of();

        Solution start = new Solution();
        HashMap<Integer,List<Character>> hash = new HashMap<>();
        hash.put(2,Arrays.asList('a','b','c'));
        hash.put(3,Arrays.asList('d','e','f'));
        hash.put(4,Arrays.asList('g','h','i'));
        hash.put(5,Arrays.asList('j','k','l'));
        hash.put(6,Arrays.asList('m','n','o'));
        hash.put(7,Arrays.asList('p','q','r','s'));
        hash.put(8,Arrays.asList('t','u','v'));
        hash.put(9,Arrays.asList('w','x','y','z'));

        ArrayList<String> res = new ArrayList<>();
        int i =0;
        String curStr ="";

        start.digitiTochartacter(i,digits,curStr,digits.length(),res,hash);
        return res;
        
    }
}
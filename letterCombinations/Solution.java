import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> s = new ArrayList<>();
        Map<Integer,String> alphabets = new HashMap<>();
        alphabets.put(2,"abc");
        alphabets.put(3,"def");
        alphabets.put(4,"ghi");
        alphabets.put(5,"jkl");
        alphabets.put(6,"mno");
        alphabets.put(7,"pqrs");
        alphabets.put(8,"tuv");
        alphabets.put(9,"wxyz");

        if(digits.length()==0){
         return s;   
        }else{
            if(digits.length()==1){
                String combinations = alphabets.get(Integer.parseInt(digits));
                for(int i=0;i<combinations.length();i++){
                    s.add(String.valueOf(combinations.charAt(i)));
                }
            }else if(digits.length()==2){
                String first = alphabets.get(Integer.parseInt(String.valueOf(digits.charAt(0))));
                String second = alphabets.get(Integer.parseInt(String.valueOf(digits.charAt(1))));
                for(int i=0;i<first.length();i++){
                    for(int j=0;j<second.length();j++){
                        String combo = new StringBuilder().append(first.charAt(i)).append(second.charAt(j)).toString();
                        s.add(combo);
                        combo = "";
                    }
                }
            }else if(digits.length()==3){
                String first = alphabets.get(Integer.parseInt(String.valueOf(digits.charAt(0))));
                String second = alphabets.get(Integer.parseInt(String.valueOf(digits.charAt(1))));
                String third = alphabets.get(Integer.parseInt(String.valueOf(digits.charAt(2))));
                for(int i=0;i<first.length();i++){
                    for(int j=0;j<second.length();j++){
                        for(int k=0;k<third.length();k++){
                            String combo = new StringBuilder().append(first.charAt(i)).append(second.charAt(j)).append(third.charAt(k)).toString();
                            s.add(combo);
                            combo = "";
                        }
                    }
                }
            }
            else if(digits.length()==4){
                String first = alphabets.get(Integer.parseInt(String.valueOf(digits.charAt(0))));
                String second = alphabets.get(Integer.parseInt(String.valueOf(digits.charAt(1))));
                String third = alphabets.get(Integer.parseInt(String.valueOf(digits.charAt(2))));
                String fourth = alphabets.get(Integer.parseInt(String.valueOf(digits.charAt(3))));
            
                for(int i=0;i<first.length();i++){
                    for(int j=0;j<second.length();j++){
                        for(int k=0;k<third.length();k++){ 
                            for(int l=0;l<fourth.length();l++){ 
                                String combo = new StringBuilder().append(first.charAt(i)).append(second.charAt(j)).append(third.charAt(k)).append(fourth.charAt(l)).toString();
                                s.add(combo);
                                combo = "";
                            }
                        }
                    }
                }
            }
        }
        return s;
    }
}
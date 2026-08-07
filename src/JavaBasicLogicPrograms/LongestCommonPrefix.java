package JavaBasicLogicPrograms;
//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".
//
//
//
//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.

public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] strs = {"flower","flow","flight", "f"};
        String c="";
        for(int i=0; i< strs[0].length(); i++){
            int count=0;
            for(int j=0; j<strs.length; j++){
                if(i<strs[j].length()){
                if(strs[0].charAt(i)==strs[j].charAt(i)){
                    count++;
                }}
            }if(count==strs.length){
                c=c.concat(String.valueOf(strs[0].charAt(i)));
            }
        }
        System.out.println(c);

    }
}

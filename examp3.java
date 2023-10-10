package Backtracking;

import java.lang.module.FindException;

//find permutation for string abc
public class examp3 {
    public static void findPermutation(String str, String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        //kaam
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i+1, str.length());
            findPermutation(Newstr, ans+curr);

        }

    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str,"");
    }
    
}

package src.字符串;

public class BF算法 {


    public int strStr(String haystack, String needle) {
        if (needle.length()==0){
            return -1;
        }
        int pointer = 0;
        for (int i = 0; i <haystack.length() ; i++) {
            boolean correct = true;
            pointer = i;
            for (int j = 0; j <needle.length() ; j++) {
                if (haystack.charAt(i+j)!=needle.charAt(j)){
                    correct = false;
                    continue;
                }
            }

            if (correct){
                return pointer;
            }
        }

        return -1;
    }


}

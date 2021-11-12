package 字符串;

public class Q1 {

    public static void main(String[] args) {

    }

    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length==0){
            return "";
        }
        int[] stringLength = new int[strs.length];
        for (int i = 0; i <strs.length ; i++) {
            stringLength[i]=strs[i].length();
        }
        int shortest = stringLength[0];
        for (int i = 0; i <stringLength.length ; i++) {
            if (shortest>stringLength[i]){
                shortest=stringLength[i];
            }
        }
        //shortest就是需要循环的次数
        for (int i = 0; i <shortest ; i++) {
             boolean equal = true;
             char letter = strs[i].charAt(i);
            for (int j = 0; j <strs.length ; j++) {
                if (strs[j].charAt(i)!=letter){
                    equal=false;
                    return result;
                }
            }
            result.concat(String.valueOf(letter));
        }
        return result;
    }
}

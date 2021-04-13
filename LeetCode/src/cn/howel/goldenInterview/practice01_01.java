package cn.howel.goldenInterview;

/**
 * @author howel
 * @version 1.0.0
 * @Description
 */
public class practice01_01 {

    public static boolean isUnique(String astr) {
        String s = "";
        if (astr.length() == 1) return true;
        if (astr.length() == 2) {
            if (astr.substring(0,1).equals(astr.substring(1,2))) {
                return false;
            }
        }
        for(int i = 0; i < astr.length() - 2; i++) {
            s = astr.substring(i,i+1);
            for(int j = i + 1; j < astr.length() - 1 ; j++) {
                if (s.equals(astr.substring(j, j + 1))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "leetcode";
        String b = "abc";
        System.out.println(isUnique(a));
        System.out.println(isUnique(b));
    }
}

package day25_methods;

import my_util.StringUtil;

public class UsingStringClass {

    public static void main(String[] args) {


        System.out.println(StringUtil.reverseString("java"));


        String fixed = StringUtil.fixFormat("tOM");
        System.out.println(fixed);
        System.out.println();
        System.out.println(StringUtil.fixFormat("toM"));

        System.out.println(StringUtil.cameCase("JAVA is GooD LanGuAgE"));


        System.out.println(StringUtil.frequencyOfCharacter("apple", 'z'));
        System.out.println(StringUtil.frequencyOfCharacter("apple", 'p'));
    }
}

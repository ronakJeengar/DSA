package com.Ronak.Strings;

public class RemoveSpace {

    public static void main(String[] args) {

        String str = "Ronak Jeengar";

        String str1 = str.replaceAll(" ", "\\s");
        System.out.println(str1);

    }

}

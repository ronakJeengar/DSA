package com.ronak.ArrayList;

import java.util.*;

public class ArrayListIntro {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        // Add element in list

        list.add(12);
        list.add(24);
        list.add(33);

        System.out.println(list);
        System.out.println(list.contains(15));
        System.out.println(list.size());

    }

}

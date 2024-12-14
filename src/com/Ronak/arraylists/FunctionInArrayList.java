package com.ronak.arraylists;

import java.util.ArrayList;

public class FunctionInArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(24);
        list.add(36);
        System.out.println(list);

        list.add(1, 34);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        System.out.println(list.get(2));

        list.set(2, 26);
        System.out.println(list);

        System.out.println(list.contains(2));

        System.out.println(list.size());

        System.out.println(list.indexOf(26));

        System.out.println(list.lastIndexOf(26));

        list.clear();
        System.out.println(list.isEmpty());
        System.out.println(list);

    }

}

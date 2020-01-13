package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new Limite<Integer>(new Supprime<Integer>(new Options<Integer>(new ArrayList<>())),10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        for(Integer i : list){
            System.out.println(i);
        }

        System.out.println("---------------------");

        list.remove(5);
        list.remove(2);
        list.remove(3);
        for(Integer i : list){
            System.out.println(i);
        }

    }
}

package com.bl.javastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamsDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to JavaStreams Api");
        List<Integer>numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        numbers.stream().forEach(num-> System.out.println(num));

        List<Double>doubleList=numbers.stream().map(num->num*2.0).collect(Collectors.toList());

        System.out.println(doubleList);

        List<Integer>evenNumbers=numbers.stream().filter(num->num%2==0).collect(Collectors.toList());
        System.out.println("Even Numbers"+evenNumbers);

    }
}

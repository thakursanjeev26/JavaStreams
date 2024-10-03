package com.bl.javastreams;

import java.util.*;
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

        Optional<Integer>firstEvenNumber=numbers.stream().filter(num->num%2==0).findFirst();
        if(firstEvenNumber.isPresent()){
            System.out.println("The first even number is: " + firstEvenNumber.get());
        }
        else {
            System.out.println("No even numbers found.");
        }
        Optional<Integer> minEvenNumber = numbers.stream()
                .filter(num -> num % 2 == 0) // Filter even numbers
                .min(Comparator.naturalOrder()); // Get the minimum even number


        Optional<Integer> maxEvenNumber = numbers.stream()
                .filter(num -> num % 2 == 0) // Filter even numbers
                .max(Comparator.naturalOrder()); // Get the maximum even number


        if (minEvenNumber.isPresent()) {
            System.out.println("The minimum even number is: " + minEvenNumber.get());
        } else {
            System.out.println("No even numbers found for minimum.");
        }


        if (maxEvenNumber.isPresent()) {
            System.out.println("The maximum even number is: " + maxEvenNumber.get());
        } else {
            System.out.println("No even numbers found for maximum.");
        }

        // Calculate the sum of the numbers
        int sum = numbers.stream().mapToInt(Integer::intValue).sum(); // Using mapToInt to sum

        // Calculate the average of the numbers
        OptionalDouble average = numbers.stream().mapToInt(Integer::intValue).average(); // Using mapToInt to calculate average

        // Display the sum
        System.out.println("The sum of the numbers is: " + sum);

        // Display the average
        if (average.isPresent()) {
            System.out.println("The average of the numbers is: " + average.getAsDouble());
        } else {
            System.out.println("No numbers found to calculate average.");
        }

    }
}

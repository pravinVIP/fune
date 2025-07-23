package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("a","b","c");
        List<String> list2=List.of("a","b","c");
        List<String> list5=List.of("a","b","c","d");
        System.out.println(list);
        System.out.println(list2);

        String[] strArr={"a","b","c"};
        //hello
        Stream<String> list3=Arrays.stream(strArr).filter(s->!s.startsWith("a"));




        list3.forEach(System.out::println);

        Arrays.stream(strArr,0,1).forEach(System.out::println);

    }
}
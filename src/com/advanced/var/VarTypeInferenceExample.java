package com.advanced.var;

import java.util.List;
import java.util.Map;

public class VarTypeInferenceExample {
    public static void main(String[] args) {
        var list = List.of("dayalan","kumar");
        System.out.printf("var value is ===="+list);
        //to iterate the above collection using var
        for(var name : list){
            System.out.println("name="+name);
            //testing
        }

        //using below ofEntries we can create immutable map
        // below ofEntries got introduced in java 9
       var map = Map.ofEntries(Map.entry("a", List.of("apple","banana")));
        System.out.println("==============");
        System.out.println("map ="+map);
        map.forEach((s,  strings) -> {
            System.out.println("s = "+s);
            System.out.println("string ="+strings);
        });
        var transformedString = transform("dayalankumar");
        System.out.println("transformedString value is=="+transformedString);
    }

    static String transform(String name){
        return name.toUpperCase();
    }
}

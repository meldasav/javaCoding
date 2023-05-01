package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {
        Apple apple1 = new Apple("Red","sour",0.99);
        Apple apple2 = new Apple("green","sweet",1.99);

      List<Apple> list = new ArrayList<>();
      list.add(apple1);
      list.add(apple2);
      for(Apple apples : list){
          System.out.println(apples.color);
      }


    }
}

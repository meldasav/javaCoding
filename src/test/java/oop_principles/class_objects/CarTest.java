package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car("Tesla","S",2022,"Brow");
        Car car2 = new Car("BMW","S",2022,"RED");

        List<Car> list = new ArrayList<>(Arrays.asList(car1,car2));
        for (Car c : list){
           if(c.make.equals("Tesla")) System.out.println(c);
        }
        list.forEach(System.out::println);

    }
}

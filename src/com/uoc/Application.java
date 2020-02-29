package com.uoc;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {
      /*  List<String> student=new ArrayList<>();

        student.add("Saman");
        student.add("Nimal");
        student.add("Amal");
        student.add("Kanthi");
        student.add("Ruwan");
        student.add("Isuri");


        List<String> filtereddata=student.stream()
                .filter(s->s.length()>5)
                .collect(Collectors.toList());
        System.out.println(filtereddata);
'
       */
      List<Sensor> sensors=new ArrayList<>();
      Sensor sensor1=new Sensor("Living",28);
      sensors.add(sensor1);
      Sensor sensor2=new Sensor("Office",32);
      sensors.add(sensor2);
      Sensor sensor3=new Sensor("Bed Room",30);
      sensors.add(sensor3);
      Sensor sensor4=new Sensor("Kitchen room",29);
      sensors.add(sensor4);
      Sensor sensor5=new Sensor("Bath room",30);
      sensors.add(sensor5);

    List<Sensor> hotSensors=sensors.stream()
            .filter(sensor -> sensor.getValue()>28)
            .collect(Collectors.toList());
        System.out.println(hotSensors);

    }
}

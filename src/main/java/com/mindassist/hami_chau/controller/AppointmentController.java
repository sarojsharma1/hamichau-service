package com.mindassist.hami_chau.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping()
public class AppointmentController {

    public void checkAvailability() {

        List<Integer> l1 = new ArrayList();
        List<Integer> l2 = new LinkedList();

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new LinkedHashSet<>();
        Set<Integer> s3 = new TreeSet<>();

        Map<Integer, Integer> m1 = new HashMap<>();
        Map<Integer, Integer> m2 = new LinkedHashMap<>();
        Map<Integer, Integer> m3 = new TreeMap<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);

        l1.clear();

    }
}



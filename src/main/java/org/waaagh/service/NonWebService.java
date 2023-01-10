package org.waaagh.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class NonWebService {
    public void printMessage(String[] args) {
        System.out.println("Started with arguments: ");
        Arrays.stream(args).forEach(System.out::println);
    }
}

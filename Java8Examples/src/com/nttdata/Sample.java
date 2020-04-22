package com.nttdata;

import java.util.Arrays;
import java.util.Collection;

public class Sample {
public static void main(String[] args) {
Collection gadgetList = Arrays.asList("Laptop", "Smart Watch", "IPad");
gadgetList.stream().filter(element -> ((String) element).length() > 4)
.forEach(element -> System.out.println(element));
}
}

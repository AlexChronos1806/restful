package com.payroll.rest;

import java.util.Arrays;

public class Teste {
    
    public static void main(String[] args) {
			String[] listaStr = {"1", "2", "3"};
			String strt = Arrays.stream(listaStr).filter(str -> str.equals("3")).findAny().get();
			System.out.println(strt);
    }
}

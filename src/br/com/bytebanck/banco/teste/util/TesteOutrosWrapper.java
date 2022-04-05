package br.com.bytebanck.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrapper {
	
	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef.intValue()); //unboxing
		
		Double dRef = Double.valueOf(3.2); //autoboxing
		System.out.println(dRef.doubleValue()); //unboxing
		
		Boolean bRef = Boolean.FALSE;// No java constantes são sempre escritas em letras maiúsculas
		System.out.println(bRef.valueOf(false));
		
		Number refNumero = Float.valueOf(29.9f);
		System.out.println(refNumero.floatValue());
		
		List<Number> lista = new ArrayList<Number>();
		lista.add(10);
		lista.add(32.6);
		lista.add(25.6f);	
	}
}

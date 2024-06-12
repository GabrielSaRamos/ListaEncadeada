package Exercicio2;

import java.util.LinkedList;
 
import Exercicio2.ListaEncadeada;

public class ListaEncadeadaTeste {

	public static void main(String[] args) {
		
	 testeLinkedList();
		
		}
	

	public static void testeLinkedList() {
		LinkedList<Integer> lista = new LinkedList<>();
		
		lista.add(10);
		lista.add(20);
		lista.add(30);
		lista.add(40);
		lista.add(50);
		
		
		lista.add(2, 53);
		
		lista.remove(5);
	
	}
}


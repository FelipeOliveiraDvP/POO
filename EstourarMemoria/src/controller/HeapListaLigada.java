package controller;

import model.No;

public class HeapListaLigada {
	public static void main(String[] args) {
		No primeiro = new No();
		No ultimo = primeiro;
		int count = 0;
		while(true) {
			No outro = new No();
			System.out.println(count++);
			ultimo.proximo = outro;
			ultimo = outro;
		}
	}
}

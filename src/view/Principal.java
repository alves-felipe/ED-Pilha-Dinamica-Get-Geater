package view;

import br.com.leandrocolevati.pilhalong.Pilha;
import controller.OperacaoControler;

public class Principal {
	
	public static void main(String[] args) {
		Pilha pilha = new Pilha();

		for(int i = 0; i < 15; i++) {
			int val = (int) ((Math.random() * 50) + 1);
			pilha.push(val);			
		}
		
		OperacaoControler oc = new OperacaoControler();
		
		System.out.println("maior valor: "+oc.maiorValor(pilha));
		
		
	}

}

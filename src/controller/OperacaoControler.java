package controller;

import br.com.leandrocolevati.pilhalong.Pilha;

public class OperacaoControler {
	
	public int maiorValor (Pilha pilha) {
		Pilha copy = pilha;
		int last = 0;
		
		try {
		
			while(copy.size() > 1) {
				long v1 = copy.pop();
				long v2 = copy.pop();
				copy.push(v1 >= v2 ? v1 : v2);
			}
		
			last = (int) copy.pop();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return last;
	}

}

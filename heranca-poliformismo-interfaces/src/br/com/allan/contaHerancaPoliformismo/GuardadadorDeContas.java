package br.com.allan.contaHerancaPoliformismo;

public class GuardadadorDeContas {
	
	private Conta[] referencias;
	private int posicaoLivre;
	
	public GuardadadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}

	public void adciona(Conta ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
		
	}

	public int getQuantidadeDeElementos() {
		
		return this.posicaoLivre;
	}

	public Conta getReferencia(int posicao) {
		return this.referencias[posicao];
	}

}

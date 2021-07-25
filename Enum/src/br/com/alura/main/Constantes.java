package br.com.alura.main;

public enum Constantes {

	BANCO("341"), AGENCIA("9999"), CONTA("2222222");
	
	private String valor;
	
	Constantes (String valor){
		this.valor = valor;
	}
	
	public String getValor() {
		return this.valor;
	}

}

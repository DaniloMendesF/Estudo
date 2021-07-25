package br.com.alura.main;

public class Teste {
	
	public static void main(String[] args) {
		
		Constantes banco = Constantes.BANCO;
		Constantes agencia = Constantes.AGENCIA;
		Constantes conta = Constantes.CONTA;		
		
		System.out.println(banco.getValor());
		System.out.println(agencia.getValor());
		System.out.println(conta.getValor());
	}
}

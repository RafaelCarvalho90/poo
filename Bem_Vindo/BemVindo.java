package br.com.residencia.poo.primeiraaula;

import java.util.Scanner;
public class BemVindo {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Olá qual o seu nome?\n");
		String nome = sca.nextLine();	
		System.out.println("Seja bem vindo(a)" + nome +" ao mundo Java\n");
		System.out.println("Qual seu sobrenome\n");
		String sobrenome = sca.nextLine();
		System.out.println(nome+" qual é a sua idade\n");
		int idade= sca.nextInt();
		if (idade>120){
			System.out.println("Esse site é feito somente para mortais, por favor aguarde o lancamento da versão 2.0 for gods\n");
		}
		else {
		if (idade<0) {
			System.out.println("Você nem nasceu ainda, está fazendo o que aqui?");
		}
		else {
			System.out.println("Cadastro de "+nome+" "+sobrenome+", "+idade+" anos, feito com sucesso\n"); 
	    }
		sca.close();
		}
	}
}

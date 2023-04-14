/*O programa “Tempo de vida” irá imprimir a soma das idades de todos os
colegas da sua equipe (6 pessoas). Pergunte a cada um a idade e não
esqueça a sua! Depois faça a atribuição direta da expressão em uma
variável inteira.*/


package lista1;
import java.util.Scanner;

public class TempoDeVida_usando_for {

	public static void main(String[] args) {		
		
		Scanner s = new Scanner(System.in);
		int n= 10;
		int v[]=new int [n];
		int soma=0;
		
		System.out.println("\t Tempo de vida\n");	    
		for(int i=1;i<6;i++) {
		System.out.println("Insira a idade do "+i+"° colega");
		v[i]= s.nextInt();
		soma = soma +v[i];
			if(v[i]>120){
				System.out.println("Só aceitamos idades de seres mortais");
				//adicionar comando para voltar ao menu inicial
			}
			
			if(v[i]<0) {
				System.out.println("Ainda não tem idade suficiente para estar aqui");}
			if (i==5) {
				System.out.println("Qual a sua idade");
		int id1 = s.nextInt();
			if (i==5) {
				System.out.println("A soma de todas idades é:"+(soma+id1));	
		s.close();
			}
			}
			
	    }
	}
}


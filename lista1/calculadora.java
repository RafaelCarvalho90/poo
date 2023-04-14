/*O programa “Tempo de vida” irá imprimir a soma das idades de todos os
colegas da sua equipe (6 pessoas). Pergunte a cada um a idade e não
esqueça a sua! Depois faça a atribuição direta da expressão em uma
variável inteira.*/
package lista1;
import java.util.Scanner;

public class calculadora {
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	Float soma;
	Float sub;
	Float mult;
	Float div;
	
	System.out.println("+---------------------------+");
	System.out.println("|     Calculadora v1.0      |");
	System.out.println("+---------------------------+");
	System.out.println("Digite o primeiro número\n");
	Float num1 = s.nextFloat();
	System.out.println("\nDigite o segundo número\n");
	Float num2 = s.nextFloat();
	System.out.println("+---------------------------+");
	System.out.println("|Escolha a operação desejada|");
	System.out.println("+---------------------------+");
	System.out.println("1)+\t2)-\t3)*\t4)/");
	soma = num1 +num2;
	sub = num1 - num2;
	mult = num1 * num2;
	div = num1/num2;
	int opcao = s.nextInt();
	switch (opcao) {
		case 1:{System.out.println(num1+" + " + num2+" = "+soma);
				break;}
		case 2:{System.out.println(num1+" - "+num2+"= "+sub);
				break;}
		case 3:{System.out.println(num1+" * "+"= "+mult);
				break;}
		case 4:{System.out.println(div);
		if (num2==0){System.out.println("Não é possivel dividir por 0");}
				break;}
		default:{System.out.println("Opção Invalida");
				break;}
	}	
	s.close();
	}
}
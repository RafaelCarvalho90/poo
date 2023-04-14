/*O programa “bem-vindo” pergunta seu nome e sobrenome, e depois
gentilmente te cumprimenta.
- 1o etapa: perguntar o nome;
- 2o etapa: perguntar o sobrenome;
- 3o etapa: junta o nome com o sobrenome e forma uma frase.*/
package lista1;
import java.util.Scanner;

public class Bem_Vindo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Olá qual o seu nome?\n");
		String nome = s.nextLine();
		System.out.println(nome+" qual o seu sobrenome?\n");
		String sobrenome = s.nextLine();
		System.out.println("Seja bem vindo(a): "+nome+" "+sobrenome);
		s.close();
	}

}

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Monstrinho fadinha = new Monstrinho();
		int opcao, turno = 1;
		
		System.out.println("Sua fadinha nasceu! \nCuide dela com carinho!\nNão deixe seus status chegarem a zero");
		//Mostra o status do seu fadinha
		fadinha.status();
		//executa a repetição do jogo enquanto seu fadinha está vivo
		while(fadinha.estaVivo()) {
			//Mostra as opções e espera o jogador digitar sua escolha
			System.out.println("\n\n### TURNO "+turno+" ###");
			System.out.println("Escolha uma ação: ");
			System.out.println("1- Comer: \n Energia++ \n Força++ \n Saúde++ \n Magia-- \n Felicidade \n \n" );
			System.out.println("2- Descansar: \n Energia+ \n Força-- \n Saúde++ \n Magia \n Felicidade+ \n \n");
			System.out.println("3- Treinar magia: \n Energia-- \n Força+ \n Saúde \n Magia+++ \n Felicidade+ \n \n");
			System.out.println("4- Brincar: \n Energia-- \n Saúde++ \n Magia \n Felicidade+ \n \n");
			System.out.println("5- Voar: \n Energia-- \n Saúde+ \n Magia+  \n Felicidade+ \n \n");
			System.out.println("6- Estudar: \n Energia-- \n Saúde++ \n Magia+ \n Felicidade+ \n \n");


			opcao = teclado.nextInt();
			
			
			switch(opcao) {
			
			//Caso o usuário digite 1 a opção é dar Comida a Fadinha:
			case 1: 
				fadinha.aplicarAcao(new Comida());
				
				//Caso o usuário digite 3 a opção é fazer a fadinha descansar:
			case 2:
				fadinha.aplicarAcao(new Descansar());
				
				//Caso o usuário digite 2 a opção é fazer a fadinha Treinar magia:
			case 3:
				fadinha.aplicarAcao(new TreinarMagia());
				
			//Caso o usuário digite 4 a opção é fazer a fadinha Brincar:
			case 4:
				fadinha.aplicarAcao(new Brincar());
				
			//Caso o usuário digite 5 a opção é fazer a fadinha Voar:
			case 5:
				fadinha.aplicarAcao(new Voar());
				
			//Caso o usuário digite 6 a opção é fazer a fadinha Estudar:
			case 6:
				fadinha.aplicarAcao(new Estudar());
				
			}
			
	
			//Executa a ação de passar turno onde o fadinha envelhece
			fadinha.passarTurno();
			//Revela o status da fadinha após passar turno
			fadinha.status();
			turno++;
		}		
		
		//Os status da fadinha chegaram a zero
		System.out.println("### VOCE PERDEU ###");
		System.out.println("Seu mostrinho sobreviveu "+ turno + " turnos");
		
		
		teclado.close();
	}
	
	
}

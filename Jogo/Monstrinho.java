public class Monstrinho {

	int saude;
	int energia;
	int forca;
	int felicidade;
	int magia;
	
	//Construtor da classe fadinha
	//Os atributos da fadinha iniciam com valor 5
	public Monstrinho() {
		this.saude = 10;
		this.energia = 10;
		this.forca = 10;
		this.felicidade = 10;
		this.magia = 10;
	}
	
	public void passarTurno() {
		//A classe GeradorDeNumeros é utilizada para gerar um número aleatório
		//entre 0 e 2 para ser reduzido dos atributos da fadinha
		this.saude -= GeradorDeNumeros.gerar();
		this.energia -= GeradorDeNumeros.gerar();
		this.forca -= GeradorDeNumeros.gerar();
		this.felicidade -= GeradorDeNumeros.gerar();
		this.magia -= GeradorDeNumeros.gerar();
		
	}
	
	public void aplicarAcao(Acao acao) {
		//Ao aplicar uma ação na fadinha, seus atributos aumentam
		//de acordo com os atributos da ação empregada
		this.saude += acao.getSaude();
		this.forca += acao.getForca();
		this.energia += acao.getEnergia();
		this.felicidade += acao.getFelicidade();
		this.magia += acao.getMagia();

	}
	
	public boolean estaVivo() {
		//Este método retorna verdadeiro quando todos os atributos do
		//fadinha forem maiores que zero. Caso um dos atributos seja
		//menor ou igual a zero este método retorna falso.
		return (this.saude > 0 && this.energia > 0 && this.forca> 0 && this.felicidade>0 && this.magia>0);
	}

	
	public void status() {
		//Este método imprime os valores dos atributos da fadinha
		if (this.saude <= 3 && this.energia <= 3 && this.forca <= 3 && this.felicidade<= 3 && this.magia<= 3) {
			System.out.println("!!!");
		}
		
		System.out.println("Dados da fadinha:");
		
		System.out.println("Saúde: " + this.saude);
		if(this.saude <= 3){
			System.out.println("Sua fadinha está doente...");
			}
		
		System.out.println("Energia: " + this.energia);
		if(this.energia <= 3){
			System.out.println("Sua fadinha está cansada...");
			}
		
		System.out.println("Força: " + this.forca);
		if(this.forca <= 3){
			System.out.println("Sua fadinha está fraca...");
			}
		
		System.out.println("Felicidade: " + this.felicidade);
		if(this.felicidade <= 3){
			System.out.println("Sua fadinha está triste...");
			}
		
		System.out.println("Magia: " + this.magia);
		if(this.magia <= 3){
			System.out.println("A magia de sua fadinha está acabando...");
			}
		
	}
	
}

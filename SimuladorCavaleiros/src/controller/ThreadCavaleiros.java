package controller;

public class ThreadCavaleiros extends Thread{
	
	private int idCavaleiro;
	private int deslocamento;
	private int distanciaPercorrida;
	private static int posTocha;
	private static int posPedra;
	private static int portas[] = {1, 2, 3, 4};
	
	public ThreadCavaleiros(int idCavaleiro) {
		this.idCavaleiro = idCavaleiro;
	}
	
	public void run() {
		cavaleiroTocha();
		cavaleiroPedra();
		cavaleiroPortas();
	
	}

	private void cavaleiroTocha() {
		System.out.println("******************* CAVALEIRO "+ idCavaleiro +" DECIDE ENTRAR EM UM CORREDOR ESCURO ********************");
		int distanciaTotal = 500;
		distanciaPercorrida = 0;
		deslocamento = (int) ((Math.random()*3)+ 2);
		int tempo = 50;
		while(distanciaPercorrida < distanciaTotal) {
			distanciaPercorrida += deslocamento;
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("\nCavaleiro " + idCavaleiro + ") Se deslocou " + deslocamento + "m.");
		}
		System.out.println("\nO CAVALEIRO " + idCavaleiro + " ALCANÇOU OS 500 METROS\n");
		posTocha++;
		if(posTocha == 1) {
			deslocamento += 2;
			System.out.println("\nO CAVALEIRO " + idCavaleiro + " CONSEGUIU PEGAR A TOCHA PRIMEIRO!! VELOCIDADE +2\n");
		}
	}
	
	private void cavaleiroPedra() {
		int distanciaTotal = 1000;
		int tempo = 50;
		while(distanciaPercorrida < distanciaTotal) {
			distanciaPercorrida += deslocamento;
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("\nCavaleiro " + idCavaleiro + ") Se deslocou " + deslocamento + "m.");
		}
		System.out.println("\nO CAVALEIRO " + idCavaleiro + " ALCANÇOU OS 1500 METROS\n");
		posPedra++;
		if(posPedra == 1) {
			deslocamento += 2;
			System.out.println("\nO CAVALEIRO " + idCavaleiro + " CONSEGUIU PEGAR A PEDRA PRIMEIRO!! VELOCIDADE +2\n");
		}
	}
	
	private void cavaleiroPortas() {
		boolean[] portasEscolher = new boolean[portas.length];
	    int distanciaTotal = 500;
	    int tempo = 50;
	    while (distanciaPercorrida < distanciaTotal) {
	        distanciaPercorrida += deslocamento;
	        try {
	            sleep(tempo);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println("\nCavaleiro " + idCavaleiro + ") Se deslocou " + deslocamento + "m.");
	    }
	    System.out.println("\nO CAVALEIRO " + idCavaleiro + " CHEGOU AO FINAL E SE DEPAROU COM 4 PORTAS\n");

	    int portaEscolhida = (int) (Math.random() * portas.length);
	    while (portasEscolher[portaEscolhida] == true) {
	        portaEscolhida = (int) (Math.random() * portas.length);
	    }

	    portasEscolher[portaEscolhida] = true;

	    if (portaEscolhida == 3) {
	        System.out.println("\nO CAVALEIRO " + idCavaleiro + " ESCOLHEU A PORTA CERTA E CONSEGUIU FUGIR!");
	    } else {
	        System.out.println("\nO CAVALEIRO " + idCavaleiro + " ESCOLHEU A PORTA ERRADA E FOI COMIDO POR MONSTROS");
	    }
	}
}
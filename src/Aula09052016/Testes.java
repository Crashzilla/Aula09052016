package Aula09052016;

public class Testes {
	
	public static void main (String[] args){
		
		
			Cavalo c1 = new Cavalo("Raio");
			Cavalo c2 = new Cavalo("Trovão");
			Cavalo c3 = new Cavalo("Relampago");
			Cavalo c4 = new Cavalo("Eletricidade");
			Cavalo c5 = new Cavalo("Vencedor");
			
			Thread t1 = new Thread(c1);
			Thread t2 = new Thread(c2);
			Thread t3 = new Thread(c3);
			Thread t4 = new Thread(c4);
			Thread t5 = new Thread(c5);
			
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();
	}
}

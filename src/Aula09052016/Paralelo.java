package Aula09052016;

public class Paralelo  extends Thread{
	
	String nome;
	
	
	
	public Paralelo(String nome) {
		super();
		this.nome = nome;
	}

	public void run(){
	
		int i = 0;
		
		while(true){
			System.out.println(nome + i++);
		}
		
	}
}

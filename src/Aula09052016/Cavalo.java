package Aula09052016;

public class Cavalo implements Runnable{

	private String nome;
	
	public Cavalo(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public void run() {
		
		try {
			for(int i=0; i<10; i++){
				Thread.sleep((int)(Math.random() * 5000));
				System.out.println(nome + " " + i);
			}
			System.out.println("============ " + nome + " cruzou a linha de chegada. ============");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

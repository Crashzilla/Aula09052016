package Aula09052016;

public class ParaleloRun implements Runnable {
	public void run() {
		
		int i = 0;
		
		while(true){
			System.out.println(i++);
		}
		
	}
}

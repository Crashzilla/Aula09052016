package Aula09052016;

import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	
	public static void main (String[] args){
		
		/*new Paralelo("t1").start();
		new Paralelo("t2").start();
		new Paralelo("t3").start();
		new Paralelo("t4").start();
		new Paralelo("t5").start();
		
		try {
			Path origem = Paths.get("C:\\Windows");
			Path destino = Paths.get("C:\\temp");
			System.out.println("Copiando pasta: "+origem);
			Files.walkFileTree(origem, CopiarArquivos(destino));
		} catch (Exception e) {
			System.out.println(e);
		}*/
		
		try {
			Files.list(Paths.get("c:\\windows"))
			.filter(p -> p.toString().endsWith("*.exe"))
			.forEach(System.out::println);
		} catch (Exception e) {
			System.out.println();
		}
		
	}
}

package Aula09052016;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public class CopiarArquivos extends SimpleFileVisitor<Path> {

	private Path destino;
	private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.txt");
	
	public CopiarArquivos(Path destino) {
		super();
		this.destino = destino;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		System.out.println("Copiando Arquivos... (" + file.getFileName() + ")");
		if (matcher.matches(file.getFileName())){
			Files.copy(file, destino.resolve(file.getFileName()), StandardCopyOption.REPLACE_EXISTING);
		}
		return FileVisitResult.CONTINUE;
	}
	
	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
	System.out.println("Falhou " + exc.getMessage()+ " " + file.getFileName() + ")");
	return FileVisitResult.CONTINUE;
	}
	
	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrcs) throws IOException {
	System.out.println("Buscando diretório... (" + dir.getFileName() + ")");
	return FileVisitResult.CONTINUE;
	}

}

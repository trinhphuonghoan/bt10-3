package Finally;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CheckedExceptionSample {
	public static void main(String[] args) throws InterruptedException{
		Thread.sleep(1000);
		try {
			Files.createFile(Paths.get("students.txt"));
		}catch(FileAlreadyExistsException e){
			System.out.println("File Already");
			System.out.println(e.toString());
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("excrption:" + e.toString());
		}finally {
			System.out.println("Always executed");
		}
		System.out.println("After exception");
	}
}

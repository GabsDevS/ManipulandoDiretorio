package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a pasta: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isFile);
		System.out.println("Pastas: ");
		
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		boolean sucess = new File(strPath + "\\subdir").mkdir();
		System.out.println("Diretorio criado !");
				
		sc.close();

	}

}

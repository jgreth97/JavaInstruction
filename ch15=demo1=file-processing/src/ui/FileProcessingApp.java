package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcessingApp {

	public static void main(String[] args) throws IOException {
		//create file directory on hard drive
		//create file
		String dirString = "Jackson-MBP-2/temp/sub1/sub2";
		Path dirPath = Paths.get(dirString);
			if (Files.notExists(dirPath)) {
				Files.createDirectories(dirPath);
				System.out.println("directory created: "+dirPath.getFileName());
			}
		//crate file
		String fileString = "products.txt";
		Path filePath = Paths.get(dirString, fileString);
			if (Files.notExists(filePath)) {
				Files.createFile(filePath);
			}
		//display file info
			System.out.println("File Name"+filePath.getFileName());
			System.out.println("Absolute Path"+filePath.toAbsolutePath());
			System.out.println("Is Writable "+Files.isWritable(filePath));
			
				if (Files.exists(dirPath) && Files.isDirectory(dirPath)) {
					System.out.println("Directory"+dirPath.toAbsolutePath());
					System.out.println("Files: ");
				}
					DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
					for (Path p : dirStream) {
						if (Files.isRegularFile(p)){
					System.out.println("      "+p.getFileName());
						}
					//else if (Files.isDirectory(dirPath)) {
				//System.out.println(p.getParent().toString());
				//}
				}
				
			//write data to a file
				Path productsPath = Paths.get("products.txt");
				File productsFile = productsPath.toFile();

				PrintWriter out = new PrintWriter(
								new BufferedWriter(
								new FileWriter(productsFile)));
			//write data to the string
				out.println("Java\tMurach's Java Programming\t57.50");
				
				out.close();
				
				//read data from file
				BufferedReader in = new BufferedReader(
									new FileReader(productsFile));
				String line = in.readLine();
				System.out.println(line);
				in.close();
	}
	}



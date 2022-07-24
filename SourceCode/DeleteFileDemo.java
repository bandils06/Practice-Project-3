package com.question7;

//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
import java.io.*;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
import java.nio.file.*;

public class DeleteFileDemo {
	//Creat file through File class
		public static void createFile() throws IOException {
			//give path to create file along with 'filename.txt'
			File file = new File("E:\\FilesDemo\\file2.txt");
			
			if (file.createNewFile()) {
				System.out.println("File is created.");
			} else {
				System.out.println("File already exists.");
			}
			
			//File is created till here.
					
		}
		
		// Delete file through main method 
		public static void main(String[] args) {
			try {
//				createFile();
				
				Path path= Paths.get("E:\\FilesDemo\\file2.txt");
				if(Files.deleteIfExists(path))
					System.out.println("File deleted");
				else
					System.out.println("File not exist");
				
			} catch (IOException e) {
				System.out.println(e);
			} finally {
				System.out.println("Exit...");
			}
		}

}

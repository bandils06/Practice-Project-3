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
//import java.util.Arrays;
//import java.util.List;
import java.util.*;

public class CreateUpdateRead {
	
	//Creat file through File class
	public static void createFile() throws IOException {
		//give path to create file along with 'filename.txt'
		File file = new File("E:\\FilesDemo\\file1.txt");
		
		if (file.createNewFile()) {
			System.out.println("File is created.");
		} else {
			System.out.println("File already exists.");
		}
		
		//File is created till here.
				
	}
	
	// Writes or update data by using NIO class.
	public static void writeUpdateFile() throws IOException {
		//get path to perform operation
		Path path = Paths.get("E:\\\\FilesDemo\\\\file1.txt");
		String str = "Write or Update file using NIO";
		byte arr[] = str.getBytes();// converts str to byte array
		
		Files.write(path, arr);
		System.out.println("Data written successfully.");

		
		List<String> list=Arrays.asList("This  is my first line","This is my secondLine");
		Files.write(path, list, StandardOpenOption.APPEND);
		//StandardOpenOption.APPEND is used to append new data along with old data.
		//If we don't use this, then we can add data but old data will lost if exist.
		System.out.println("Lines written successfully.");

	}
	
	//Reads through FileReader class
	public static void readFile() throws IOException {
		FileReader file = new FileReader("E:\\\\FilesDemo\\\\file1.txt");
		int data;
		
		while ((data = file.read()) != -1)
			System.out.print((char)data);
		System.out.println("Data retrieve successfully.");
	}

	public static void main(String[] args) {
		try {
			createFile();
			writeUpdateFile();
			readFile();
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			System.out.println("Exit...");
		}
	}

}

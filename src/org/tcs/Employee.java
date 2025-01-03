package org.tcs;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Employee  {
	

	public static void main(String[] args) throws IOException {
		
		//Create an object for File class and mention the path
		
		File file = new File("C:\\screenshots\\hello.txt");
		File file2 = new File("C:\\screenshots\\hello");
		
		//To make a folder
		boolean mkdir = file2.mkdir();
		System.out.println(mkdir);
		
		//To create nested folders
//		System.out.println(file.mkdirs());
		
		System.out.println(file.createNewFile());
		
		System.out.println(file.isDirectory());
		
		System.out.println(file.isFile());
		
		System.out.println(file.canWrite());
		
		System.out.println(file.canRead());
		
		System.out.println(file.canExecute());
		
//		FileUtils.write(file, "\n"+"Welcome all", true);

		List<String> readLines = FileUtils.readLines(file);
		
		for (String string : readLines) {
			System.out.println(string);
		}

		
		
	}

	
	
}

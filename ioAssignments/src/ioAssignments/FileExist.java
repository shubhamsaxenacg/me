//.........Checking whether file exist 

package ioAssignments;

import java.io.File;
import java.util.Scanner;

public class FileExist {
	public static void main(String args[]) {
		
		String filePathString;
		Scanner scanner = new Scanner(System.in);
	//Input path of file	
		System.out.println("Enter file path....");
		filePathString = scanner.next();
		
	//...Checking file at the given loacation	
		File file = new File(filePathString);
		if(file.exists() && !file.isDirectory())
		{
			System.out.println("File is there....");
		}
		else
			System.out.println("File is not there....");
		
		scanner.close();
	}
}

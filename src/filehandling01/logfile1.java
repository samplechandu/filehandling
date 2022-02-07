package filehandling01;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class logfile1 {
	public void Calculator() throws IOException {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the operation");
		int op = sc.nextInt();
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		if(op == 1)
			System.out.println("Addition:" +(a+b));
		if(op == 2)
			System.out.println("substraction:" +(a-b));
		if(op == 3)
			System.out.println("Division:" +(a/b));
		
		File file = new File("c:\\Files\\testFile1.txt");
		if(file.createNewFile()) {
			System.out.println("File is created");
		}
		else {
			System.out.println("File is already exists");
		}
		FileWriter w = new FileWriter(file);
		w.append("First num = "+a+"\n second num = "+b+"\noperation done");
		w.close();
		   
        FileReader reader = new FileReader("c:\\Files\\testFile1.txt");
		int data;
		while((data=reader.read())!=-1) {
			System.out.println((char)data);
		}
		System.out.println(" "); 
	}
	public static void main(String[] args) throws IOException {
		logfile1 R = new logfile1();
		R.Calculator();
		
			
	}

}

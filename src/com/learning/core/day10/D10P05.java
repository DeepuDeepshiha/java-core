package com.learning.core.day10;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;

public class D10P05 {
	public static void writefile(File f,String str)
	{
		try
		{
			FileWriter fw=new FileWriter(f);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(str);
			bw.flush();
			bw.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void size(File f)
	{
		System.out.println("Size of the file:"+f.length()); 
	}
	public static void readfile(File f)
	{
		try
		{
			FileReader fw=new FileReader(f);
			BufferedReader bw=new BufferedReader(fw);
			String line=bw.readLine();
			while(line!=null)
			{
				System.out.println(line);
				line=bw.readLine();
			}
			bw.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deletefile(File f)
	{
		f.delete();
		System.out.println("File is Deleted");
	}
	public static void main(String[] args)
	{
		File f=new File("io.txt");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		writefile(f,str);
		//size(f);
		//readfile(f);
		//deletefile(f);
	}

}

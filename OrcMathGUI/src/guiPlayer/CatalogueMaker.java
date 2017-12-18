package guiPlayer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatalogueMaker {

	Scanner in = new Scanner(System.in);
	private static ArrayList<Gundam> list;
	
	public CatalogueMaker() {
		list = new ArrayList<Gundam>();
		list.add(new Gundam("RX-78-2", "Gundam Origin", "White"));
		list.add(new Gundam("Barbatos", "Gundam Iron Blooded Orphans", "White"));
		list.add(new Gundam("Wing", "Gundam Wing", "White"));
		list.add(new Gundam("Bael", "Gundam Iron Blooded Orphans", "Light Blue"));
		list.add(new Gundam("Exia", "Gundam 00", "Blue"));
		list.add(new Gundam("Sinanju", "Gundam Unicorn", "Red"));
		list.add(new Gundam("Unicorn", "Gundam Unicorn", "White"));
	}

	public static void main(String[] args) {
	
		CatalogueMaker x = new CatalogueMaker();
		System.out.println(x.getCSVContent());
		System.out.println("What would you like to add? Seperate them using commas.");
		Scanner in = new Scanner(System.in);
		x.seperateAdd(in.nextLine());
		x.testSaveContent();
	}
	

	private static String separate(String s) {
		String[] splitAns = s.split(",");
		return splitAns[0] + "," + splitAns[1] + "," + splitAns[2];
		
		//list.add(new Gundam (splitAns[0], splitAns[1], splitAns[2]));
	
	}
	
	 private static void testSaveContent() {

		 try{    
		
		 FileWriter fw=new FileWriter("data.csv");    
		 Scanner in = new Scanner(System.in);
		 //fw.write(separate(in.nextLine()));    
		 for(int i =0; i<list.size();i++)
		 {
			 fw.write(i + "\n");
		 }
				 
		 fw.close();    
		
		 System.out.println("Success! File \""+"data.csv"+"\" saved!");
		
		 }catch(IOException e){
		
		 System.out.println("An IOException was thrown. \nCheck to see that the directory where you tried to save the file actually exists.");
		
		 }

	     

	 }
	 
	 
	 private static List<String> testFileLoading() {

		 Scanner in = new Scanner(System.in);
		
		 String fileName = "";
		
		 List<String> content = new ArrayList<String>();
		
		 //use this boolean to control the while loop. The user should have multiple chances to enter a correct filename
		
		 boolean opened = false;
		
		 while(!opened){
		
		 try {
		
		 System.out.println("Enter a file to open");
		
		 fileName = in.nextLine();
		
		 FileReader fileReader = new FileReader(new File(fileName));
		
		 String line = "";
		
		 //a BufferedReader enables us to read the file one line at a time
		
		 BufferedReader br = new BufferedReader(fileReader);
		
		 while ((line = br.readLine()) != null) {
			
			String[] param = line.split(",");
			list.add(new Gundam(param[0], param[1],param[2]));
		 }
		
		 br.close();
		
		 opened = true;
		
		 }catch (IOException e) {
		
		 System.out.println("The file name you specified does not exist.");
		
		 }
		 }

	 }

	 

	
	public String getCSVContent()
	{
		String data = "Name,Series,Color\n";
		for(Gundam g: list)
		{
			data += g + "\n";
		}
		return data;
	}
	
	public static void seperateAdd(String ans)
	{
	/*	String[] newAnswers = new String[3];
		int[] commaIndex = new int[3];
		for(int index = 0; index < answer.length(); index++)
		{
			if(answer.substring(index, index+1) == ",")
			{
				commaIndex[index] = index;
			}
		}
		newAnswers[0] = answer.substring(0, commaIndex[0]);
		newAnswers[1] = answer.substring(newAnswers[0].length()-1, commaIndex[1]);
		newAnswers[2] = answer.substring(newAnswers[1].length()-1, commaIndex[2]);
		return newAnswers; */
		
		String[] splitAns = ans.split(",");
		list.add(new Gundam (splitAns[0], splitAns[1], splitAns[2]));
	
	}
	
	public void addNewItem(String n, String s, String c)
	{
		CatalogueMaker x = new CatalogueMaker();
		list.add(new Gundam(n,s,c));
		System.out.println("Item added sucessfully!" + x.getCSVContent());
		
	}

}

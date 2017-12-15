package guiPlayer;

import java.util.ArrayList;
import java.util.Scanner;

public class CatalogueMaker {

	Scanner in = new Scanner(System.in);
	private ArrayList<Gundam> list;
	
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
		addNewItem()
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
	
	public String[] seperateAnswer(String answer)
	{
		String[] newAnswers = new String[3];
		int[] commaIndex = new int[3];
		for(int index = 0; index < answer.length(); i++)
		{
			if(answer.substring(index, index+1) == ",")
			{
				commaIndex[index] = index;
			}
		}
		newAnswers[0] = answer.substring(0, commaIndex[0]);
		newAnswers[1] = answer.substring(newAnswers[0].length()-1, commaIndex[1]);
	
	}
	
	public void addNewItem(String n, String s, String c)
	{
		CatalogueMaker x = new CatalogueMaker();
		list.add(new Gundam(n,s,c));
		System.out.println("Item added sucessfully!" + x.getCSVContent());
		
	}

}

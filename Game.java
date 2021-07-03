import java.util.Scanner;
class JumblingGame
{
	
	JumblingGame()
	{
		int Score=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO JUMBLING GAME");
		System.out.println("QURRELIS");
		String Ans1=sc.next().toUpperCase();
		System.out.println("NIOL");
		String Ans2=sc.next().toUpperCase();
		System.out.println("ROTRAP");
		String Ans3=sc.next().toUpperCase();
		System.out.println("ENTTIK");
		String Ans4=sc.next().toUpperCase();
		System.out.println("SEUMO");
		String Ans5=sc.next().toUpperCase();
		System.out.println("YPPPU");
		String Ans6=sc.next().toUpperCase();
		System.out.println("ZALIDR");
		String Ans7=sc.next().toUpperCase();
		System.out.println("SIFH");
		String Ans8=sc.next().toUpperCase();
		System.out.println("ATGO");
		String Ans9=sc.next().toUpperCase();
		System.out.println("EHN");
		String Ans10=sc.next().toUpperCase();
		if (Ans1.equals("SQUIRREL"))
		{
			Score+=1;
		}
		if (Ans2.equals("LION"))
		{
			Score+=1;
		}
		if (Ans3.equals("PARROT"))
		{
			Score+=1;
		}
		if (Ans4.equals("KITTEN"))
		{
			Score+=1;
		}
		if (Ans5.equals("MOUSE"))
		{
			Score+=1;
		}
		if (Ans6.equals("PUPPY"))
		{
			Score+=1;
		}
		if (Ans7.equals("LIZARD"))
		{
			Score+=1;
		}
		if (Ans8.equals("FISH"))
		{
			Score+=1;
		}
		if (Ans9.equals("GOAT"))
		{
			Score+=1;
		}
		if (Ans10.equals("HEN"))
		{
			Score+=1;
		}
		System.out.println("Your score :"+Score);
	}
}
class HiddenGame
{
	HiddenGame()
	{
		int Score=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO HIDDEN GAME");
		System.out.println("ENTER THE LETTER THAT ARE MISSING IN PLACE OF STARS");
		System.out.println("B**GAL***");
		String Ans1=sc.next().toUpperCase();
		System.out.println("K**NO**");
		String Ans2=sc.next().toUpperCase();
		System.out.println("B***R");
		String Ans3=sc.next().toUpperCase();
		System.out.println("H****ABAD");
		String Ans4=sc.next().toUpperCase();
		System.out.println("C*E***I");
		String Ans5=sc.next().toUpperCase();
		System.out.println("D*L*I");
		String Ans6=sc.next().toUpperCase();
		System.out.println("B**P**");
		String Ans7=sc.next().toUpperCase();
		System.out.println("K***ATA");
		String Ans8=sc.next().toUpperCase();
		System.out.println("NANDI******");
		String Ans9=sc.next().toUpperCase();
		System.out.println("A**U*");
		String Ans10=sc.next().toUpperCase();
		if(Ans1.equals("ENURU"))
		{
			Score+=1;
		}
		if(Ans2.equals("UROL"))
		{
			Score+=1;
		}
		if(Ans3.equals("IHA"))
		{
			Score+=1;
		}
		if(Ans4.equals("YDER"))
		{
			Score+=1;
		}
		if(Ans5.equals("HNNA"))
		{
			Score+=1;
		}
		if(Ans6.equals("EH"))
		{
			Score+=1;
		}
		if(Ans7.equals("HOAL"))
		{
			Score+=1;
		}
		if(Ans8.equals("OLK"))
		{
			Score+=1;
		}
		if(Ans9.equals("KOTKUR"))
		{
			Score+=1;
		}
		if(Ans10.equals("LLR"))
		{
			Score+=1;
		}
		System.out.println("Your score :"+Score);
	}
}
class Game
{
	public static void main(String Args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose 1 for JUMBLING GAME");
		System.out.println("Choose 2 for HIDEEN GAME");
		int Choice=sc.nextInt();
		switch(Choice)
		{
			case 1:JumblingGame a=new JumblingGame();
				break;
			case 2:HiddenGame b=new HiddenGame();
				break;

		}
		
	}
}
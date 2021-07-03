import java.util.Scanner;
class JumblingGame
{
	
	JumblingGame()
	{
		String[] MAns={"SQUIRREL","LION","PARROT","KITTEN","MOUSE","PUPPY","LIZARD","FISH","GOAT","HEN"};
		String Ans[]=new String[10];
		int Score=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO JUMBLING GAME");
		random.s(MAns[0]);
		Ans[0]=sc.next().toUpperCase();
		random.s(MAns[1]);
		Ans[1]=sc.next().toUpperCase();
		random.s(MAns[2]);
		Ans[2]=sc.next().toUpperCase();
		random.s(MAns[3]);
		Ans[3]=sc.next().toUpperCase();
		random.s(MAns[4]);
		Ans[4]=sc.next().toUpperCase();
		random.s(MAns[5]);
		Ans[5]=sc.next().toUpperCase();
		random.s(MAns[6]);
		Ans[6]=sc.next().toUpperCase();
		random.s(MAns[7]);
		Ans[7]=sc.next().toUpperCase();
		random.s(MAns[8]);
		Ans[8]=sc.next().toUpperCase();
		random.s(MAns[9]);
		Ans[9]=sc.next().toUpperCase();
		int Index=0;
		for(String s:MAns)
		{
			if(Ans[Index].equals(s))
			{
				Score+=1;
			}
			Index+=1;
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
		String[] MAns={"BENGALURU","KURNOOL","BIHAR","HYDERBAD","CHENNAI","BIHAR","BHOPAL","KOLKATA","NANDIKOTKUR","ALLUR"};
		String Ans[]=new String[10];
		System.out.println("WELCOME TO HIDDEN GAME");
		System.out.println("ENTER THE LETTER THAT ARE MISSING IN PLACE OF STARS");
		random.o(MAns[0]);
		Ans[0]=sc.next().toUpperCase();
		random.o(MAns[1]);
		Ans[1]=sc.next().toUpperCase();
		random.o(MAns[2]);
		Ans[2]=sc.next().toUpperCase();
		random.o(MAns[3]);
		Ans[3]=sc.next().toUpperCase();
		random.o(MAns[4]);
		Ans[4]=sc.next().toUpperCase();
		random.o(MAns[5]);
		Ans[5]=sc.next().toUpperCase();
		random.o(MAns[6]);
		Ans[6]=sc.next().toUpperCase();
		random.o(MAns[7]);
		Ans[7]=sc.next().toUpperCase();
		random.o(MAns[8]);
		Ans[8]=sc.next().toUpperCase();
		random.o(MAns[9]);
		Ans[9]=sc.next().toUpperCase();
		int Index=0;
		for(String s:MAns)
		{
			if(Ans[Index].equals(s))
			{
				Score+=1;
			}
			Index+=1;
		}
		System.out.println("Your score :"+Score);
	}
}
class Game2
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
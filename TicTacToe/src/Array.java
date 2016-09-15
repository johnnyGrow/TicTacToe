import java.util.Scanner;

public class Array
	{
		
		static String move;
		static String board[][]=new String [3][3];
	

public static void displayTable()
{
	System.out.println("     1     2     3");
	System.out.println("  -------------------");
	System.out.println("A |  "+board[0][0]+"  |  "+board[0][1]+"  |  "+board[0][2]+"  |");
	System.out.println("  |     |     |     |");
	System.out.println("  -------------------");
	System.out.println("B |  "+board[1][0]+"  |  "+board[1][1]+"  |  "+board[1][2]+"  |");
	System.out.println("  |     |     |     |");
	System.out.println("  -------------------");
	System.out.println("C |  "+board[2][0]+"  |  "+board[2][1]+"  |  "+board[2][2]+"  |");
	System.out.println("  |     |     |     |");
	System.out.println("  -------------------");
	
		{
			
		}
	
}

public static void fillTable1()
{
	for(int row=0; row<3; row++)
		{
			for(int col=0; col<3; col++)
				{
					board[row][col]=" ";
				}
		}
}
public static void userInput()
{
	
int row=0;
	System.out.println("what is your move(ex:A1)");
	Scanner userInput=new Scanner(System.in);
	 move=userInput.nextLine();
	switch (move.substring(0,1))
	{
	case "a":
	case "A":
			{
				row=0;
				break;
			}
		case "b":
		case "B":
				{
					row=1;
					break;
				}
	case "c":
	case "C":
			{
				row=2;
				break;
			}
		
}
	int col=Integer.parseInt(move.substring(1))-1;
	board[row][col]="o";
}
public static void computerMove()
{
	int row=0;
	int col=0;
	 row=0;
	 col=0;
	int randomRow=(int)(Math.random()*3)+1;
	int randomCol=(int)(Math.random()*3)+1;
	row=randomRow;
	col=randomCol;
	if(board[row][col]==" ")
		{
			board[row][col]="x";
		}
	else
		{
			computerMove();
		}
	
	
}
}
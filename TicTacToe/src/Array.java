import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.JFrame;
public class Array
	{
		
		static String move;
		static String board[][]=new String [3][3];
		static String playerMove;
		static String compMove;
		static int row=0;
		static int col=0;
		static int compRow=0;
		static int compCol=0;
		static String playerChar;
		static String compChar;
		static String name;
		static int choice;
		static JFrame frame=new JFrame();
public static void doIntro()
{
	ImageIcon icon =  new ImageIcon("56.gif");
	name = (String)JOptionPane.showInputDialog(
            frame,
            "Hey There, What is Your Name?",
            "Tic Tac Toe",
            JOptionPane.PLAIN_MESSAGE,
            icon,
            null,  
            null); 
	Object[] options = {"X", "O"};
	ImageIcon icon2 =  new ImageIcon("890.gif");
	choice = JOptionPane.showOptionDialog(null, 
		"Ok "+name+". Would You Like To Be 'X' or 'O'?",
		"Choose Your Character",
		JOptionPane.YES_NO_CANCEL_OPTION,
		JOptionPane.QUESTION_MESSAGE, 
		icon2,
		options, 
		options[1]);
		switch(choice)
		{
		case 0:
				{
					playerChar="X";
					compChar="O";
					break;
				}
		case 1:
				{
					playerChar="O";
					compChar="X";
					break;
				}
		}
}
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
public static String playerMove()
{
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
	col=Integer.parseInt(move.substring(1))-1;
	return playerMove;
}
public static void doMove()
	{
		playerMove = playerChar;
		board[row][col] = playerMove;
		displayTable();
	}
public static void compMove()
	{
		compMove = compChar;
		compRow = (int)(Math.random()*3);
		compCol = (int)(Math.random()*3);			
		if (board[compRow][compCol].equals(" "))
			{
				board[compRow][compCol]=compMove;
				displayTable();
			}
		else 
			{
				compMove();
			}
			
	}
public static void checkOwnOpenSpace()
	{
		if (board[row][col].equals(playerChar))
			{
				System.out.println("Can't take your own space twice, try again");
				playerMove();
			}
		if  (board[row][col].equals(compChar))
			{
				System.out.println("Can't take his space pal, try again");
				playerMove();
			}
		else 
			{
				doMove();
			}
		}
}
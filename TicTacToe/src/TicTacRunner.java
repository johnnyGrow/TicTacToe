public abstract class TicTacRunner
	{
		public static void main(String[] args)
			{
				Array.doIntro();
				Array.fillTable1();
				Array.displayTable();
				Array.playerMove();
				Array.doMove();
					{
						boolean gameContinues = true;
						while (gameContinues)
							{
								Array.compMove();
								//checkCompOpenSpace();
								Array.playerMove();
								Array.checkOwnOpenSpace();
							}	
					}
			}
	}
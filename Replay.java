package tictactoe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Replay
{
	public static void viewReplay(String filepath, int replayNumber, int speed) throws IOException, InterruptedException
	{
		String filename = "replay-" + replayNumber + ".txt";
		String[] moves = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
		
		String boardRowDivider = "\n--+---+--\n";
		BufferedReader reader = new BufferedReader(new FileReader(filepath + filename));
		
		for (int i = 0; i < moves.length; i++)
		{
			int coordinates = Integer.parseInt(reader.readLine());
			
			if (coordinates == 0)
			{
				System.out.println("Game has ended.");
				System.exit(0);
			}
			else if (i % 2 == 0){moves[coordinates-1] = "X";}
			else				{moves[coordinates-1] = "O";}
			
			System.out.println
			(
					"\n\n\n" +
					moves[0] + " | " + moves[1] + " | " + moves[2] +
					boardRowDivider +
					moves[3] + " | " + moves[4] + " | " + moves[5] +
					boardRowDivider +
					moves[6] + " | " + moves[7] + " | " + moves[8]
			);
			
			Thread.sleep(speed);
		}
		reader.close();
	}
	
	
	public static void saveReplay(String filepath, int[] moveArray) throws IOException
	{
		BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));
		
		for (int i = 0; i < moveArray.length; i++)
		{
			writer.write(moveArray[i] + "\r\n");
		}
		
		writer.close();
	}
}

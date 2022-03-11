package tictactoe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Replay
{
//	public static void main(String[] args)
//	{
//		final String FILEPATH = "src\\tictactoe\\Data\\";
//		
//		try
//		{
//			viewReplay(FILEPATH, 5, 2500);
//			System.out.println("And that's the game!");
//			
//			saveReplay("src\\tictactoe\\Data\\replay-0.txt", new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8});
//		}
//		catch (IOException e)
//		{
//			System.out.println("An IO Exception occured.");
//			System.exit(0);
//		}
//		catch (InterruptedException e)
//		{
//			System.out.println("The thread was interrupted.");
//			System.exit(1);
//		}
//		catch (Exception e)
//		{
//			System.out.println("An unknown error occurred.");
//			System.exit(2);
//		}
//	}
	
	
	public static void viewReplay(String filepath, int replayNumber, int speed) throws IOException, InterruptedException
	{
		String filename = "replay-" + replayNumber + ".txt";
		String[] moves = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
		
		String boardRowDivider = "\n--+---+--\n";
		BufferedReader reader = new BufferedReader(new FileReader(filepath + filename));
		
		for (int i = 0; i < moves.length; i++)
		{
			int coordinates = Integer.parseInt(reader.readLine());
			
			if (i % 2 == 0)		{moves[coordinates] = "X";}
			else				{moves[coordinates] = "O";}
			
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

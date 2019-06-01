import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tictactoe extends JFrame{
	
	static char choice = 'Z';
	static char com = 'Z';
	public static void victoryCheck(char board[][],JLabel display)
	{
	if(board[0][0]==board[0][1]&& board[0][0]==board[0][2] && board[0][0]==choice)
	{
		display.setText("You Won");
	}
	else if(board[1][0]==board[1][1]&& board[1][0]==board[1][2] && board[1][0]==choice)
	{
		display.setText("You Won");
	}
	else if(board[2][0]==board[2][1]&& board[2][0]==board[2][2] && board[2][0]==choice)
	{
		display.setText("You Won");
	}
	else if(board[0][0]==board[0][1]&& board[0][0]==board[0][2] && board[0][0]==choice)
	{
		display.setText("You Won");
	}
	else if(board[1][0]==board[1][1]&& board[1][0]==board[1][2] && board[1][0]==choice)
	{
	display.setText("You Won");
	}
	else if(board[2][0]==board[2][1]&& board[2][0]==board[2][2] && board[2][0]==choice)
	{
		display.setText("You Won");
	}
	else if(board[0][0]==board[1][1] && board[0][0] == board[2][2] && board[0][0]==choice)
	{
		display.setText("You Won");
	}
	else if(board[2][0]==board[1][1] && board[2][0]==board[0][2] && board[2][0]==choice)
	{
		display.setText("You Won");
	}
	if(board[0][0]==board[0][1]&& board[0][0]==board[0][1] && board[0][0]==com)
	{
	display.setText("You Lost");
	}
	else if(board[1][0]==board[1][1]&& board[1][0]==board[1][2] && board[1][0]==com)
	{
		display.setText("You Lost");
	}
	else if(board[2][0]==board[2][1]&& board[2][0]==board[2][2] && board[2][0]==com)
	{
		display.setText("You Lost");
	}
	else if(board[0][0]==board[0][1]&& board[0][0]==board[0][2] && board[0][0]==com)
	{
		display.setText("You Lost");
	}
	else if(board[1][0]==board[1][1]&& board[1][0]==board[1][2] && board[1][0]==com)
	{
		display.setText("You Lost");
	}
	else if(board[2][0]==board[2][1]&& board[2][0]==board[2][2] && board[2][0]==com)
	{
		display.setText("You Lost");
	}
	else if(board[0][0]==board[1][1] && board[0][0] == board[2][2] && board[0][0]==com)
	{
		display.setText("You Lost");
	}
	else if(board[2][0]==board[1][1] && board[2][0]==board[0][2] && board[2][0]==com)
	{
		display.setText("You Lost");
	}
	
		
	}
	public static void printBoard(char board[][])
	{
		for(int r= 0;r<3;r++)
		{
			for(int c = 0;c<3;c++)
			{
				System.out.print(board[r][c]);
			}
			System.out.println();
			
		}
		
	}
	public static void updateBoard(ArrayList<JButton> buttons,char board[][])
	{
		int i = 0;
		for(int r =0;r<3;r++)
		{
			for(int c = 0;c<3;c++)
			{
				if(board[r][c]==com)
				{
					buttons.get(i).setText(""+com);
				
				}
				else if(board[r][c]==choice)
				{
					buttons.get(i).setText(""+choice);
				}
				else
				{
					buttons.get(i).setText("");
				}
				i++;
			}
		}
		printBoard(board);
	}
	public static void playPiece(JButton b, char board[][],int row,int col)
	{
		if(board[row][col]==0)
		{
			board[row][col] = choice;
			b.setText(""+choice);
		}
		
	}

	public static void computerPlayer(char board[][],char com)
	{
		if(board[0][0]== com && board[0][1]== com && board[0][2] == 0)
		
		{
			board[0][2] = com;
			
		}
		else if(board[0][0]== com && board[0][1]== 0 && board[0][2] == com)
		{
			board[0][1] = com;
		}
		else if(board[0][0]== 0 && board[0][1]== com && board[0][2] == com)
		{
			board[0][0] = com;
		}
		if(board[1][0]== com && board[1][1]== com && board[1][2] == 0)
			
		{
			board[1][2] = com;
		}
		else if(board[1][0]== com && board[1][1]== 0 && board[1][2] == com)
		{
			board[1][1] = com;
		}
		else if(board[1][0]== 0 && board[1][1]== com && board[1][2] == com)
		{
			board[1][0] = com;
		}
		if(board[2][0]== com && board[2][1]== com && board[2][2] == 0)
			
		{
			board[2][2] = com;
		}
		else if(board[2][0]== com && board[2][1]== 0 && board[2][2] == com)
		{
			board[2][1] = com;
		}
		else if(board[2][0]== 0 && board[2][1]== com && board[2][2] == com)
		{
			board[2][0] = com;
		}
		else
		{
			for(int i = 0;i<3;i++)
			{
				for(int j = 0;j<3;j++)
				{
					if(board[i][j]==0)
					{
						System.out.print(board[i][j]);
						board[i][j] = com;
						
						return;
					}
					System.out.println();
				}
			}
		}
	}
	public static void main(String[] args) {
		char[][] board = new char[3][3];
		ArrayList<JButton> buttons = new ArrayList<JButton>();
		JFrame  game = new JFrame("Tic-Tac-Toe");
		game.setVisible(true);
		game.setSize(500,500);
		Container cp = game.getContentPane();
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout gl = new GridLayout(0,3);
		JButton x1 = new JButton("");
		JButton x2 = new JButton("");
		JButton x3 = new JButton("");
		
		JButton x4 = new JButton("");
		JButton x5 = new JButton("");
		JButton x6 = new JButton("");
	
		JButton x7 = new JButton("");
		JButton x8 = new JButton("");
		JButton x9 = new JButton("");
		JButton reset = new JButton("reset");
		
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
			for (int r = 0;r<3;r++)
			{
				for(int c =0;c<3;c++)
				{
					board[r][c] = 0;
				}
			}
			updateBoard(buttons,board);
			}
		});
	
		JLabel guide = new JLabel("Choose X or 0");
		JButton xc = new JButton("X");
		JButton oc = new JButton("O");
		x1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
			playPiece(x1,board,0,0);
		   victoryCheck(board,guide);
			computerPlayer(board,com);
			updateBoard(buttons,board);
			 victoryCheck(board,guide);
			
			}
		});
		x2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
			playPiece(x2,board,0,1);
			 victoryCheck(board,guide);
			computerPlayer(board,com);
			updateBoard(buttons,board);
		    victoryCheck(board,guide);
			}
		});
		x3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
			playPiece(x3,board,0,2);
			 victoryCheck(board,guide);
			computerPlayer(board,com);
			updateBoard(buttons,board);
			 victoryCheck(board,guide);
			}
		});
		x4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
			playPiece(x4,board,1,0);
			 victoryCheck(board,guide);
			computerPlayer(board,com);
			updateBoard(buttons,board);
			 victoryCheck(board,guide);
	}
		});
		x5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
			playPiece(x5,board,1,1);
			 victoryCheck(board,guide);
			computerPlayer(board,com);
			updateBoard(buttons,board);
			 victoryCheck(board,guide);
			}
		});
		x6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
			
			playPiece(x6,board,1,2);
			 victoryCheck(board,guide);
			computerPlayer(board,com);
			updateBoard(buttons,board);
			 victoryCheck(board,guide);
			}
		});
		x7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
			playPiece(x7,board,2,0);
			 victoryCheck(board,guide);
			computerPlayer(board,com);
			updateBoard(buttons,board);
			 victoryCheck(board,guide);
			}
		});
		x8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
			
			playPiece(x8,board,2,1);
			 victoryCheck(board,guide);
			computerPlayer(board,com);
			updateBoard(buttons,board);
			 victoryCheck(board,guide);
			}
		});
		x9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
			
			playPiece(x9,board,2,2);
			 victoryCheck(board,guide);
			computerPlayer(board,com);
			updateBoard(buttons,board);
			 victoryCheck(board,guide);
			}
		});
		buttons.add(x1);
		buttons.add(x2);
		buttons.add(x3);
		buttons.add(x4);
		buttons.add(x5);
		buttons.add(x6);
		buttons.add(x7);
		buttons.add(x8);
		buttons.add(x9);
		
		xc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
			choice = 'X';
			com = 'O';
			guide.setText("You chose " + choice);
			xc.setVisible(false);
			oc.setVisible(false);
			}
		});
		oc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent r)
			{
				choice = 'O';
				com = 'X';
				guide.setText("You chose " + choice);
				xc.setVisible(false);
				oc.setVisible(false);
			
			}
			
		});
		cp.add(guide);
		cp.add(xc);
		cp.add(oc);
		cp.add(x1);
		cp.add(x2);
		cp.add(x3);
		cp.add(x4);
		cp.add(x5);
		cp.add(x6);
		cp.add(x7);
		cp.add(x8);
		cp.add(x9);
		cp.add(reset);
		game.setLayout(gl);
		
	}

}

package Project;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TicTacToe extends JFrame implements ActionListener {
  public static int BOARD_SIZE = 3;
  
  public static enum GameStatus {
	  Incomplete,XWins,ZWins,Tie
  }
  
  private JButton[][] buttons = new JButton[BOARD_SIZE][BOARD_SIZE];
    boolean crossTurn = true;
  public TicTacToe() {
		super.setTitle("TicTacToe");
		super.setSize(800, 800);
		
		GridLayout grid = new GridLayout(BOARD_SIZE, BOARD_SIZE);
         super.setLayout(grid);
         Font font = new Font("Comic Sans", 1, 150);
	      for(int row=0; row<BOARD_SIZE; row++) {
	    	  for(int col=0; col<BOARD_SIZE; col++) {
	    		  JButton button = new JButton("");
	    		  buttons[row][col] = button;
	    		  button.setFont(font);
	    		  button.addActionListener(this);
	    		  super.add(button);
	    	  }  
	      }
	    super.setResizable(false);  
	    super.setVisible(true);  
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
	 JButton clickedButton = (JButton)e.getSource(); 
     makeMove(clickedButton);
     GameStatus gs = this.getGameStatus();
  }
  

private void makeMove(JButton clickedButton) {
	  String btntext = clickedButton.getText();
	  if(btntext.length()>0) {
		  JOptionPane.showMessageDialog(this,"Invalid Move");
	  }
	  else {
		  if(crossTurn) {
			  clickedButton.setText("X");
		  }
		  else {
			  clickedButton.setText("0");
		  }
		  crossTurn =! crossTurn;
	  }
  }

   private GameStatus getGameStatus() {
    String text1="",text2="";
	   
   }
   
}

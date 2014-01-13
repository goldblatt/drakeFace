package drakeFace;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class DrakeGame extends JFrame{
	
	public DrakeGame() {
		setTitle("DrakeFace"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setSize(300,280); 
		this.setBackground(Color.white);
		setLocationRelativeTo(null); 
		setResizable(true); 
	}
	
	public static void main (String[] args) throws InterruptedException {
		DrakeGame frame = new DrakeGame(); 
		Board board = new Board(); 
		frame.add(board);		
		MouseClick mouse = new MouseClick(board); 
		frame.addMouseListener(mouse); 
		frame.setVisible(true); 

		while (true) {
			board.move(); 
			board.repaint(); 
			Thread.sleep(10); 
		}
	}
	
}

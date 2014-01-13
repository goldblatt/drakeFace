package drakeFace;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Board extends JPanel{
	
	//will eventually grab these from the ball class!
	int xspeed = 1; 
	int yspeed = 1; 

	ArrayList<FaceBall> ballArray = new ArrayList<FaceBall>(); 
	
	public void addBallToArray(FaceBall newGuy){
		ballArray.add(newGuy); 
	}
	
	public void move() {
		for (int i = 0; i< ballArray.size(); i++) {
			ballArray.get(i).moveBall(); 
			if (ballArray.get(i).timeLeft()<=0) {
				ballArray.remove(i); 
			}
		}
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g; 
		g2d.setColor(Color.red); 
		for (int i = 0; i< ballArray.size(); i++) {
			ballArray.get(i).paint(g2d); 
		}
	}
	
}

package drakeFace;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class FaceBall { 
	int width = 30; 
	int height = 30; 
	int mass = 20; 
	BufferedImage image; 
	private Board gameBoard; 

	//using this when mouse pressed to calc force
	int initx; 
	int inity; 
	
	//use this to place faces
	int xpos; 
	int ypos; 
	
	//use this to e
	int transperency; 
	int timeLeft = 1000; 
	
	int xspeed = 1; 
	int yspeed = 1; 
	
	public int timeLeft() {
		return timeLeft--; 
	}
	
	public FaceBall(Board board, String filename, int xp, int yp) {
		initx = xp; 
		inity = yp; 
		gameBoard = board; 
		transperency = 100; 
		
		try {
			image = ImageIO.read(new File(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Throws an error" + e);
		} 
	}
	public void moveBall() {
		
		xpos = xpos - xspeed; 
		ypos = ypos - yspeed; 
		
		if (xpos > gameBoard.getWidth() - 50 || xpos < 5) {
			xspeed = xspeed * -1; 
		}
		if (ypos > gameBoard.getHeight() - 50 || ypos < 5) {
			yspeed = yspeed * -1; 
		}
		

		
	}
	
	
	public void paint(Graphics2D g) {
		g.drawOval(xpos, ypos, width, height); 
		g.drawImage(image, xpos, ypos, null);
	}
	
	
	
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		xpos = arg0.getX() - 30; 
		ypos = arg0.getY() - 30;
		
		xspeed = (initx -xpos) / mass; 
		yspeed = (inity - ypos) / mass; 
		
		
	}

	
}

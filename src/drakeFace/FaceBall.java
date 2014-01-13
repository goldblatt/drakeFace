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
	int timeLeft; 
	
	
	public FaceBall(Board board, String filename, int xp, int yp) {
		xpos = xp; 
		ypos = yp; 
		gameBoard = board; 
		transperency = 100; 
		timeLeft = 100; 
		
		try {
			image = ImageIO.read(new File(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Throws an error" + e);
		} 
	}
	public void moveBall(int xvelocity, int yvelocity) {
		xpos = xpos + 1 * xvelocity; 
		ypos = ypos + 1 * yvelocity; 
	}
	
	
	public void paint(Graphics2D g) {
		g.drawImage(image, xpos, ypos, null);
	}
	
	
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		initx = arg0.getX(); 
		inity = arg0.getY();
	}

	
}

package drakeFace;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseClick implements MouseListener{

	Board board; 
	String filename = "/Users/sgoldblatt/Documents/workspace/game/src/drakeFace/drakeFACE2.png"; 
	FaceBall newFace; 
	
	
	public MouseClick(Board board) {
		this.board = board;
	}
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		newFace = new FaceBall(board, filename, arg0.getX()-50, arg0.getY()-50); 
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		//make a call to the ball class
		// can call get x and y
		newFace.mouseReleased(MouseEvent arg0); 
		board.addBallToArray(newFace);
	}

}

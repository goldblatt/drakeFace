package drakeFace;

public class BallThread extends Thread {
	Board board; 
	
	BallThread(Board board) {
		this.board = board; 
	}
	
	@Override
	public void run() {
		int time = 100; 
		while (time > 0) {
			board.move(); 
			board.repaint(); 
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			time--; 
		}
	}
}

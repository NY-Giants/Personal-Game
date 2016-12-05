import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class RunnerClass {
JFrame frame;
static final int width = 500;
static final int height = 800;
GamePanel2 gpanel = new GamePanel2();
	public static void main(String[] args) {
	
		
	}
RunnerClass(){
	frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(width, height);
	frame.addKeyListener(gpanel);


}
void setup(){
 
	
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	
}

}

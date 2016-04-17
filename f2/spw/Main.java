package f2.spw;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args){
		JFrame frame = new JFrame("Alien Attack");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setSize(700, 650);
		
		SpaceShip v = new SpaceShip(330, 550, 40, 40);
		GamePanel gp = new GamePanel();
		GameEngine engine = new GameEngine(gp, v);
		
		frame.getContentPane().add(gp, BorderLayout.CENTER);
		frame.addKeyListener(engine);
		frame.setVisible(true);
		engine.start();
	}
}

package orig2011.v2;

import javax.swing.JFrame;

import orig2011.v0.GUIView;
import orig2011.v0.IGameFactory;

/**
 * This class creates an AWT window which will contain the game.
 */
public class Main {
	public static void main(final String[] args) {
		// Create a new frame (a window)
		JFrame frame = new JFrame();
		
		//For some reason i need to cast to v0 of IGameFactory, no errors in v2 though...
		GUIView guiView = new GUIView((IGameFactory) new ReversiFactory());

		frame.setTitle("Games 2.2");

		// Add gui to window
		frame.add(guiView);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// pack() will do the layout of the window so it gets the correct size
		frame.pack();

		// Open the window
		frame.setVisible(true);
		frame.requestFocus();
	}
}

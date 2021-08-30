package codes.mcdonald.craig.algovisual.ui;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.FlatLightLaf;

public class MainJFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public MainJFrame() {
		
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
		} catch (UnsupportedLookAndFeelException e) {
			// Don't care, just try and set the theme
		}

		JFrame frame = new JFrame("Algorithm Visualizations");
		frame.setLocationRelativeTo(null);
		frame.setSize(1024, 768);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

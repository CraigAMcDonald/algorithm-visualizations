package codes.mcdonald.craig.algovisual.ui;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.FlatLightLaf;

public class MainJFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public MainJFrame(final String appName) {
		
		super(appName);
		
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
		} catch (UnsupportedLookAndFeelException e) {
			// Don't care, just try and set the theme
		}

		setLocationRelativeTo(null);
		setSize(1024, 768);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

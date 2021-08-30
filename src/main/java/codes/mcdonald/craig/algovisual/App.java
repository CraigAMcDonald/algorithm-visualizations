package codes.mcdonald.craig.algovisual;

import javax.swing.SwingUtilities;

import codes.mcdonald.craig.algovisual.ui.MainJFrame;

public class App {
	
	private static final String APP_NAME = "Algorithm Visualizations";

	public static void main(String[] args) {

		SwingUtilities.invokeLater(() -> {
			new MainJFrame(APP_NAME);
		});
	}
}
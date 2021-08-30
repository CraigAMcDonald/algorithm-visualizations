package codes.mcdonald.craig.algovisual;

import javax.swing.SwingUtilities;

import codes.mcdonald.craig.algovisual.ui.MainJFrame;

public class App {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(() -> {
			new MainJFrame();
		});
	}
}
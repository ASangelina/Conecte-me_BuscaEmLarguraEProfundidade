package Live004;

import javax.swing.JFrame;

public class Janela {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Tic Tac Toe");
		
		frame.setSize(600, 630);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JogoDaVelha velha = new JogoDaVelha();
		velha.setBounds(0, 0, 600, 600);
		
		frame.add(velha);
		
		frame.addMouseListener(velha);

	}

}

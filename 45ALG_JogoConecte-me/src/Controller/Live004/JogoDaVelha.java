package Live004;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JogoDaVelha extends JPanel implements MouseListener {

	Font minhaFontGrande = new Font("Consolas", Font.BOLD, 80);
	Font minhaFontMedia = new Font("Consolas", Font.BOLD, 30);
	Font minhaFontPequena = new Font("Consolas", Font.BOLD, 15);
	
	
	int matriz[][];
	int jogador;
	int ganhador;
	boolean jogarNov;
	
	int v1;
	int v2;
	
	Color cor1;
	
	public JogoDaVelha() {
		matriz = new int [3][3];
		jogador = 1;
		ganhador = 0;
		jogarNov = false;
		v1 = 0;
		v2 = 0;
		
		cor1 = new Color(0, 160, 0);
		
	}
	
	@Override
	public void paintComponent(Graphics g2) {
		
		Graphics2D g = (Graphics2D) g2.create();
		
		if (jogarNov) {
			int jogarNovamente = new JOptionPane().showConfirmDialog(this, "Deseja jogar novamente?");
			if (jogarNovamente == JOptionPane.OK_OPTION) {
				jogarNov = false;
				reiniciarJogo();	
			} else {
				System.exit(1);
			}
		}

		g.setStroke(new BasicStroke(5));
		g.setFont(minhaFontGrande);
		
		g.setColor(Color.white);
		g.fillRect(0,  0,  600,  600);
		
		g.setColor(Color.black);
		g.drawLine(0, 200, 600, 200);
		g.drawLine(0, 400, 600, 400);

		g.drawLine(200,  0,  200, 600);
		g.drawLine(400,  0,  400, 600);
		
		for(int lin = 0; lin<3;lin++) {

			for(int col = 0; col < 3; col++) {
				if (matriz[lin][col] == 1) {
					g.setColor(cor1);
					g.drawString("o", 75 + col*200, 125 + lin*200);
				} else if (matriz[lin][col] == 2) {
					g.setColor(Color.RED);
					g.drawString("x", 75 + col*200, 125 + lin*200);
				}
			}
			
		}
		
		if (ganhador != 0) {
			if (ganhador == 1) {
				g.setColor(cor1);
			} else {
				g.setColor(Color.RED);
			}
			g.setColor(Color.red);
			g.setFont(minhaFontMedia);
			g.drawString("O jogador " + ganhador + " venceu!", 180, 200);
			
			jogarNov = true;
			repaint();
			
			g.setColor(cor1);
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		int linha = e.getY()/200;
		int coluna = e.getX()/200;
		System.out.println("Clicou na linha: " + linha);
		System.out.println("Clicou na coluna: " + coluna);
		
		if (jogador == 1 && matriz[linha][coluna] == 0) {
			matriz[linha][coluna] = 1;	
			jogador = 2;
		} else if (jogador == 2 && matriz[linha][coluna] == 0) {
			matriz[linha][coluna] = 2;
			jogador = 1;
		}
		
		verificaGanhador();
		
		repaint();	
		
	}
	
	private void verificaGanhador() {
		
		
		for(int pos = 0; pos<3;pos++) {
				
			if (matriz[pos][0] == matriz[pos][1] && matriz[pos][0] == matriz[pos][2] && matriz[pos][0] != 0) {
				System.out.println("Houve ganhador");
				ganhador = matriz[pos][0];
				break;
			}
			
			if (matriz[0][pos] == matriz[1][pos] && matriz[0][pos] == matriz[2][pos] && matriz[0][pos] != 0) {
				System.out.println("Houve ganhador");
				ganhador = matriz[0][pos];
				break;
			}
			
		}
		
		if (matriz[0][0] == matriz[1][1] && matriz[0][0] == matriz[2][2] && matriz[0][0] != 0) {
			System.out.println("Houve ganhador");
			ganhador = matriz[0][0];
		}
		
		if (matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0] && matriz[1][1] != 0) {
			System.out.println("Houve ganhador");
			ganhador = matriz[0][2];
		}
		
		if (ganhador == 1) {
			v1++;
		}else if (ganhador == 2) {
			v2++;
		}
		
	}
	
	private void reiniciarJogo() {
		
		for(int lin = 0; lin<3;lin++) {

			for(int col = 0; col < 3; col++) {
				matriz[lin][col] = 0;
				ganhador = 0;
			}
			
		}
		
		jogador = 1;
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

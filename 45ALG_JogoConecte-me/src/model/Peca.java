
public class Peca {
	
	private int tipo;
	private int pinosEsq;
	private int pinosCim;
	private int pinosDir;
	private int pinosBai;

	public Peca(int x, int y, int tipo, int pinosEsq, int pinosCim, int pinosDir, int pinosBai) {
		
		this.tipo = tipo;
		this.pinosEsq = pinosEsq;
		this.pinosCim = pinosCim;
		this.pinosDir = pinosDir;
		this.pinosBai = pinosBai;
		
	}
	
	private void gira() {
		int aux = this.pinosBai;

		this.pinosCim = this.pinosEsq;
		this.pinosDir = this.pinosCim;
		this.pinosBai = this.pinosDir;
		this.pinosEsq = aux;
	}

}

public  class Componente {
    // no momento pensei em classe abstratar(nao deu muito certo) e faz parte do modelo//
    private int cor;// (1-vermelho; 2-azul;3-verde; 4-laranja) isso se pensa na leitura do txt,
    //entao se cor for 3 criar objeto Green  //
    // esse int vai determinar a criacao do componente por COR; - talvez por ser uma classe abstract//
    // e as classes cores terem acoes diferentes//
    private int linhaI; // a linha que o objeto vai iniciar...////vou precisar desses dados aqui e para desenhar;//
    private int colunaJ; // a coluna que o objeto vai iniciar - esse tbm o same do de cima//
    private int pinoE; // qtd de pinos das esquerda de 0 - 4 //
    private int pinoD; // qtd de pinos das direita de 0 - 4//
    private int pinoC; // qtd de pinos das de cima de 0 - 4 //
    private int pinoB; // qtd de pinos das baixo de 0 - 4//

    public Componente(int cor,int linhaI,int colunaJ,int pinoE,int pinoD,int pinoC,int pinoB){
        this.cor = cor;
        this.linhaI = linhaI;
        this.colunaJ = colunaJ;
        this.pinoE = pinoE;
        this.pinoD = pinoD;
        this.pinoB = pinoB;
    }


    public int getColunaJ() {
        return colunaJ;
    }

    public void setColunaJ(int colunaJ) {
        this.colunaJ = colunaJ;
    }

    public int getCor(){
        return cor;
    }
    public void setCor(int cor){
        this.cor = cor;
    }

    public int getLinhaI() {
        return linhaI;
    }

    public void setLinhaI(int linhaI) {
        this.linhaI = linhaI;
    }

    public int getPinoB() {
        return pinoB;
    }

    public void setPinoB(int pinoB) {
        this.pinoB = pinoB;
    }

    public int getPinoC() {
        return pinoC;
    }

    public void setPinoC(int pinoC) {
        this.pinoC = pinoC;
    }

    public int getPinoD() {
        return pinoD;
    }

    public void setPinoD(int pinoD) {
        this.pinoD = pinoD;
    }

    public int getPinoE() {
        return pinoE;
    }

    public void setPinoE(int pinoE) {
        this.pinoE = pinoE;
    }
}


package teste;

class Bola{
    private String cor; 

    public Bola(String cor) {
        this.cor = cor;
    }

    public String getcor() {
        return cor;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }

public static void main(String[] args) {
    //Teste da classe Bola
    Bola minhaBola = new Bola("rosa");
    System.out.println("Cor da bola:" + minhaBola.getcor());

    minhaBola.setcor("amarelo");
    System.out.println("Nova cor da Bola:" + minhaBola.getcor());

}
}

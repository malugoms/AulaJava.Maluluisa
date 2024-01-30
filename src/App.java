public class Main {
    // Definindo a classe "carro"
class carro {
    // Atributos da classe
    private String marca; // Atributo privado para encapsulamento
    private String modelo;
    private String cor;
    private int AnodeFabricacao;   // Atributo privado para encapsulamento
    private int Velocidadeatual;
    
    // Método construtor da classe para inicializar os atributos
    Pessoa(String marca, modelo, cor, int AnodeFabricacao, Velocidadeatual) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.AnodeFabricacao = AnodeFabricacao;
        this.Velocidadeatual = Velocidadeatual;
    }
    
    // Método getter para obter o nome da pessoa
    public String getmarca() {
        return marca;

    public String getmodelo() {
        return modelo;

    public String getcor() {
        return cor;


    }
    
    // Método getter para obter a idade da pessoa
   public String getAnodeFabricacao;
       return AnodeFabricacao;

    public String getVelocidadeatual;
    
    }
}

// Classe principal que contém o método main
public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa chamado "pessoa1"
        Carro Carro1 = new Carro("fusca", ford, 2013, rosa, 60);
        
        // Usando os métodos getters para obter e imprimir as informações da pessoa
        System.out.println("marca: " + pessoa1.getmarca()); // Obtém e imprime a marca
        System.out.println("modelo: " + pessoa1.getmodelo()); // Obtém e imprime o modelo
        System.out.println("cor: " + pessoa1.getcor()); // Obtém e imprime a cor
        System.out.println("AnodeFabricação: " + pessoa1.getAnodeFabricacao()); // Obtém e imprime o AnodeFabricacao
        System.out.println("Velocidadeatual: " + pessoa1.getVelocidadeatual()); // Obtém e imprime a Velocidadeatual
    }
}
}

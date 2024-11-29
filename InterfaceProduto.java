// Interface Produto

interface Carro {

    void exibirInfo();
    
    }
    
    
    // Produtos Concretos
    
    class Sedan implements Carro {
    
    @Override
    
    public void exibirInfo() {
    
    System.out.println("Sedan: Um carro confortável para família.");
    
    }
    
    }
    
    
    class SUV implements Carro {
    
    @Override
    
    public void exibirInfo() {
    
    System.out.println("SUV: Um carro robusto e espaçoso.");
    
    }
    
    }
    
    
    // Fábrica
    
    abstract class FabricaDeCarro {
    
    public abstract Carro criarCarro(String tipo);
    
    
    public Carro solicitarCarro(String tipo) {
    
    Carro carro = criarCarro(tipo);
    
    carro.exibirInfo();
    
    return carro;
    
    }
    
    }
    
    
    // Fábrica Concreta
    
    class FabricaConcretaDeCarro extends FabricaDeCarro {
    
    @Override
    
    public Carro criarCarro(String tipo) {
    
    if (tipo.equalsIgnoreCase("Sedan")) {
    
    return new Sedan();
    
    } else if (tipo.equalsIgnoreCase("SUV")) {
    
    return new SUV();
    
    }
    
    return null;
    
    }
    
    }
    
    
    // Cliente
    
    public class InterfaceProduto {
    
    public static void main(String[] args) {
    
    FabricaDeCarro fabrica = new FabricaConcretaDeCarro();
    
    fabrica.solicitarCarro("Sedan");
    
    fabrica.solicitarCarro("SUV");
    
    }
}
// Interface de Estratégia
interface Comportamento {
    void mover();
}

// Estratégias Concretas
class ComportamentoAgressivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Mover-se agressivamente");
    }
}

class ComportamentoDefensivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Mover-se defensivamente");
    }
}

class ComportamentoNormal implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Mover-se normalmente");
    }
}

// Contexto
class Robo {
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }
}

// Cliente
public class InterfaceEstrategia {
    public static void main(String[] args) {
        Robo robo = new Robo();

        robo.setComportamento(new ComportamentoAgressivo());
        robo.mover();

        robo.setComportamento(new ComportamentoDefensivo());
        robo.mover();

        robo.setComportamento(new ComportamentoNormal());
        robo.mover();
    }
}

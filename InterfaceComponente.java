// Interface Componente
interface Cafe {
    String getDescricao();
    double custo();
}

// Componente Concreto
class CafeSimples implements Cafe {
    @Override
    public String getDescricao() {
        return "Café simples";
    }

    @Override
    public double custo() {
        return 1.00;
    }
}

// Decorador Abstrato
abstract class CafeDecorator implements Cafe {
    protected Cafe cafe;

    public CafeDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    public String getDescricao() {
        return cafe.getDescricao();
    }

    public double custo() {
        return cafe.custo();
    }
}

// Decoradores Concretos
class Leite extends CafeDecorator {
    public Leite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + ", Leite";
    }

    @Override
    public double custo() {
        return cafe.custo() + 0.50;
    }
}

class Chocolate extends CafeDecorator {
    public Chocolate(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + ", Chocolate";
    }

    @Override
    public double custo() {
        return cafe.custo() + 0.70;
    }
}

// Cliente
public class InterfaceComponente {
    public static void main(String[] args) {
        Cafe cafe = new CafeSimples();
        System.out.println(cafe.getDescricao() + " $" + cafe.custo());

        cafe = new Leite(cafe);
        System.out.println(cafe.getDescricao() + " $" + cafe.custo());

        cafe = new Chocolate(cafe);
        System.out.println(cafe.getDescricao() + " $" + cafe.custo());
    }
}


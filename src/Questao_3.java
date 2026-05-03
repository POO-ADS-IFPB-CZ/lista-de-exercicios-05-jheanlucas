interface AparelhoTelefonico {
    void ligar();
    void atender();
}

interface NavegadorInternet {
    void exibirPagina();
    void adicionarNovaAba();
}

interface ReprodutorMusical {
    void tocar();
    void pausar();
}

class Smartphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void ligar()           { System.out.println("Ligando..."); }
    public void atender()         { System.out.println("Atendendo chamada..."); }
    public void exibirPagina()    { System.out.println("Exibindo página..."); }
    public void adicionarNovaAba(){ System.out.println("Nova aba aberta."); }
    public void tocar()           { System.out.println("Tocando música..."); }
    public void pausar()          { System.out.println("Música pausada."); }
}

public class Questao_3 {
    public static void main() {
        Smartphone smartphone = new Smartphone();

        smartphone.ligar();
        smartphone.atender();
        smartphone.exibirPagina();
        smartphone.adicionarNovaAba();
        smartphone.tocar();
        smartphone.pausar();
    }
}
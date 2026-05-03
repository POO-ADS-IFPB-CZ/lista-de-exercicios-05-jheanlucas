interface Imprimivel {
    void imprimir();
}

interface EnviavelPorEmail {
    void enviar(String email);
}

class RelatorioFinanceiro implements Imprimivel, EnviavelPorEmail {
    public void imprimir() {
        System.out.println("Imprimindo relatório financeiro...");
    }
    public void enviar(String email) {
        System.out.println("Enviando relatório financeiro para: " + email);
    }
}

class Contrato implements Imprimivel {
    public void imprimir() {
        System.out.println("Imprimindo contrato...");
    }
}

public class Questao_5 {
    public static void main() {
        Imprimivel[] documentos = { new RelatorioFinanceiro(), new Contrato(), new RelatorioFinanceiro() };

        for (Imprimivel doc : documentos) {
            doc.imprimir();
            if (doc instanceof EnviavelPorEmail email) {
                email.enviar("empresa@email.com");
            }
        }
    }
}
// Interface ReprodutorMusical
interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

// Implementação da interface ReprodutorMusical
class ReprodutorMusicalImpl implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }
}

// Interface AparelhoTelefonico
interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

// Implementação da interface AparelhoTelefonico
class AparelhoTelefonicoImpl implements AparelhoTelefonico {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz.");
    }
}

// Interface NavegadorInternet
interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

// Implementação da interface NavegadorInternet
class NavegadorInternetImpl implements NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página.");
    }
}

// Classe principal iPhone que integra todas as funcionalidades
public class iPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    // Construtor que inicializa as implementações
    public iPhone() {
        this.reprodutorMusical = new ReprodutorMusicalImpl();
        this.aparelhoTelefonico = new AparelhoTelefonicoImpl();
        this.navegadorInternet = new NavegadorInternetImpl();
    }

    // Métodos para acessar as funcionalidades do iPhone
    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    // Método principal para testar as funcionalidades do iPhone
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        // Testando o reprodutor musical
        iphone.getReprodutorMusical().tocar();
        iphone.getReprodutorMusical().pausar();
        iphone.getReprodutorMusical().selecionarMusica("Musica Favorita");

        // Testando o aparelho telefônico
        iphone.getAparelhoTelefonico().ligar("123-4567");
        iphone.getAparelhoTelefonico().atender();
        iphone.getAparelhoTelefonico().iniciarCorreioVoz();

        // Testando o navegador de internet
        iphone.getNavegadorInternet().exibirPagina("https://www.example.com");
        iphone.getNavegadorInternet().adicionarNovaAba();
        iphone.getNavegadorInternet().atualizarPagina();
    }
}

package iphone;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String versao;
    
    public IPhone(String modelo, String versao) {
        this.modelo = modelo;
        this.versao = versao;
    }

    // Telefone
    public void ligar(String numero) {
        System.out.println(" Ligando para: " + numero);
    }
    
    public void atender(String numero) {
        System.out.println(" Atendendo: " + numero);
    }
    
    public void iniciarCorreioVoz(String mensagem) {
        System.out.println(" Correio de voz: " + mensagem);
    }

    // Navegador
    public void exibirPagina(String url) {
        System.out.println(" Abrindo: " + url);
    }
    
    public void adicionarNovaAba(String url) {
        System.out.println(" Nova aba: " + url);
    }
    
    public void atualizarPagina() {
        System.out.println(" Atualizando página");
    }

    // Música
    public void tocar() {
        System.out.println(" Tocando música");
    }
    
    public void pausar() {
        System.out.println(" Pausado");
    }
    
    public void selecionarMusica(String musica) {
        System.out.println(" Selecionada: " + musica);
    }

    // Ponto de entrada (main)
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone("iPhone 1", "iOS 10");
        
        // Demonstração completa
        System.out.println("\n=== MODO TELEFONE ===");
        meuIPhone.ligar("11999998888");
        meuIPhone.atender("11888889999");
        
        System.out.println("\n=== MODO NAVEGADOR ===");
        meuIPhone.exibirPagina("https://www.apple.com/br");
        meuIPhone.adicionarNovaAba("https://open.spotify.com");
        
        System.out.println("\n=== MODO MÚSICA ===");
        meuIPhone.tocar();
        meuIPhone.selecionarMusica("Anti-Hero - Taylor Swift");
        meuIPhone.pausar();
    }
}
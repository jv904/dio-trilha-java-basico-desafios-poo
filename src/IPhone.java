public class IPhone {
    public static void main(String[] args) throws Exception {
        NavegadorInternet navegador = new NavegadorInternet() {
            @Override
            public void exibirPagina(String url) {
                System.out.println("Exibindo página: " + url);
            }

            @Override
            public void adicionarNovaAba() {
                System.out.println("Nova aba adicionada.");
            }

            @Override
            public void atualizarPagina() {
                System.out.println("Página atualizada.");
            }
        };

        AparelhoTelefonico telefone = new AparelhoTelefonico() {
            @Override
            public void ligar(String numero) {
                System.out.println("Ligando para: " + numero);
            }

            @Override
            public void atender() {
                System.out.println("Atendendo chamada.");
            }

            @Override
            public void iniciarCorreioVoz() {
                System.out.println("Iniciando correio de voz.");
            }
        };

        ReprodutorMusical reprodutor = new ReprodutorMusical() {
            @Override
            public void tocar() {
                System.out.println("Música tocando.");
            }

            @Override
            public void pausar() {
                System.out.println("Música pausada.");
            }

            @Override
            public void selecionarMusica(String musica) {
                System.out.println("Música selecionada: " + musica);
            }
        };
        navegador.exibirPagina("https://www.example.com");
        telefone.ligar("123456789");
        reprodutor.selecionarMusica("Minha Música Favorita");
    }
}

package strategy;

public class ControleDeTracao {
    private Tracao tracao;

    public void setTracao(Tracao tracao) {
        this.tracao = tracao;
    }

    public void alterarTracao(){
        tracao.controleTracao();
    }
}

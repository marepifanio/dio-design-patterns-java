package strategy;

public class TracaoAWD implements Tracao {
    @Override
    public void controleTracao() {
        System.out.println("Tração de perfil AWD: Ambiente urbano");
    }
}

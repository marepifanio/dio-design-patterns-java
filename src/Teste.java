import singleton.DBConnectionEager;
import singleton.DBConnectionLazy;
import singleton.DBConnectionLazyHolder;
import strategy.*;

public class Teste {
    public static void main(String[] args) {

        //  Singleton

        System.out.println("_________Singleton__________\n");

        System.out.println("------- Testando a Conexão Lazy ------");

        DBConnectionLazy lazy1 = DBConnectionLazy.getConnectionLazy();
        System.out.println(lazy1);

        lazy1 = DBConnectionLazy.getConnectionLazy();
        System.out.println(lazy1);

        DBConnectionLazy lazy2 = DBConnectionLazy.getConnectionLazy();
        System.out.println(lazy1);

        System.out.println("\n------- Testando a Conexão Eager ------");

        DBConnectionEager eager1 = DBConnectionEager.getConnectionEager();
        System.out.println(eager1);

        eager1 = DBConnectionEager.getConnectionEager();
        System.out.println(eager1);

        DBConnectionEager eager2 = DBConnectionEager.getConnectionEager();
        System.out.println(eager2);

        System.out.println("------- Testando a Conexão Eager ------");

        DBConnectionLazyHolder lazyHolder1 = DBConnectionLazyHolder.getConnectionLazyHolder();
        System.out.println(lazyHolder1);

        lazyHolder1 = DBConnectionLazyHolder.getConnectionLazyHolder();
        System.out.println(lazyHolder1);

        DBConnectionLazyHolder lazyHolder2 = DBConnectionLazyHolder.getConnectionLazyHolder();
        System.out.println(lazyHolder2);

        // Strategy

        System.out.println("\n_________Strategy__________\n");


        Tracao tracao4x2 = new Tracao4x2();
        Tracao tracao4x4 = new Tracao4x4();
        Tracao tracaoAWD = new TracaoAWD();

        ControleDeTracao controle = new ControleDeTracao();

        controle.setTracao(tracaoAWD);
        controle.alterarTracao();
        controle.alterarTracao();

        controle.setTracao(tracao4x2);
        controle.alterarTracao();
        controle.alterarTracao();

        controle.setTracao(tracao4x4);
        controle.alterarTracao();
        controle.alterarTracao();
    }
}

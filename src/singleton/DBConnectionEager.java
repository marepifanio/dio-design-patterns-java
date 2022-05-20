package singleton;

public class DBConnectionEager {

    private static DBConnectionEager connectionEager = new DBConnectionEager();

    private DBConnectionEager(){
        super();
    }

    public static DBConnectionEager getConnectionEager(){
        return connectionEager;
    }
}

package singleton;

public class DBConnectionLazy {

    private static DBConnectionLazy connectionLazy;

    private DBConnectionLazy(){
        super();
    }

    public static DBConnectionLazy getConnectionLazy(){
        if(connectionLazy == null){
            connectionLazy = new DBConnectionLazy();
        }
        return connectionLazy;
    }
}

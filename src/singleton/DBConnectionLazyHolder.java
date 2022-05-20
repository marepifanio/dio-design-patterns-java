package singleton;

public class DBConnectionLazyHolder {

    private static class InstanceHolder {
        public static DBConnectionLazyHolder connectionLazyHolder = new DBConnectionLazyHolder();
    }


    private DBConnectionLazyHolder(){
        super();
    }

    public static DBConnectionLazyHolder getConnectionLazyHolder(){

        return InstanceHolder.connectionLazyHolder;
    }
}

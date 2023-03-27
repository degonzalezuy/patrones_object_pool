package objectpool.impl;

public class PoolException extends Exception{

    // Excepción personalizada para lanzar cualquier error dentro del ObjectPool
    public PoolException(String message){
        super(message);
    }
}

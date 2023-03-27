package objectpool.impl;

public interface IObjectPool <T extends IPooledObject> {

    //Metodo para solicitar un objeto al pool
    public T getObject() throws PoolException;

    //Metodo para regresar un objeto al pool cuando ya no sea requerido
    public void releaceObject(T pooledObject);
}

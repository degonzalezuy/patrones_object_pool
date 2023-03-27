package objectpool.impl.factory;

import objectpool.impl.IPooledObject;

public interface IPoolableObjectFactory <T extends IPooledObject> {
    public T createNew();
}

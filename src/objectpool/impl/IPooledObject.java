package objectpool.impl;

public interface IPooledObject {
    public boolean validate();
    public void invalidate();
}

package core.service;

import java.util.List;

public interface ExampleService<E> {
    public List<E> findAll();
    public void add(E e);
}

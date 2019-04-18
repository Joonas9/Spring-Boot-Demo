package core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import core.repository.ExampleRepository;
import core.model.Example;

@Service
public class DefaultExampleService implements ExampleService<Example> {

    @Autowired
    private ExampleRepository exampleRepository;

    @Override
    public List<Example> findAll() {
        return exampleRepository.findAll();
    }
    @Override
    public void add(Example example) {
        exampleRepository.save(example);
    }
}

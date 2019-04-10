package core.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import core.Repository.ExampleRepository;
import core.model.Example;

@Service
public class ExampleService {

    @Autowired
    private ExampleRepository exampleRepository;

    public List<Example> findAll() {
        return exampleRepository.findAll();
    }
}

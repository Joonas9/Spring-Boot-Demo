package core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import core.Service.ExampleService;
import core.model.Example;

@RestController
public class Controller {

    @Autowired
    private ExampleService exampleService;

    @GetMapping("/")
    public List<Example> msg() {
        return exampleService.findAll();
    }

}

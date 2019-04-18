package core;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import core.model.Example;
import core.service.ExampleService;

@RestController
@RequestMapping(path="/demo")
public class Controller {

    @Autowired
    private ExampleService exampleService;

    @GetMapping("/")
    public List<Example> getExamples() {
        return exampleService.findAll();
    }

    @PostMapping("/")
    public void addExample(@RequestBody Example example) {
        Integer id = exampleService.findAll().size() + 1;
        example.setId(id);
        exampleService.add(example);
    }
}

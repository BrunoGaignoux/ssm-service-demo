package ssm.api.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ssm.api.demo.domain.Os;
import ssm.api.demo.repository.OsRepository;

@RestController
@RequestMapping(path = "/os")
public class OsController {
    @Autowired
    private OsRepository repository;

    @GetMapping
    public Iterable<Os> index() {
        return repository.findAll();
    }
}

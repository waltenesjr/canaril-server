package br.com.athos.canaril.controller;

import br.com.athos.canaril.model.Canario;
import br.com.athos.canaril.repository.CanarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/canario"})
@CrossOrigin("http://localhost:4200")
public class CanarioController {

    @Autowired
    CanarioRepository repository;

    @GetMapping
    public List<Canario> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Canario get(@PathVariable("id") Long id) {
        return repository.getById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") long id) {
        repository.delete(repository.findById(id).get());
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public Canario createOrUpdate(@RequestBody Canario canario) {
        return repository.save(canario);
    }
}
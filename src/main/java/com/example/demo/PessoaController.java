package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {

    @Autowired
    private Pessoa pessoa;

    @GetMapping("/pessoa")
    public Pessoa getPessoa() {
        return pessoa;
    }
}

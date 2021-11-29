package com.alexinha.banco;

import java.util.List;

import com.alexinha.banco.model.Clientes;
import com.alexinha.banco.repository.ClientesRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoApplication implements CommandLineRunner {
	private ClientesRepository repository;

	public BancoApplication(ClientesRepository repository) {
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Clientes model = new Clientes();
		model.setId(3);
		model.setNome("Monica Geller");
		model.setIdade(28);
		model.setProfissao("Chef de cozinha");

		repository.save(model);

		System.out.println("\n");
		System.out.println("-- Cadastro de Cliente --\n");
		repository.findAll().forEach(c -> System.out.printf("Nome: %s | Idade: %d | Profissão: %s\n", 
		c.getNome(), c.getIdade(), c.getProfissao()));
		
		System.out.println("\n");
	}
}

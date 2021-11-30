package com.alexinha.banco;

import java.util.List;

import com.alexinha.banco.model.Agencia;
import com.alexinha.banco.model.Clientes;
import com.alexinha.banco.repository.AgenciaRepository;
import com.alexinha.banco.repository.ClientesRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoApplication implements CommandLineRunner {

	private ClientesRepository clientesRepository;
	private AgenciaRepository agenciaRepository;


	public BancoApplication(ClientesRepository clientesRepository, AgenciaRepository agenciaRepository) {
		this.agenciaRepository = agenciaRepository;
		this.clientesRepository = clientesRepository;
		
	}

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Clientes
		Clientes modelClientes = new Clientes();
		modelClientes.setId(2);
		modelClientes.setNome("Ross Geller");
		modelClientes.setIdade(30);
		modelClientes.setProfissao("Palentologista");
		clientesRepository.save(modelClientes);

		System.out.println("\n");
		clientesRepository.findAll().forEach(c -> System.out.printf("Nome: %s | Idade: %d | Profissão: %s\n", 
		c.getNome(), c.getIdade(), c.getProfissao()));
		System.out.println("\n");

		//Agencia
		Agencia modelAgencia = new Agencia();
		modelAgencia.setId(1);
		modelAgencia.setBanco("Bradesco");
		modelAgencia.setAgencia(2283);
		modelAgencia.setLocalizacao("Blumenau");
		agenciaRepository.save(modelAgencia);
		
		agenciaRepository.findAll().forEach(a -> System.out.printf("ID: %d | Agência: %s | Localização: %s",
		a.getId(), a.getBanco(), a.getLocalizacao()));
		
	}
}

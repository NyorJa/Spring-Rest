package com.gretrozh.springbootbackendapirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gretrozh.springbootbackendapirest.models.entity.Cliente;
import com.gretrozh.springbootbackendapirest.models.services.IClienteService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/clientes")
public class ClienteRestController {
	
	@Autowired
	private IClienteService clienteService;

	@GetMapping
	public List<Cliente> index(){
		return clienteService.findAll();
	}

	@GetMapping("/{id}")
	public Cliente buscarPorId(@PathVariable Long id){
		return clienteService.buscarPorId(id);
	}
}

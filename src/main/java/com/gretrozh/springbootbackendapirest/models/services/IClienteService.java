package com.gretrozh.springbootbackendapirest.models.services;

import java.util.List;

import com.gretrozh.springbootbackendapirest.models.entity.Cliente;
 
public interface IClienteService {
	
	List<Cliente> findAll();
	Cliente buscarPorCorreo(String correo);

}

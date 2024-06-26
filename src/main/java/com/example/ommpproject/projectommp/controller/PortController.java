package com.example.ommpproject.projectommp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ommpproject.projectommp.models.Port;
import com.example.ommpproject.projectommp.models.User;
import com.example.ommpproject.projectommp.repositories.PortRepository;
import com.example.ommpproject.projectommp.services.PortService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/ports")

public class PortController {
	
	@Autowired
	private PortService portService;
	@Autowired
	PortRepository portRepository;
	
//	@GetMapping ("/list/{id}")
//	public List<User> getList(@PathVariable Long id) {
//		List <Long> ids= new ArrayList<Long>();
//		ids.add(id);
//		return portService.getListByport(ids);
//	}
	@GetMapping ("/list/{portid}")
	public List<User> getList(@PathVariable Long portid) {
		return portRepository.findByPort(portid);
	}
	@PostMapping
	public Port addPort(@RequestBody Port port) {

		return portService.addPort(port);
	}

	@GetMapping 
	public List<Port> getAllPorts() {
		return portService.getAllPorts();
	}
	

	@GetMapping("/{id}")
	public Port getMatche(@PathVariable Long id) {
		return portService.getPortById(id);
	}

	@PutMapping("/{id}")
	public Port update( @RequestBody Port port) {
		return portService.editPort(port);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		portService.deletePortById(id);
	}

}

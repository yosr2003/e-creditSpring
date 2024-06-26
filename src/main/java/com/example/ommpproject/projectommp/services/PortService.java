package com.example.ommpproject.projectommp.services;

import java.util.List;

import com.example.ommpproject.projectommp.models.Port;

public interface PortService {
	
//	public List<User> getListByport(List<Long> ids );
	
	public Port addPort(Port p);

	public Port editPort(Port p);

	public Port getPortById(Long id);

	public void deletePortById(Long id);

	public List<Port> getAllPorts();

}

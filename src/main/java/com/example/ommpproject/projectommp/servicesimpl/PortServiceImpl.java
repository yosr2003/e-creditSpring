package com.example.ommpproject.projectommp.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ommpproject.projectommp.models.Port;
import com.example.ommpproject.projectommp.repositories.PortRepository;
import com.example.ommpproject.projectommp.services.PortService;

@Service
public class PortServiceImpl implements PortService {
	
	@Autowired
	private PortRepository portRepository;

	@Override
	public Port addPort(Port p) {
		// TODO Auto-generated method stub
		return portRepository.save(p);
	}

	@Override
	public Port editPort(Port p) {
		// TODO Auto-generated method stub
		return portRepository.save(p);
	}

	@Override
	public Port getPortById(Long id) {
		// TODO Auto-generated method stub
		 Optional<Port> port=portRepository.findById(id);
		 return port.isPresent() ? port.get(): null;
	}

	@Override
	public void deletePortById(Long id) {
		// TODO Auto-generated method stub
		 portRepository.deleteById(id);
		
	}

	@Override
	public List<Port> getAllPorts() {
		// TODO Auto-generated method stub
		return portRepository.findAll();
	}
//
//	@Override
//	public List<User> getListByport(List<Long> ids) {
//		// TODO Auto-generated method stub
//		return userRepository.findAllById(ids);
//	}

}


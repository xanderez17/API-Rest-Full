package com.apirestfull.app.Vista;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apirestfull.app.Modelo.Usuario;
import com.apirestfull.app.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	@Transactional(readOnly= true)
	public Iterable<Usuario> findAll() {
		return userRepository.findAll();
	}
	
	@Override
	@Transactional(readOnly= true)
	public Page<Usuario> findAll(Pageable pageable) {
		return userRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly= true)
	public Optional<Usuario> findById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	@Transactional
	public Usuario save(Usuario usuario) {	
		return userRepository.save(usuario);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		userRepository.deleteById(id);
	}


	

	

}

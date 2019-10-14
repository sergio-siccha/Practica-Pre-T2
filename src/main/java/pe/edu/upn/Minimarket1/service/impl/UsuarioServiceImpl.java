package pe.edu.upn.Minimarket1.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upn.Minimarket1.model.entity.Usuario;
import pe.edu.upn.Minimarket1.model.repository.UsuarioRepository;
import pe.edu.upn.Minimarket1.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<Usuario> findAll() throws Exception{
		return usuarioRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Optional<Usuario> findById(Integer id) throws Exception{
		return usuarioRepository.findById(id);
	}
	
	@Transactional
	@Override
	public Usuario save(Usuario entity) throws Exception{
		return usuarioRepository.save(entity);
	}
	
	@Transactional
	@Override
	public Usuario update(Usuario entity) throws Exception{
		return usuarioRepository.save(entity);
	}
	
	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception{
		usuarioRepository.deleteById(id);
	}
	
	@Transactional
	@Override
	public void deleteAll() throws Exception{
		usuarioRepository.deleteAll();
	}
}

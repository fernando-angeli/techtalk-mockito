package com.fernandoangeli.modelomockito.service;

import com.fernandoangeli.modelomockito.domain.User;
import com.fernandoangeli.modelomockito.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void saveUser(User user){
        validarUser(user);
        repository.save(user);
    }

    private void validarUser(User user){
        if(user.getEmail() == null || user.getNome() == null){
            throw new RuntimeException("Campos obrigatórios...");
        }
    }

    public Optional<User> retornarUsuarioPorId(int id){
        return repository.findById(id);
    }
}

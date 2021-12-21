package com.fernandoangeli.modelomockito.service;

import com.fernandoangeli.modelomockito.domain.User;
import com.fernandoangeli.modelomockito.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    // Faz a injeção da service UserService
    @InjectMocks
    private UserService service;

    // Faz o mock do repositório
    @Mock
    private UserRepository repository;

    @Test
    public void deveCadastrarUsuarioAoInformarOsDadosCorretos(){

        User user = new User();
        user.setId(1);
        user.setNome("João");
        user.setEmail("joao@gmail.com");

        service.saveUser(user);

        verify(repository).save(user);
    }

    @Test(expected = Exception.class)
    public void deveRetornarExceptionQuandoDadosInformadosForemIncorretos(){

        User user = new User();

        service.saveUser(user);
    }

    @Test
    public void deveRetornarUmUsuarioAoSerInformadoUmId(){

        int id = 1;
        User user = new User();
        user.setId(1);
        user.setNome("João");
        user.setEmail("joao@gmail.com");

        when(service.retornarUsuarioPorId(id)).thenReturn(Optional.of(user));

        Optional<User> result = service.retornarUsuarioPorId(1);

    }
}
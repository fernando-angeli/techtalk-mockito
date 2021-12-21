package com.fernandoangeli.modelomockito.repository;

import com.fernandoangeli.modelomockito.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}

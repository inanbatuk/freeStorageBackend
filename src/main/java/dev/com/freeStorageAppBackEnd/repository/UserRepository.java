package dev.com.freeStorageAppBackEnd.repository;

import dev.com.freeStorageAppBackEnd.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository  extends CrudRepository<User ,Integer> {
    Optional <User> findByEmail(String email);
}

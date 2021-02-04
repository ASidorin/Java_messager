package ru.sidorin.java_messager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sidorin.java_messager.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);


    User findByActivationCode(String code);
}

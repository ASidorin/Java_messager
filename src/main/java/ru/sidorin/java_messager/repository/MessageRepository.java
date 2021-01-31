package ru.sidorin.java_messager.repository;

import org.springframework.data.repository.CrudRepository;
import ru.sidorin.java_messager.domain.Message;

public interface MessageRepository extends CrudRepository<Message, Long> {

    Iterable<Message> findByTag(String filter);
}

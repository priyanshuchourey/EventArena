package com.example.polls.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.polls.model.*;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
}

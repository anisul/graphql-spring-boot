package com.ansnz.graphqlspringboot.repository;

import com.ansnz.graphqlspringboot.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}

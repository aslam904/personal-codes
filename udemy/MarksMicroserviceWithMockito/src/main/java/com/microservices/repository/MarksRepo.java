
package com.microservices.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.entity.Marks;

@Repository("MarksRepository")
@Scope("singleton")
public interface MarksRepo extends JpaRepository<Marks, Integer> {

}

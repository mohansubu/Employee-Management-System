package com.example.demo.Repo;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.*;

public interface Employeerepo extends CrudRepository<Registration, Long> {
	
}

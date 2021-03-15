package com.example.tsclientconnectivity.repositories;
import com.example.tsclientconnectivity.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepo extends CrudRepository<Student, String> {
}

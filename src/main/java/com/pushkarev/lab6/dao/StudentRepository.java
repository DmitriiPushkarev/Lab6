package com.pushkarev.lab6.dao;

import com.pushkarev.lab6.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Long>{
}

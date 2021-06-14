package com.example.railway_lab_department.Repository;

import com.example.railway_lab_department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

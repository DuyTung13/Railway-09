package com.example.railway_lab_department.Service;

import com.example.railway_lab_department.Repository.DepartmentRepository;
import com.example.railway_lab_department.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DepartmentService {

    @Autowired
    private DepartmentRepository deprepo;

    public List<Department> listAll() {
        return deprepo.findAll();
    }

    public void save(Department dep) {
        deprepo.save(dep);
    }

    public Department get(long id) {
        return deprepo.findById(id).get();
    }

    public void delete(long id) {
        deprepo.deleteById(id);
    }
}

package com.example.railway_lab_department.Controller;

import com.example.railway_lab_department.Service.DepartmentService;
import com.example.railway_lab_department.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @Autowired
    private DepartmentService service;


    @RequestMapping("/")
    public String viewHomePage(Model model) {
        var deps = service.listAll();
        model.addAttribute("listdeps", deps);

        return "index";
    }


    @RequestMapping("/new")
    public String showNewProductPage(Model model) {
        var dep = new Department();
        model.addAttribute("newdep", dep);

        return "new_Department";
    }
}

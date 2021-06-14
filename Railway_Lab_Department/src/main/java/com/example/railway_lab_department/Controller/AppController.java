package com.example.railway_lab_department.Controller;

import com.example.railway_lab_department.Service.DepartmentService;
import com.example.railway_lab_department.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveDepartment(@ModelAttribute("department") Department department) {
        service.save(department);

        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditDepartmentPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit_Department");
        var department = service.get(id);
        mav.addObject("department", department);

        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deleteDepartment(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }
}

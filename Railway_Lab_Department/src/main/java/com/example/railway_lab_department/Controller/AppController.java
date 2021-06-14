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
    private DepartmentService _service;
    public  AppController(DepartmentService service) {
        _service = service;
    }


    @RequestMapping("/")
    public String viewHomePage(Model model) {
        var deps = _service.listAll();
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
        _service.save(department);

        return "redirect:/";
    }

    @RequestMapping("/edit/{ID}")
    public ModelAndView showEditDepartmentPage(@PathVariable(name = "ID") int ID) {
        ModelAndView mav = new ModelAndView("edit_Department");
        var department = _service.get(ID);
        mav.addObject("department", department);

        return mav;
    }

    @RequestMapping("/delete/{ID}")
    public String deleteDepartment(@PathVariable(name = "ID") int ID) {
        _service.delete(ID);
        return "redirect:/";
    }
}

package com.hyh.crud.controller;

import com.hyh.crud.entity.Emp;
import com.hyh.crud.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author HuangYuhan
 * @version 1.0
 * @date 2020/6/21 - 23:26
 */

@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("all")
    public String showAllEmps(Model model){
        List<Emp> emps = empService.findEmps();
        model.addAttribute("emps", emps);
        return "index";
    }
}

package com.hyh.crud.controller;

import com.hyh.crud.entity.Emp;
import com.hyh.crud.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Map;

/**
 * @author HuangYuhan
 * @version 1.0
 * @date 2020/6/21 - 23:26
 */

@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("reg")
    public String toReg(){
        return "reg";
    }

    @RequestMapping("all")
    public String showAllEmps(Model model){
        List<Emp> emps = empService.findEmps();
        model.addAttribute("emps", emps);
        return "index";
    }

    @RequestMapping("emp/reg")
    public String reg(Map<String, Object> map,
                      Model model,
                      @RequestParam("id") int id,
                      @RequestParam("name") String name,
                      @RequestParam("pwd") String pwd){

        Emp emp = new Emp(id, name, pwd);
        int i = empService.addEmp(emp);
        if(i > 0){
            return "main";
        }else{
            map.put("msg", "注册失败");
            return "reg";
        }
    }

    @RequestMapping("emp/del/{id}")
    @ResponseBody
    public String cutEmp(@PathVariable("id") int id){
        int i = empService.delEmp(id);
        if (i > 0) {
            return "删除成功！";
        }
        return "删除失败";
    }


}

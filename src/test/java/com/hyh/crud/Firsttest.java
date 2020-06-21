package com.hyh.crud;

import com.hyh.crud.entity.Emp;
import com.hyh.crud.mapper.EmpMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author HuangYuhan
 * @version 1.0
 * @date 2020/6/21 - 18:17
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CrudApplication.class)
public class Firsttest {

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void test01(){
        List<Emp> emps = empMapper.selAll();
        for (Emp emp: emps
             ) {
            System.out.println(emp);
        }
    }
}

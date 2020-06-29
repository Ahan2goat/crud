package com.hyh.crud.service;

import com.hyh.crud.entity.Emp;

import java.util.List;

/**
 * @author HuangYuhan
 * @version 1.0
 * @date 2020/6/16 - 22:48
 */
public interface EmpService {

    public List<Emp> findEmps();

    public int addEmp(Emp emp);

    public int delEmp(int id);
}

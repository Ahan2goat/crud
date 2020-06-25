package com.hyh.crud.service.Impl;

import com.hyh.crud.entity.Emp;
import com.hyh.crud.mapper.EmpMapper;
import com.hyh.crud.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HuangYuhan
 * @version 1.0
 * @date 2020/6/16 - 23:06
 */

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;
    @Override
    public List<Emp> findEmps() {
        return empMapper.selAll();
    }

    @Override
    public int addEmp(Emp emp) {
        return empMapper.insEmp(emp);
    }
}

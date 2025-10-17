package com.crm.service;

import com.crm.common.result.PageResult;
import com.crm.entity.Department;
import com.baomidou.mybatisplus.extension.service.IService;
import com.crm.query.DepartmentQuery;
import com.crm.query.IdQuery;

import java.util.List;


public interface DepartmentService extends IService<Department> {
    /**
     * 部门列表-分页
     *
     */
    PageResult<Department> getPage(DepartmentQuery query);


    /**
     * 部门列表 - 不分页
     *
     *
     */
    List<Department> getList();


    /**
     * 保存或编辑部门
     *
     */
    void saveOrEditDepartment(Department department);

    /**
     * 删除部门
     *
     */
    void removeDepartment(IdQuery query);

}
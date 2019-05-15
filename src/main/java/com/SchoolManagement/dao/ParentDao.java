package com.SchoolManagement.dao;

import org.springframework.data.repository.CrudRepository;
import com.SchoolManagement.enitiy.ParentMaster;
import com.SchoolManagement.enitiy.Student;


public interface ParentDao extends CrudRepository<ParentMaster, Integer> {

  public ParentMaster findByStu(Student stu);
}

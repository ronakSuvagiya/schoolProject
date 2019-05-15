package com.SchoolManagement.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.SchoolManagement.enitiy.SchoolMaster;
import com.SchoolManagement.enitiy.StdMaster;
import com.SchoolManagement.enitiy.Student;


public interface StudentDio extends CrudRepository<Student, Integer> {

  public Student findByRollNoAndSchoolAndStd(Integer rollno, SchoolMaster school,
      StdMaster stdMaster);

  public List<Student> findByschool(SchoolMaster school);
}

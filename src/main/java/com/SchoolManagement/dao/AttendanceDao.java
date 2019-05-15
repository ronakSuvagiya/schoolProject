package com.SchoolManagement.dao;

import org.springframework.data.repository.CrudRepository;
import com.SchoolManagement.enitiy.AttendanceMaster;

public interface AttendanceDao extends CrudRepository<AttendanceMaster, Integer> {



}

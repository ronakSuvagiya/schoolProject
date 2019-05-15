package com.SchoolManagement.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.SchoolManagement.common.ResponesDto;
import com.SchoolManagement.common.setResult;
import com.SchoolManagement.dto.AttendanceDto;
import com.SchoolManagement.service.AttendanceService;

@RestController
public class AttendanceControler {

  @Autowired
  AttendanceService attendanceService;

  @RequestMapping("/addAttendance")
  public ResponseEntity<ResponesDto> addDiv(@RequestBody AttendanceDto attendanceDto) {

    attendanceService.addAttendance(attendanceDto);
    setResult result = new setResult();
    ResponesDto respone = result.setResponse(HttpStatus.OK.value(), "Add Attendance Successfully");
    return new ResponseEntity<ResponesDto>(respone, HttpStatus.OK);
  }
}

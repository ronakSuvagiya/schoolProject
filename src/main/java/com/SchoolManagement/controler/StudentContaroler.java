package com.SchoolManagement.controler;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.SchoolManagement.common.ResponesDto;
import com.SchoolManagement.common.setResult;
import com.SchoolManagement.dto.StudentDto;
import com.SchoolManagement.enitiy.Student;
import com.SchoolManagement.service.StudentSerivce;

@RestController
public class StudentContaroler {

  @Autowired
  StudentSerivce stService;

  @RequestMapping("/addStudent")
  public ResponseEntity<ResponesDto> addStudent(@RequestBody StudentDto studentDto) {
    stService.addStudent(studentDto);
    setResult result = new setResult();
    ResponesDto respone = result.setResponse(HttpStatus.OK.value(), "Add Student Successfully");
    return new ResponseEntity<ResponesDto>(respone, HttpStatus.OK);
  }

  @PostMapping("/updateStudent")
  public ResponseEntity<ResponesDto> updateStudent(@RequestBody StudentDto studentDto) {
    stService.updateStudents(studentDto);
    setResult result = new setResult();
    ResponesDto respone = result.setResponse(HttpStatus.OK.value(), "Update Student Successfully");
    return new ResponseEntity<ResponesDto>(respone, HttpStatus.OK);
  }

  @PostMapping("/deleteStudent")
  public ResponseEntity<ResponesDto> deleteStudent(@RequestBody StudentDto studentDto) {
    stService.deleteStudents(studentDto);
    setResult result = new setResult();
    ResponesDto respone = result.setResponse(HttpStatus.OK.value(), "Delete Student Successfully");
    return new ResponseEntity<ResponesDto>(respone, HttpStatus.OK);
  }

  @GetMapping("/selectStudent")
  public List<Student> selectStudent(@RequestParam("school") Integer school) {
    return stService.selectStudent(school);
  }

  @GetMapping("/findByStudentid")
  public Student finbyid(@RequestParam("id") Integer id) {
    Student stList = stService.findById(id);
    return stList;
  }
}

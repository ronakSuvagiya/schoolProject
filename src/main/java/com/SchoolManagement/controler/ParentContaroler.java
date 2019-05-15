package com.SchoolManagement.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.SchoolManagement.common.ResponesDto;
import com.SchoolManagement.common.setResult;
import com.SchoolManagement.dto.ParentDto;
import com.SchoolManagement.service.ParentSerivce;

@RestController
public class ParentContaroler {

  @Autowired
  ParentSerivce parentService;

  @RequestMapping("/addParent")
  public ResponseEntity<ResponesDto> addParent(@RequestBody ParentDto parentDto) {
    parentService.addParent(parentDto);
    setResult result = new setResult();
    ResponesDto respone = result.setResponse(HttpStatus.OK.value(), "Add Parent Successfully");
    return new ResponseEntity<ResponesDto>(respone, HttpStatus.OK);
  }

  @PostMapping("/updateParent")
  public ResponseEntity<ResponesDto> updateStudent(@RequestBody ParentDto parentDto) {
    parentService.updateParent(parentDto);
    setResult result = new setResult();
    ResponesDto respone = result.setResponse(HttpStatus.OK.value(), "Update Parent Successfully");
    return new ResponseEntity<ResponesDto>(respone, HttpStatus.OK);
  }

  @PostMapping("/deleteParent")
  public ResponseEntity<ResponesDto> deleteStudent(@RequestBody ParentDto parentDto) {
    parentService.deleteParent(parentDto);
    setResult result = new setResult();
    ResponesDto respone = result.setResponse(HttpStatus.OK.value(), "Delete Parent Successfully");
    return new ResponseEntity<ResponesDto>(respone, HttpStatus.OK);
  }

}

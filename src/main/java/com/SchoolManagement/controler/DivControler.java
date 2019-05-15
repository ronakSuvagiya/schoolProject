package com.SchoolManagement.controler;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.SchoolManagement.common.ResponesDto;
import com.SchoolManagement.common.setResult;
import com.SchoolManagement.dto.DivDto;
import com.SchoolManagement.enitiy.DivMaster;
import com.SchoolManagement.service.DivService;

@RestController
public class DivControler {

  @Autowired
  DivService divService;

  @RequestMapping("/addDiv")
  public ResponseEntity<ResponesDto> addDiv(@RequestBody DivDto div) {
    divService.addDiv(div);
    setResult result = new setResult();
    ResponesDto respone = result.setResponse(HttpStatus.OK.value(), "Add Div Successfully");
    return new ResponseEntity<ResponesDto>(respone, HttpStatus.OK);
  }

  @GetMapping("/findByStd")
  public List<DivMaster> findBYStd(@RequestParam("std") String std,
      @RequestParam("school") Integer schoolId) {
    List<DivMaster> div = divService.findByStd(std, schoolId);
    return div;
  }

}

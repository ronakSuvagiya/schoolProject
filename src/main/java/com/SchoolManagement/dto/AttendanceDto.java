package com.SchoolManagement.dto;

import java.util.Date;

public class AttendanceDto {

  private String rollNo;

  private Date date;

  private Integer school;

  private Integer std;

  private Integer div;

  public String getRollNo() {
    return rollNo;
  }

  public void setRollNo(String rollNo) {
    this.rollNo = rollNo;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Integer getSchool() {
    return school;
  }

  public void setSchool(Integer school) {
    this.school = school;
  }

  public Integer getStd() {
    return std;
  }

  public void setStd(Integer std) {
    this.std = std;
  }

  public Integer getDiv() {
    return div;
  }

  public void setDiv(Integer div) {
    this.div = div;
  }



}

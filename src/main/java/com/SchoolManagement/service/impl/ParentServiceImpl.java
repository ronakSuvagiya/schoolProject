package com.SchoolManagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.SchoolManagement.activity.ParentActivity;
import com.SchoolManagement.dto.ParentDto;
import com.SchoolManagement.service.ParentSerivce;

@Service
public class ParentServiceImpl implements ParentSerivce {

  @Autowired
  ParentActivity parentActivity;

  @Override
  public void addParent(ParentDto parentDto) {
    // TODO Auto-generated method stub
    parentActivity.addParent(parentDto);

  }

  @Override
  public void updateParent(ParentDto parentDto) {
    // TODO Auto-generated method stub
    parentActivity.updateParent(parentDto);

  }

  @Override
  public void deleteParent(ParentDto parentDto) {
    // TODO Auto-generated method stub
    parentActivity.deleteParent(parentDto);
  }

}

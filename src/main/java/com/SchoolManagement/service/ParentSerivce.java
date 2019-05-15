package com.SchoolManagement.service;

import com.SchoolManagement.dto.ParentDto;

public interface ParentSerivce {

  public void addParent(ParentDto parentDto);

  public void updateParent(ParentDto parentDto);

  public void deleteParent(ParentDto parentDto);
}

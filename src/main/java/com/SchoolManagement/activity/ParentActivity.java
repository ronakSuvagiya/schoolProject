package com.SchoolManagement.activity;

import com.SchoolManagement.dto.ParentDto;


public interface ParentActivity {

  public void addParent(ParentDto parentDto);

  public void updateParent(ParentDto parentDto);

  public void deleteParent(ParentDto parentDto);
}

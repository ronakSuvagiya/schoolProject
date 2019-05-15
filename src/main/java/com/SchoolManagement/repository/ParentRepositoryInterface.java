package com.SchoolManagement.repository;

import com.SchoolManagement.enitiy.ParentMaster;

public interface ParentRepositoryInterface {
  public void addParent(ParentMaster parentMaster);

  public void updateParent(ParentMaster parentMaster);

  public void deleteParent(ParentMaster parentMaster);
}

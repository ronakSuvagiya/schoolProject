package com.SchoolManagement.controlerMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ParentController {

  @RequestMapping("/add_parent")
  public ModelAndView add_parent() {
    ModelAndView model = new ModelAndView("add_parent");

    return model;

  }

}

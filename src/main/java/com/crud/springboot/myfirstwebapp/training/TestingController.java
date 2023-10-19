package com.crud.springboot.myfirstwebapp.training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

@Controller
public class TestingController {
       private Logger logger = LoggerFactory.getLogger(getClass());
      //C:\spring boot\myfirstwebapp\src\main\resources\META-INF\resources\WEB-INF\jsp\login.jsp
      //Model
      @RequestMapping("getTraining")
      public String TrainingPage(@RequestParam String age, ModelMap model) {
        model.put("age", age);
        logger.debug("Request param is {}", age);
        logger.info("I want this printed at info level");
        logger.warn("I want this printed at warn level");
        
        System.out.println("Request param is " + age);
        return "login";
      }
}

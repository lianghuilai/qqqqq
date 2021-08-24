package cn.lexed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
* @ClassName: HelloController
* @Description: 
* @author 大来老师
* @date 2021年7月29日
* @version V1.0 
*/
/*
 *  @RestController表示当前这个Controller类里所有的方法都返回json格式
 *  @Controller+@ResponseBody
 * */
@RestController
public class HelloController {

	   @RequestMapping("/hello")
	   public String hello(){
		  return  "Hello SpringBoot";
		  
	   }
	  
}

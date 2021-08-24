package cn.lexed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* @ClassName: HelloWorldApplication
* @Description: 
* @author 大来老师
* @date 2021年7月29日
* @version V1.0 
*/
/*
 * @SpringBootApplication:来标注springboot主程序类，说明这是一个SpringBoot应用
 * */
@SpringBootApplication
public class HelloWorldApplication {
	     
	    public static void main(String[] args) {
			
	    	//Spring应用启动起来
	    	SpringApplication.run(HelloWorldApplication.class, args);
		}
	  
}

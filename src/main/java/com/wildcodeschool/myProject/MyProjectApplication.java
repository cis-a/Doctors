package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

@RequestMapping("/")
@ResponseBody
public String index () {
return "<h1>Hello, I'm the Doctor!</h1>"
	+ "<ul>"
	+	"<li><a href=/doctor/1>Doctor  1</a></li>"
	+	"<li><a href=/doctor/3>Doctor  3</a></li>"
	+	"<li><a href=/doctor/5>Doctor  5</a></li>"
	+	"<li><a href=/doctor/13>Doctor 13</a></li>"
	+ "</ul>";
}

@RequestMapping("/doctor/1")
@ResponseBody
public	String doctor1 () {
	 return "William Hartnell";
}

@RequestMapping("/doctor/3")
@ResponseBody
public	String doctor3 () {
	 return "Jon Pertwee";
}

@RequestMapping("/doctor/5")
@ResponseBody
public	String doctor5 () {
	 return "Peter Davison";
}

@RequestMapping("/doctor/13")
@ResponseBody
public	String doctor13 () {
	 return "Jodie Whittaker";
}

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

}

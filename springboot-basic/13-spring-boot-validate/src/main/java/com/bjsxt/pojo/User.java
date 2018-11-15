package com.bjsxt.pojo;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class User { 
  @NotBlank(message="用户名不能为空")
  @Length(min=2,max=6,message="最小长度是2位,最大长度是6位")
  private String name;
  @NotEmpty
  private String password;
  @Min(value=18,message="年龄未成年")
  private String age;
  @Email(message="邮箱格式不正确")
  private String email;
  
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "User [name=" + name + ", password=" + password + ", age=" + age + ", email=" + email + "]";
}
  
}

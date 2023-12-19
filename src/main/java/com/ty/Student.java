package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student
{
	private int age;

	public int getAge() {
		return age;
	}

	@Value(value="70")
	public void setAge(int age) {
		this.age = age;
	}
	
	

}

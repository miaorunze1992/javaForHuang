package co.jp.demo.day03;

import co.jp.demo.day03.entity.Student;

public class Demo1 {
	

	// 什么是类?对标数据库的表
	// 什么是类的属性？对标数据库的表的字段
	public static void main(String[] args) {
		
		// 没有引入java类概念时，存3条数据
		int id = 1;
		String name = "张三";
		String gender = "0";
		
		int id2 = 2;
		String name2 = "李四";
		String gender2 = "1";
		
		int id3 = 3;
		String name3 = "王五";
		String gender3 = "1";
		// 创建了9个变量，存了3条数据       100条数据 ==》300变量
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("张三");
		student1.setGender("0");
		
		Student student2 = new Student();
		student1.setId(2);
		student1.setName("李四");
		student1.setGender("1");
		
		Student student3 = new Student();
		student1.setId(3);
		student1.setName("王五");
		student1.setGender("1");
		// 创建了3个变量，存了3条数据       100条数据 ==》300变量
		
	}
	
	
	
	
	
	
	
	

}

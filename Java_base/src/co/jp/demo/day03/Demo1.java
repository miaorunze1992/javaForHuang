package co.jp.demo.day03;

import co.jp.demo.day03.entity.Student;

public class Demo1 {
	

	// ʲô����?�Ա����ݿ�ı�
	// ʲô��������ԣ��Ա����ݿ�ı���ֶ�
	public static void main(String[] args) {
		
		// û������java�����ʱ����3������
		int id = 1;
		String name = "����";
		String gender = "0";
		
		int id2 = 2;
		String name2 = "����";
		String gender2 = "1";
		
		int id3 = 3;
		String name3 = "����";
		String gender3 = "1";
		// ������9������������3������       100������ ==��300����
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("����");
		student1.setGender("0");
		
		Student student2 = new Student();
		student1.setId(2);
		student1.setName("����");
		student1.setGender("1");
		
		Student student3 = new Student();
		student1.setId(3);
		student1.setName("����");
		student1.setGender("1");
		// ������3������������3������       100������ ==��300����
		
	}
	
	
	
	
	
	
	
	

}

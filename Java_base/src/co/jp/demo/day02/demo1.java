package co.jp.demo.day02;

public class demo1 {

	public static void main(String[] args) {

		// 变量类型 变量名 = 直接赋值(字符串) =====>此方法相当于直接创建变量并赋值
		String str = "netwisdom";

		// 变量类型 变量名 = new 变量类型() =====>此方法相当于的调用类的构造方法，创建的变量
		// String str1 = new String("netwisdom");
		//
		// String s1 = "abc";
		// String s2 = new String("abc");
		// String s4 = new String("abc");
		// String s3 = "abc";

		// 变量.方法名()
		// System.out.println(s3.charAt(2));

		// System.out.println(s2.equals(s4));

		// int转字符串
		// int num = 456;
		// System.out.println(num);
		// String numToStr1 = "" + num;
		// System.out.println(numToStr1);
		// String numToStr2 = String.valueOf(num);
		// String numToStr3 = Integer.toString(num);
		//
		// String gender = "0";
		// int genderInt = Integer.parseInt(gender);

		// char[] nameStr = {'m','i','a','o'};
		// String name = new String(nameStr);
		// name = name.toUpperCase();
		// System.out.println(name);
		//

		// String number = "180.86";
		// 需求：转换成double类型，输出 180.8（double类型的）

		// String number001 = "我买了8个橘子，9个苹果，橘子1.259元/个，苹果6.313元/个。花了多少钱？";
		// 需求：结果为float类型，小数点后保留两位数字
		// float orangeTotal = Float.parseFloat(number001.substring(3, 4));
		// float orangePrice = Float.parseFloat(number001.substring(15, 20));
		// float appleTotal = Float.parseFloat(number001.substring(8, 9));
		// float applePrice = Float.parseFloat(number001.substring(26, 31));
		// float result =
		// Float.parseFloat(String.valueOf(orangeTotal*orangePrice +
		// appleTotal*applePrice).substring(0,5));
		// System.out.println("花了："+ result +"元");

		// byte类型的数组
		byte[] byteArray = { 1, 2, 3, 40 };
		// 普通for循环  写5遍
//		for (int i = 0; i < byteArray.length; i++) {
//			// 循环的方法体
//			System.out.println(byteArray[i]); // 0 1 2 3
//		}
		
		// foreach循环
//		for(参数类型【空格！！！】形式参数:要遍历的对象){
//			使用我们的形式参数
//		}
//		for(byte abc:byteArray){
//			System.out.println(abc);
//		}
		
		
		
		
		

		int[][] intArr = { { 123, 5454 }, { 455, 123 } };
		// 普通for循环
//		for(int i=0;i<intArr.length;i++){
//			for(int j =0;j<intArr[i].length;j++){
//				System.out.println(intArr[i][j]);
//			}
//		}
		// foreach循环
		for(int[] intArrOne:intArr){
			for(int rs:intArrOne){
				System.out.println(rs);
			}
		}
		
		
		
		
		

		// Object json
		int[] intArr1 = { 123, 5454 };
		int[] intArr2 = { 455, 123 };
		int[][] intArrArr = { intArr1, intArr2 };
		// 俄罗斯套娃！！！数据的一层套着一层

	}

}

package co.jp.demo.day02;

public class demo1 {

	public static void main(String[] args) {

		// �������� ������ = ֱ�Ӹ�ֵ(�ַ���) =====>�˷����൱��ֱ�Ӵ�����������ֵ
		String str = "netwisdom";

		// �������� ������ = new ��������() =====>�˷����൱�ڵĵ�����Ĺ��췽���������ı���
		// String str1 = new String("netwisdom");
		//
		// String s1 = "abc";
		// String s2 = new String("abc");
		// String s4 = new String("abc");
		// String s3 = "abc";

		// ����.������()
		// System.out.println(s3.charAt(2));

		// System.out.println(s2.equals(s4));

		// intת�ַ���
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
		// ����ת����double���ͣ���� 180.8��double���͵ģ�

		// String number001 = "������8�����ӣ�9��ƻ��������1.259Ԫ/����ƻ��6.313Ԫ/�������˶���Ǯ��";
		// ���󣺽��Ϊfloat���ͣ�С���������λ����
		// float orangeTotal = Float.parseFloat(number001.substring(3, 4));
		// float orangePrice = Float.parseFloat(number001.substring(15, 20));
		// float appleTotal = Float.parseFloat(number001.substring(8, 9));
		// float applePrice = Float.parseFloat(number001.substring(26, 31));
		// float result =
		// Float.parseFloat(String.valueOf(orangeTotal*orangePrice +
		// appleTotal*applePrice).substring(0,5));
		// System.out.println("���ˣ�"+ result +"Ԫ");

		// byte���͵�����
		byte[] byteArray = { 1, 2, 3, 40 };
		// ��ͨforѭ��  д5��
//		for (int i = 0; i < byteArray.length; i++) {
//			// ѭ���ķ�����
//			System.out.println(byteArray[i]); // 0 1 2 3
//		}
		
		// foreachѭ��
//		for(�������͡��ո񣡣�������ʽ����:Ҫ�����Ķ���){
//			ʹ�����ǵ���ʽ����
//		}
//		for(byte abc:byteArray){
//			System.out.println(abc);
//		}
		
		
		
		
		

		int[][] intArr = { { 123, 5454 }, { 455, 123 } };
		// ��ͨforѭ��
//		for(int i=0;i<intArr.length;i++){
//			for(int j =0;j<intArr[i].length;j++){
//				System.out.println(intArr[i][j]);
//			}
//		}
		// foreachѭ��
		for(int[] intArrOne:intArr){
			for(int rs:intArrOne){
				System.out.println(rs);
			}
		}
		
		
		
		
		

		// Object json
		int[] intArr1 = { 123, 5454 };
		int[] intArr2 = { 455, 123 };
		int[][] intArrArr = { intArr1, intArr2 };
		// ����˹���ޣ��������ݵ�һ������һ��

	}

}

package co.jp.demo.day01;

public class Main {
	
	public static void main(String[] args){
		

		
		// 二选一
//		if(a>60){
//			System.out.println("合格");
//		}else{
//			System.out.println("不合格");
//		}
		
		// 三选一
//		if(a>=80){
//			System.out.println("优秀");
//		}else if(a>60){
//			System.out.println("合格");
//		}else{
//			System.out.println("不合格");
//		}
		// 100~80 优秀/20   5~4   4
		// 80~60合格 /20  4~3    3
		// 60~0不合格
		
//		int a = 100;
//		
//		switch(a/20){
//			case 5:
//				System.out.println("优秀");
//			break;
//			case 4:
//				System.out.println("优秀");
//				break;
//			case 3:
//				System.out.println("合格");
//				break;
//			default:
//				System.out.println("不合格");
//		}
		
		
		for(int i=0; i<5; i++){
			String str = "";
			for(int j=5;j>i;j--){
				str +="*";
			}
			System.out.println(str);
		}
		
		
		
		
		
		

	}
	
	// 类方法
	public static void main(String args){
		System.out.println("Hello JAPAN！！！" + args);
	}
}

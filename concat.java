class Concat{
	public static void main(String[] args) {
		System.out.println(2+3);//number+number-->number
		System.out.println('s'+3);//char+number-->number
		System.out.println('s'+'s');//char+char-->number
		// System.out.println(1+true);//number+boolean-->not posible//CTE
        System.out.println("santanu"+"Bera");//String+String-->String
        System.out.println(1+"santanu"+2+5);//number+String+number+number-->String

        System.out.println(1+2+"Santanu");//3Santanu
        System.out.println(1+2+"Santanu"+2);//3Santanu2
        System.out.println(1+"Santanu"+(1+2));//1Santanu3
		 // System.out.println(1+"Santanu"+80-45);//Compile time error(CTE)	
		System.out.println(1+"Santanu"+(80-45));//1Santanu35
		// System.out.println("Santnau"-23);//CTE
		System.out.println(1+"Santanu"+12*23);
			System.out.println(1+"Santanu"+100/10);
			System.out.println(1+"Santanu"+105%10);

	}

}
package project09;

public class Text {

	public static void main(String[] args) {
		
		
		int a=11;
		boolean b=false;
		String s="10";
		
		
		//基本数据类型转换为对应的包装类,通过构造器传入基本数据类型
		Integer integer1=new Integer(a);
		integer1=a;//或者使用自动装箱
		System.out.println(a);
		
		//包装类转换为基本数据类型,调用xxxValue方法
		int c=integer1.intValue();
		c=integer1;//或者使用自动拆箱
		System.out.println(c);
		
		//基本数据类型转String,调用String的重载方法valueof
		String s1=String.valueOf(a);
        String s2=String.valueOf(b);
        System.out.println(s1+s2);
        
        //包装类转String,直接调用toString方法
        String s3=integer1.toString();
        System.out.println(s3);
        
        //String转基本数据类型,调用相关包装类的parseXXX方法
        int i=Integer.parseInt(s);
        
        //String转包装类,调用包装类的构造方法，传入String
        Integer integer3=new Integer(s);
	}

}

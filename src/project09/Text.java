package project09;

public class Text {

	public static void main(String[] args) {
		
		
		int a=11;
		boolean b=false;
		String s="10";
		
		
		//������������ת��Ϊ��Ӧ�İ�װ��,ͨ�����������������������
		Integer integer1=new Integer(a);
		integer1=a;//����ʹ���Զ�װ��
		System.out.println(a);
		
		//��װ��ת��Ϊ������������,����xxxValue����
		int c=integer1.intValue();
		c=integer1;//����ʹ���Զ�����
		System.out.println(c);
		
		//������������תString,����String�����ط���valueof
		String s1=String.valueOf(a);
        String s2=String.valueOf(b);
        System.out.println(s1+s2);
        
        //��װ��תString,ֱ�ӵ���toString����
        String s3=integer1.toString();
        System.out.println(s3);
        
        //Stringת������������,������ذ�װ���parseXXX����
        int i=Integer.parseInt(s);
        
        //Stringת��װ��,���ð�װ��Ĺ��췽��������String
        Integer integer3=new Integer(s);
	}

}

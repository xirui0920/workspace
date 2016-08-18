package xirui.Practices;

public class RegularExpression {

	public static void main(String[] args) {
		//�ַ���ƥ�䡣������ʽ
		System.out.println("java".matches("java"));
		System.out.println("java".equals("java"));
		System.out.println("java is fun ".matches("java.*"));
		String s = "a+b$#c".replaceAll("[#$+]", "xxx");
		System.out.println(s);
		String[] tokens = "Java,C?C#,C++".split("[.,:;?]");
		for(int i = 0;i < tokens.length;i++){
			System.out.println(tokens[i]);
		}
		
		System.out.println("welcome to java".indexOf('w'));
		System.out.println("welcome to java".indexOf('o'));
		System.out.println("welcome to java".indexOf('o',5));
		System.out.println("welcome to java".indexOf("come"));
		System.out.println("welcome to java".lastIndexOf('o'));
		System.out.println("welcome to java".lastIndexOf('o',5));
		System.out.println("welcome to java".lastIndexOf("java"));
		
		//�ַ���������֮���ת��
		char[] chars = "java".toCharArray();
		String str = new String(new char[]{'j','a','v','a'});
		
		//�ַ�����ֵת�����ַ���
		
		System.out.println(Double.parseDouble("6.6666"));
		System.out.println(String.valueOf(5.44));
		
		
	}

}

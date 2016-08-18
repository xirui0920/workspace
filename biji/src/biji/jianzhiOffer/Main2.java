package biji.jianzhiOffer;



/*
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Main2 {
	
	public static void main(String[] args) {

	}
	
	public String replaceSpace(StringBuffer str) {
		String s = str.toString();
//		str.replace(0, str.length()-1, " ");
		s = s.replaceAll(" ", "%20");
		return s;
    }
}

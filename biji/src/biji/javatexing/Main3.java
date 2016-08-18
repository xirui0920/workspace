package biji.javatexing;

public class Main3 {
	public static void main(String[] args) {
		System.out.println(func());
	}
	
	public static int func (){
	    try{
	        return 1;
	    }catch (Exception e){
	        return 2;
	    }finally{
	        return 3;
	    }
	}
}

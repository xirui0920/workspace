package biji.javatexing;
public class Main {
     public static void main(String[] args) {
          /******** 一般写法，Main类与Chinese类和American类之间的强耦合 ***********/
          // Chinese和American，当类和方法修改时，此处的类和方法也需要修改
          Chinese chinese = new Chinese();
          chinese.sayHelloWorld("张三");

          American american = new American();
          american.sayHelloWorld("Jack");
     }
    
}

 interface Human {
    public void sayHelloWorld(String name);
} 

 class Chinese implements Human {
    public void sayHelloWorld(String name) {
         String helloWorld = "你好，" + name;
         System.out.println(helloWorld);
    }
}

 class American implements Human {
    public void sayHelloWorld(String name) {
         String helloWorld = "Hello，" + name;
         System.out.println(helloWorld);
    }
}
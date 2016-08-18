package biji.javatexing;



public class Main1 {
     public static void main(String[] args) {
          /******** 工厂方法， Main类与类Chinese和American不再耦合，仅仅和其接口Human耦合 ***********/
          // 修改时还需要修改在Main类中修改这些字符串
          // Chinese和American，当类和方法修改时，只有方法需要修改
          HumanFactory humanFactory = new HumanFactory();
          Human1 human1 = humanFactory.getHuman("chinese");
          human1.sayHelloWorld("张三");

          Human1 human2 = humanFactory.getHuman("american");
          human2.sayHelloWorld("Jack");
     }
}


/******************** 工厂方法 ***************************/
 interface Human1 {
     public void sayHelloWorld(String name);
}

class HumanFactory {
     public Human1 getHuman(String type) {
          if ("chinese".equals(type)) {
               return new Chinese1();
          } else {
               return new American1();
          }
     }
}


 class Chinese1 implements Human1 {
    public void sayHelloWorld(String name) {
         String helloWorld = "你好，" + name;
         System.out.println(helloWorld);
    }
}

 class American1 implements Human1 {
    public void sayHelloWorld(String name) {
         String helloWorld = "Hello，" + name;
         System.out.println(helloWorld);
    }
}
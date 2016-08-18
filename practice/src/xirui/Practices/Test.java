package xirui.Practices;

/**
 * Created by Xirui on 2015/9/20.
 * 典型多态
 * 从上面的程序中我们可以看出 A、B、C、D 存在如下关系。

 首先我们分析5，a2.show(c)，a2 是 A 类型的引用变量，所以 this 就代表了 A，a2.show(c),它在 A 类中找发现没有找到，于是到 A 的超类中找(super)，
 由于 A 没有超类（Object除外），所以跳到第三级，也就是 this.show((super)O)，C 的超类有 B、A，所以 (super)O 为 B、A，this 同样是 A，这里在 A 中找到了 show(A obj)，
 同时由于 a2 是 B 类的一个引用且 B 类重写了 show(A obj)，因此最终会调用子类B类的 show(A obj) 方法，结果也就是 B and A。

 按照同样的方法我也可以确认其他的答案。

 方法已经找到了但是我们这里还是存在一点疑问，我们还是来看这句话：当超类对象引用变量引用子类对象时，被引用对象的类型而不是引用变量的类型决定了调用谁的成员方法，
 但是这个被调用的方法必须是在超类中定义过的，也就是说被子类覆盖的方法。这我们用一个例子来说明这句话所代表的含义：a2.show(b)；

 这里 a2 是引用变量，为 A 类型，它引用的是 B 对象，因此按照上面那句话的意思是说有B来决定调用谁的方法,
 所以 a2.show(b) 应该要调用B中的 show(B obj)，产生的结果应该是“B and B”，
 但是为什么会与前面的运行结果产生差异呢？这里我们忽略了后面那句话“但是这儿被调用的方法必须是在超类中定义过的”，那么 show(B obj) 在 A 类中存在吗？
 根本就不存在！所以这句话在这里不适用？那么难道是这句话错误了？非也！其实这句话还隐含这这句话：它仍然要按照继承链中调用方法的优先级来确认。
 所以它才会在 A 类中找到 show(A obj)，同时由于 B 重写了该方法所以才会调用 B 类中的方法，否则就会调用 A 类中的方法。

 所以多态机制遵循的原则概括为：当超类对象引用变量引用子类对象时，被引用对象的类型而不是引用变量的类型决定了调用谁的成员方法，
 但是这个被调用的方法必须是在超类中定义过的，也就是说被子类覆盖的方法，但是它仍然要根据继承链中方法调用的优先级来确认方法，
 该优先级为：this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)。
 */

public class Test {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();

        System.out.println("1--" + a1.show(b));
        System.out.println("2--" + a1.show(c));
        System.out.println("3--" + a1.show(d));
        System.out.println("4--" + a2.show(b));
        System.out.println("5--" + a2.show(c));
        System.out.println("6--" + a2.show(d));
        System.out.println("7--" + b.show(b));
        System.out.println("8--" + b.show(c));
        System.out.println("9--" + b.show(d));
    }


}

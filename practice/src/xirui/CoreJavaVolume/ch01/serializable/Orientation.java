package xirui.CoreJavaVolume.ch01.serializable;
import java.io.*;
/**
 * Created by Administrator on 16-4-8.
 * 枚举类型
 * 枚举类型序列化时要用readResolve 特殊序列化方法。
 * 因为正常序列化机制会在序列化时创建新的对象，尽管构造方法私有
 * 单列模式也要同样处理
 */
public class Orientation implements Serializable {
    public static final Orientation HORIZONTAL = new Orientation(1);
    public static final Orientation VERTICAL = new Orientation(2);

    private int value;

    private Orientation(int v){value = v;}


    //特殊序列化 必须实现固定签名方法
    protected Object readResolve() throws ObjectStreamException {
        if (value == 1) return Orientation.HORIZONTAL;
        if (value == 2) return Orientation.VERTICAL;
        return null;
    }
}

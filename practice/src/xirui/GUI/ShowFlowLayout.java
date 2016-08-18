package xirui.GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Xirui on 2015/9/15.
 * 流布局管理器应用 封装组件框架到布局管理器
 */
public class ShowFlowLayout extends JFrame{
    public ShowFlowLayout() {
        //创建流布局管理器 左对齐
        setLayout(new FlowLayout(FlowLayout.LEFT,10,20));

        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("MI"));
        add(new JTextField(1));
        add(new JLabel("Last Name"));
        add(new JTextField(8));

    }

    public static void main(String[] args) {
        ShowFlowLayout frame = new ShowFlowLayout();
        frame.setTitle("ShowFlowlayout");
        frame.setSize(200,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

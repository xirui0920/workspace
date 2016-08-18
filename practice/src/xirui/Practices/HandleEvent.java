package xirui.Practices;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Xirui on 2015/9/16.
 */
public class HandleEvent extends JFrame {
    public HandleEvent() {
        //创建2个按钮
        JButton jbtOK = new JButton("ok");
        JButton jbtCancel = new JButton("Cancel");
        //创建画板放上2个按钮
        JPanel panel = new JPanel();
        panel.add(jbtOK);
        panel.add(jbtCancel);
        add(panel); //添加画板到JFrame
        OKListenerClass listener1 = new OKListenerClass();
        CancelListenerClass listener2 = new CancelListenerClass();
        jbtOK.addActionListener(listener1);
        jbtCancel.addActionListener(listener2);

    }

    public static void main(String[] args) {
        JFrame frame = new HandleEvent();
        frame.setTitle("Handle Event");
        frame.setSize(200,150);
        frame.setLocation(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class OKListenerClass implements ActionListener {
        public void actionPerformed(ActionEvent e){
            System.out.println("ok button clicked");
        }
    }

    class CancelListenerClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Cancel button clicked");
        }
    }
}

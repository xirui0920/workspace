package xirui.Practices;

import javax.swing.*;

/**
 * Created by Xirui on 2015/9/22.
 */
public class FlashingText extends  JApplet implements Runnable {
    private JLabel jlblText = new JLabel("Welcome", JLabel.CENTER);

    public FlashingText() {
        add(jlblText);
        new Thread(this).start();
    }

    public void run() {


            try {
                while (true) {
                    if (jlblText.getText() == null)
                        jlblText.setText("Welcome");
                    else
                        jlblText.setText(null);
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }

    }

}

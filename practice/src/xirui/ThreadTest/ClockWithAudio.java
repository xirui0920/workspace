package xirui.ThreadTest;

import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Xirui on 2015/9/22.
 */
public class ClockWithAudio extends JApplet {
    protected AudioClip[] hourAudio = new AudioClip[12];
    protected AudioClip[] minuteAudio = new AudioClip[60];

    protected AudioClip amAudio = Applet.newAudioClip(this.getClass().getResource(""));

    protected AudioClip pmAudio = Applet.newAudioClip(this.getClass().getResource(""));
    //create a clock
    private StillClock clock = new StillClock(); //resolve
    //create a timer
    private Timer timer = new Timer(1000, new TimerListener());
    //create a lable to display time
    private JLabel jlblDigitTime = new JLabel("", JLabel.CENTER);

    //initialize
    public void init() {
        for (int i = 0;i < 12;i++)
            hourAudio[i] = Applet.newAudioClip(this.getClass().getResource(""));

        for (int i = 0;i<60;i++)
            minuteAudio[i] = Applet.newAudioClip(this.getClass().getResource(""));

        add(clock,BorderLayout.CENTER);
        add(jlblDigitTime,BorderLayout.SOUTH);
    }

    public void start() {
        timer.start();
    }
    public void stop() {
        timer.stop();
    }

    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            clock.setCurrentTime();
            clock.repaint();
            jlblDigitTime.setText(clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond());
            if (clock.getSecond() == 0)
                announceTime(clock.getHour(),clock.getMinute());

        }
    }
    public void announceTime(int hour,int minute) {
        hourAudio[hour % 12].play();
        try {
            Thread.sleep(1500);

            minuteAudio[minute].play();

            Thread.sleep(1500);

        }
        catch (InterruptedException ex) {
        }

        if (hour < 12)
            amAudio.play();
        else
            pmAudio.play();
    }
}

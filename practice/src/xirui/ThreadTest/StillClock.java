package xirui.ThreadTest;

import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 * Created by Xirui on 2015/9/23.
 */
public class StillClock extends JPanel {
    private int hour;
    private int minute;
    private int second;

    public StillClock() {
        setCurrentTime();
    }

    public StillClock(int hour,int minute,int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
        repaint();
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
        repaint();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int clockRadius = (int)(Math.min(getWidth(),getHeight()) * 0.8 * 0.5);
        int xCenter = getWidth() / 2;
        int yCenter = getHour() / 2;

        g.setColor(Color.BLACK);
        g.drawOval(xCenter - clockRadius,yCenter - clockRadius,2 * clockRadius,2 * clockRadius);
        g.drawString("12",xCenter - 5,yCenter - clockRadius + 12);
        g.drawString("9", xCenter - clockRadius + 3,yCenter + 5);
        g.drawString("3", xCenter + clockRadius - 10,yCenter + 3);
        g.drawString("6", xCenter - 3,yCenter + clockRadius - 3);

        int sLength = (int)(clockRadius * 0.8);
        int xSecond = (int)(xCenter + sLength * Math.sin(second * (2 * Math.PI /60)));
        int ySecond = (int)(yCenter - sLength * Math.cos(second * (2 * Math.PI / 60)));
        g.setColor(Color.red);
        g.drawLine(xCenter,yCenter,xSecond,ySecond);

        int hLength = (int)(clockRadius * 0.5);
        int xHour = (int)(xCenter + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
        int yHour = (int)(yCenter - hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
        g.setColor(Color.green);
        g.drawLine(xCenter,yCenter,xHour,yHour);
    }

    public void setCurrentTime() {
        Calendar calendar = new GregorianCalendar();

        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }
    public Dimension getPreferredSize() {
        return new Dimension(400,400);
    }


}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class S extends JFrame implements ActionListener {

    JLabel timeLabel;
    JButton start, stop, reset;
    Timer timer;
    int seconds = 0;

    S() {
        setTitle("Stopwatch");
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        timeLabel = new JLabel("00:00:00", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Verdana", Font.BOLD, 28));
        add(timeLabel, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        start = new JButton("Start");
        stop = new JButton("Stop");
        reset = new JButton("Reset");

        panel.add(start);
        panel.add(stop);
        panel.add(reset);
        add(panel, BorderLayout.SOUTH);

        start.addActionListener(this);
        stop.addActionListener(this);
        reset.addActionListener(this);

        timer = new Timer(1000, e -> updateTime());

        setVisible(true);
    }

    void updateTime() {
        seconds++;
        int h = seconds / 3600;
        int m = (seconds % 3600) / 60;
        int s = seconds % 60;
        timeLabel.setText(String.format("%02d:%02d:%02d", h, m, s));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) timer.start();
        if (e.getSource() == stop) timer.stop();
        if (e.getSource() == reset) {
            timer.stop();
            seconds = 0;
            timeLabel.setText("00:00:00");
        }
    }

    public static void main(String[] args) {
        new S();
    }
}

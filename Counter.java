import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Counter implements ActionListener {
  JLabel leftLabel;
  JLabel rightLabel;
  int leftCount;
  int rightCount; 

  Counter() {
    JFrame frame = new JFrame("Let's Count");
    frame.setLayout(new FlowLayout());
    frame.setSize(200, 110);

    JButton left = new JButton("Left");
    JButton right = new JButton("Right");

    int leftCount = 0;
    int rightCount = 0;

    left.addActionListener(this);
    right.addActionListener(this);

    frame.add(left);
    frame.add(right);

    leftLabel = new JLabel("Count: " + leftCount);
    rightLabel = new JLabel("Count: " + rightCount);
    frame.add(leftLabel);
    frame.add(rightLabel);

    JButton reset = new JButton("Reset");
    reset.addActionListener(this);
    frame.add(reset);
    
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    if(ae.getActionCommand().equals("Left")) {
      this.leftCount++;
      leftLabel.setText("Count: " + this.leftCount);
    }else if(ae.getActionCommand().equals("Right")) {
      this.rightCount++;
      rightLabel.setText("Count: " + this.rightCount);  
    }else {
      this.leftCount = 0;
      this.rightCount = 0;
      leftLabel.setText("Count: " + this.leftCount);
      rightLabel.setText("Count: " + this.rightCount);
    }
  }
}
import java.awt.*;
import java.awt.event.*;

public class AppletDemo extends Frame implements ActionListener {
    Button b1, b2, b3, b4;
    TextField t1, t2, t3;
    Label l1, l2, l3;

    public AppletDemo() {
        l1 = new Label("Enter the number");
        l2 = new Label("Enter another number");
        l3 = new Label("Solution");

        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);
        t3.setEditable(false);

        b1 = new Button("Addition");
        b2 = new Button("Subtraction");
        b3 = new Button("Multiplication");
        b4 = new Button("Division");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setLayout(new FlowLayout());

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }

    public void actionPerformed(ActionEvent e) {
        double x, y, z;
        try {
            x = Double.parseDouble(t1.getText().trim());
            y = Double.parseDouble(t2.getText().trim());

            if (e.getSource() == b1) {
                z = x + y;
                t3.setText(String.valueOf(z));
            } else if (e.getSource() == b2) {
                z = x - y;
                t3.setText(String.valueOf(z));
            } else if (e.getSource() == b3) {
                z = x * y;
                t3.setText(String.valueOf(z));
            } else if (e.getSource() == b4) {
                if (y != 0) {
                    z = x / y;
                    t3.setText(String.valueOf(z));
                } else {
                    t3.setText("Error: Div by 0");
                }
            }
        } catch (NumberFormatException ex) {
            t3.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        AppletDemo a1 = new AppletDemo();
        a1.setSize(400, 200);
        a1.setVisible(true);
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class More extends JFrame implements ActionListener
{

    JTextField t1 ;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24;
    static double c,n,n2;
    String s1,s2,s3,s4,s5;
    More()
    {


        setBounds(600, 100, 400, 500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("SCIENTIFIC CALCULATOR-ADVANCED");
        setVisible(true);

        t1 = new JTextField("");
        t1.setBounds(70,40,250,30);
        t1.setLayout(null);

        JPanel jp = new JPanel();

        jp.setBounds(45,150,300,250);
        jp.setLayout(new GridLayout(6, 4,10,10));

        btn21 = new JButton("x^2");
        btn22 = new JButton("x^3");
        btn23 = new JButton("x!");
        btn24 = new JButton("x^y");
        btn1 = new JButton("C");
        btn2 = new JButton("Del");
        btn3 = new JButton("ln");
        btn4 = new JButton("log");
        btn5 = new JButton("7");
        btn6 = new JButton("8");
        btn7 = new JButton("9");
        btn8 = new JButton("sin");
        btn9 = new JButton("4");
        btn10 = new JButton("5");
        btn11 = new JButton("6");
        btn12 = new JButton("cos");
        btn13 = new JButton("1");
        btn14 = new JButton("2");
        btn15 = new JButton("3");
        btn16 = new JButton("tan");
        btn17 = new JButton("More");
        btn18 = new JButton("0");
        btn19 = new JButton(".");
        btn20 = new JButton("=");

        btn21.addActionListener(this);
        btn22.addActionListener(this);
        btn23.addActionListener(this);
        btn24.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn10.addActionListener(this);
        btn11.addActionListener(this);
        btn12.addActionListener(this);
        btn13.addActionListener(this);
        btn14.addActionListener(this);
        btn15.addActionListener(this);
        btn16.addActionListener(this);
        btn17.addActionListener(this);
        btn17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Main().setVisible(true);
                }catch (Exception qw)
                {
                    qw.printStackTrace();
                }}
        });
        btn18.addActionListener(this);
        btn19.addActionListener(this);
        btn20.addActionListener(this);

        add(t1);
        add(jp); jp.add(btn1); jp.add(btn2); jp.add(btn3);
        jp.add(btn4);
        jp.add(btn21);jp.add(btn22); jp.add(btn23);jp.add(btn24);
        jp.add(btn5); jp.add(btn6);
        jp.add(btn7); jp.add(btn8); jp.add(btn9);
        jp.add(btn10);jp.add(btn11); jp.add(btn12); jp.add(btn13);
        jp.add(btn14); jp.add(btn15); jp.add(btn16);
        jp.add(btn17); jp.add(btn18); jp.add(btn19);jp.add(btn20);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn19) {
            s3 = t1.getText();
            s4 = ".";
            s5 = s3 + s4;
            t1.setText(s5);
        }

        if (e.getSource() == btn18) {
            s3 = t1.getText();
            s4 = "0";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (e.getSource() == btn13) {
            s3 = t1.getText();
            s4 = "1";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (e.getSource() == btn14) {
            s3 = t1.getText();
            s4 = "2";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (e.getSource() == btn15) {
            s3 = t1.getText();
            s4 = "3";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (e.getSource() == btn9) {
            s3 = t1.getText();
            s4 = "4";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (e.getSource() == btn10) {
            s3 = t1.getText();
            s4 = "5";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (e.getSource() == btn11) {
            s3 = t1.getText();
            s4 = "6";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (e.getSource() == btn5) {
            s3 = t1.getText();
            s4 = "7";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (e.getSource() == btn6) {
            s3 = t1.getText();
            s4 = "8";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (e.getSource() == btn7) {
            s3 = t1.getText();
            s4 = "9";
            s5 = s3 + s4;
            t1.setText(s5);
        }

        if (e.getSource() == btn16) {
            s1 = t1.getText();
            t1.setText("");
            c = 1;
        }
        if (e.getSource() == btn12) {
            s1 = t1.getText();
            t1.setText("");
            c = 2;
        }
        if (e.getSource() == btn8) {
            s1 = t1.getText();
            t1.setText("");
            c = 3;
        }
        if (e.getSource() == btn4) {
            s1 = t1.getText();
            t1.setText("");
            c = 4;
        }
        if (e.getSource() == btn3) {
            s1 = t1.getText();
            t1.setText("");
            c = 5;
        }
        if (e.getSource() == btn21) {
            s1 = t1.getText();
            t1.setText("");
            c = 6;
        }
        if (e.getSource() == btn22) {
            s1 = t1.getText();
            t1.setText("");
            c = 7;
        }
        if (e.getSource() == btn23) {
            s1 = t1.getText();
            t1.setText("");
            c = 8;
        }
        if (e.getSource() == btn24) {
            s1 = t1.getText();
            t1.setText("");
            c = 9;
        }

        if (e.getSource() == btn2) {
            String s = t1.getText();
            t1.setText("");
            for (int i = 0; i < s.length() - 1; i++)
                t1.setText(t1.getText() + s.charAt(i));
        }
        if (e.getSource() == btn20) {
            s2 = t1.getText();
            if (c == 1) {
               double n = Double.parseDouble(s2) ;
                double radian = Math.toRadians(n);
                double tanValue= Math.tan(radian);
                t1.setText(String.valueOf("tan(" + n + ") = " + tanValue));
            }
            if (c == 2) {
                double n = Double.parseDouble(s2) ;
                double radian = Math.toRadians(n);
                double cosValue= Math.cos(radian);
                t1.setText(String.valueOf("cos(" + n + ") = " + cosValue));
            }
            if (c == 3) {
                double n = Double.parseDouble(s2) ;
                double radian = Math.toRadians(n);
                double sinValue= Math.sin(radian);
                t1.setText(String.valueOf("sin(" + n + ") = " + sinValue));
            }
            if (c == 4) {
                double n = Double.parseDouble(s2);
                double result = Math.log10(n);
                t1.setText(String.valueOf(result));
            }
            if (c == 5) {
                double n = Double.parseDouble(s2);
                double result = Math.log10(n);
                double ln = result*2.3;
                t1.setText(String.valueOf(ln));
            }
            if (c == 6) {

                double n = Double.parseDouble(s1) ;
                double result = (n)*(n);
                t1.setText(String.valueOf(result));
            }
            if (c == 7) {
                double n = Double.parseDouble(s1);
                double result = (n)*(n)*(n);
                t1.setText(String.valueOf(result));
            }
            if(c==8)
            {
                double n = Double.parseDouble(s1);
                int i,fact=1;
                for(i=1;i<=n;i++){
                    fact=fact*i;
                }
                t1.setText(String.valueOf(fact));
            }
            if (c == 9) {
                double n = Double.parseDouble(s1);
                double n2 = Double.parseDouble(s2);
                long result = 1;
                for (; n2 != 0; --n2) {
                    result *= n;
                }
                t1.setText(String.valueOf(result));
            }
        }
        if (e.getSource() == btn1) {
            t1.setText("");
        }
    }
    public static void main(String[] args)
    {
        More ad = new More();
    }
}

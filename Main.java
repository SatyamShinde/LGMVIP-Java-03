import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
JTextField txt ;
JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20;
static double c,n;
String a1,a2,a3,a4,a5;
    Main()
    {
        setBounds(600, 100, 400, 500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("SCIENTIFIC CALCULATOR");
        setVisible(true);

        txt = new JTextField("");
        txt.setBounds(70,40,250,30);
        txt.setLayout(null);
        JPanel jp = new JPanel();

        jp.setBounds(45,150,300,250);
        jp.setLayout(new GridLayout(5, 4,10,10));

         btn1 = new JButton("C");
         btn2 = new JButton("Del");
         btn3 = new JButton("%");
         btn4 = new JButton("/");
         btn5 = new JButton("7");
         btn6 = new JButton("8");
         btn7 = new JButton("9");
         btn8 = new JButton("x");
         btn9 = new JButton("4");
         btn10 = new JButton("5");
         btn11 = new JButton("6");
         btn12 = new JButton("-");
         btn13 = new JButton("1");
         btn14 = new JButton("2");
         btn15 = new JButton("3");
         btn16 = new JButton("+");
         btn17 = new JButton("More");
         btn18 = new JButton("0");
         btn19 = new JButton(".");
         btn20 = new JButton("=");

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
                    new More().setVisible(true);
                }catch (Exception qw)
                {
                    qw.printStackTrace();
                }}
        });
        btn18.addActionListener(this);
        btn19.addActionListener(this);
        btn20.addActionListener(this);

        add(txt);
        add(jp);
        jp.add(btn1); jp.add(btn2); jp.add(btn3);
        jp.add(btn4); jp.add(btn5); jp.add(btn6);
        jp.add(btn7); jp.add(btn8); jp.add(btn9);
        jp.add(btn10);jp.add(btn11); jp.add(btn12); jp.add(btn13);
        jp.add(btn14); jp.add(btn15); jp.add(btn16);
        jp.add(btn17); jp.add(btn18); jp.add(btn19);jp.add(btn20);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn19){
            a3 = txt.getText();
            a4 = ".";
            a5 = a3 + a4;
            txt.setText(a5);}

        if(e.getSource()==btn18){
            a3 = txt.getText();
            a4 = "0";
            a5 = a3 + a4;
            txt.setText(a5);
        }
        if(e.getSource()==btn13){
            a3 = txt.getText();
            a4 = "1";
            a5 = a3 + a4;
            txt.setText(a5);
        }
        if(e.getSource()==btn14){
            a3 = txt.getText();
            a4 = "2";
            a5 = a3 + a4;
            txt.setText(a5);
        }
        if(e.getSource()==btn15){
            a3 = txt.getText();
            a4 = "3";
            a5 = a3 + a4;
            txt.setText(a5);
        }
        if(e.getSource()==btn9){
            a3 = txt.getText();
            a4 = "4";
            a5 = a3 + a4;
            txt.setText(a5);
        }
        if(e.getSource()==btn10){
            a3 = txt.getText();
            a4 = "5";
            a5 = a3 + a4;
            txt.setText(a5);
        }
        if(e.getSource()==btn11){
            a3 = txt.getText();
            a4 = "6";
            a5 = a3 + a4;
            txt.setText(a5);
        }
        if(e.getSource()==btn5){
            a3 = txt.getText();
            a4 = "7";
            a5 = a3 + a4;
            txt.setText(a5);
        }
        if(e.getSource()==btn6){
            a3 = txt.getText();
            a4 = "8";
            a5 = a3 + a4;
            txt.setText(a5);
        }
        if(e.getSource()==btn7){
            a3 = txt.getText();
            a4 = "9";
            a5 = a3 + a4;
            txt.setText(a5);
        }
        if(e.getSource()==btn16){
            a1 = txt.getText();
            txt.setText("");
            c = 1;
        }
        if(e.getSource()==btn12){
            a1 = txt.getText();
            txt.setText("");
            c = 2;
        }
        if(e.getSource()==btn8){
            a1 = txt.getText();
            txt.setText("");
            c = 3;
        }
        if(e.getSource()==btn4){
            a1 = txt.getText();
            txt.setText("");
            c = 4;
        }
        if(e.getSource()==btn3){
            a1 = txt.getText();
            txt.setText("");
            c = 5;
        }
        if(e.getSource()==btn2)
        {
            String s=txt.getText();
            txt.setText("");
            for(int i=0;i<s.length()-1;i++)
                txt.setText(txt.getText()+s.charAt(i));
        }
        if(e.getSource()==btn20){
            a2 = txt.getText();
            if(c==1){
                n = Double.parseDouble(a1) + Double.parseDouble(a2);
                txt.setText(String.valueOf(n));
            }
            if(c==2){
                n = Double.parseDouble(a1) - Double.parseDouble(a2);
                txt.setText(String.valueOf(n));
            }
            if(c==3){
                n = Double.parseDouble(a1) * Double.parseDouble(a2);
                txt.setText(String.valueOf(n));
            }
            if(c==4){
                n = Double.parseDouble(a1) / Double.parseDouble(a2);
                txt.setText(String.valueOf(n));
            }
            if(c==5){
                n = (Double.parseDouble(a1)*100) / Double.parseDouble(a2);
                txt.setText(String.valueOf(n + "%"));
            }
        }
        if(e.getSource()==btn1){
            txt.setText("");
        }
    }
        public static void main(String[] args) {
        Main mn = new Main();
        }
}

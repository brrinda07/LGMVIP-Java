import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class currencyconverter{
    JFrame f;
    currencyconverter(){
        f=new JFrame("Currency");
        String curr[]={"USD","INR","POUND","EURO","YEN"};
        JComboBox<String> c1=new JComboBox<String>(curr);
        c1.setBounds(525,300,150,30);
        f.add(c1);

        JComboBox<String> c2=new JComboBox<String>(curr);
        c2.setBounds(1050,300,150,30);
        f.add(c2);
        
        JLabel l1,l2,l3,l4,l5;
        JButton bt1,bt2;
               
        l1=new JLabel("CURRENCY CONVERTER");
        l1.setBounds(660,200,300,30);
        l1.setFont(new Font("Times New Roman",Font.BOLD,23));
        f.add(l1);

        l2=new JLabel("Input Currency");
        l2.setBounds(325,300,300,30);
        f.add(l2);

        l3=new JLabel("Output Currency");
        l3.setBounds(850,300,300,30);
        f.add(l3);

        l4=new JLabel("Amount");
        l4.setBounds(325,400,300,30);
        f.add(l4);

        l5=new JLabel("Amount");
        l5.setBounds(850,400,300,30);
        f.add(l5);

        JTextField x1=new JTextField("0");
        x1.setBounds(525,400,150,30);
        f.add(x1);

        JTextField x2=new JTextField("0");
        x2.setBounds(1050,400,150,30);
        f.add(x2);

        bt1=new JButton("CONVERT");
        bt1.setBounds(750,500,150,40);
        f.add(bt1);

        bt2=new JButton("CLOSE");
        bt2.setBounds(750,600,150,30);
        f.add(bt2);
        
        bt1.addActionListener(new ActionListener(){
            double d,d1;
            public void actionPerformed(ActionEvent e){
                
                d=Double.parseDouble(x1.getText());
                try{
                    if(c1.getSelectedIndex()==0 & c2.getSelectedIndex()==1){
                        d1=d*82.4;}
                    if(c1.getSelectedIndex()==0 & c2.getSelectedIndex()==2){
                        d1=d*0.8;}
                    if(c1.getSelectedIndex()==0 & c2.getSelectedIndex()==3){
                        d1=d*0.93;}
                    if(c1.getSelectedIndex()==0 & c2.getSelectedIndex()==4){
                        d1=d*139.96;}        
                    if(c1.getSelectedIndex()==1 & c2.getSelectedIndex()==0){
                        d1=d*0.012;}
                    if(c1.getSelectedIndex()==1 & c2.getSelectedIndex()==2){
                        d1=d*0.0097;}
                    if(c1.getSelectedIndex()==1 & c2.getSelectedIndex()==3){
                        d1=d*0.011;}
                    if(c1.getSelectedIndex()==1 & c2.getSelectedIndex()==4){
                        d1=d*1.7;}
                    if(c1.getSelectedIndex()==2 & c2.getSelectedIndex()==0){
                        d1=d*1.25;}
                    if(c1.getSelectedIndex()==2 & c2.getSelectedIndex()==1){
                        d1=d*102.6;}
                    if(c1.getSelectedIndex()==2 & c2.getSelectedIndex()==3){
                        d1=d*1.16;}
                    if(c1.getSelectedIndex()==2 & c2.getSelectedIndex()==4){
                        d1=d*174.26;}
                    if(c1.getSelectedIndex()==3 & c2.getSelectedIndex()==0){
                        d1=d*1.07;}
                    if(c1.getSelectedIndex()==3 & c2.getSelectedIndex()==1){
                        d1=d*88.37;}
                    if(c1.getSelectedIndex()==3 & c2.getSelectedIndex()==2){
                        d1=d*0.86;}
                    if(c1.getSelectedIndex()==3 & c2.getSelectedIndex()==4){
                        d1=d*150.13;}             
                    if(c1.getSelectedIndex()==4 & c2.getSelectedIndex()==0){
                        d1=d*0.0071;}
                    if(c1.getSelectedIndex()==4 & c2.getSelectedIndex()==1){
                        d1=d*0.59;}
                    if(c1.getSelectedIndex()==4 & c2.getSelectedIndex()==2){
                        d1=d*0.0057;}
                    if(c1.getSelectedIndex()==4 & c2.getSelectedIndex()==3){
                        d1=d*0.0067;}
    
                    String str1=String.valueOf(d1);
                    x2.setText(str1);
                }
                catch(Exception e1){
                    System.out.println("Error");
                }
                
            }
        });

        bt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                f.dispose();
            }
        });

        f.add(bt2);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(1550,900);
    }
    public static void curr_conv(){
        new currencyconverter();
        
    }
    public static void main(String args[]){
        curr_conv();
    }
}
package com.briup.JD1721.corejava.gui;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.table.TableStringConverter;
import javax.xml.soap.Text;
public class Calculator_0010 {
	private JFrame frame;
	private JTextField tf_display;
	private JPanel panel;
	private JButton btn_7;
	private JButton btn_8;
	private JButton btn_9;
	private JButton btn_div;
	private JButton btn_Backspace;
	private JButton btn_6;
	private JButton btn_5;
	private JButton btn_4;
	private JButton btn_by;
	private JButton btn_clear;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_sub;
	private JButton btn_sqrt;
	private JButton btn_addsub;
	private JButton btn_0;
	private JButton btn_point;
	private JButton btn_add;
	private JButton btn_equals;
	/**
	 * 定义三个成员变量，用于接收第一次的数据数据输入和第二次的数据输入
	 * 操作符
	 */
	private double num1;
	private double num2;
	private String op="";
	/**
	 * Launch the application.
	 */
	public void show1(){
		
	}
	public void show(ActionEvent arg0){
		//获取上面显示的字符 
		String command=arg0.getActionCommand();
		//获取单行文本框中已经存在的文本
		String text =tf_display.getText();
		if (text.length()>=10){
			tf_display.setText(text);
			return;
		}
		//将单行文本框中的内容置为command
		//判断Test的是否为“0”
		if("0".equals(text)){
		  text="";
		}
		tf_display.setText(text+command);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_0010 window = new Calculator_0010();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public Calculator_0010() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u8BA1\u7B97\u5668");
		frame.setBounds(100, 100, 506, 457);
		//设置窗体的默认关闭操作
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//-------------------------------------------------------------------------------------------------------------------
		tf_display = new JTextField("0");
		tf_display.setHorizontalAlignment(SwingConstants.RIGHT);
		tf_display.setBackground(Color.CYAN);
		tf_display.setEditable(false);
		//创建窗体 
		tf_display.setFont(new Font("微软雅黑", Font.PLAIN, 50));
		frame.getContentPane().add(tf_display, BorderLayout.NORTH);
		tf_display.setColumns(10);
		//-------------------------------------------------------------------------------------------------------------------
		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 5, 0, 0));
		//-------------------------------------------------------------------------------------------------------------------
		btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				show(arg0);
			}
		});
		btn_7.setBackground(new Color(255, 51, 102));
		btn_7.setFont(new Font("微软雅黑", Font.BOLD, 40));
		panel.add(btn_7);
		//-------------------------------------------------------------------------------------------------------------------
		btn_8 = new JButton("8");
		btn_8.setBackground(new Color(255, 51, 102));
		btn_8.setFont(new Font("微软雅黑", Font.BOLD, 40));
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				show(arg0);
			}
		});
		panel.add(btn_8);
		//-------------------------------------------------------------------------------------------------------------------
		btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				show(arg0);
			}
		});
		btn_9.setBackground(new Color(255, 51, 102));
		btn_9.setFont(new Font("微软雅黑", Font.BOLD, 40));
		panel.add(btn_9);
		//-------------------------------------------------------------------------------------------------------------------
		btn_div = new JButton("/");
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String test=tf_display.getText();
				num1=Double.parseDouble(test);
				op="/";
				tf_display.setText("0");
				System.out.println(num1);
			}
		});
		btn_div.setBackground(new Color(255, 51, 102));
		btn_div.setFont(new Font("微软雅黑", Font.BOLD, 40));
		panel.add(btn_div);
		//-------------------------------------------------------------------------------------------------------------------
		btn_Backspace = new JButton("\u2190");
		btn_Backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String test	=tf_display.getText();
			if(test.length()==1)
			tf_display.setText("0");
			else {
			test=test.substring(0,test.length()-1);
			tf_display.setText(test);
			}
			}
		});
		btn_Backspace.setBackground(new Color(255, 51, 102));
		btn_Backspace.setFont(new Font("微软雅黑", Font.BOLD, 40));
		panel.add(btn_Backspace);
		//-------------------------------------------------------------------------------------------------------------------
		btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				show(arg0);
			}
		});
		btn_4.setBackground(new Color(255, 51, 102));
		btn_4.setFont(new Font("微软雅黑", Font.BOLD, 40));
		panel.add(btn_4);
		//-------------------------------------------------------------------------------------------------------------------
		btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				show(arg0);
			}
		});
		btn_5.setBackground(new Color(255, 51, 102));
		btn_5.setFont(new Font("微软雅黑", Font.BOLD, 40));
		panel.add(btn_5);
		//-------------------------------------------------------------------------------------------------------------------
		btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				show(arg0);
			}
		});
		btn_6.setBackground(new Color(255, 51, 102));
		btn_6.setFont(new Font("微软雅黑", Font.BOLD, 40));
		panel.add(btn_6);
		//-------------------------------------------------------------------------------------------------------------------
		btn_by = new JButton("*");
		btn_by.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String test=tf_display.getText();
				num1=Double.parseDouble(test);
				op="*";
				tf_display.setText("0");
				System.out.println(num1);
			}
		});
		btn_by.setBackground(new Color(255, 51, 102));
		btn_by.setFont(new Font("微软雅黑", Font.BOLD, 40));
		panel.add(btn_by);
		//-------------------------------------------------------------------------------------------------------------------
		btn_clear = new JButton("C");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tf_display.setText("0");
				num1=0;
				num2=0;
				op="";
			}
		});
		btn_clear.setBackground(new Color(255, 51, 102));
		btn_clear.setFont(new Font("微软雅黑", Font.BOLD, 40));
		panel.add(btn_clear);
		//-------------------------------------------------------------------------------------------------------------------
		btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					show(e);
			}
		});
		btn_1.setBackground(new Color(255, 51, 102));
		btn_1.setFont(new Font("微软雅黑", Font.BOLD, 40));
		panel.add(btn_1);
		//-------------------------------------------------------------------------------------------------------------------
		btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//获取上面显示的字符 
			String command=arg0.getActionCommand();
			//获取单行文本框中已经存在的文本
			String text =tf_display.getText();
			if (text.length()>=10){
				tf_display.setText(text);
				return;
			}
			//将单行文本框中的内容置为command
			//判断Test的是否为“0”
			if("0".equals(text)){
			  text="";
			}
			tf_display.setText(text+command);
			}
		});
		btn_2.setBackground(new Color(255, 51, 102));
		btn_2.setFont(new Font("微软雅黑", Font.BOLD, 40));
		panel.add(btn_2);
		//-------------------------------------------------------------------------------------------------------------------
		btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				show(arg0);
			}
		});
		btn_3.setBackground(new Color(255, 51, 102));
		btn_3.setFont(new Font("微软雅黑", Font.BOLD, 40));
		panel.add(btn_3);
		//-------------------------------------------------------------------------------------------------------------------
		btn_sub = new JButton("-");
		btn_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String test=tf_display.getText();
				num1=Double.parseDouble(test);
				op="-";
				tf_display.setText("0");
				System.out.println(num1);
				
			}
		});
		btn_sub.setBackground(new Color(255, 51, 102));
		btn_sub.setFont(new Font("微软雅黑", Font.BOLD, 40));
		panel.add(btn_sub);
		//-------------------------------------------------------------------------------------------------------------------
		btn_sqrt = new JButton("Sqrt");
		btn_sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String test	=tf_display.getText();
			
		double	qrt= Math.sqrt(Double.parseDouble(test));
				tf_display.setText(qrt+"");
			}
		});
		btn_sqrt.setBackground(new Color(255, 51, 102));
		btn_sqrt.setFont(new Font("微软雅黑", Font.ITALIC, 24));
		panel.add(btn_sqrt);
		//-------------------------------------------------------------------------------------------------------------------
		btn_addsub = new JButton("\u00B1");
		btn_addsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double d=Double.parseDouble(tf_display.getText()) ;
				if(d!=0){
					tf_display.setText(-d+"");
				}
			}
		});
		btn_addsub.setBackground(new Color(255, 51, 102));
		btn_addsub.setFont(new Font("微软雅黑", Font.BOLD, 40));
		panel.add(btn_addsub);
		//-------------------------------------------------------------------------------------------------------------------
		btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				show(arg0);
			}
		});
		btn_0.setBackground(new Color(255, 51, 102));
		btn_0.setFont(new Font("微软雅黑", Font.BOLD, 40));
		panel.add(btn_0);
		//-------------------------------------------------------------------------------------------------------------------
		btn_point = new JButton(".");
		btn_point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s=tf_display.getText(); 
				System.out.println(s.indexOf(".")+""+"-------");
				if(s.indexOf(".")<0 ){
				tf_display.setText(tf_display.getText()+btn_point.getActionCommand());
				}
				else{
				tf_display.setText(tf_display.getText());
				}	
			}
		});
		btn_point.setBackground(new Color(255, 51, 102));
		btn_point.setFont(new Font("微软雅黑", Font.BOLD, 40));
		panel.add(btn_point);
		//-------------------------------------------------------------------------------------------------------------------
		btn_add = new JButton("+");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String test=tf_display.getText();
				num1=Double.parseDouble(test);
				op="+";
				tf_display.setText("0");
				System.out.println(num1);
			}
		});
		btn_add.setBackground(new Color(255, 51, 102));
		btn_add.setFont(new Font("微软雅黑", Font.BOLD, 40));
		panel.add(btn_add);
		//------------------------------------------------------------------------------------------------------------------
		btn_equals = new JButton("=");
		btn_equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			  String  test	=tf_display.getText();
			  num2=Double.parseDouble(test);
			  double result=0;
			  switch (op) {
			case "+":
				result=num1+num2;
				break;
			case "-":
				result=num1-num2;
				break;
			case "*":
				result=num1*num2;
				break;
			case "/":
				result=num1/num2;
				break;

				
			}
			  tf_display.setText(result+"");
			}
		});
		btn_equals.setBackground(new Color(255, 51, 102));
		btn_equals.setFont(new Font("微软雅黑", Font.BOLD, 40));
		panel.add(btn_equals);
		
	}

}

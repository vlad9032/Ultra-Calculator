package pac1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class InpButton extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private PText pt  = null;
	private InternalData intd = null;
	public InpButton(PText pt, InternalData intd) {
		this.pt = pt;
		this.intd = intd;
		setLayout(new GridLayout(4,4));
		JButton button1 = new JButton("1");
		button1.addActionListener(new cifer());
		add(button1);
		JButton button2 = new JButton("2");
		button2.addActionListener(new cifer());
		add(button2);
		JButton button3 = new JButton("3");
		button3.addActionListener(new cifer());
		add(button3);
		JButton button4 = new JButton("4");
		button4.addActionListener(new cifer());
		add(button4);
		JButton button5 = new JButton("5");
		button5.addActionListener(new cifer());
		add(button5);
		JButton button6 = new JButton("6");
		button6.addActionListener(new cifer());
		add(button6);
		JButton button7 = new JButton("7");
		button7.addActionListener(new cifer());
		add(button7);
		JButton button8 = new JButton("8");
		button8.addActionListener(new cifer());
		add(button8);
		JButton button9 = new JButton("9");
		button9.addActionListener(new cifer());
		add(button9);
		JButton button0 = new JButton("0");
		button0.addActionListener(new cifer());
		add(button0);
		}
		class cifer implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				String name = ((JButton)e.getSource()).getText();//schitivaet s knopki
				String temp = pt.getData();
				temp += name;
				pt.setData(temp);
			}
		}
		
	
}

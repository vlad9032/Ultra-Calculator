package pac1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import pac1.Arifm2Button.equ;
import pac1.Arifm2Button.mul;

public class Arifm2Button  extends JPanel {
	private static final long serialVersionUID = 1L;
	private PText pt = null;
	private InternalData intd = null;
	public Arifm2Button(PText pt, InternalData intd) {
		this.pt = pt;
		this.intd = intd;
		setLayout(new GridLayout(5,1));
		JButton buttondel = new JButton("sqrt");
		buttondel.addActionListener(new mul());
		add(buttondel);
		JButton buttonmul = new JButton("n!");
		buttonmul.addActionListener(new mul());
		add(buttonmul);
		JButton buttonsum = new JButton("x*x");
		buttonsum.addActionListener(new mul());
		add(buttonsum);
		JButton buttonmin = new JButton("sin");
		buttonmin.addActionListener(new mul());
		add(buttonmin);
		JButton buttonequalse = new JButton("cos");
		buttonequalse.addActionListener(new equ());
		add(buttonequalse);
		}
	class mul implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String name = ((JButton)e.getSource()).getText();
			String temp = pt.getData();
			double d = Double.valueOf(temp);
			intd.setOper(name);
			intd.setA(d);
			pt.setData("");
		}
	}
	class equ implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String temp = pt.getData();
			double d = Double.valueOf(temp);
			intd.setB(d);
			d = intd.getResult();
			pt.setData(""+d);
		}
	}
	
	
	
}

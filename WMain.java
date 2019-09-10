package pac1;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WMain extends JFrame{
	private static final long serialVersionUID = 1L;
	private InternalData intd = null;
	public WMain() {
		super("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(330,230);
		setLocation(300,100);
		
		
		PText pt = new PText();
		add("North",pt);
		
		intd = new InternalData();
		InpButton inpbut = new InpButton(pt,intd);
		JPanel pButton = new JPanel();
		pButton.add(inpbut);
		add("Center",pButton);
		
		ArifmButton arfb = new ArifmButton(pt,intd);
		JPanel pButton1 = new JPanel();
		pButton1.add(arfb);
		add("East",pButton1);
		
		Arifm2Button arf2b = new Arifm2Button(pt,intd);
		JPanel pButton12 = new JPanel();
		pButton12.add(arf2b);
		add("West",pButton12);
	}
	
}

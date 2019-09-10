package pac1;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class PText extends JPanel {
private static final long serialVersionUID = 1L;
String data = "";
JTextField txtF = null;

public PText() {
	txtF = new JTextField(20);
	txtF.setText(data);
	txtF.setEnabled(false);
	add(txtF);
	}
public String getData() {
	return data;
}
public void setData(String value) {
	data = value;
	txtF.setText(data);
}




}

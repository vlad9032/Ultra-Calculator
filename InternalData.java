package pac1;

public class InternalData {
double a;
double b;
String oper;
double m;
public double getA() {
	return a;
}
public void setA(double a) {
	this.a = a;
}
public double getB() {
	return b;
}
public void setB(double b) {
	this.b = b;
}
public String getOper() {
	return oper;
}
public void setOper(String oper) {
	this.oper = oper;
}
public double getM() {
	return m;
}
public void setM(double m) {
	this.m = m;
}
public double getResult() {
	if(oper.equals("+"))
	return a+b;
	if(oper.equals("-"))
	return a-b;
	if(oper.equals("*"))
	return a*b;
	if(oper.equals("/"))
	return a/b;
	return 0;
}
public void addM(double par) {
	m = m+par;
	return;
}

public void subM(double par) {
	m = m-par;
	return;
}



}

package ijaux.scale;

import java.util.ArrayList;

/*
 * This classes stores all Radial polynomial upto order m n for individual pixel.
 */
public class Zps {

	ArrayList<Double> real=new ArrayList<Double>();
	ArrayList<Double> imag=new ArrayList<Double>();
	/*int order;
	int degree;
	public Zps(int order, int degree){
		this.order=order;
		this.degree=degree;
	}*/
	public void setComplex(ArrayList<Double> real,ArrayList<Double> imag){
		this.real=real;
		this.imag=imag;
	}
	public ArrayList<Double> getReal(){
		return real;
	}
}
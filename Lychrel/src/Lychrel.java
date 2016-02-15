import javax.swing.JOptionPane;

public class Lychrel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String low = JOptionPane.showInputDialog("Ingresa el limite inferior");
	String upper = JOptionPane.showInputDialog("Ingresa el limite superior");
	Range lower = new Range();
	lower.rango(Integer.parseInt(low), Integer.parseInt(upper));
	lower.types();
	}

}

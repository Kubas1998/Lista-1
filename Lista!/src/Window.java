import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Window extends JFrame implements ActionListener {
	
	JLabel lCelsius, lFahrenheit;
	JTextField tCelsius, tFahrenheit;
	JButton bPrzelicz;
	double tempCelsius, tempFahrenheit;
	
	
	public Window() {
		setSize(500,200);
		setTitle("Window");
		setLayout(null);
		
		
		lCelsius= new JLabel("Stopnie Celsiusza");
		lCelsius.setBounds(20,20,150,20);
		add(lCelsius);
		
		tCelsius= new JTextField("");
		tCelsius.setBounds(170,20,150,20);
		add(tCelsius);
		
		lFahrenheit = new JLabel("Stopnie Fahrenheita");
		lFahrenheit.setBounds(20,70,150,20);
		add(lFahrenheit);
		tFahrenheit= new JTextField("");
		tFahrenheit.setBounds(170,70,150,20);
		add(tFahrenheit);
		
		bPrzelicz  = new JButton("Przelicz");
		bPrzelicz.setBounds(20,100,150,20);
		add(bPrzelicz);
		bPrzelicz.addActionListener(this);

	}
	public static void main(String[] args) {
		Window win = new Window();
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		tempCelsius=Double.parseDouble(tCelsius.getText());
		tempFahrenheit= 32.0 + (9.0/5.0) * tempCelsius;
		tFahrenheit.setText(String.valueOf(tempFahrenheit));
	}
}
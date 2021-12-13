import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

class Registration extends MyFrame {
	Registration() throws IOException {
		try {
			MyFrame f = new MyFrame();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

	void regis() {
		try {
			MyFrame f = new MyFrame();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}

class Upd extends Updation {
	void udpa() {
		Updation up = new Updation();
	}
}

class University
		extends JFrame
		implements ActionListener {

	private Container c;
	private JLabel title;
	private JButton newuser;
	private JButton update;
	private JButton check;

	public University() {
		setTitle("University Portal");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("University Portal");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		c.add(title);

		newuser = new JButton("Register");
		newuser.setFont(new Font("Arial", Font.PLAIN, 15));
		newuser.setSize(150, 60);
		newuser.setLocation(90, 250);
		newuser.addActionListener(this);
		c.add(newuser);

		update = new JButton("Update");
		update.setFont(new Font("Arial", Font.PLAIN, 15));
		update.setSize(150, 60);
		update.setLocation(350, 250);
		update.addActionListener(this);
		c.add(update);

		check = new JButton("Check");
		check.setFont(new Font("Arial", Font.PLAIN, 15));
		check.setSize(150, 60);
		check.setLocation(610, 250);
		check.addActionListener(this);
		c.add(check);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource() == newuser) {
				Registration s1 = new Registration();
				s1.regis();
			} else if (e.getSource() == update) {
				Upd s2 = new Upd();
				s2.udpa();
			}
		} catch (IOException e1) {
			// TODO: handle exception
		}

	}
}

public class Drive {
	public static void main(String[] args) throws Exception {
		University f = new University();
	}
}

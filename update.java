
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

class Updation
		extends JFrame
		implements ActionListener {

	// Components of the Form
	private Container c;
	private JLabel title;
	private JLabel name;
	private JTextField tname;
	private JCheckBox term;
	private JButton sub;
	private JButton reset;
	private JTextArea tout;
	private JLabel res;
	private JTextArea resadd;

	public Updation() {
		setTitle("Update Student Details");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Update Student Details");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(400, 30);
		title.setLocation(300, 30);
		c.add(title);

		name = new JLabel("Name of student ");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(400, 20);
		name.setLocation(100, 100);
		c.add(name);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(190, 20);
		tname.setLocation(270, 100);
		c.add(tname);

		term = new JCheckBox("Accept Terms And Conditions.");
		term.setFont(new Font("Arial", Font.PLAIN, 15));
		term.setSize(250, 20);
		term.setLocation(150, 450);
		c.add(term);

		sub = new JButton("Search");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(150, 500);
		sub.addActionListener(this);
		c.add(sub);

		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(270, 500);
		reset.addActionListener(this);
		c.add(reset);

		tout = new JTextArea();
		tout.setFont(new Font("Arial", Font.PLAIN, 15));
		tout.setSize(300, 400);
		tout.setLocation(500, 100);
		tout.setLineWrap(true);
		tout.setEditable(false);
		c.add(tout);

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(100, 525);
		c.add(res);

		resadd = new JTextArea();
		resadd.setFont(new Font("Arial", Font.PLAIN, 15));
		resadd.setSize(200, 75);
		resadd.setLocation(580, 175);
		resadd.setLineWrap(true);
		c.add(resadd);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		int i;
		if (e.getSource() == sub) {
			if (term.isSelected()) {
				try {
					File inputFile = new File("details.txt");
					File tempFile = new File("myTempFile.txt");

					BufferedReader reader = new BufferedReader(new FileReader(inputFile));
					BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

					String lineToRemove = tname.getText();
					String currentLine;
					boolean Flag = true;

					while ((currentLine = reader.readLine()) != null) {
						String trimmedLine = currentLine.trim();
						if (trimmedLine.equals(lineToRemove)) {
							continue;
						}
						writer.write(currentLine);
					}
				} catch (IOException ieo) {
					System.out.println("Exception:" + ieo.getStackTrace());
				}

			} else {
				// tout.setText("");
				// resadd.setText("");
				// res.setText("Please accept the"
				// + " terms & conditions..");
				System.out.println("Not done");
			}
		} else if (e.getSource() == reset) {
			System.out.println("Reset");
			// String def = "";
			// tname.setText(def);

			// tout.setText(def);
			// term.setSelected(false);

			// resadd.setText(def);
		}
	}
}

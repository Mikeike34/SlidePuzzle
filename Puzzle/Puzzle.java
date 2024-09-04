import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Puzzle extends JFrame implements ActionListener{

	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, shuffle;
	int counter = 0;
	JLabel counterLabel;
	
	Puzzle(){
		setSize(400,400); //400X400 pixels in size
		setLayout(null);
		setVisible(true); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //program will close when using the X on the top right.
		
		//instantiating each button and label
		b1 = new JButton("1");
		b2 = new JButton(" ");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("2");
		shuffle = new JButton("Shuffle!");
		counterLabel = new JLabel("Moves: 0");
		
		//adding each button
		add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(shuffle);
		
		//instantiating a container that holds the counterLabel
		Container contentPane = this.getContentPane();
		contentPane.add(counterLabel);
		
		//setting the layout of each button forming a grid type of layout. 
		b1.setBounds(90,60,50,40);
		b2.setBounds(160,60,50,40);
		b3.setBounds(230,60,50,40);
		b4.setBounds(90,115,50,40);
		b5.setBounds(160,115,50,40);
		b6.setBounds(230,115,50,40);
		b7.setBounds(90,170,50,40);
		b8.setBounds(160,170,50,40);
		b9.setBounds(230,170,50,40);
		shuffle.setBounds(135,245,100,40);
		counterLabel.setBounds(145,15,180,40);
		
		//Visuals of puzzle
		//button colors
		b1.setBackground(Color.decode("#C1E1C1"));
		b2.setBackground(Color.decode("#C1E1C1"));
		b3.setBackground(Color.decode("#C1E1C1"));
		b4.setBackground(Color.decode("#C1E1C1"));
		b5.setBackground(Color.decode("#C1E1C1"));
		b6.setBackground(Color.decode("#C1E1C1"));
		b7.setBackground(Color.decode("#C1E1C1"));
		b8.setBackground(Color.decode("#C1E1C1"));
		b9.setBackground(Color.decode("#C1E1C1"));
		shuffle.setBackground(Color.decode("#ffe282"));
		
		//Fonts
		b1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
		b2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
		b3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
		b4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
		b5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
		b6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
		b7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
		b8.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
		b9.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
		shuffle.setFont(new Font(Font.DIALOG, Font.PLAIN, 18));
		counterLabel.setFont(new Font(Font.DIALOG, Font.PLAIN, 18));
		//end visuals
		
		//action listeners
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		shuffle.addActionListener(this);
		
	}// end constructor

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//shuffle function
		if(e.getSource() == shuffle) {
			String s = b4.getText();
			b4.setText(b9.getText());
			b9.setText(s);
			s=b1.getText();
			b1.setText(b5.getText());
			b5.setText(s);
			s = b2.getText();
			b2.setText(b7.getText());
			b7.setText(s);
			counter = -1;
			counterLabel.setText("Moves: 0");
		}
		
		//button "slide" functions
		if(e.getSource() == b1) {
			String s = b1.getText();
			if(b2.getText().equals(" ")) {
				b2.setText(s);
				b1.setText(" ");
			}//end nested if
			else if(b4.getText().equals(" ")) {
				b4.setText(s);
				b1.setText(" ");
			}//end else if
		}//end if
		
		if(e.getSource() == b2) {
			String s = b2.getText();
			if(b1.getText().equals(" ")) {
				b1.setText(s);
				b2.setText(" ");
			}//end nested if
			else if(b3.getText().equals(" ")) {
				b3.setText(s);
				b2.setText(" ");
			}//end else if
			else if(b5.getText().equals(" ")) {
				b5.setText(s);
				b2.setText(" ");
			}//end else if
		}//end if
		
		if(e.getSource() == b3) {
			String s = b3.getText();
			if(b2.getText().equals(" ")) {
				b2.setText(s);
				b3.setText(" ");
			}//end nested if
			else if(b6.getText().equals(" ")) {
				b6.setText(s);
				b3.setText(" ");
			}//end else if
		}//end if
		
		if(e.getSource() == b4) {
			String s = b4.getText();
			if(b1.getText().equals(" ")) {
				b1.setText(s);
				b4.setText(" ");
			}//end nested if
			else if(b7.getText().equals(" ")) {
				b7.setText(s);
				b4.setText(" ");
			}//end else if
			else if(b5.getText().equals(" ")) {
				b5.setText(s);
				b4.setText(" ");
			}//end else if
		}//end if
		
		if(e.getSource() == b5) {
			String s = b5.getText();
			if(b2.getText().equals(" ")) {
				b2.setText(s);
				b5.setText(" ");
			}//end nested if
			else if(b4.getText().equals(" ")) {
				b4.setText(s);
				b5.setText(" ");
			}//end else if
			else if(b6.getText().equals(" ")) {
				b6.setText(s);
				b5.setText(" ");
			}//end else if
			else if(b8.getText().equals(" ")) {
				b8.setText(s);
				b5.setText(" ");
			}//end else if
		}//end if
		
		if(e.getSource()==b6) {
			String s = b6.getText();
			if(b9.getText().equals(" ")) {
				b9.setText(s);
				b6.setText(" ");
			}//end nested if
			else if(b3.getText().equals(" ")) {
				b3.setText(s);
				b6.setText(" ");
			}//end else if
			else if(b5.getText().equals(" ")) {
				b5.setText(s);
				b6.setText(" ");
			}//end else if
		}//end if
		
		if(e.getSource() == b7) {
			String s = b7.getText();
			if(b4.getText().equals(" ")) {
				b4.setText(s);
				b7.setText(" ");
			}//end nested if
			else if(b8.getText().equals(" ")) {
				b8.setText(s);
				b7.setText(" ");
			}//end else if
		}//end if
		
		if(e.getSource() == b8) {
			String s = b8.getText();
			if(b7.getText().equals(" ")) {
				b7.setText(s);
				b8.setText(" ");
			}//end nested if
			else if(b9.getText().equals(" ")) {
				b9.setText(s);
				b8.setText(" ");
			}//end else if
			else if(b5.getText().equals(" ")) {
				b5.setText(s);
				b8.setText(" ");
			}//end else if
		}//end if
		
		if(e.getSource()==b9) {
			String s = b9.getText();
			if(b6.getText().equals(" ")) {
				b6.setText(s);
				b9.setText(" ");
			}//end nested if
			else if(b8.getText().equals(" ")) {
				b8.setText(s);
				b9.setText(" ");
			}//end else if
			
			//checking for win condition
			if(b1.getText().equals("1")&&b2.getText().equals("2")&&b3.getText().equals("3")&&b4.getText().equals("4")&&b5.getText().equals("5")&&b6.getText().equals("6")&&b7.getText().equals("7")&&b8.getText().equals("8")&&b9.getText().equals(" ")) {
				JOptionPane.showMessageDialog(Puzzle.this, "You Won!\n" + "You made "+counter+" moves!\n Great Job!");
			}//end nested if
		}//end if
		
		counter++;
		counterLabel.setText("Moves: "+ counter);
		
	}//end actionPerformed
	
}//end class

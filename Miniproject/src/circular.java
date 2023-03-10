import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class circular extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField tf1;
	private int cq[];
	private int size;
	private int r = -1;
	private int f = 0;
	private int count = 0;
	//public circular (int n)
	//{
	//	cq=new int [n];
	//	size=cq.length;
	//}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					circular frame = new circular();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public circular() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 444);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(34, 139, 34));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(165, 42, 42));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 17));
		lblNewLabel.setBounds(54, 21, 451, 21);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE");
		lblNewLabel_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(54, 70, 126, 16);
		contentPane.add(lblNewLabel_1);

		sizefield = new JTextField();
		sizefield.setBounds(206, 70, 96, 19);
		contentPane.add(sizefield);
		sizefield.setColumns(10);

		JButton create = new JButton("CREATE C QUEUE");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size = Integer.valueOf(sizefield.getText());
				cq = new int[size];
				String message = " circular queue of size" + size + "created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setForeground(new Color(210, 105, 30));
		create.setFont(new Font("Tahoma", Font.BOLD, 14));
		create.setBounds(143, 113, 155, 25);
		contentPane.add(create);

		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_2.setForeground(new Color(165, 42, 42));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(39, 164, 144, 17);
		contentPane.add(lblNewLabel_2);

		element = new JTextField();
		element.setBounds(219, 165, 96, 19);
		contentPane.add(element);
		element.setColumns(10);

		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int elem;
				if (count == size) {
                String message="insertion not possible";
					JOptionPane.showMessageDialog(contentPane,message);

				} else {
					
					elem = Integer.valueOf(element.getText());
					r = (r + 1) % size;
					cq[r] = elem;
					count++;
					JOptionPane.showMessageDialog(contentPane, "inserted element at position "+r+" is "+cq[r]);
					element.setText("");

				}
				}catch (Exception e1) {
					String s= "Please enter valid input!";
					JOptionPane.showMessageDialog(contentPane, s);
				}
			}
		});
		insert.setForeground(new Color(220, 20, 60));
		insert.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		insert.setBounds(341, 164, 87, 25);
		contentPane.add(insert);

		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// code for display
				String msg="";
				int f1 = f;
				if (count == 0) {
					
					String message="display is not possible";
					JOptionPane.showMessageDialog(contentPane, message);

				} else {
					for (int i = 1; i <= count; i++) {
						
                      msg=msg+" "+cq[f1];
						f1 = (f1+1) % size;
						
					}
					tf1.setText(msg);
				}
			}
		});
		display.setForeground(new Color(255, 105, 180));
		display.setFont(new Font("Tahoma", Font.BOLD, 14));
		display.setBounds(229, 266, 97, 25);
		contentPane.add(display);

		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// codee for delete
				
				if (count == 0) {
					JOptionPane.showMessageDialog(contentPane, "deletion is not possible");

				} else {
					String message = ("element deleted" + cq[f]);
					JOptionPane.showMessageDialog(contentPane, message);

					f=(f+1) % size;
					count--;
				}
			}
		});
		delete.setForeground(new Color(0, 0, 255));
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBounds(228, 204, 87, 25);
		contentPane.add(delete);

		tf1 = new JTextField();
		tf1.setBounds(206, 323, 222, 19);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		JButton btnNewButton = new JButton("RETURN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Home().setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(51, 322, 97, 27);
		contentPane.add(btnNewButton);
	}
}


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Queue extends JFrame {

	private JPanel contentPane;

	private JTextField sizefield;
	private JTextField element;
	private JTextField DisplayBox;
	private int q[];
	private int size;
	private int r = -1;
	private int f = 0;
	public Queue (int size)
	{
		q=new int [size];
		size=q.length;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 451);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("QUEUE DATA STRUCTURE");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Californian FB", Font.BOLD, 16));
		lblNewLabel.setBounds(235, 30, 212, 19);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setBounds(76, 82, 135, 13);
		contentPane.add(lblNewLabel_1);

		sizefield = new JTextField();
		sizefield.setBounds(209, 79, 158, 19);
		contentPane.add(sizefield);
		sizefield.setColumns(10);

		JButton create = new JButton("CREATE QUEUE");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR CREATE QUEUE
				size = Integer.valueOf(sizefield.getText());
				q = new int[size];
				String message = "queue of size" + size + "created";
				JOptionPane.showMessageDialog(contentPane, message);

			}
		});
		create.setForeground(new Color(47, 79, 79));
		create.setFont(new Font("Tahoma", Font.PLAIN, 14));
		create.setBounds(178, 139, 158, 25);
		contentPane.add(create);

		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_2.setForeground(new Color(50, 205, 50));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(58, 200, 132, 16);
		contentPane.add(lblNewLabel_2);

		element = new JTextField();
		element.setBounds(209, 197, 135, 19);
		contentPane.add(element);
		element.setColumns(10);

		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for insert
				 
				if (r == size - 1) {
					String message = ("insertion is not possible");
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else
				{
					int elem = Integer.valueOf(element.getText());

					JOptionPane.showMessageDialog(contentPane, "element is inserted"+q[r]);
					++r;
					q[r] = elem;
					element.setText("");

				}

			}
		});
		insert.setForeground(new Color(85, 107, 47));
		insert.setFont(new Font("Tahoma", Font.BOLD, 13));
		insert.setBounds(401, 199, 113, 25);
		contentPane.add(insert);

		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (r == -1 || f > r) {
					String message="deletion is not possible";
					JOptionPane.showMessageDialog(contentPane, message);

				} else {
					
					String message=" element deleted is"+q[f];
					JOptionPane.showMessageDialog(contentPane, message);
					++f;
					//delete.setText("");
				}
			}
		});
		delete.setForeground(new Color(255, 0, 255));
		delete.setFont(new Font("Tahoma", Font.BOLD, 13));
		delete.setBounds(203, 262, 101, 25);
		contentPane.add(delete);

		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR DISPLAY
				String msg = " ";
				if (r == -1 || f > r) {
					String message = "display not possible";
					JOptionPane.showMessageDialog(contentPane, message);

				} else {
					for (int i = f; i <= r; i++) {
						msg = msg + " " + q[i];
					}
					DisplayBox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(255, 99, 71));
		display.setFont(new Font("Tahoma", Font.BOLD, 13));
		display.setBounds(203, 310, 101, 25);
		contentPane.add(display);

		DisplayBox = new JTextField();
		DisplayBox.setBounds(198, 360, 199, 19);
		contentPane.add(DisplayBox);
		DisplayBox.setColumns(10);
	}
}

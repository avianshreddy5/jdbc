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

public class Stack extends JFrame {

	private JPanel contentPane;

	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top = -1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 475);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 17));
		lblNewLabel.setBounds(129, 28, 209, 21);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ENTER THE STACK SIZE");
		lblNewLabel_1.setForeground(new Color(105, 105, 105));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBounds(79, 76, 154, 13);
		contentPane.add(lblNewLabel_1);

		sizefield = new JTextField();
		sizefield.setBounds(242, 73, 96, 19);
		contentPane.add(sizefield);
		sizefield.setColumns(10);

		JButton create = new JButton("CREATE STACK");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// stack creation code
				size = Integer.valueOf(sizefield.getText());
				s = new int[size];
				String message = "stack of size" + size + "created";
				JOptionPane.showMessageDialog(contentPane, message);

			}
		});
		create.setForeground(new Color(139, 0, 0));
		create.setFont(new Font("Tahoma", Font.PLAIN, 10));
		create.setBounds(170, 129, 103, 21);
		contentPane.add(create);

		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_2.setForeground(new Color(199, 21, 133));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2.setBounds(53, 184, 108, 13);
		contentPane.add(lblNewLabel_2);

		element = new JTextField();
		element.setBounds(188, 181, 96, 19);
		contentPane.add(element);
		element.setColumns(10);

		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// push code
				int elem;
				if (top == size - 1) {
					JOptionPane.showMessageDialog(contentPane, "push not possible");
				}

				else {
					elem = Integer.valueOf(element.getText());
					++top;
					s[top] = elem;
					JOptionPane.showMessageDialog(contentPane, "push successfull");
					element.setText("");

				}

			}
		});
		push.setForeground(new Color(72, 61, 139));
		push.setFont(new Font("Tahoma", Font.BOLD, 10));
		push.setBounds(346, 180, 103, 21);
		contentPane.add(push);

		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// pop code
				if (top == -1) {
					JOptionPane.showMessageDialog(contentPane, "pop not possible");
				} else {
					String message = "elemrnt deleted is" + s[top];
					JOptionPane.showMessageDialog(contentPane, message);
					--top;

				}
			}
		});
		pop.setForeground(new Color(165, 42, 42));
		pop.setFont(new Font("Tahoma", Font.BOLD, 10));
		pop.setBounds(199, 248, 108, 21);
		contentPane.add(pop);

		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// display code
				String msg = " ";
				if (top == -1) {
					JOptionPane.showMessageDialog(contentPane, "display not possible");
				} else {
					for (int i = top; i >= 0; i--) {
						msg = msg + " " + s[i];
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(139, 0, 139));
		display.setFont(new Font("Tahoma", Font.BOLD, 10));
		display.setBounds(188, 300, 77, 21);
		contentPane.add(display);

		displaybox = new JTextField();
		displaybox.setBackground(new Color(100, 149, 237));
		displaybox.setBounds(177, 359, 272, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}

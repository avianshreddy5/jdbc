import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Doublelinkedlist extends JFrame {

	private JPanel contentPane;
	private JTextField element1;
	private JTextField textField;
	private JTextField DISBOX;

	class Node {
		Node prelink;
		int data;
		Node nextlink;

	}

	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doublelinkedlist frame = new Doublelinkedlist();
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
	public Doublelinkedlist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 473);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST");
		lblNewLabel.setBackground(new Color(128, 0, 0));
		lblNewLabel.setForeground(new Color(139, 0, 139));
		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 18));
		lblNewLabel.setBounds(220, 22, 228, 21);
		contentPane.add(lblNewLabel);

		JLabel lbl1 = new JLabel("ENTER THE ELEMENT\r\n");
		lbl1.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 15));
		lbl1.setBounds(10, 99, 193, 18);
		contentPane.add(lbl1);

		JLabel lbl2 = new JLabel("ENTER THE ELEMENT\r\n");
		lbl2.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 15));
		lbl2.setBounds(10, 159, 193, 18);
		contentPane.add(lbl2);

		element1 = new JTextField();
		element1.setBounds(220, 99, 96, 19);
		contentPane.add(element1);
		element1.setColumns(10);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(220, 160, 96, 19);
		contentPane.add(textField);

		JButton inrearbtn = new JButton("INSERT REAR");
		inrearbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// insert rear function
				int elem;
				elem = Integer.valueOf(element1.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.prelink = null;
				newnode.nextlink = null;
				Node temp;

				if (first == null) {
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "element inserted at rear");
					element1.setText("");
				} else {
					temp = first;
					while (temp.nextlink != null) {
						temp = temp.nextlink;
					}
					temp.nextlink = newnode;
					newnode.prelink = temp;
					JOptionPane.showMessageDialog(contentPane, "element inserted at rear");
					element1.setText("");
				}
			}
		});
		inrearbtn.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 15));
		inrearbtn.setBounds(424, 99, 153, 27);
		contentPane.add(inrearbtn);

		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem;
				elem = Integer.valueOf(textField.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.prelink = null;
				newnode.nextlink = null;

				if (first == null) {
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "element inserted at front");
					textField.setText("");
				} else {
					newnode.nextlink = first;
					first.prelink = newnode;
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "element inserted at front");
					textField.setText("");
				}
			}
		});
		insertfront.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 15));
		insertfront.setBounds(424, 159, 167, 27);
		contentPane.add(insertfront);

		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "deletion not possible");
				} else if (first.nextlink == null) {
					JOptionPane.showMessageDialog(contentPane, "element deleted is" + first.data);
					first = null;
				} else {
					first = first.nextlink;
					JOptionPane.showMessageDialog(contentPane, "deleted element at front is" + first.prelink.data);
					first.prelink = null;
				}
			}
		});
		deletefront.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 15));
		deletefront.setBounds(91, 252, 209, 27);
		contentPane.add(deletefront);

		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "deletion not possible");
				} else if (first.nextlink == null) {
					JOptionPane.showMessageDialog(contentPane, "deleted element is" + first.data);
					first = null;
				} else {

					temp = first;
					while (temp.nextlink.nextlink != null) {
						temp = temp.nextlink;
					}
					JOptionPane.showMessageDialog(contentPane, "element deleted is" + temp.nextlink.data);
					temp.nextlink = null;
				}
			}
		});
		deleterear.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 15));
		deleterear.setBounds(424, 252, 199, 27);
		contentPane.add(deleterear);

		JButton disfor = new JButton("DISPLAY FORWARD");
		disfor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				String m = " ";
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
					DISBOX.setText("");
				} else if (first.nextlink == null) {
					m = " " + first.data;
					DISBOX.setText(m);

				} else {
					temp = first;
					while (temp != null) {
						m = m + " " + temp.data;
						DISBOX.setText(m + " ");

						temp = temp.nextlink;
					}

				}

			}
		});
		disfor.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 15));
		disfor.setBounds(91, 314, 209, 27);
		contentPane.add(disfor);

		JButton disrev = new JButton("DISPLAY REVERSE");
		disrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				String m = "";
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "display not possible");
					DISBOX.setText("");
				} else if (first.nextlink == null) {

					m = m + " " + first.data;
					DISBOX.setText(m);

				} else {

					temp = first;
					while (temp.nextlink != null) {
						temp = temp.nextlink;

					}
					while (temp != null) {
						m = m + " " + temp.data;

						temp = temp.prelink;

					}
					DISBOX.setText(m);

				}

			}
		});

		disrev.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 15));
		disrev.setBounds(424, 314, 199, 27);
		contentPane.add(disrev);

		DISBOX = new JTextField();
		DISBOX.setBounds(55, 382, 583, 19);
		contentPane.add(DISBOX);
		DISBOX.setColumns(10);

	}
}
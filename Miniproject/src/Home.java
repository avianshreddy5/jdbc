import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE DATA STRUCTURE");
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		lblNewLabel.setBounds(140, 10, 183, 19);
		contentPane.add(lblNewLabel);
		
		JButton array = new JButton("ARRAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Array
				new Arrays().setVisible(true);		
				}
		});
		array.setForeground(Color.MAGENTA);
		array.setFont(new Font("Tahoma", Font.ITALIC, 12));
		array.setBounds(150, 39, 93, 23);
		contentPane.add(array);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE for queue
				new Queue().setVisible(true);
			}
		});
		queue.setForeground(Color.MAGENTA);
		queue.setFont(new Font("Constantia", Font.PLAIN, 10));
		queue.setBounds(274, 93, 121, 21);
		contentPane.add(queue);
		
		JButton btnNewButton = new JButton("CIRCULAR QUEUE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for circular queue
				new circular().setVisible(true);
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setForeground(new Color(255, 255, 0));
		btnNewButton.setBounds(33, 150, 183, 21);
		contentPane.add(btnNewButton);
		
		JButton btnSingleLinkedList = new JButton("SINGLE LINKED LIST");
		btnSingleLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for sinlgy linked list
				new Singlylinkedlist().setVisible(true);
			
			}
		});
		btnSingleLinkedList.setForeground(new Color(165, 42, 42));
		btnSingleLinkedList.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSingleLinkedList.setBounds(270, 150, 156, 21);
		contentPane.add(btnSingleLinkedList);
		
		JButton doublelinkedlist = new JButton("DOUBLE LINKED LIST");
		doublelinkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Doublelinkedlist().setVisible(true);
			
			}
		});
		doublelinkedlist.setForeground(new Color(0, 255, 255));
		doublelinkedlist.setFont(new Font("Tahoma", Font.PLAIN, 10));
		doublelinkedlist.setBounds(129, 181, 205, 21);
		contentPane.add(doublelinkedlist);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for stack
				new Stack().setVisible(true);
			}
		});
		stack.setForeground(Color.GREEN);
		stack.setBounds(29, 91, 127, 21);
		contentPane.add(stack);
	}
}

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

public class Arrays extends JFrame {

	private JPanel content;
	private JTextField length;
	private JTextField element;
	private JTextField deleteposition;
	private JTextField inserposition;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Arrays frame = new Arrays();
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
	public Arrays() {
		setBackground(new Color(187, 255, 187));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 824, 510);
		content = new JPanel();
		content.setBackground(new Color(255, 255, 168));
		content.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(content);
		content.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Arrays DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(102, 0, 0));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 18));
		lblNewLabel.setBounds(200, 22, 263, 43);
		content.add(lblNewLabel);
		
		JLabel lblEnterArraysLength = new JLabel("ENTER Arrays LENGTH");
		lblEnterArraysLength.setForeground(new Color(202, 0, 202));
		lblEnterArraysLength.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEnterArraysLength.setBounds(39, 80, 181, 17);
		content.add(lblEnterArraysLength);
		
		length = new JTextField();
		length.setBounds(394, 80, 199, 31);
		content.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("CREATE Arrays");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CREATE Arrays CODE
			/*String len=length.getText();
			int l=Integer.valueOf(len);*/
				int len=Integer.valueOf(length.getText());
				arr=new int[len];
				String message="Arrays of length"+len+"Created";
				JOptionPane.showMessageDialog(content, message);
			}
		});
		create.setFont(new Font("Tahoma", Font.PLAIN, 16));
		create.setForeground(new Color(60, 0, 60));
		create.setBounds(188, 139, 199, 31);
		content.add(create);
		
		JLabel lblNewLabel_1 = new JLabel("INSERT AN INTEGER ELEMENTS");
		lblNewLabel_1.setForeground(new Color(64, 0, 128));
		lblNewLabel_1.setBackground(new Color(0, 117, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(27, 221, 249, 17);
		content.add(lblNewLabel_1);
		
		element = new JTextField();
		element.setBounds(264, 215, 199, 31);
		content.add(element);
		element.setColumns(10);
		
		JLabel delete = new JLabel("DELETE POSITION");
		delete.setForeground(new Color(128, 0, 128));
		delete.setFont(new Font("Times New Roman", Font.BOLD, 16));
		delete.setBackground(new Color(0, 117, 0));
		delete.setBounds(39, 289, 215, 20);
		content.add(delete);
		
		deleteposition = new JTextField();
		deleteposition.setColumns(10);
		deleteposition.setBounds(279, 291, 199, 31);
		content.add(deleteposition);
		
		inserposition = new JTextField();
		inserposition.setForeground(new Color(196, 85, 223));
		inserposition.setFont(new Font("Times New Roman", Font.BOLD, 14));
		inserposition.setColumns(10);
		inserposition.setBounds(578, 214, 90, 31);
		content.add(inserposition);
		
		JLabel lblPosition = new JLabel(" POSITION");
		lblPosition.setForeground(new Color(64, 128, 128));
		lblPosition.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPosition.setBackground(new Color(0, 117, 0));
		lblPosition.setBounds(469, 219, 113, 20);
		content.add(lblPosition);
		
		JButton delet1 = new JButton("DELETE");
		delet1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR DELEYION
				int pos=Integer.valueOf(deleteposition.getText());
				arr[pos]=0;
				String message="Element deleted @ the position"+pos;
				JOptionPane.showConfirmDialog(content, message);
				deleteposition.setText("");
				
			}
		});
		delet1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		delet1.setBounds(551, 285, 100, 28);
		content.add(delet1);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR DISPLAY
				String msg="";
				for(int i=0;i<=arr.length-1;i++)
				{
				msg=msg+" "+arr[i];
				}
			displaybox.setText(msg);
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 18));
		display.setBounds(279, 418, 162, 31);
		content.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(478, 421, 297, 24);
		content.add(displaybox);
		displaybox.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR INSERTION
				try {
				int elem=Integer.valueOf(element.getText());
				int pos=Integer.valueOf(inserposition.getText());
				arr[pos]=elem;
				String message="Element"+elem+"inserted @ position"+pos;
				JOptionPane.showMessageDialog(content, message);
				element.setText("");
				inserposition.setText("");
			}catch (Exception e1) {
				String s= "Please enter valid input!";
				JOptionPane.showMessageDialog(getContentPane(), s);
			}	
			}
		});
		insert.setForeground(new Color(45, 255, 45));
		insert.setFont(new Font("Times New Roman", Font.BOLD, 16));
		insert.setBounds(700, 214, 100, 31);
		content.add(insert);
	
}
}


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
import javax.swing.ImageIcon;

public class Singlylinkedlist extends JFrame {
	class Node{
		int data;
		Node link;
	}

	private JPanel contentPane;
	private JTextField elementrear;
	private JTextField elementfront;
	private JTextField result;
	private Node first;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Singlylinkedlist frame = new Singlylinkedlist();
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
	public Singlylinkedlist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 812, 530);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(119, 136, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Singlylinkedlist LINKED LIST DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(216, 30, 500, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_1.setForeground(new Color(172, 36, 206));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblNewLabel_1.setBounds(23, 118, 185, 20);
		contentPane.add(lblNewLabel_1);
		
		elementrear = new JTextField();
		elementrear.setBackground(new Color(192, 192, 192));
		elementrear.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		elementrear.setBounds(257, 120, 152, 19);
		contentPane.add(elementrear);
		elementrear.setColumns(10);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.setBackground(new Color(255, 128, 0));
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for insertion rear
				Node temp;
			int	elem=Integer.valueOf(elementrear.getText());
			String msg="ELEMENT INSERTED AT REAR IS "+elem;
			JOptionPane.showMessageDialog(contentPane, msg);
			elementrear.setText("");
			Node newnode=new Node();
			newnode.data=elem;
			newnode.link=null;
				
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					temp=first;
					while(temp.link!=null)
					{
						temp=temp.link;
					}
					temp.link=newnode;
					
				}
			}
		});
		insertrear.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		insertrear.setBounds(489, 114, 160, 29);
		contentPane.add(insertrear);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_1_1.setForeground(new Color(172, 36, 206));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblNewLabel_1_1.setBounds(23, 173, 185, 20);
		contentPane.add(lblNewLabel_1_1);
		
		elementfront = new JTextField();
		elementfront.setBackground(new Color(192, 192, 192));
		elementfront.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		elementfront.setColumns(10);
		elementfront.setBounds(257, 175, 142, 19);
		contentPane.add(elementfront);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.setBackground(new Color(255, 128, 0));
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insertfront code
				int elem=Integer.valueOf(elementfront.getText());
				String msg="ELEMENT INSERTED AT FRONT END IS "+elem;
				JOptionPane.showMessageDialog(contentPane, msg);
				elementfront.setText("");
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					newnode.link=first;
					first=newnode;
				}
			}
		});
		insertfront.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		insertfront.setBounds(489, 169, 160, 29);
		contentPane.add(insertfront);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.setBackground(new Color(255, 128, 0));
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "DELETION NOT POSSIBLE");
				}
				if(first.link==null)
				{
					JOptionPane.showMessageDialog(contentPane, "ELEMENT DELETED IS "+first.data);
					first=null;
				}
				else
				{
					temp=first;
					while(temp.link.link!=null)
					{
						temp=temp.link;
					}
					JOptionPane.showMessageDialog(contentPane, "ELEMENT DELETED IS "+temp.link.data);
					temp.link=null;
				}
			}
		});
		deleterear.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		deleterear.setBounds(302, 235, 160, 29);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.setBackground(new Color(255, 128, 0));
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//deletion of front code
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "DELETION NOT POSSIBLE");
				}
				if(first.link==null)
				{
					JOptionPane.showMessageDialog(contentPane, "ELEMENT DELETED IS "+first.data);
					first=null;
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "ELEMENT DELETED IS"+first.data);
					first=first.link;
				}
			}
		});
		deletefront.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		deletefront.setBounds(302, 295, 160, 29);
		contentPane.add(deletefront);
		
		JButton display = new JButton("DISPLAY");
		display.setBackground(new Color(255, 128, 0));
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "DISPLAY NOT POSSIBLE");
					result.setText("");
				}
				else if(first.link==null)
				{
					msg=msg+" "+first.data;
					result.setText(msg);
				}
				else
				{
					temp=first;
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						result.setText(msg);
						temp=temp.link;
					}
				}
			}
		});
		display.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		display.setBounds(302, 353, 160, 29);
		contentPane.add(display);
		
		result = new JTextField();
		result.setBackground(new Color(192, 192, 192));
		result.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		result.setColumns(10);
		result.setBounds(232, 428, 332, 35);
		contentPane.add(result);
		
		JButton HOME = new JButton("BACK");
		HOME.setBackground(new Color(255, 128, 0));
		HOME.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Home().setVisible(true);
			}
		});
		HOME.setIcon(new ImageIcon("C:\\Users\\Yashawant\\Downloads\\HOME.png"));
		HOME.setBounds(618, 428, 96, 33);
		contentPane.add(HOME);
	}
}
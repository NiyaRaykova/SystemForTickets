import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormApplication extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	WriteInFile infoUser;
	public FormApplication() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\\u043D\u0438\u044F\\workspace\\SystemForTickets2\\src\\resources\\movie_icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
	
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>\u0412\u044A\u0432\u0435\u0434\u0435\u0442\u0435 \u0434\u0430\u043D\u043D\u0438\u0442\u0435 \u0441\u0438, \u0437\u0430 \u0434\u0430 \u043F\u043E\u043B\u0443\u0447\u0438\u0442\u0435 \u0440\u0430\u0437\u043F\u0438\u0441\u043A\u0430 \u0437\u0430 \u0437\u0430\u043A\u0443\u043F\u0435\u043D\u0438\u0442\u0435 \u0431\u0438\u043B\u0435\u0442\u0438 (\u0432\u0441\u0438\u0447\u043A\u0438 \u043F\u043E\u043B\u0435\u0442\u0430 \u0441\u0430 \u0437\u0430\u0434\u044A\u043B\u0436\u0438\u0442\u0435\u043B\u043D\u0438)</html>");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 414, 65);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\u0418\u043C\u0435");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(91, 117, 71, 28);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0424\u0430\u043C\u0438\u043B\u0438\u044F");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(91, 156, 71, 20);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u0410\u0434\u0440\u0435\u0441");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(91, 200, 71, 17);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(172, 123, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(172, 200, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(172, 158, 86, 20);
		contentPane.add(textField_2);
		
		JButton button = new JButton("\u041F\u043E\u043B\u0443\u0447\u0438 \u0431\u0438\u043B\u0435\u0442");
		button.setForeground(Color.BLACK);
		button.setBounds(278, 239, 131, 42);
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().length() == 0 && (button.isEnabled())){
					JOptionPane.showMessageDialog(null, "Моля попълнете първото си име.");
				}
				if(textField_1.getText().length() == 0 && (button.isEnabled())){
					JOptionPane.showMessageDialog(null, "Моля попълнете адреса си.");
				}
				if(textField_2.getText().length() == 0 && (button.isEnabled())){
					JOptionPane.showMessageDialog(null, "Моля попълнете фамилията си.");
				} else {
				     infoUserTF();
				     
				}
				
			}
			
		}
				);
		contentPane.add(button);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\\u043D\u0438\u044F\\workspace\\SystemForTickets2\\src\\resources\\icap-bg.jpg"));
		lblNewLabel_1.setBounds(0, 0, 434, 311);
		contentPane.add(lblNewLabel_1);
	}
	public void infoUserTF(){
		infoUser = new WriteInFile("UserInformation");
		infoUser.write("Име:" + textField.getText());
		infoUser.write("Фамилия:" + textField_1.getText());
		infoUser.write("Адрес:" + textField_2.getText());
		infoUser.closeFile();
	}
}

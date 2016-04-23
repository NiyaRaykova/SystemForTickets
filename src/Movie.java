import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Movie extends JFrame {
	 String name;
     String genre;
     int time;
     String actors;
     String director;
     DataChooser dataSystem;
     private JPanel contentPane;
	public Movie(String name,String genre, int time, String actors, String director) {
		
		this.name = name;
		this.genre = genre;
		this.time = time;
		this.actors = actors;
		this.director = director;
		initBatmanVsSuperman();
		initFilmWarHorse();
		initFilmDeadpool();
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void initFilmWarHorse(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 590);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\\u043D\u0438\u044F\\workspace\\SystemForTickets2\\src\\resources\\tva trqq da e.jpg"));
		lblNewLabel.setBounds(34, 11, 328, 389);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html>\u201E\u0411\u043E\u0435\u043D \u043A\u043E\u043D\u201D \u0440\u0430\u0437\u043A\u0430\u0437\u0432\u0430 \u0438\u0441\u0442\u043E\u0440\u0438\u044F\u0442\u0430 \u043D\u0430 \u043C\u043B\u0430\u0434\u0438\u044F \u0410\u043B\u0431\u044A\u0440\u0442 (\u0414\u0436\u0435\u0440\u0435\u043C\u0438 \u042A\u0440\u0432\u0430\u0439\u043D) \u0438 \u043D\u0435\u0433\u043E\u0432\u0438\u044F \u043A\u043E\u043D \u0414\u0436\u043E\u0443\u0438. \u0421\u0438\u043B\u043D\u0430\u0442\u0430 \u0432\u0440\u044A\u0437\u043A\u0430 \u043F\u043E\u043C\u0435\u0436\u0434\u0443 \u0438\u043C \u0435 \u043F\u0440\u0435\u043A\u044A\u0441\u043D\u0430\u0442\u0430, \u043A\u043E\u0433\u0430\u0442\u043E \u0414\u0436\u043E\u0443\u0438 \u0435 \u043F\u0440\u043E\u0434\u0430\u0434\u0435\u043D \u043D\u0430 \u043A\u0430\u0432\u0430\u043B\u0435\u0440\u0438\u044F\u0442\u0430 \u0438 \u0435 \u0438\u0437\u043F\u0440\u0430\u0442\u0435\u043D \u0432 \u043E\u043A\u043E\u043F\u0438\u0442\u0435 \u043D\u0430 \u041F\u044A\u0440\u0432\u0430\u0442\u0430 \u0441\u0432\u0435\u0442\u043E\u0432\u043D\u0430 \u0432\u043E\u0439\u043D\u0430.\r\n\r\n\u0412\u044A\u043F\u0440\u0435\u043A\u0438 \u0447\u0435 \u0435 \u043F\u0440\u0435\u043A\u0430\u043B\u0435\u043D\u043E \u043C\u043B\u0430\u0434, \u0410\u043B\u0431\u044A\u0440\u0442 \u0441\u0435 \u043E\u0442\u043F\u0440\u0430\u0432\u044F \u0437\u0430 \u0424\u0440\u0430\u043D\u0446\u0438\u044F, \u0437\u0430 \u0434\u0430 \u0441\u043F\u0430\u0441\u0438 \u043F\u0440\u0438\u044F\u0442\u0435\u043B\u044F \u0441\u0438.</html> \r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		lblNewLabel_1.setBounds(296, 28, 328, 342);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u0412\u0420\u0415\u041C\u0415\u0422\u0420\u0410\u0415\u041D\u0415\r\n");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(34, 411, 105, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u0420\u0415\u0416\u0418\u0421\u042C\u041E\u0420\r\n");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(34, 443, 77, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u0416\u0410\u041D\u0420\r\n");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(315, 411, 77, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u0410\u041A\u0422\u042C\u041E\u0420\u0418");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(315, 443, 77, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel label = new JLabel("147 \u043C\u0438\u043D\u0443\u0442\u0438\r\n");
		label.setBounds(149, 411, 97, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0421\u0442\u0438\u0432\u044A\u043D \u0421\u043F\u0438\u043B\u0431\u044A\u0440\u0433");
		label_1.setBounds(149, 443, 99, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u0414\u0440\u0430\u043C\u0430");
		label_2.setBounds(436, 411, 145, 14);
		contentPane.add(label_2);
		
		JLabel lblNewLabel_6 = new JLabel("<html>\u0422\u043E\u043C \u0425\u0438\u0434\u044A\u043B\u0441\u043E\u043D, \u0411\u0435\u043D\u0435\u0434\u0438\u043A\u0442 \u041A\u044A\u043C\u0431\u0435\u0440\u0431\u0430\u0447, \u0415\u043C\u0438\u043B\u0438 \u0423\u043E\u0442\u0441\u044A\u043D, \u0422\u043E\u0431\u0438 \u041A\u0435\u0431\u0435\u043B, \u0414\u0435\u0439\u0432\u0438\u0434 \u0422\u044E\u043B\u0438\u0441</html>");
		lblNewLabel_6.setBounds(432, 422, 164, 84);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("\u041A\u0443\u043F\u0438 \u0431\u0438\u043B\u0435\u0442\u0438\r\n");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(206, 493, 145, 47);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton){
				    dataSystem = new DataChooser();
					dataSystem.setVisible(true);
				}
			}
		});
		contentPane.add(btnNewButton);
		
    }
    public void initFilmDeadpool(){
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 590);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\\u043D\u0438\u044F\\workspace\\SystemForTickets2\\src\\resources\\Deadpool_poster.jpg"));
		lblNewLabel.setBounds(20, 11, 288, 359);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html>\u0411\u0430\u0437\u0438\u0440\u0430\u043D \u043D\u0430 \u043D\u0430\u0439-\u043D\u0435\u0441\u0442\u0430\u043D\u0434\u0430\u0440\u0442\u043D\u0438\u044F \u0430\u043D\u0442\u0438\u0433\u0435\u0440\u043E\u0439 \u043D\u0430 Marvel Comics, \u0414\u0415\u0414\u041F\u0423\u041B \u0440\u0430\u0437\u043A\u0430\u0437\u0432\u0430 \u0438\u0441\u0442\u043E\u0440\u0438\u044F\u0442\u0430 \u0437\u0430 \u043F\u0440\u043E\u0438\u0437\u0445\u043E\u0434\u0430 \u043D\u0430 \u0431\u0438\u0432\u0448\u0438\u044F \u0430\u0433\u0435\u043D\u0442 \u043D\u0430 \u0421\u043F\u0435\u0446\u0438\u0430\u043B\u043D\u0438\u0442\u0435 \u0447\u0430\u0441\u0442\u0438, \u043F\u0440\u0435\u0432\u044A\u0440\u043D\u0430\u043B \u0441\u0435 \u0432 <BR>\u043D\u0430\u0435\u043C\u0435\u043D \u0443\u0431\u0438\u0435\u0446 - \u0423\u0435\u0439\u0434 \u0423\u0438\u043B\u0441\u044A\u043D. \u0418\u0437\u043C\u0430\u043C\u0435\u043D \u0432\u043E\u0435\u043D\u0435\u043D \u0435\u043A\u0441\u043F\u0435\u0440\u0438\u043C\u0435\u043D\u0442 \u0433\u043E \u043E\u0431\u0435\u0437\u043E\u0431\u0440\u0430\u0437\u044F\u0432\u0430, \u043D\u043E \u043C\u0443 \u0434\u0430\u0432\u0430 \u0441\u0438\u043B\u0430\u0442\u0430 \u0441\u0432\u0435\u0442\u043A\u0430\u0432\u0438\u0447\u043D\u043E \u0434\u0430 \u0441\u0435 \u0440\u0435\u0433\u0435\u043D\u0435\u0440\u0438\u0440\u0430 \u0438 \u0442\u043E\u0439 \u043F\u0440\u0438\u0435\u043C\u0430 \u0430\u043B\u0442\u0435\u0440 \u0435\u0433\u043E\u0442\u043E \u0414\u0435\u0434\u043F\u0443\u043B. \u0412\u044A\u043E\u0440\u044A\u0436\u0435\u043D \u0441 \u043D\u043E\u0432\u0438\u0442\u0435 \u0441\u0438 \u0441\u043F\u043E\u0441\u043E\u0431\u043D\u043E\u0441\u0442\u0438 \u0438, \u0438\u0437\u0432\u0440\u0430\u0442\u0435\u043D\u043E \u0447\u0443\u0432\u0441\u0442\u0432\u043E \u0437\u0430 \u0445\u0443\u043C\u043E\u0440, \u0414\u0435\u0434\u043F\u0443\u043B \u0441\u0435 \u0432\u043F\u0443\u0441\u043A\u0430 \u0432 \u043F\u0440\u0435\u0441\u043B\u0435\u0434\u0432\u0430\u043D\u0435 \u043D\u0430 \u0447\u043E\u0432\u0435\u043A\u0430, \u043A\u043E\u0439\u0442\u043E \u043F\u043E\u0447\u0442\u0438 \u0435 \u0440\u0430\u0437\u0440\u0443\u0448\u0438\u043B \u0436\u0438\u0432\u043E\u0442\u0430 \u043C\u0443.<BR>\r\n\u0414\u0435\u0434\u043F\u0443\u043B \u0435 \u0443\u043D\u0438\u043A\u0430\u043B\u043D\u0430 \u0444\u0438\u0433\u0443\u0440\u0430 \u0432\u044A\u0432 \u0412\u0441\u0435\u043B\u0435\u043D\u0430\u0442\u0430 \u043D\u0430 Marvel, \u043F\u0440\u0438\u0442\u0435\u0436\u0430\u0432\u0430\u0449\u0430 \u043D\u0435 \u043E\u0441\u043E\u0431\u0435\u043D\u043E \u0442\u0438\u043F\u0438\u0447\u043D\u0430 \u0437\u0430 \u0441\u0443\u043F\u0435\u0440 \u0433\u0435\u0440\u043E\u0439 \u043D\u0430\u0433\u043B\u0430\u0441\u0430. \u0422\u043E\u0439 \u044F\u0437\u0432\u0438\u0442\u0435\u043B\u043D\u043E \u043A\u043E\u043D\u0442\u0440\u0430\u0441\u0442\u0438\u0440\u0430 \u0441 \u0438\u0434\u0435\u0430\u043B\u0438\u0437\u0438\u0440\u0430\u043D\u0438\u0442\u0435 \u0433\u0435\u0440\u043E\u0438 \u0438 \u0437\u043B\u043E\u0434\u0435\u0438, \u043A\u043E\u0438\u0442\u043E \u043D\u0430\u0441\u0435\u043B\u044F\u0432\u0430\u0442 \u0434\u0440\u0443\u0433\u0438\u0442\u0435 \u043A\u043E\u043C\u0438\u043A\u0441\u0438 \u043D\u0430 Marvel. \u0414\u0435\u0434\u043F\u0443\u043B \u0441 \u043F\u043E\u0432\u0435\u0434\u0435\u043D\u0438\u0435\u0442\u043E \u0441\u0438 \u0438 \u043D\u0435\u043F\u0440\u0438\u043B\u0438\u0447\u0435\u043D \u0440\u0435\u0447\u043D\u0438\u043A \u0440\u0430\u0437\u0447\u0443\u043F\u0432\u0430 \u0441\u0442\u0430\u043D\u0434\u0430\u0440\u0442\u043D\u0438\u0442\u0435 \u0440\u0430\u043C\u043A\u0438..</html> \r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		lblNewLabel_1.setBounds(296, 28, 328, 342);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u0412\u0420\u0415\u041C\u0415\u0422\u0420\u0410\u0415\u041D\u0415\r\n");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(34, 411, 105, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u0420\u0415\u0416\u0418\u0421\u042C\u041E\u0420\r\n");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(34, 443, 77, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u0416\u0410\u041D\u0420\r\n");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(315, 411, 77, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u0410\u041A\u0422\u042C\u041E\u0420\u0418");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(315, 443, 77, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel label = new JLabel("110 \u043C\u0438\u043D\u0443\u0442\u0438");
		label.setBounds(149, 411, 97, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0422\u0438\u043C \u041C\u0438\u043B\u044A\u0440");
		label_1.setBounds(149, 443, 99, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u0415\u043A\u0448\u044A\u043D - \u0424\u0435\u043D\u0442\u044A\u0437\u0438");
		label_2.setBounds(436, 411, 145, 14);
		contentPane.add(label_2);
		
		JLabel lblNewLabel_6 = new JLabel("<html>\u0415\u0434 \u0421\u043A\u0440\u0435\u0439\u043D, \u041C\u043E\u0440\u0435\u043D\u0430 \u0411\u0430\u043A\u0430\u0440\u0438\u043D, \u0422\u0438 \u0414\u0436\u0435\u0439 \u041C\u0438\u043B\u044A\u0440, \u0414\u0436\u0438\u043D\u0430 \u041A\u0430\u0440\u0430\u043D\u043E, \u0420\u0430\u0439\u044A\u043D \u0420\u0435\u0439\u043D\u043E\u043B\u0434\u0441</html>\r\n\r\n");
		lblNewLabel_6.setBounds(436, 443, 161, 62);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("\u041A\u0443\u043F\u0438 \u0431\u0438\u043B\u0435\u0442\u0438\r\n");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(206, 493, 145, 47);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton){
					 dataSystem = new DataChooser();
					dataSystem.setVisible(true);
				}
			}
		});
		contentPane.add(btnNewButton);
    	    
    }
	public void initBatmanVsSuperman(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 650, 590);
			setVisible(true);
			contentPane = new JPanel();
			contentPane.setBackground(Color.GRAY);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\\u043D\u0438\u044F\\workspace\\SystemForTickets2\\src\\resources\\Batman_v_Superman_poster.jpg"));
			lblNewLabel.setBounds(20, 11, 288, 359);
			contentPane.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("<html>\u041F\u0440\u0438\u0442\u0435\u0441\u043D\u0435\u043D, \u0447\u0435 \u0434\u0435\u0439\u0441\u0442\u0432\u0438\u044F\u0442\u0430 \u043D\u0430 \u0431\u043E\u0433\u043E\u043F\u043E\u0434\u043E\u0431\u043D\u0438\u044F \u0441\u0443\u043F\u0435\u0440\u0433\u0435\u0440\u043E\u0439 \u043C\u043E\u0433\u0430\u0442 \u0434\u0430 \u0438\u0437\u043B\u044F\u0437\u0430\u0442 \u043E\u0442 \u043A\u043E\u043D\u0442\u0440\u043E\u043B, \u0441\u0438\u043B\u043D\u0438\u044F\u0442 \u0438 \u0441\u0442\u0440\u0430\u0445\u043E\u0432\u0438\u0442 \u0437\u0430\u0449\u0438\u0442\u043D\u0438\u043A \u043D\u0430 \u0413\u043E\u0442\u044A\u043C \u0421\u0438\u0442\u0438 \u0441\u0435 \u043A\u043E\u043D\u0444\u0440\u043E\u043D\u0442\u0438\u0440\u0430 \u0441 \u043D\u0430\u0439-\u043F\u043E\u0447\u0438\u0442a\u043D\u0438\u044F, \u0441\u044A\u0432\u0440\u0435\u043C\u0435\u043D\u0435\u043D \u0441\u043F\u0430\u0441\u0438\u0442\u0435\u043B \u043D\u0430 \u041C\u0435\u0442\u0440\u043E\u043F\u043E\u043B\u0438\u0441, \u0434\u043E\u043A\u0430\u0442\u043E \u0441\u0432\u0435\u0442\u044A\u0442 \u0441\u0435 \u043A\u043E\u043B\u0435\u0431\u0430\u0435 \u043E\u0442 \u043A\u0430\u043A\u044A\u0432 \u0433\u0435\u0440\u043E\u0439 \u043D\u0430\u0438\u0441\u0442\u0438\u043D\u0430 \u0438\u043C\u0430 \u043D\u0443\u0436\u0434\u0430. \u0418 \u0434\u043E\u043A\u0430\u0442\u043E \u0411\u0430\u0442\u043C\u0430\u043D \u0438 \u0421\u0443\u043F\u0435\u0440\u043C\u0435\u043D \u043C\u0435\u0440\u044F\u0442 \u0441\u0438\u043B\u0438, \u0441\u0435 \u043D\u0430\u0434\u0438\u0433\u0430 \u0435\u0434\u043D\u0430 \u043D\u043E\u0432\u0430 \u043D\u0435\u0441\u0440\u0430\u0432\u043D\u0438\u043C\u0430 \u0437\u0430\u043F\u043B\u0430\u0445\u0430, \u043A\u043E\u044F\u0442\u043E \u0449\u0435 \u043F\u043E\u0441\u0442\u0430\u0432\u0438 \u043F\u043E\u0434 \u0443\u0433\u0440\u043E\u0437\u0430 \u0441\u044A\u0449\u0435\u0441\u0442\u0432\u0443\u0432\u0430\u043D\u0435\u0442\u043E \u043D\u0430 \u0447\u043E\u0432\u0435\u0447\u0435\u0441\u0442\u0432\u043E\u0442\u043E.</html> \r\n");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			
			lblNewLabel_1.setBounds(296, 28, 328, 342);
			contentPane.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("\u0412\u0420\u0415\u041C\u0415\u0422\u0420\u0410\u0415\u041D\u0415\r\n");
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_2.setBounds(34, 411, 105, 14);
			contentPane.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("\u0420\u0415\u0416\u0418\u0421\u042C\u041E\u0420\r\n");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_3.setForeground(Color.WHITE);
			lblNewLabel_3.setBounds(34, 443, 77, 14);
			contentPane.add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("\u0416\u0410\u041D\u0420\r\n");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_4.setForeground(Color.WHITE);
			lblNewLabel_4.setBounds(315, 411, 77, 14);
			contentPane.add(lblNewLabel_4);
			
			JLabel lblNewLabel_5 = new JLabel("\u0410\u041A\u0422\u042C\u041E\u0420\u0418");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_5.setForeground(Color.WHITE);
			lblNewLabel_5.setBounds(315, 443, 77, 14);
			contentPane.add(lblNewLabel_5);
			
			JLabel label = new JLabel("150 \u043C\u0438\u043D\u0443\u0442\u0438");
			label.setBounds(149, 411, 97, 14);
			contentPane.add(label);
			
			JLabel label_1 = new JLabel("\u0417\u0430\u043A \u0421\u043D\u0430\u0439\u0434\u0435\u0440");
			label_1.setBounds(149, 443, 99, 14);
			contentPane.add(label_1);
			
			JLabel label_2 = new JLabel("\u0415\u043A\u0448\u044A\u043D - \u041F\u0440\u0438\u043A\u043B\u044E\u0447\u0435\u043D\u0441\u043A\u0438\r\n");
			label_2.setBounds(436, 411, 145, 14);
			contentPane.add(label_2);
			
			JLabel lblNewLabel_6 = new JLabel("<html>\u0414\u0436\u0435\u0439\u0441\u044A\u043D \u041C\u043E\u043C\u043E\u0430, \u0415\u0439\u043C\u0438 \u0410\u0434\u0430\u043C\u0441, \u0425\u0435\u043D\u0440\u0438 \u041A\u0430\u0432\u0438\u043B, \u0414\u0436\u0435\u0444\u0440\u0438 \u0414\u0438\u0439\u043D \u041C\u043E\u0440\u0433\u0430\u043D, \u0411\u0435\u043D \u0410\u0444\u043B\u0435\u043A</html>\r\n\r\n");
			lblNewLabel_6.setBounds(436, 443, 161, 62);
			contentPane.add(lblNewLabel_6);
			
			JButton btnNewButton = new JButton("\u041A\u0443\u043F\u0438 \u0431\u0438\u043B\u0435\u0442\u0438\r\n");
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnNewButton.setForeground(Color.BLACK);
			btnNewButton.setBounds(206, 493, 145, 47);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(e.getSource() == btnNewButton){
						 dataSystem = new DataChooser();
						dataSystem.setVisible(true);
					}
				}
			});
			contentPane.add(btnNewButton);
			
			JLabel lblNewLabel_7 = new JLabel("New label");
			lblNewLabel_7.setText("Today is: " + " " + new Date().toString()); 
			lblNewLabel_7.setBounds(366, 309, 231, 14);
			contentPane.add(lblNewLabel_7);
			
	}
	
	
}

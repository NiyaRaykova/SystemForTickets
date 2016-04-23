import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CinemaChoose extends JFrame {

	private JPanel contentPane;
	private JButton btnDeadpool;
	private JButton btnBatmanVsSuperman;
	private JButton btnWarHorse;
	Movie deadpool; 
	Movie warHorse;
	Movie BatmanVsSuperman;
	WriteInFile textFile;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CinemaChoose frame = new CinemaChoose();
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
	public CinemaChoose() {
		textFile = new WriteInFile("ticketForFilm");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\\u043D\u0438\u044F\\workspace\\SystemForTickets2\\src\\resources\\movie_icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(800,664);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon icon = new ImageIcon("C:\\Users\\\u043D\u0438\u044F\\workspace\\SystemForTickets2\\src\\resources\\Deadpool-Poster-Dec1st.jpg");
		  Image img = icon.getImage() ;  
		   Image newimg = img.getScaledInstance( 23, 23,  java.awt.Image.SCALE_SMOOTH ) ;  
		   icon = new ImageIcon( newimg );
		initJButtons();
		addBtnProperties();
		
	}
	
	public void initJButtons(){
		
	    btnWarHorse = new JButton("");
		btnWarHorse.setIcon(new ImageIcon("C:\\Users\\\u043D\u0438\u044F\\workspace\\SystemForTickets2\\src\\resources\\28FdskXalzOK0kEirQkmTRpnqR0.png"));
		btnWarHorse.setBounds(536, 24, 169, 236);
		contentPane.add(btnWarHorse);
		
	    btnBatmanVsSuperman = new JButton("");
		btnBatmanVsSuperman.setIcon(new ImageIcon("C:\\Users\\\u043D\u0438\u044F\\workspace\\SystemForTickets2\\src\\resources\\2016-04-01-1459488050-1567099-bvs.png"));
		btnBatmanVsSuperman.setBounds(319, 24, 169, 236);
		contentPane.add(btnBatmanVsSuperman);
		
	    btnDeadpool = new JButton("");
		btnDeadpool.setIcon(new ImageIcon("C:\\Users\\\u043D\u0438\u044F\\workspace\\SystemForTickets2\\src\\resources\\james-gunn-explains-why-deadpool-made-so-much-money-844407.png"));
		btnDeadpool.setBounds(104, 24, 169, 236);
		contentPane.add(btnDeadpool);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\\u043D\u0438\u044F\\workspace\\SystemForTickets2\\src\\resources\\11949934-movie-hall-with-red-seats-and-blank-screen-vector-background.jpg"));
		lblNewLabel.setBounds(0, 0, 784, 625);
		contentPane.add(lblNewLabel);
	}
	public void addBtnProperties(){
		btnWarHorse.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if ((e.getSource() == btnWarHorse)) {
				    warHorse = new Movie("War Horse","Драма",147,"Том Хидълстън и др.","Стивън Спилбърг");
					warHorse.initFilmWarHorse();
					textFile.write("Името на филма:" + "War Horse");
					textFile.write("Прожекцията:" + warHorse.getTime());
					textFile.closeFile();
					
				}
			}
		});
		btnDeadpool.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if ((e.getSource() == btnDeadpool)) {
				    deadpool = new Movie("Deadpool","екшън",109,"Ед Скрейн и др.","Тим Милър");
					deadpool.initFilmDeadpool();
					textFile.write("Името на филма:" + "Deadpool");
					textFile.write("Прожекцията:" + deadpool.getTime());
					textFile.closeFile();
					
					
				}
			}
		});
		btnBatmanVsSuperman.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if ((e.getSource() == btnBatmanVsSuperman)) {
				    BatmanVsSuperman = new Movie("Батман срещу Супермен","екшън",199,"Бен Афлек и др.","Зак Снайдър");
					BatmanVsSuperman.initBatmanVsSuperman();
					textFile.write("Името на филма:" + "Batman Vs Superman");
					textFile.write("Прожекцията:" + BatmanVsSuperman.getTime());
					textFile.closeFile();
					
					
				}
			}
		});
	}
	 
}


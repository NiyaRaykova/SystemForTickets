import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class SystemForTickets extends JFrame {

	private JPanel contentPane;
	private int money;
	private int tickets;
	private int priceTicket;
	private JLabel lblTickets;
	private JLabel lblMoney;
	WriteInFile writerTicket;
	public SystemForTickets() {
		writerTicket = new WriteInFile("BookSeat.txt");
		setTitle("Booking System");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Desktop\\film_creative_minimalism_photography_sample_frames_74358_2048x1152.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530,600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("\u041C\u043E\u043B\u044F,\r\n \u0438\u0437\u0431\u0435\u0440\u0435\u0442\u0435 \u0441\u0438 \u043C\u0435\u0441\u0442\u0430");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel.setBounds(71, 11, 381, 38);
		contentPane.add(lblNewLabel);
	    lblTickets = new JLabel("");
	    lblTickets.setForeground(Color.WHITE);
	    lblTickets.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTickets.setBounds(177, 60, 36, 20);
		lblTickets.setText(tickets + "");
		contentPane.add(lblTickets);
		priceTicket = 8;
	    lblMoney = new JLabel("");
	    lblMoney.setForeground(Color.WHITE);
	    lblMoney.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMoney.setBounds(223, 60, 46, 20);
		lblMoney.setText(money + "");
		contentPane.add(lblMoney);
		init88Buttons();
	}
    public void init88Buttons(){
		
		JButton button_12 = new JButton("");
		button_12.setBackground(Color.GREEN);
		button_12.setBounds(71, 143, 24, 23);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_12) {
					button_12.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("");
		button_13.setBackground(Color.GREEN);
		button_13.setBounds(71, 177, 24, 23);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_13) {
					button_13.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("");
		button_14.setBackground(Color.GREEN);
		button_14.setBounds(71, 211, 24, 23);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_14) {
					button_14.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("");
		button_15.setBackground(Color.GREEN);
		button_15.setBounds(71, 245, 24, 23);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_15) {
					button_15.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("");
		button_16.setBackground(Color.GREEN);
		button_16.setBounds(71, 279, 24, 23);
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_16) {
					button_16.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_16);
		
		JButton button_17 = new JButton("");
		button_17.setBackground(Color.GREEN);
		button_17.setBounds(71, 315, 24, 23);
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_17) {
					button_17.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_17);
		
		JButton button_18 = new JButton("");
		button_18.setBackground(Color.GREEN);
		button_18.setBounds(71, 349, 24, 23);
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_18) {
					button_18.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_18);
		
		JButton button_19 = new JButton("");
		button_19.setBackground(Color.GREEN);
		button_19.setBounds(105, 349, 24, 23);
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_19) {
					button_19.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_19);
		
		JButton button_20 = new JButton("");
		button_20.setBackground(Color.GREEN);
		button_20.setBounds(105, 315, 24, 23);
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_20) {
					button_20.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_20);
		
		JButton button_21 = new JButton("");
		button_21.setBackground(Color.GREEN);
		button_21.setBounds(105, 279, 24, 23);
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_21) {
					button_21.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_21);
		
		
		JButton button_22 = new JButton("");
		button_22.setBackground(Color.GREEN);
		button_22.setBounds(105, 245, 24, 23);
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_22) {
					button_22.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_22);
		
		JButton button_23 = new JButton("");
		button_23.setBackground(Color.GREEN);
		button_23.setBounds(105, 211, 24, 23);
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_23) {
					button_23.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_23);
		
		JButton button_24 = new JButton("");
		button_24.setBackground(Color.GREEN);
		button_24.setBounds(105, 177, 24, 23);
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_24) {
					button_24.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_24);
		
		JButton button_25 = new JButton("");
		button_25.setBackground(Color.GREEN);
		button_25.setBounds(105, 143, 24, 23);
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_25) {
					button_25.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_25);
		
		JButton button_26 = new JButton("");
		button_26.setBackground(Color.GREEN);
		button_26.setBounds(137, 143, 24, 23);
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_26) {
					button_26.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_26);
		
		JButton button_27 = new JButton("");
		button_27.setBackground(Color.GREEN);
		button_27.setBounds(137, 177, 24, 23);
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_27) {
					button_27.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_27);
		
		JButton button_28 = new JButton("");
		button_28.setBackground(Color.GREEN);
		button_28.setBounds(137, 211, 24, 23);
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_28) {
					button_28.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_28);
		
		JButton button_29 = new JButton("");
		button_29.setBackground(Color.GREEN);
		button_29.setBounds(137, 245, 24, 23);
		button_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_29) {
					button_29.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_29);
		
		JButton button_30 = new JButton("");
		button_30.setBackground(Color.GREEN);
		button_30.setBounds(137, 279, 24, 23);
		button_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_30) {
					button_30.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_30);
		
		JButton button_31 = new JButton("");
		button_31.setBackground(Color.GREEN);
		button_31.setBounds(137, 315, 24, 23);
		button_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_31) {
					button_31.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_31);
		
		JButton button_32 = new JButton("");
		button_32.setBackground(Color.GREEN);
		button_32.setBounds(137, 349, 24, 23);
		button_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_32) {
					button_32.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_32);
		
		JButton button_33 = new JButton("");
		button_33.setBackground(Color.GREEN);
		button_33.setBounds(171, 143, 24, 23);
		button_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_33) {
					button_33.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_33);
		
		JButton button_34 = new JButton("");
		button_34.setBackground(Color.GREEN);
		button_34.setBounds(171, 177, 24, 23);
		button_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_34) {
					button_34.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_34);
		
		JButton button_35 = new JButton("");
		button_35.setBackground(Color.GREEN);
		button_35.setBounds(171, 211, 24, 23);
		button_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_35) {
					button_35.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_35);
		
		JButton button_36 = new JButton("");
		button_36.setBackground(Color.GREEN);
		button_36.setBounds(171, 245, 24, 23);
		button_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_36) {
					button_36.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_36);
		
		JButton button_37 = new JButton("");
		button_37.setBackground(Color.GREEN);
		button_37.setBounds(171, 279, 24, 23);
		button_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_37) {
					button_37.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_37);
		
		JButton button_38 = new JButton("");
		button_38.setBackground(Color.GREEN);
		button_38.setBounds(171, 315, 24, 23);
		button_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_38) {
					button_38.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_38);
		
		JButton button_39 = new JButton("");
		button_39.setBackground(Color.GREEN);
		button_39.setBounds(171, 349, 24, 23);
		button_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_39) {
					button_39.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_39);
		
		JButton button_40 = new JButton("");
		button_40.setBackground(Color.GREEN);
		button_40.setBounds(205, 143, 24, 23);
		button_40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_40) {
					button_40.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_40);
		
		JButton button_41 = new JButton("");
		button_41.setBackground(Color.GREEN);
		button_41.setBounds(205, 177, 24, 23);
		button_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_41) {
					button_41.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_41);
		
		JButton button_42 = new JButton("");
		button_42.setBackground(Color.GREEN);
		button_42.setBounds(205, 211, 24, 23);
		button_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_42) {
					button_42.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_42);
		
		JButton button_43 = new JButton("");
		button_43.setBackground(Color.GREEN);
		button_43.setBounds(205, 245, 24, 23);
		button_43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_43) {
					button_43.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_43);
		
		JButton button_44 = new JButton("");
		button_44.setBackground(Color.GREEN);
		button_44.setBounds(205, 279, 24, 23);
		button_44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_44) {
					button_44.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_44);
		
		JButton button_45 = new JButton("");
		button_45.setBackground(Color.GREEN);
		button_45.setBounds(205, 315, 24, 23);
		button_45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_45) {
					button_45.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_45);
		
		JButton button_46 = new JButton("");
		button_46.setBackground(Color.GREEN);
		button_46.setBounds(205, 349, 24, 23);
		button_46.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_46) {
					button_46.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_46);
		
		JButton button_47 = new JButton("");
		button_47.setBackground(Color.GREEN);
		button_47.setBounds(239, 143, 24, 23);
		button_47.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_47) {
					button_47.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_47);
		
		JButton button_48 = new JButton("");
		button_48.setBackground(Color.GREEN);
		button_48.setBounds(239, 177, 24, 23);
		button_48.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_48) {
					button_48.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_48);
		
		JButton button_49 = new JButton("");
		button_49.setBackground(Color.GREEN);
		button_49.setBounds(239, 211, 24, 23);
		button_49.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_49) {
					button_49.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_49);
		
		JButton button_50 = new JButton("");
		button_50.setBackground(Color.GREEN);
		button_50.setBounds(239, 245, 24, 23);
		button_50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_50) {
					button_50.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_50);
		
		JButton button_51 = new JButton("");
		button_51.setBackground(Color.GREEN);
		button_51.setBounds(239, 279, 24, 23);
		button_51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_51) {
					button_51.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_51);
		
		JButton button_52 = new JButton("");
		button_52.setBackground(Color.GREEN);
		button_52.setBounds(239, 315, 24, 23);
		button_52.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_52) {
					button_52.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_52);
		
		JButton button_53 = new JButton("");
		button_53.setBackground(Color.GREEN);
		button_53.setBounds(239, 349, 24, 23);
		button_53.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_53) {
					button_53.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_53);
		
		JButton button_54 = new JButton("");
		button_54.setBackground(Color.GREEN);
		button_54.setBounds(273, 143, 24, 23);
		button_54.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_54) {
					button_54.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_54);
		
		JButton button_55 = new JButton("");
		button_55.setBackground(Color.GREEN);
		button_55.setBounds(273, 177, 24, 23);
		button_55.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_55) {
					button_55.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_55);
		
		JButton button_56 = new JButton("");
		button_56.setBackground(Color.GREEN);
		button_56.setBounds(273, 211, 24, 23);
		button_56.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_56) {
					button_56.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_56);
		
		JButton button_57 = new JButton("");
		button_57.setBackground(Color.GREEN);
		button_57.setBounds(273, 245, 24, 23);
		button_57.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_57) {
					button_57.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_57);
		
		JButton button_58 = new JButton("");
		button_58.setBackground(Color.GREEN);
		button_58.setBounds(273, 279, 24, 23);
		button_58.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_58) {
					button_58.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_58);
		
		JButton button_59 = new JButton("");
		button_59.setBackground(Color.GREEN);
		button_59.setBounds(273, 315, 24, 23);
		button_59.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_12) {
					button_59.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_59);
		
		JButton button_60 = new JButton("");
		button_60.setBackground(Color.GREEN);
		button_60.setBounds(273, 349, 24, 23);
		button_60.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_60) {
					button_60.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_60);
		
		JButton button_61 = new JButton("");
		button_61.setBackground(Color.GREEN);
		button_61.setBounds(306, 143, 24, 23);
		button_61.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_61) {
					button_61.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_61);
		
		JButton button_62 = new JButton("");
		button_62.setBackground(Color.GREEN);
		button_62.setBounds(306, 177, 24, 23);
		button_62.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_62) {
					button_62.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_62);
		
		JButton button_63 = new JButton("");
		button_63.setBackground(Color.GREEN);
		button_63.setBounds(306, 211, 24, 23);
		button_63.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_63) {
					button_63.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_63);
		
		JButton button_64 = new JButton("");
		button_64.setBackground(Color.GREEN);
		button_64.setBounds(306, 245, 24, 23);
		button_64.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_64) {
					button_64.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_64);
		
		JButton button_65 = new JButton("");
		button_65.setBackground(Color.GREEN);
		button_65.setBounds(306, 279, 24, 23);
		button_65.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_65) {
					button_65.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_65);
		
		JButton button_66 = new JButton("");
		button_66.setBackground(Color.GREEN);
		button_66.setBounds(306, 315, 24, 23);
		button_66.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_66) {
					button_66.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_66);
		
		JButton button_67 = new JButton("");
		button_67.setBackground(Color.GREEN);
		button_67.setBounds(306, 349, 24, 23);
		button_67.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_67) {
					button_67.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_67);
		
		JButton button_68 = new JButton("");
		button_68.setBackground(Color.GREEN);
		button_68.setBounds(340, 143, 24, 23);
		button_68.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_68) {
					button_68.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_68);
		
		JButton button_69 = new JButton("");
		button_69.setBackground(Color.GREEN);
		button_69.setBounds(340, 177, 24, 23);
		button_69.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_69) {
					button_69.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_69);
		
		JButton button_70 = new JButton("");
		button_70.setBackground(Color.GREEN);
		button_70.setBounds(374, 143, 24, 23);
		button_70.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_70) {
					button_70.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_70);
		
		JButton button_71 = new JButton("");
		button_71.setBackground(Color.GREEN);
		button_71.setBounds(374, 177, 24, 23);
		button_71.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_71) {
					button_71.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_71);
		
		JButton button_72 = new JButton("");
		button_72.setBackground(Color.GREEN);
		button_72.setBounds(340, 211, 24, 23);
		button_72.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_72) {
					button_72.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_72);
		
		JButton button_73 = new JButton("");
		button_73.setBackground(Color.GREEN);
		button_73.setBounds(374, 211, 24, 23);
		button_73.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_73) {
					button_73.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_73);
		
		JButton button_74 = new JButton("");
		button_74.setBackground(Color.GREEN);
		button_74.setBounds(340, 245, 24, 23);
		button_74.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_74) {
					button_74.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_74);
		
		JButton button_75 = new JButton("");
		button_75.setBackground(Color.GREEN);
		button_75.setBounds(340, 279, 24, 23);
		button_75.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_75) {
					button_75.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_75);
		
		JButton button_76 = new JButton("");
		button_76.setBackground(Color.GREEN);
		button_76.setBounds(340, 315, 24, 23);
		button_76.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_76) {
					button_76.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_76);
		
		JButton button_77 = new JButton("");
		button_77.setBackground(Color.GREEN);
		button_77.setBounds(340, 349, 24, 23);
		button_77.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_77) {
					button_77.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_77);
		
		JButton button_78 = new JButton("");
		button_78.setBackground(Color.GREEN);
		button_78.setBounds(374, 245, 24, 23);
		button_78.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_78) {
					button_78.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_78);
		
		JButton button_79 = new JButton("");
		button_79.setBackground(Color.GREEN);
		button_79.setBounds(374, 279, 24, 23);
		button_79.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_79) {
					button_79.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_79);
		
		JButton button_80 = new JButton("");
		button_80.setBackground(Color.GREEN);
		button_80.setBounds(374, 315, 24, 23);
		button_80.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_80) {
					button_80.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_80);
		
		JButton button_81 = new JButton("");
		button_81.setBackground(Color.GREEN);
		button_81.setBounds(374, 349, 24, 23);
		button_81.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_81) {
					button_81.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_81);
		
		JButton button_82 = new JButton("");
		button_82.setBackground(Color.GREEN);
		button_82.setBounds(408, 143, 24, 23);
		button_82.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_82) {
					button_82.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_82);
		
		JButton button_83 = new JButton("");
		button_83.setBackground(Color.GREEN);
		button_83.setBounds(408, 177, 24, 23);
		button_83.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_83) {
					button_83.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_83);
		
		JButton button_84 = new JButton("");
		button_84.setBackground(Color.GREEN);
		button_84.setBounds(408, 211, 24, 23);
		button_84.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_84) {
					button_84.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_84);
		
		JButton button_85 = new JButton("");
		button_85.setBackground(Color.GREEN);
		button_85.setBounds(408, 245, 24, 23);
		button_85.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_85) {
					button_85.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_85);
		
		JButton button_86 = new JButton("");
		button_86.setBackground(Color.GREEN);
		button_86.setBounds(408, 279, 24, 23);
		button_86.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_86) {
					button_86.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_86);
		
		JButton button_87 = new JButton("");
		button_87.setBackground(Color.GREEN);
		button_87.setBounds(408, 315, 24, 23);
		button_87.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_87) {
					button_87.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_87);
		
		JButton button_88 = new JButton("");
		button_88.setBackground(Color.GREEN);
		button_88.setBounds(408, 349, 24, 23);
		button_88.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_88) {
					button_88.setBackground(Color.YELLOW);
					addSeat();
				}
			}
		});
		contentPane.add(button_88);
		
		JLabel lblNewLabel_1 = new JLabel("\u0411\u0438\u043B\u0435\u0442\u0438");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(117, 63, 62, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u043B\u0432.");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(258, 60, 46, 18);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("=");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(205, 63, 24, 15);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("\u041A\u0423\u041F\u0418 \u0411\u0418\u041B\u0415\u0422\u0418");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					if (btnNewButton.isEnabled() && button_12.getBackground()==(Color.YELLOW)) {
						button_12.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_13.getBackground()==(Color.YELLOW)) {
						button_13.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_14.getBackground()==(Color.YELLOW)) {
						button_14.setBackground(Color.RED);
					
			}
					if (btnNewButton.isEnabled() && button_15.getBackground()==(Color.YELLOW)) {
						button_15.setBackground(Color.RED);
					
			}
					if (btnNewButton.isEnabled() && button_16.getBackground()==(Color.YELLOW)) {
						button_16.setBackground(Color.RED);
				
			}
					if (btnNewButton.isEnabled() && button_17.getBackground()==(Color.YELLOW)) {
						button_17.setBackground(Color.RED);
					
			}
					if (btnNewButton.isEnabled() && button_18.getBackground()==(Color.YELLOW)) {
						button_18.setBackground(Color.RED);
				
			}
					if (btnNewButton.isEnabled() && button_19.getBackground()==(Color.YELLOW)) {
						button_19.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_20.getBackground()==(Color.YELLOW)) {
						button_20.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_21.getBackground()==(Color.YELLOW)) {
						button_21.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_22.getBackground()==(Color.YELLOW)) {
						button_22.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_23.getBackground()==(Color.YELLOW)) {
						button_23.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_24.getBackground()==(Color.YELLOW)) {
						button_24.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_25.getBackground()==(Color.YELLOW)) {
						button_25.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_26.getBackground()==(Color.YELLOW)) {
						button_26.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_27.getBackground()==(Color.YELLOW)) {
						button_27.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_28.getBackground()==(Color.YELLOW)) {
						button_28.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_29.getBackground()==(Color.YELLOW)) {
						button_29.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_30.getBackground()==(Color.YELLOW)) {
						button_30.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_31.getBackground()==(Color.YELLOW)) {
						button_31.setBackground(Color.RED);
					
			}
					if (btnNewButton.isEnabled() && button_32.getBackground()==(Color.YELLOW)) {
						button_32.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_33.getBackground()==(Color.YELLOW)) {
						button_33.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_34.getBackground()==(Color.YELLOW)) {
						button_34.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_35.getBackground()==(Color.YELLOW)) {
						button_35.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_36.getBackground()==(Color.YELLOW)) {
						button_36.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_37.getBackground()==(Color.YELLOW)) {
						button_37.setBackground(Color.RED);
					
			}
					if (btnNewButton.isEnabled() && button_38.getBackground()==(Color.YELLOW)) {
						button_38.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_39.getBackground()==(Color.YELLOW)) {
						button_39.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_40.getBackground()==(Color.YELLOW)) {
						button_40.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_41.getBackground()==(Color.YELLOW)) {
						button_41.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_42.getBackground()==(Color.YELLOW)) {
						button_43.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_43.getBackground()==(Color.YELLOW)) {
						button_43.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_44.getBackground()==(Color.YELLOW)) {
						button_44.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_45.getBackground()==(Color.YELLOW)) {
						button_45.setBackground(Color.RED);
					
			}
					if (btnNewButton.isEnabled() && button_46.getBackground()==(Color.YELLOW)) {
						button_46.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_47.getBackground()==(Color.YELLOW)) {
						button_47.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_48.getBackground()==(Color.YELLOW)) {
						button_48.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_49.getBackground()==(Color.YELLOW)) {
						button_49.setBackground(Color.RED);
					
			}
					if (btnNewButton.isEnabled() && button_50.getBackground()==(Color.YELLOW)) {
						button_50.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_51.getBackground()==(Color.YELLOW)) {
						button_51.setBackground(Color.RED);
					
			}
					if (btnNewButton.isEnabled() && button_52.getBackground()==(Color.YELLOW)) {
						button_52.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_53.getBackground()==(Color.YELLOW)) {
						button_53.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_54.getBackground()==(Color.YELLOW)) {
						button_54.setBackground(Color.RED);
					
			}
					if (btnNewButton.isEnabled() && button_55.getBackground()==(Color.YELLOW)) {
						button_55.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_56.getBackground()==(Color.YELLOW)) {
						button_56.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_57.getBackground()==(Color.YELLOW)) {
						button_57.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_58.getBackground()==(Color.YELLOW)) {
						button_58.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_59.getBackground()==(Color.YELLOW)) {
						button_59.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_60.getBackground()==(Color.YELLOW)) {
						button_60.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_61.getBackground()==(Color.YELLOW)) {
						button_61.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_62.getBackground()==(Color.YELLOW)) {
						button_62.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_63.getBackground()==(Color.YELLOW)) {
						button_63.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_64.getBackground()==(Color.YELLOW)) {
						button_64.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_65.getBackground()==(Color.YELLOW)) {
						button_65.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_66.getBackground()==(Color.YELLOW)) {
						button_66.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_67.getBackground()==(Color.YELLOW)) {
						button_67.setBackground(Color.RED);
					
			}
					if (btnNewButton.isEnabled() && button_68.getBackground()==(Color.YELLOW)) {
						button_68.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_69.getBackground()==(Color.YELLOW)) {
						button_69.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_70.getBackground()==(Color.YELLOW)) {
						button_70.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_71.getBackground()==(Color.YELLOW)) {
						button_71.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_72.getBackground()==(Color.YELLOW)) {
						button_72.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_73.getBackground()==(Color.YELLOW)) {
						button_73.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_74.getBackground()==(Color.YELLOW)) {
						button_74.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_75.getBackground()==(Color.YELLOW)) {
						button_75.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_76.getBackground()==(Color.YELLOW)) {
						button_76.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_77.getBackground()==(Color.YELLOW)) {
						button_77.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_78.getBackground()==(Color.YELLOW)) {
						button_78.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_79.getBackground()==(Color.YELLOW)) {
						button_79.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_80.getBackground()==(Color.YELLOW)) {
						button_80.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_81.getBackground()==(Color.YELLOW)) {
						button_81.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_82.getBackground()==(Color.YELLOW)) {
						button_82.setBackground(Color.RED);
					
			}
					if (btnNewButton.isEnabled() && button_83.getBackground()==(Color.YELLOW)) {
						button_83.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_84.getBackground()==(Color.YELLOW)) {
						button_84.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_85.getBackground()==(Color.YELLOW)) {
						button_85.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_86.getBackground()==(Color.YELLOW)) {
						button_86.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_87.getBackground()==(Color.YELLOW)) {
						button_87.setBackground(Color.RED);
						
			}
					if (btnNewButton.isEnabled() && button_88.getBackground()==(Color.YELLOW)) {
						button_88.setBackground(Color.RED);
						
			}
					if(btnNewButton.isEnabled()){
						btnNewButton.setEnabled(false);
				}
			}
		});
		btnNewButton.setBounds(331, 406, 153, 57);
		contentPane.add(btnNewButton);
		
		JButton button_89 = new JButton("");
		button_89.setBackground(Color.YELLOW);
		button_89.setBounds(25, 450, 36, 32);
		contentPane.add(button_89);
		
		JButton button_90 = new JButton("");
		button_90.setBackground(Color.GREEN);
		button_90.setBounds(25, 406, 36, 33);
		contentPane.add(button_90);
		
		JButton button_91 = new JButton("");
		button_91.setBackground(Color.RED);
		button_91.setBounds(25, 493, 36, 32);
		contentPane.add(button_91);
		
		JLabel label = new JLabel("\u0441\u0432\u043E\u0431\u043E\u0434\u043D\u0438 \u043C\u0435\u0441\u0442\u0430");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(67, 414, 94, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0438\u0437\u0431\u0440\u0430\u043D\u0438 \u043C\u0435\u0441\u0442\u0430\r\n");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(71, 461, 94, 14);
		contentPane.add(label_1);
		
		JLabel lblNewLabel_4 = new JLabel("\u0437\u0430\u0435\u0442\u0438 \u043C\u0435\u0441\u0442\u0430\r\n");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(71, 503, 90, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel label_2 = new JLabel("2");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(37, 186, 24, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("3\r\n");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(37, 220, 24, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("1\r\n");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_4.setBounds(37, 152, 24, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("4\r\n");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_5.setBounds(37, 254, 24, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("5");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_6.setBounds(37, 288, 24, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("7");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_7.setBounds(37, 358, 24, 14);
		contentPane.add(label_7);
		
		JButton btnNewButton_1 = new JButton("\u0415\u041A\u0420\u0410\u041D");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setForeground(Color.WHITE);
		 btnNewButton_1.setBackground(Color.BLUE);
		 btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBounds(71, 91, 361, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel label_8 = new JLabel("6");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_8.setBounds(37, 324, 24, 14);
		contentPane.add(label_8);
		
		JButton btnNewButton_2 = new JButton("OK");
		btnNewButton_2.setBounds(331, 474, 153, 57);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton_2){
					FormApplication form = new FormApplication();
					form.setVisible(true);
					writerTicket.write("Закупени места:" + tickets);
					writerTicket.write("Дължима сума:" + money);
					writerTicket.closeFile();
				}
			}
		});
		contentPane.add(btnNewButton_2);
    }
    public void addSeat(){
    	tickets++;
		money = tickets * priceTicket;
		lblMoney.setText(money + "");
		lblTickets.setText(tickets + "");
	}
}


import java.awt.BorderLayout;
import java.awt.Color;
import java.util.GregorianCalendar;
import java.awt.EventQueue;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class DataChooser extends JFrame {

	private JPanel contentPane;
	String data;
	JButton btnNewButton;
	JButton button_2;
	JButton button;
	String data2;
	String data3;
	String data4;
	String data5;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	WriteInFile textWriter;

	public DataChooser() {
		textWriter = new WriteInFile("ticketForData");
		data2 = "2016-04-22";
		data3 = "2016-04-22";
		data4 = "2016-04-22";
		data5 = "2016-04-22";
		data = "2016-04-23";
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		button_2 = new JButton("");
		button_2.setBounds(109, 48, 89, 59);
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(246, 48, 116, 59);
		contentPane.add(btnNewButton_1);
		btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(372, 48, 140, 59);
		contentPane.add(btnNewButton_2);
		btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(522, 48, 122, 59);
		contentPane.add(btnNewButton_3);
		JLabel lblNewLabel = new JLabel(
				"\u041C\u043E\u043B\u044F \u0438\u0437\u0431\u0435\u0440\u0435\u0442\u0435 \u0441\u0438 \u0447\u0430\u0441.");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(162, 218, 312, 52);
		contentPane.add(lblNewLabel);
		initData();
		initData2();
		initData3();
		initData4();
		initData5();
		initGreenButtons();
		

	}

	public void initData() {
		button = new JButton("2016-04-23");
		button.setBounds(10, 48, 105, 59);
		button.setBackground(Color.ORANGE);
		contentPane.add(button);
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			c.setTime(sdf.parse(data));
			c.add(Calendar.DATE, 1);
			data = sdf.format(c.getTime());
			btnNewButton = new JButton("");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnNewButton.setBounds(125, 48, 111, 59);
			btnNewButton.setText(data + "");
			contentPane.add(btnNewButton);
		} catch (ParseException e) {

			e.printStackTrace();
		}
	}

	public void initData2() {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			c.setTime(sdf.parse(data2));
			c.add(Calendar.DATE, 2);
			data2 = sdf.format(c.getTime());
			button_2.setText(data2 + "");
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public void initData3() {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			c.setTime(sdf.parse(data3));
			c.add(Calendar.DATE, 3);
			data3 = sdf.format(c.getTime());
			btnNewButton_1.setText(data3 + "");
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public void initData4() {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			c.setTime(sdf.parse(data4));
			c.add(Calendar.DATE, 4);
			data4 = sdf.format(c.getTime());
			btnNewButton_2.setText(data4 + "");
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public void initData5() {
		try {

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			c.setTime(sdf.parse(data4));
			c.add(Calendar.DATE, 5);
			data5 = sdf.format(c.getTime());
			btnNewButton_3.setText(data5 + "");
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public String getData() {
		return data;
	}

	public String getData2() {
		return data2;
	}

	public String getData3() {
		return data3;
	}

	public String getData4() {
		return data4;
	}

	public String getData5() {
		return data5;
	}

	public void initGreenButtons() {
		btnNewButton_4 = new JButton("12:00");
		btnNewButton_4.setBackground(Color.GREEN);
		btnNewButton_4.setBounds(125, 132, 111, 45);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton_4) {
					SystemForTickets systemTickets = new SystemForTickets();
					systemTickets.setVisible(true);
					textWriter.write("Дата:" + "2016-04-24");
					textWriter.write("Часът на прожекцията:" + 12);
					textWriter.closeFile();

				}
			}
		});
		contentPane.add(btnNewButton_4);

		btnNewButton_5 = new JButton("10:00");
		btnNewButton_5.setBackground(Color.GREEN);
		btnNewButton_5.setBounds(10, 132, 105, 45);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton_5) {
					SystemForTickets systemTickets = new SystemForTickets();
					systemTickets.setVisible(true);
					textWriter.write("Дата:" + "2016-04-23");
					textWriter.write("Часът на прожекцията:" + 10);
					textWriter.closeFile();

				}
			}
		});
		contentPane.add(btnNewButton_5);

		button_5 = new JButton("14:00");
		button_5.setBackground(Color.GREEN);
		button_5.setBounds(246, 132, 116, 45);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_5) {
					SystemForTickets systemTickets = new SystemForTickets();
					systemTickets.setVisible(true);
					textWriter.write("Дата:" + "2016-04-25");
					textWriter.write("Часът на прожекцията:" + 14);
					textWriter.closeFile();

				}
			}
		});
		contentPane.add(button_5);

		button_6 = new JButton("16:00");
		button_6.setBackground(Color.GREEN);
		button_6.setBounds(374, 132, 138, 45);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_6) {
					SystemForTickets systemTickets = new SystemForTickets();
					systemTickets.setVisible(true);
					textWriter.write("Дата:" + "2016-04-26");
					textWriter.write("Часът на прожекцията:" + 16);
					textWriter.closeFile();

				}
			}
		});
		contentPane.add(button_6);

		button_7 = new JButton("18:00");
		button_7.setBackground(Color.GREEN);
		button_7.setBounds(522, 132, 122, 45);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_7) {
					SystemForTickets systemTickets = new SystemForTickets();
					systemTickets.setVisible(true);
					textWriter.write("Дата:" + "2016-04-27");
					textWriter.write("Часът на прожекцията:" + 18);
					textWriter.closeFile();

				}
			}
		});
		contentPane.add(button_7);
	}
}

package loginForm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Cursor;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsrNm;
	private JPasswordField txtpwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	Color defaultColor=new Color(255,255,255);
	Color enteredColor=new Color(255,0,0);
	Color defaultbcg=Color.DARK_GRAY;
	Color enteredbcg=Color.white;
	public Login() {
		setResizable(false);
		
		setUndecorated(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(0, 0, 717, 325);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 0, 717, 67);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER ACCOUNT");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(240, 21, 217, 25);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("MV Boli", Font.BOLD, 22));
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(229, 44, 208, 13);
		panel_1.add(separator);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.WHITE);
		panel_2.setBorder(null);
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(0, 70, 717, 255);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblUsrNm = new JLabel("USER NAME :");
		lblUsrNm.setForeground(Color.WHITE);
		lblUsrNm.setBounds(123, 40, 96, 35);
		panel_2.add(lblUsrNm);
		lblUsrNm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		
		JSeparator sprUser = new JSeparator();
		sprUser.setBounds(121, 73, 426, 2);
		panel_2.add(sprUser);
		txtUsrNm = new JTextField();
		txtUsrNm.setForeground(Color.WHITE);
		txtUsrNm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtUsrNm.setBounds(217, 40, 330, 31);
		txtUsrNm.setBackground(Color.DARK_GRAY);
		txtUsrNm.setOpaque(true);
		txtUsrNm.setBorder(null);
		txtUsrNm.setColumns(10);
			panel_2.add(txtUsrNm);
		txtUsrNm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblUsrNm.setForeground(Color.red);
				sprUser.setBackground(Color.red);
				
			}
			public void mouseExited(MouseEvent e) {
				lblUsrNm.setForeground(Color.white);
				sprUser.setBackground(Color.white);
				
			}
		});
		JLabel lblPwd = new JLabel("PASSWORD :");
		lblPwd.setForeground(Color.WHITE);
		lblPwd.setBounds(123, 104, 86, 22);
		panel_2.add(lblPwd);
		lblPwd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		JSeparator sprP = new JSeparator();
		sprP.setBounds(121, 136, 426, 2);
		panel_2.add(sprP);
		
		txtpwd = new JPasswordField();
		txtpwd.setForeground(Color.WHITE);
		txtpwd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpwd.setEchoChar('*');
		txtpwd.setBounds(219, 100, 330, 35);
		txtpwd.setBackground(Color.DARK_GRAY);
		txtpwd.setOpaque(true);
		txtpwd.setBorder(null);
		txtpwd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblPwd.setForeground(Color.red);
				sprP.setBackground(Color.red);
				
			}
			public void mouseExited(MouseEvent e) {
				lblPwd.setForeground(Color.white);
				sprP.setBackground(Color.white);
				
			}
		});
		panel_2.add(txtpwd);
		JLabel loginBtn = new JLabel("LOG IN");
		loginBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		loginBtn.setHorizontalAlignment(SwingConstants.CENTER);
		loginBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name=txtUsrNm.getText();
				char[]pwd =txtpwd.getPassword();
				if(name.equals("")|| pwd.length<8) {
					JOptionPane.showMessageDialog(panel_2, "check your information !!", "root", JOptionPane.ERROR_MESSAGE);
				}
				else {
					txtpwd.setText("");
					txtUsrNm.setText("");
					JOptionPane.showMessageDialog(null, " welcome "+name);
				}
				
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				loginBtn.setForeground(enteredColor);
				
				loginBtn.setFont(new Font("Tahoma",Font.BOLD,26));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				loginBtn.setForeground(defaultColor);
				
				loginBtn.setFont(new Font("Tahoma",Font.BOLD,20));
				
			}
		});
		
		loginBtn.setForeground(Color.WHITE);
		loginBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		loginBtn.setBounds(271, 161, 127, 35);
		panel_2.add(loginBtn);
		
		JLabel lblExit = new JLabel("Exit");
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblExit.setForeground(Color.red);
			}
			public void mouseExited(MouseEvent e) {
				lblExit.setForeground(Color.white);
			}
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblExit.setForeground(Color.WHITE);
		lblExit.setHorizontalAlignment(SwingConstants.CENTER);
		lblExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblExit.setBounds(538, 198, 127, 35);
		panel_2.add(lblExit);
	}
}

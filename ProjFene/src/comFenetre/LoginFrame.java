package comFenetre;



import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {

	Container container = getContentPane();
    JLabel userLabel = new JLabel("Nom");
    JLabel passwordLabel = new JLabel("Mot de passe");
    JPanel panel10 = new JPanel();
    JPanel panel11 = new JPanel();
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");

    LoginFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLayoutManager() {
        container.setLayout(null);
        panel11.setLayout(null);
    }

    public void setLocationAndSize() {
    	panel10.setBackground(new Color(123, 165, 151));
        panel10.setBounds(0,0,300,600);
        panel11.setBackground(Color.WHITE);
        panel11.setBounds(300,0,790,600);
    	
        userLabel.setBounds(148, 250, 150, 30);
        passwordLabel.setBounds(100, 300, 100, 30);
        userTextField.setBounds(200, 250, 150, 30);
        passwordField.setBounds(200, 300, 150, 30);
        
        
        
        
        
        
        loginButton.setBounds(200, 350, 150, 30);
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(new Color(123, 165, 151));
    }

    public void addComponentsToContainer() {
    	container.add(panel10);
        container.add(panel11);
    	
        panel11.add(userLabel);
        panel11.add(passwordLabel);
        panel11.add(userTextField);
        panel11.add(passwordField);
        
        panel11.add(loginButton);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        
    }


   
	@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if (userText.equalsIgnoreCase("a") && pwdText.equalsIgnoreCase("a")) {
            	new Fenetre();
        		
            
            } else {
                JOptionPane.showMessageDialog(this, "Login ou mot de passe invalide");
            }

        }
        
    }

}

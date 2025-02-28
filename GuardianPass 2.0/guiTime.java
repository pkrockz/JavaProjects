import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Font;

public class guiTime extends JFrame implements ActionListener
{
    JButton passwordCheckButton, savedPasswordButton;
    JLabel headerLabel;
    JPanel headerPanel;

    guiTime()
    {
        GUIHandle();
    }

    public void GUIHandle()
    {
        setLayout(new BorderLayout());
        setTitle("GuardianPass");
        
        headerPanel = new JPanel();
        headerPanel.setBackground(Color.LIGHT_GRAY);
        headerLabel= new JLabel("GuardianPass");
        headerLabel= new JLabel("Choose an Option");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerPanel.add(headerLabel, JLabel.CENTER);
        add(headerPanel, BorderLayout.NORTH);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10); //padding 

        passwordCheckButton = new JButton("Password Check");
        gbc.gridx = 0; 
        gbc.gridy = 1; 
        gbc.anchor = GridBagConstraints.WEST;
        passwordCheckButton.setPreferredSize(new Dimension(200, 50));
        passwordCheckButton.setFont(new Font("Arial", Font.BOLD, 18));
        mainPanel.add(passwordCheckButton, gbc);

        savedPasswordButton = new JButton("Saved Passwords");
        gbc.gridx = 2; 
        gbc.gridy = 1; 
        gbc.anchor = GridBagConstraints.EAST;
        savedPasswordButton.setPreferredSize(new Dimension(200, 50));
        savedPasswordButton.setFont(new Font("Arial", Font.BOLD, 18));
        mainPanel.add(savedPasswordButton, gbc);

        add(mainPanel, BorderLayout.CENTER);
        savedPasswordButton.addActionListener(this);
        passwordCheckButton.addActionListener(this);
        
        setVisible(true);
        setSize(500,200);
        setResizable(false);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == savedPasswordButton)
        {
            
        }
        else if(e.getSource() == passwordCheckButton)
        {

        }
    }
    public static void main(String[] args) 
    {
        new guiTime();
    }
}

//         addCustomerButton.addActionListener(e -> cardLayout.show(parentPanel, "Add Customer"));



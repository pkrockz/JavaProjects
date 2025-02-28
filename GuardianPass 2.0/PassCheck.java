import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class PassCheck extends JFrame implements ActionListener
{
    PassCheck()
    {
        PassGUI();
    }

    JLabel passInpReq,headerLabel,fillerLabel,ftitleLabel,finfoLabel;
    JButton backButton, enterButton;
    JTextArea passInput;
    JPanel mainPanel,headerPanel,footerPanel;
    GridBagConstraints gbc,gbc1;

    public void PassGUI()
    {
        setLayout(new BorderLayout());
        setTitle("GuardianPass");
        
        headerPanel = new JPanel();
        headerPanel.setBackground(Color.LIGHT_GRAY);
        headerLabel= new JLabel("Password Check");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerPanel.add(headerLabel, JLabel.CENTER);
        add(headerPanel, BorderLayout.NORTH);

        mainPanel = new JPanel(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10); //padding 

        passInpReq = new JLabel("   Enter Password");
        gbc.gridx = 0; 
        gbc.gridy = 1; 
        gbc.anchor = GridBagConstraints.WEST;
        passInpReq.setFont(new Font("Arial", Font.BOLD, 22));
        mainPanel.add(passInpReq, gbc);

        passInput = new JTextArea(1, 10);
        gbc.gridx = 1; 
        gbc.gridy = 1; 
        gbc.anchor = GridBagConstraints.EAST;
        passInput.setPreferredSize(new Dimension(220, 25));
        passInput.setFont(new Font("Arial", Font.BOLD, 18));
        mainPanel.add(passInput, gbc);

        fillerLabel = new JLabel();
        gbc.gridx = 0; 
        gbc.gridy = 2; 
        gbc.anchor = GridBagConstraints.CENTER;
        fillerLabel.setFont(new Font("Arial", Font.BOLD, 22));
        mainPanel.add(fillerLabel, gbc);

        enterButton = new JButton("Check Strength");
        gbc.gridx = 0; 
        gbc.gridy = 3; 
        gbc.anchor = GridBagConstraints.CENTER;
        enterButton.setPreferredSize(new Dimension(200, 40));
        enterButton.setFont(new Font("Arial", Font.BOLD, 18));
        mainPanel.add(enterButton, gbc);

        backButton = new JButton("Back to Main Menu");
        gbc.gridx = 1; 
        gbc.gridy = 3; 
        gbc.anchor = GridBagConstraints.CENTER;
        backButton.setPreferredSize(new Dimension(200, 40));
        backButton.setFont(new Font("Arial", Font.BOLD, 18));
        mainPanel.add(backButton, gbc);

        footerPanel = new JPanel(new GridBagLayout());
        footerPanel.setBackground(Color.LIGHT_GRAY);
        gbc1 = new GridBagConstraints();
        gbc1.insets = new Insets(10,10,10,10); 

        ftitleLabel = new JLabel("Information");
        ftitleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        ftitleLabel.setHorizontalAlignment(SwingConstants.CENTER); 

        gbc1.gridx = 0; 
        gbc1.gridy = 0; 
        gbc1.anchor = GridBagConstraints.CENTER; 
        gbc1.weightx = 1.0; 
        footerPanel.add(ftitleLabel, gbc1);

        finfoLabel = new JLabel("");
        finfoLabel.setFont(new Font("Arial", Font.BOLD, 14));
        
        gbc1.gridx = 0; 
        gbc1.gridy = 1; 
        gbc1.anchor = GridBagConstraints.WEST; 

        gbc1.fill = GridBagConstraints.HORIZONTAL; 
        footerPanel.add(finfoLabel, gbc1);

        add(footerPanel, BorderLayout.SOUTH);
        add(mainPanel, BorderLayout.CENTER);

        enterButton.addActionListener(this);
        backButton.addActionListener(this);

        setVisible(true);
        setSize(600,400);
        setResizable(false);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == backButton)
        {

        }
        else if(e.getSource() == enterButton)
        {
            String password = passInput.getText();
            String result = GPass.checkPasswordStrength(password);
            finfoLabel.setText(result);
        }
    }

    public static void main (String args[])
    {
        new PassCheck();
    }
}

class GPass 
{
    private static final String LOWERCASE = "qwertyuioplkjhgfdsazxcvbnm";
    private static final String UPPERCASE = LOWERCASE.toUpperCase();
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()_+-=[]{};':\",./<>?";

    public static String checkPasswordStrength(String password) 
    {
        int lscore = 0, uscore = 0, nscore = 0, sscore = 0, fscore = 0;
        StringBuilder result = new StringBuilder();

        if (password.length() < 8) 
        {
            result.append("Password is too short\n");
        }

        for (char currentChar : password.toCharArray()) 
        {
            if (LOWERCASE.contains(String.valueOf(currentChar))) lscore++;
            if (UPPERCASE.contains(String.valueOf(currentChar))) uscore++;
            if (NUMBERS.contains(String.valueOf(currentChar))) nscore++;
            if (SPECIAL.contains(String.valueOf(currentChar))) sscore++;
        }

        if (lscore == 0) 
            result.append("Password has no lowercase letters\n");
        
        if (uscore == 0) 
            result.append("Password has no uppercase letters\n");
        
        if (nscore == 0) 
            result.append("Password has no numbers\n");
        
        if (sscore == 0) 
            result.append("Password has no special characters\n");
        

        if (password.length() > 8 && password.length() <= 12) fscore += 2;
        else if (password.length() > 12) fscore += 4;
        else fscore += 1;

        if (lscore >= 3 && lscore <= 4) fscore += 2;
        else if (lscore > 4) fscore += 3;
        else fscore += 1;

        if (uscore >= 3 && uscore <= 4) fscore += 2;
        else if (uscore > 4) fscore += 3;
        else fscore += 1;

        if (nscore > 1 && nscore <= 3) fscore += 2;
        else if (nscore > 3) fscore += 3;
        else fscore += 1;

        if (sscore > 1 && sscore <= 3) fscore += 2;
        else if (sscore > 3) fscore += 3;
        else fscore += 1;

        if (fscore >= 12) result.append("Password strength: Very Strong");
        else if (fscore >= 8 && fscore < 12) result.append("Password strength: Strong");
        else if (fscore >= 5 && fscore < 8) result.append("Password strength: Good");
        else result.append("Password strength: Error");

        return result.toString();
    }
}
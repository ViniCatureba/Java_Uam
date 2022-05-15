import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//to do: Fazer comparação de de char para string, para validar input. Linha 66
//precisa de um inicio de bd para conferir os inputs com usuarios cadasrados





public class GuiLogin implements ActionListener{
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton loginEnterButton;
    private static JLabel successMsg;
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User :");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(80, 20, 165, 25);
        panel.add(userText);
        
        passwordLabel = new JLabel("Password :");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(80, 50, 165, 25);
        panel.add(passwordText);


        loginEnterButton = new JButton("Login!");
        loginEnterButton.setBounds(10, 80, 80, 25);
        loginEnterButton.addActionListener(new GuiLogin());
        panel.add(loginEnterButton);



        successMsg = new JLabel("");
        successMsg.setBounds(10, 110, 300, 25);
        panel.add(successMsg);


        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        //precisa fazer a coparação de char para string.
        //char password = passwordText.getPassword();

        if(user.equals() && password.equals()) {
            successMsg.setText("Login efetuado om sucesso, seja bem vindo ao sistema, "+ user);

        }

        
    }
}
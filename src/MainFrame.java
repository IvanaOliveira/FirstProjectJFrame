import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MainFrame extends JFrame {
    // Estilo da fonte e tamanho
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 15);
    JTextField tfFirstName, tfLastName;
    JLabel lbWelcome;

    public void initialize() {
        /*********************** Form Panel ***********************/
        //1º Label
        JLabel lbFirstName = new JLabel("First Name");
        lbFirstName.setFont(mainFont);

        //1º Text Field
        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);

        //2º Label
        JLabel lbLastName = new JLabel("Last Name");
        lbLastName.setFont(mainFont);

        //2º Text Field
        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);

        JPanel formPanel = new JPanel();
        // Tamanho do painel Formulário
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        // deixa opaco a separação entre label e Text Field
        formPanel.setOpaque(false);
        //Adiciona label e Text Field
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);

        /*********************** Welcome Label ***********************/
        //Label do Titulo da Janela
        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        /*********************** Buttons Panel ***********************/
        JButton btnOK = new JButton("ok");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stubst
                String firstName = tfFirstName.getText();
                String lastName = tfLastName.getText();
                lbWelcome.setText("Hello " + firstName + " " + lastName);
                
            }
            
        });

        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
            }

        });

        JPanel buttonsPanel = new JPanel();
        // Tamanho do painel dos botões
        buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
        // deixa opaco a separação entre os botões
        buttonsPanel.setOpaque(false);
        // Adiciona botões 
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnClear);

        JPanel mainPanel = new JPanel();
        // Estilo do Layout da janela
        mainPanel.setLayout(new BorderLayout());
        // Cor de Fundo
        mainPanel.setBackground(new Color(128,128,255));
        // Espaço entre os 4 lados da janela
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        // Adiona o painel do formulário
        mainPanel.add(formPanel, BorderLayout.NORTH);
        // Adiona o label do titulo da janela
        mainPanel.add(lbWelcome, BorderLayout.CENTER);
        // Adiona o painel dos botões
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

        //Adiciona o mainPanel
        add(mainPanel);

        // Mostra titulo da Janela
        setTitle("Welcome");
        // Tamanho da Janela
        setSize(500,600);
        // Tamanho minimo da Janela
        setMinimumSize(new Dimension(300, 400));
        // Fechar operação
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Deixar Janela visivel
        setVisible(true);
    }

    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }
}
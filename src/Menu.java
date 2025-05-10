import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Menu extends JFrame {
    public Menu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Sistema de Cadastro");
        setLayout(null);

        JButton buttons[] = {
            new JButton("Cadastrar"),
            new JButton("Excluir"),
            new JButton("Listar"),
            new JButton("Fechar"),
        };

        JLabel text = new JLabel("Escolha uma opção");
        text.setBounds(90, 0, 150, 100);
        add(text);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setBounds(94, 60 + i * 60, 100, 50);
            add(buttons[i]);
            JButton jButton = buttons[i];
            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    buttonAction(jButton);
                }
            });
        }

        setVisible(true);
    }

    protected void buttonAction(JButton button) {
        Object selectedValue;
        Object options[];

        if (button.getText().equals("Cadastrar")) {
            options = new Object[]{"Disciplina", "Estudante", "Estudante em uma disciplina"};
            selectedValue = JOptionPane.showInputDialog(null, "Escolha uma opção de cadastro", "Cadastro", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            optionActions(selectedValue);
        }

        if (button.getText().equals("Excluir")) {
            options = new Object[]{"Disciplina", "Estudante", "Estudante de uma disciplina"};
            selectedValue = JOptionPane.showInputDialog(null, "Escolha uma opção para excluir", "Exclusão", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            optionActions(selectedValue);
        }

        if (button.getText().equals("Listar")) {
            options = new Object[]{"Disciplinas", "Estudantes"};
            selectedValue = JOptionPane.showInputDialog(null, "Escolha uma opção para listar", "Listagem", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            optionActions(selectedValue);
        }

        if (button.getText().equals("Fechar")) {
            JOptionPane.showMessageDialog(null, "O Programa será encerrado!", "Aviso", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }

    protected void optionActions(Object selectedValue) {
        
    }
}

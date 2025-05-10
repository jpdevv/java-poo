import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu extends JFrame {
    private List<Estudante> estudantes = new ArrayList<>();
    private List<Disciplina> disciplinas = new ArrayList<>();

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

        for(int i = 0; i < buttons.length; i++) {
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

        if(button.getText().equals("Cadastrar")) {
            options = new Object[]{"Disciplina", "Estudante", "Estudante em uma disciplina"};
            selectedValue = JOptionPane.showInputDialog(null, "Escolha uma opção de cadastro", "Cadastro", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            optionActions(selectedValue);
        }

        if(button.getText().equals("Excluir")) {
            options = new Object[]{"Disciplina", "Estudante", "Estudante de uma disciplina"};
            selectedValue = JOptionPane.showInputDialog(null, "Escolha uma opção para excluir", "Exclusão", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            optionActions(selectedValue);
        }

        if(button.getText().equals("Listar")) {
            options = new Object[]{"Disciplinas", "Estudantes"};
            selectedValue = JOptionPane.showInputDialog(null, "Escolha uma opção para listar", "Listagem", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            optionActions(selectedValue);
        }

        if(button.getText().equals("Fechar")) {
            JOptionPane.showMessageDialog(null, "O Programa será encerrado!", "Aviso", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }

    protected void optionActions(Object selectedValue) {
        if(selectedValue == null) return;

        String option = selectedValue.toString();

        switch (option) {
            case "Disciplina":
                JTextField nomeDisciplinaField = new JTextField();
                JTextField chField = new JTextField();

                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

                panel.add(new JLabel("Digite o nome:"));
                panel.add(nomeDisciplinaField);
                panel.add(Box.createVerticalStrut(15));

                panel.add(new JLabel("Digite a carga horaria:"));
                panel.add(chField);

                int result = JOptionPane.showConfirmDialog(null, panel, "Cadasto de disciplinas", JOptionPane.OK_CANCEL_OPTION);

                if(result == JOptionPane.OK_OPTION) {
                    String nomeDisciplina = nomeDisciplinaField.getText();
                    int cargaHoraria = Integer.parseInt(chField.getText());
                    disciplinas.add(new Disciplina(nomeDisciplina, cargaHoraria));
                    String text = String.format("Disciplina '%s' cadastrada com uma carga horária de %d horas!", nomeDisciplina, cargaHoraria);
                    JOptionPane.showMessageDialog(null, text, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }
                break;

            case "Estudante":
                JTextField nomeEstudanteField = new JTextField();
                JTextField cpfField = new JTextField();
                JTextField matriculaField = new JTextField();
                JTextField emailField = new JTextField();
                JTextField enderecoField = new JTextField();

                JPanel panel2 = new JPanel();
                panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

                panel2.add(new JLabel("Nome:"));
                panel2.add(nomeEstudanteField);
                panel2.add(Box.createVerticalStrut(10));

                panel2.add(new JLabel("CPF:"));
                panel2.add(cpfField);
                panel2.add(Box.createVerticalStrut(10));

                panel2.add(new JLabel("Matrícula:"));
                panel2.add(matriculaField);
                panel2.add(Box.createVerticalStrut(10));

                panel2.add(new JLabel("Email:"));
                panel2.add(emailField);
                panel2.add(Box.createVerticalStrut(10));

                panel2.add(new JLabel("Endereço:"));
                panel2.add(enderecoField);

                int resultEstudantes = JOptionPane.showConfirmDialog(null, panel2, "Cadastro de estudante", JOptionPane.OK_CANCEL_OPTION);

                if(resultEstudantes == JOptionPane.OK_OPTION) {
                    String nomeEstudante = nomeEstudanteField.getText();
                    String cpfEstudante = cpfField.getText();
                    String emailEstudante = emailField.getText();
                    String matriculaEstudante = matriculaField.getText();
                    String enderecoEstudante = enderecoField.getText();
                    estudantes.add(new Estudante(matriculaEstudante, nomeEstudante, emailEstudante, enderecoEstudante, cpfEstudante));

                    String text = String.format("Estudante %s cadastrado(a)!", nomeEstudante);
                    JOptionPane.showMessageDialog(null, text, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }
                break;

            case "Estudante em uma disciplina":
                break;

            case "Estudante de uma disciplina":
                break;
            
            case "Disciplinas":
                StringBuilder disciplinasList = new StringBuilder();

                if(!disciplinas.isEmpty()) {
                    for (Disciplina disciplina : disciplinas) {
                        disciplinasList.append(disciplina.info()).append("\n");
                        disciplinasList.append(disciplina.listarEstudantes());
                    }
                    JOptionPane.showMessageDialog(null, disciplinasList, "Disciplinas", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Não há disciplinas cadastradas!", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
                break;

            case "Estudantes":
                StringBuilder estudantesList = new StringBuilder();

                if(!estudantes.isEmpty()) {
                    for (Estudante estudante : estudantes) {
                        estudantesList.append(estudante.info()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, estudantesList, "Estudantes", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Não há estudantes cadastrados!", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção desconhecida " + option);
                break;
        }
    }
}

import javax.swing.*;
import java.awt.event.*;

public class BattleshipMenu extends JFrame {
    public BattleshipMenu() {
        setTitle("Hundir la Flota");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("¡Hundir la Flota!");
        JButton startButton = new JButton("Empezar Juego");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new BattleshipGame().setVisible(true);
            }
        });

        panel.add(label);
        panel.add(startButton);
        add(panel);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BattleshipMenu().setVisible(true);
            }
        });
    }
}
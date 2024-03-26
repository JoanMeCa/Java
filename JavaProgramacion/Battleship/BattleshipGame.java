import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;

public class BattleshipGame extends JFrame {
    private JButton[][] buttons = new JButton[5][5];
    private boolean[][] tablero = new boolean[5][5];
    private int barcosRestantes = 5;
    private int disparosRestantes = 20;
    private JLabel infoLabel;

    public BattleshipGame() {
        setTitle("Hundir la Flota");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 450);

        JPanel gamePanel = new JPanel(new GridLayout(5, 5));
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(50, 50));
                button.addActionListener(new ButtonClickListener(i, j));
                buttons[i][j] = button;
                gamePanel.add(button);
            }
        }
        add(gamePanel, BorderLayout.CENTER);

        JPanel infoPanel = new JPanel(new BorderLayout());
        infoLabel = new JLabel("Disparos restantes: " + disparosRestantes + " | Barcos restantes: " + barcosRestantes);
        infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        infoPanel.add(infoLabel, BorderLayout.CENTER);
        add(infoPanel, BorderLayout.NORTH);

        colocarBarcosAleatorios();
        setLocationRelativeTo(null);
    }

    private void colocarBarcosAleatorios() {
        Random random = new Random();
        for (int i = 0; i < barcosRestantes; i++) {
            int x = random.nextInt(barcosRestantes);
            int y = random.nextInt(barcosRestantes);
            tablero[x][y] = true;
        }
    }

    private class ButtonClickListener implements ActionListener {
        private int x;
        private int y;

        public ButtonClickListener(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            if (tablero[x][y]) { 
                clickedButton.setBackground(Color.GREEN);
                barcosRestantes--; 
                if (barcosRestantes == 0) {
                    mostrarGifPopup("https://i.pinimg.com/originals/5a/47/0e/5a470e061d6a98f315f6f034d949f173.gif", "¡Yippee!");
                    volverAlMenu();
                }
            } else {
                clickedButton.setBackground(Color.RED); 
            }
            clickedButton.setEnabled(false); 
            disparosRestantes--; 
            if (disparosRestantes == 0 && barcosRestantes > 0) { 
                mostrarGifPopup("https://m.media-amazon.com/images/I/416h4telakL._UXNaN_FMjpg_QL85_.jpg", "Pathetic");
                volverAlMenu();
            }
            actualizarInfoLabel(); 
        }
    }

    private void mostrarGifPopup(String urlGif, String mensaje) {
        try {
            URL url = new URL(urlGif);
            ImageIcon gifIcon = new ImageIcon(url);
            JLabel gifLabel = new JLabel(gifIcon);
            JOptionPane.showMessageDialog(this, gifLabel, mensaje, JOptionPane.PLAIN_MESSAGE);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            
        }
    }

    private void volverAlMenu() {
        dispose();
        new BattleshipMenu().setVisible(true);
    }

    private void actualizarInfoLabel() {
        infoLabel.setText("Disparos restantes: " + disparosRestantes + " | Barcos restantes: " + barcosRestantes);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BattleshipGame().setVisible(true);
            }
        });
    }
}
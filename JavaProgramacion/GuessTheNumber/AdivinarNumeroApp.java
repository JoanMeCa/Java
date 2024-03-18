package GuessTheNumber;

import javax.swing.SwingUtilities;

public class AdivinarNumeroApp {
    public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
            AdivinarNumeroFrame frame = new AdivinarNumeroFrame();
            frame.setVisible(true);
        });
    }
}

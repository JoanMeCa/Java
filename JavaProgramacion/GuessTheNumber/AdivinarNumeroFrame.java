package GuessTheNumber;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdivinarNumeroFrame extends JFrame {
    private JLabel Label;
    private JTextField Text;
    private JButton Boton;
    private int numero;
    private int intentos;

    public AdivinarNumeroFrame() {
        setTitle("Adivina el numero:");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        setLocationRelativeTo(null);

        Label = new JLabel("Introduce un numero entre 1 y 100: ");
        Text = new JTextField(10);
        Boton = new JButton("Comprobar");

        numero = (int) (Math.random() * 100) + 1;
        intentos = 7;

        Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comprobarNumero();
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(Label);
        panel.add(Text);
        panel.add(Boton);

        add(panel);
    }

    private void comprobarNumero() {
        String input = Text.getText();
        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce un número.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean esNumero = true;
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                esNumero = false;
                break;
            }
        }
    
        if (!esNumero) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce un número válido.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int numeroelegido = Integer.parseInt(input);
        if (numeroelegido < 1 || numeroelegido > 100) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce un número entre 1 y 100.",
                    "Número Inválido", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (numeroelegido == 69) {
            JOptionPane.showMessageDialog(this, "Nice", 
            "Nice", JOptionPane.INFORMATION_MESSAGE);
        }
        if (numeroelegido == numero) {
            JOptionPane.showMessageDialog(this, "¡Felicidades! ¡Has adivinado el número, hay que ver lo listo que eres!", 
            "¡CORRECTO!", JOptionPane.INFORMATION_MESSAGE);
            reiniciarJuego();
        } else {
            intentos--;
            if (intentos > 0) {
                String mensaje = "¡MAL! Te quedan: " + intentos + " intentos.";
                if (numeroelegido < numero) {
                    mensaje += "\n El numero secreto es mayor";
                } else {
                    mensaje += "\n El numero secreto es menor";
                }
                JOptionPane.showMessageDialog(this, mensaje, "Intento Fallido", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "¡AGOTASTE TODOS TUS INTENTOS, INUTIL, ERES UNA VERGÜENZA PARA TU FAMILIA!", "¡INUTIL!", JOptionPane.WARNING_MESSAGE);
                reiniciarJuego();
            }
        }
        Text.setText("");
    }
    private void reiniciarJuego() {
        // Generar un nuevo número secreto y restablecer los intentos
        numero = (int) (Math.random() * 100) + 1;
        intentos = 7;
    }

}

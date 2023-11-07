package JavaInicio;

import java.util.Random;
import java.util.Scanner;

public class MonkeyIsland {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] BuenoInicio = {"Te diría que comencemos la pelea, pero parece que ya has perdido...", 
                                "No sabía que llamaron esta isla en honor a tu rostro.", 
                                "Buena suerte, la necesitarás."};
        String[] BuenoRemate = {"Oh, te refieres a DEEZ NUTS?", 
                                "Y sin embargo, tengo uno justo delante de mi!", 
                                "Vive la révolution!"};
        String[] BuenoContra = {"¿Practicas necrofilia? Quédate con tus fetiches...", 
                                "¡¿Oye, como puedes hablar así de tu familia?!", 
                                "¿Es su honor tan grande como su cuerpo?"};
        String[] MaloInicio = {"Disfrute de una buena noche con tu madre anoche...", 
                                "Te mandaré a morir con esos asquerosos monos!", 
                                "Por el honor de mi madre, venceré..."};
        String[] MaloContra = {"Mucho ruido y pocas nueces, si sabes a lo que me refiero...", 
                                "No sabía que los monos supieran hablar...", 
                                "Silencio! Prepárate para conocer al rey del esgrima!"};
        int Win = 0;
        int Lose = 0;
        boolean Jugar = true;
        Random random = new Random();
        int Primero = random.nextInt(2);
        while (Jugar == true) {
            int Respuestaal = random.nextInt(BuenoInicio.length);
            if (Primero == 0) {
                System.out.println("Tu empiezas!");
                System.out.println("Escoge tu puya inicial: ");
                System.out.println("1. " + BuenoInicio[0]);
                System.out.println("2. " + BuenoInicio[1]);
                System.out.println("3. " + BuenoInicio[2]);
                int EleccionBueno = input.nextInt();
                EleccionBueno--;
                System.out.println(BuenoInicio[EleccionBueno]);
                System.out.println(MaloContra[Respuestaal]);
                System.out.println("Como responderás?");
                System.out.println("1. " + BuenoRemate[0]);
                System.out.println("2. " + BuenoRemate[1]);
                System.out.println("3. " + BuenoRemate[2]);
                int RemateBueno = input.nextInt();
                RemateBueno--;
                System.out.println(BuenoRemate[RemateBueno]);
                if (RemateBueno == Respuestaal) {
                    System.out.println("Malo: ¡Ugh! ¡Te arrepentirás de esto!");
                    System.out.println("Bien hecho!");
                    System.out.println("Ganaste esta ronda.");
                    Win++;
                    Primero++;
                }
                else {
                    System.out.println("Malo: ¿Que clase de respuesta es esa? ¡JA!");
                    System.out.println("Oh no! Fallaste!");
                    System.out.println("Perdiste esta ronda.");
                    Lose++;
                    Primero++;
                }
            }
            if (Primero == 1) {
                System.out.println("El rival empieza!");
                System.out.println(MaloInicio[Respuestaal]);
                System.out.println("Como contraatacas?");
                System.out.println("1. " + BuenoContra[0]);
                System.out.println("2. " + BuenoContra[1]);
                System.out.println("3. " + BuenoContra[2]);
                int ContraBueno = input.nextInt();
                ContraBueno--;
                System.out.println(BuenoContra[ContraBueno]);
                if (ContraBueno == Respuestaal) {
                    System.out.println("Malo: Qu- ¡¿Como has podido?!");
                    System.out.println("Bien hecho!");
                    System.out.println("Ganaste esta ronda.");
                    Win++;
                    Primero--; 
                }
                else {
                    System.out.println("Malo: ¡JA! Te veo en problemas, ¿Necesitas que llame a tu mamá?");
                    System.out.println("Oh no! Fallaste!");
                    System.out.println("Perdiste esta ronda.");
                    Lose++;
                    Primero--;
                }
            }
            if (Lose >= 2) {
                System.out.println("Malo: Es suficiente, seguir sería aún más humillante que ser tú.");
                System.out.println("Oh no! Perdiste!");
                System.exit(0);
            }
            if (Win >= 2) {
                System.out.println("Malo: No es posible, no... NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
                System.out.println("FELICIDADES! HAS GANADO!");
                System.exit(0);
            }
        }
        input.close();
    }
}
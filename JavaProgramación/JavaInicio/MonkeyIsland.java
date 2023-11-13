package JavaInicio;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MonkeyIsland {
    public static void main(String[] args) {
        String Malo = "BaddyMcBadface";
        String Bueno = "GooddyMcGoodface";
        String[] BuenoInicio = {"Te diría que comencemos la pelea, pero parece que ya has perdido...", 
                                "No sabía que llamaron esta isla en honor a tu rostro.", 
                                "Buena suerte, la necesitarás.",
                                "¡He aquí, el eslabón perdido!",
                                "Venga, empezemos, tengo planes para esta noche...",
                                "¡Es hora de morir!",
                                "¿Listo para un duelo verbal? Adelante, dispara tu mejor insulto.",
                                "¡Vamos, no te quedes ahí parado! ¡Es hora de demostrar quién es el más astuto!"};
        String[] BuenoRemate = {"Oh, te refieres a DEEZ NUTS?", 
                                "Y sin embargo, tengo uno justo delante de mi!", 
                                "Vive la révolution!",
                                "¿El oído te empieza a fallar viejales?",
                                "¡Eso dijo ella!",
                                "¿Por? ¿Buscas pareja?",
                                "¡Deja de describirte y pelea!",
                                "Ok boomer"};
        String[] BuenoContra = {"¿Practicas necrofilia? Quédate con tus fetiches...", 
                                "¡¿Oye, como puedes hablar así de tu familia?!", 
                                "¿Es su honor tan grande como su cuerpo?",
                                "Bastante adecuado para luchar contra una vaca, no crees?",
                                "Es eso algo de lo que sentirse orgulloso?",
                                "¡Deja de mirarte al espejo y enfrentame!",
                                "Vaya, veo que te va el sadomaso...",
                                "¿Eso te dijo ella?"};
        String[] MaloInicio = {"Disfrute de una buena noche con tu madre anoche...", 
                                "Te mandaré a morir con esos asquerosos monos!", 
                                "Por el honor de mi madre, venceré...",
                                "Peleas como un ganadero!",
                                "¡Adelante! ¡No tardaré ni un minuto!",
                                "¡Jamás había visto algo tan feo!",
                                "¡Tus insultos no son más que gemidos de dolor!",
                                "¡Una lengua tan pequeña jamás podrá vencerme!"};
        String[] MaloContra = {"Mucho ruido y pocas nueces, si sabes a lo que me refiero...", 
                                "No sabía que los monos supieran hablar...", 
                                "Silencio! Prepárate para conocer al rey del esgrima!",
                                "¿Decías algo? Tus palabras me aburren...",
                                "Nunca había visto una cosa tan grande...",
                                "Veo poca compañía femenina, ¿acaso eres homosexual?",
                                "Tanta cabeza, y tan poca inteligencia...",
                                "Estos jóvenes... ¡No sabéis como insultar como toca!"};
        String[] MaloGana =   {"¿A eso llamas un insutlo? ¡JA! Patético.",
                                "Hasta mi abuela insulta mejor que tú.",
                                "¡JA! L + Ratio",
                                "¿Disculpa? ¿Por que narices dirías eso?"};
        String[] MaloPierde = {"¡Ugh! ¡Te arrepentirás de esto!",
                                "Eh- pues... NO TÚ. ¡UGH!",
                                "¡OYE! ¡Eso es falta!",
                                "¡Tch! ¡Trucos baratos!"};
        int Win = 0;
        int Lose = 0;
        boolean Jugar = true;
        Random random = new Random();
        int Primero = random.nextInt(2);
        Scanner input = new Scanner(System.in);
        System.out.println("Han pasado 7 años desde aquel día, aquel día en el que tu honor te fue arrebatado.");
        System.out.println("Pero Dios te ha otogado otra oportunidad, una oportunidad de vengarte de tu enemigo... " + Malo);
        System.out.println(Malo + ": Ah, " + Bueno + ", volvemos a encontrarnos...");
        System.out.println(Bueno + ": Y esta vez, no saldrás de aquí con vida...");
        System.out.println(Malo + ": Veamos si eres más que solo palabras... ¡EN GUARDIA!");
        while (Jugar == true) {
            int cantidadNumeros = 4;
            int rangoMinimo = 0;
            int rangoMaximo = BuenoInicio.length - 1;

            if (rangoMaximo - rangoMinimo + 1 < cantidadNumeros) {
                System.out.println("No es posible generar " + cantidadNumeros + " números sin repetir en el rango especificado.");
                return;
            }
            ArrayList<Integer> numerosGenerados = new ArrayList<>();
            while (numerosGenerados.size() < cantidadNumeros) {
                int numeroAleatorio = random.nextInt(rangoMaximo - rangoMinimo + 1) + rangoMinimo;

                if (!numerosGenerados.contains(numeroAleatorio)) {
                    numerosGenerados.add(numeroAleatorio);
                }
            }
            int numero1 = 0, numero2 = 0, numero3 = 0, numero4 = 0;
            if (numerosGenerados.size() == cantidadNumeros) {
                numero1 = numerosGenerados.get(0);
                numero2 = numerosGenerados.get(1);
                numero3 = numerosGenerados.get(2);
                numero4 = numerosGenerados.get(3);
            }
        String[] BuenoInicioRonda = {BuenoInicio[numero1], 
                                BuenoInicio[numero2], 
                                BuenoInicio[numero3],
                                BuenoInicio[numero4],};
        String[] BuenoRemateRonda = {BuenoRemate[numero1], 
                                BuenoRemate[numero2], 
                                BuenoRemate[numero3],
                                BuenoRemate[numero4],};
        String[] BuenoContraRonda = {BuenoContra[numero1], 
                                BuenoContra[numero2], 
                                BuenoContra[numero3],
                                BuenoContra[numero4],};
        String[] MaloInicioRonda = {MaloInicio[numero1], 
                                MaloInicio[numero2], 
                                MaloInicio[numero3],
                                MaloInicio[numero4],};
        String[] MaloContraRonda = {MaloContra[numero1], 
                                MaloContra[numero2], 
                                MaloContra[numero3],
                                MaloContra[numero4],};
            int Respuestaal = random.nextInt(MaloContraRonda.length);
            int Maloganal = random.nextInt(MaloGana.length);
            int Maloloseal = random.nextInt(MaloPierde.length);
            if (Lose > 2) {
                System.out.println(Malo + ": Ríndete " + Bueno + ", nunca podrás vencerme en mi terreno.");
                System.out.println(Bueno + ": ¡NO! No puedo rendirme, tengo que seguir... luchando...");
                System.out.println("Tus ojos se cierran y solo ves oscuridad");
                System.out.println("Has perdido");
                System.out.println("Si tan solo tuvieras una oportunidad");
                System.exit(0);
            }
            if (Win > 2) {
                System.out.println(Malo + ": ¡UGH...! ¿Como es posible...?");
                System.out.println(Bueno + ": Con esto, he vengado la muerte de mi padre...");
                System.out.println(Malo + ": Iluso... Yo no maté a tu padre...");
                System.out.println(Bueno + ": ¡Mentiras! Si no fuiste tú... ¿quién?");
                System.out.println(Malo + ": Tu... madre...");
                System.out.println("Has derrotado al hombre que mató a tu padre, pero sus últimas palabras traen una revelación trágica");
                System.out.println("Tu aventura no ha terminado");
                System.out.println("Tienes un nuevo objetivo...");
                System.out.println("Tu madre");
                System.exit(0);
            }
            if (Primero == 0) {
                System.out.println("Tu empiezas!");
                System.out.println("Escoge tu puya inicial: ");
                System.out.println("1. " + BuenoInicioRonda[0]);
                System.out.println("2. " + BuenoInicioRonda[1]);
                System.out.println("3. " + BuenoInicioRonda[2]);
                System.out.println("4. " + BuenoInicioRonda[3]);
                int EleccionBueno = input.nextInt();
                EleccionBueno--;
                System.out.println(Bueno + ": " + BuenoInicioRonda[EleccionBueno]);
                System.out.println(Malo + ": " + MaloContraRonda[Respuestaal]);
                System.out.println("Como responderás?");
                System.out.println("1. " + BuenoRemateRonda[0]);
                System.out.println("2. " + BuenoRemateRonda[1]);
                System.out.println("3. " + BuenoRemateRonda[2]);
                System.out.println("4. " + BuenoRemateRonda[3]);
                int RemateBueno = input.nextInt();
                RemateBueno--;
                System.out.println(Bueno + ": " + BuenoRemateRonda[RemateBueno]);
                if (RemateBueno == Respuestaal) {
                    System.out.println(Malo + ": " + MaloPierde[Maloloseal]);
                    System.out.println("Bien hecho!");
                    System.out.println("Ganaste esta ronda.");
                    Win++;
                    Primero++;
                }
                else {
                    System.out.println(Malo + ": " + MaloGana[Maloganal]);
                    System.out.println("Oh no! Fallaste!");
                    System.out.println("Perdiste esta ronda.");
                    Lose++;
                    Primero++;
                }
            }
            if (Primero == 1) {
                System.out.println("El rival empieza!");
                System.out.println(Malo + ": " + MaloInicioRonda[Respuestaal]);
                System.out.println("Como contraatacas?");
                System.out.println("1. " + BuenoContraRonda[0]);
                System.out.println("2. " + BuenoContraRonda[1]);
                System.out.println("3. " + BuenoContraRonda[2]);
                System.out.println("4. " + BuenoContraRonda[3]);
                int ContraBueno = input.nextInt();
                ContraBueno--;
                System.out.println(Bueno + ": " + BuenoContraRonda[ContraBueno]);
                if (ContraBueno == Respuestaal) {
                    System.out.println(Malo + ": " + MaloPierde[Maloloseal]);
                    System.out.println("Bien hecho!");
                    System.out.println("Ganaste esta ronda.");
                    Win++;
                    Primero--; 
                }
                else {
                    System.out.println(Malo + ": " + MaloGana[Maloganal]);
                    System.out.println("Oh no! Fallaste!");
                    System.out.println("Perdiste esta ronda.");
                    Lose++;
                    Primero--;
                }
            }
        }
        input.close();
    }
}
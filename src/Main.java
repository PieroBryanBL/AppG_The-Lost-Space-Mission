import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrect = false;

            System.out.println("|| La Misión Espacial Perdida ||");
            System.out.println("Estás a bordo de la nave espacial Kepler");
            System.out.println("en una misión de exploración espacial.");
            System.out.println("Tu objetivo es descubrir nuevos planetas habitables.");
            System.out.println("¿Deseas explorar un planeta rocoso, gaseoso");
            System.out.println("o uno con anillos?");
            System.out.println("----------");
            System.out.println("A. ¿Deseas explorar un planeta rocoso?");
            System.out.println("B. ¿Gaseoso?");
            System.out.println("C. ¿O con anillos?");
        System.out.println("----------");

        while (!isCorrect) {
            String decide = scanner.nextLine();

            switch (decide.toUpperCase()) {
                case "A" -> {
                    System.out.println("Aterrizas en el planeta rocoso y te encuentras");
                    System.out.println("con una atmósfera tóxica. Tus sistemas");
                    System.out.println("de soporte vital se dañan y la misión termina en fracaso.");
                    System.out.println("Vuelve a intentarlo.");
                    isCorrect = true;
                }
                case "B" -> {
                    System.out.println("Te adentras en el planeta gaseoso y las tormentas");
                    System.out.println("te rodean. Los sensores de la nave fallan");
                    System.out.println("y la misión termina en fracaso.");
                    System.out.println("Vuelve a intentarlo.");
                    isCorrect = true;
                }
                case "C" -> {
                    System.out.println("Aterrizas en el planeta con anillos y descubres una");
                    System.out.println("civilización alienígena avanzada. Estableces contacto");
                    System.out.println("pacífico y la humanidad se beneficia de su");
                    System.out.println("tecnología. La misión es un éxito.");
                    isCorrect = true;
                }
                default -> System.out.println("Opción inválida. Por favor, elige A, B o C.");
            }
        }
        scanner.close();
    }
}

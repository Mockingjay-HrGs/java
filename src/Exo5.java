public class Exo5 {
    public static void main(String[] args) {
        Integer existingVariable = null; // Remplacez par une valeur pour tester l'existence
        Integer result = java.util.Optional.ofNullable(existingVariable).orElse(42);
        System.out.println(result);
    }
}
public class Main {
    public static void main(String[] args) {
        int iterator = 1;
        int cont = 0;
        do {
            cont = iterator + cont;
            iterator++;
            System.out.println(cont);
        } while (iterator < 20);
    }
}
import java.util.Scanner;


public class Task1{
    public static void main(String[] args) {
               
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        String Figure = iScanner.nextLine();
        iScanner.close();
        int N = 0;
        try {
            N = Integer.parseInt(Figure);
            // System.out.println(N);  
        } 
        catch (NumberFormatException e) {  
            System.err.println("Неправильный формат строки!");  
        } 

        int sum = 0;
        int multi = 1;
        int step = 1;

        while (step<= N) {
            sum = sum + step;
            multi = multi * step;
            ++step;
        }

              
        System.out.println("n-ое треугольного число равно: " + sum);
        System.out.println("Факториал числа N равен: " + multi);

    }
}
//Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
public class Task_1 {

    public static void main(String[] args) {
        
        StringBuilder builder = new StringBuilder("Hello");
        StringBuilder builder1 = new StringBuilder("Hell");

        System.out.println(builder.toString().equals(builder1.toString()));
    }
    
}

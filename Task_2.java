//Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
public class Task_2 {

    public static void main(String[] args) {
        
        StringBuilder builder = new StringBuilder("Hello");
        StringBuilder builder1 = new StringBuilder("olleH");

        System.out.println(builder.toString().equals(builder1.reverse().toString()));
    }
}

//4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
public class Task_4_5 {

    public static void main(String[] args) {
        
        int x = 3;
       int y = 56;
       float z = ((float)x / (float)y);

       StringBuilder sum = new StringBuilder();
       sum
            .append(x)
            .append(" + ")
            .append(y)
            .append(" = ")
            .append(x + y)
            ;
        
        StringBuilder sub = new StringBuilder();
        sub
            .append(x)
            .append(" - ")
            .append(y)
            .append(" = ")
            .append(x - y)
            ;

        StringBuilder mul = new StringBuilder();
        mul
            .append(x)
            .append(" * ")
            .append(y)
            .append(" = ")
            .append(x * y)
            ;        

        StringBuilder div = new StringBuilder();
        div
            .append(x)
            .append(" / ")
            .append(y)
            .append(" = ")
            .append(z)
            ;
        
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);

//5.Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
        
        sum.insert(sum.indexOf("="),"Равно"); 
        sum.deleteCharAt(sum.indexOf("="));
        System.out.println(sum);
        
        sub.insert(sub.indexOf("="), "Равно"); 
        sub.deleteCharAt(sub.indexOf("="));
        System.out.println(sub);


//6.Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

        mul.replace(mul.indexOf("="), mul.indexOf("=") + 1, "Равно");
        System.out.println(mul);

        div.replace(div.indexOf("="), div.indexOf("=") + 1, "Равно");
        System.out.println(div);
    }
    
}

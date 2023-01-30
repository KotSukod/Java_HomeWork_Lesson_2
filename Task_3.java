//Напишите программу, чтобы перевернуть строку с помощью рекурсии.

public class Task_3 {

  static StringBuilder func (StringBuilder sb,StringBuilder sb1, int i){
    StringBuilder result;
    int ind = sb.length() - 1;

    if (i == sb.length()){
      return sb1;
    }
    sb1.append(sb.charAt(ind -i));
    i ++;
    result = func(sb,sb1, i);
    return result;

  }

    public static void main(String[] args) {

  
        StringBuilder str =  new StringBuilder("Hello World");
        StringBuilder str1 =  new StringBuilder("");


        System.out.println(func(str,str1,0));
        


    }
    
}

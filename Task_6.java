public class Task_6 {

    public static void main(String[] args) {
        
        String str = "=";
        StringBuilder str1 = new StringBuilder("=");
        for (int i = 1; i < 100001; i++){
            str += "=";
            str1.append("=");
        }
        
        

        
        
       double start = System.currentTimeMillis();
       str.replace('=', '+');
        double end = System.currentTimeMillis();

        double start1 = System.currentTimeMillis();
        for (int i = 0; i < str1.length(); i++){ 
           str1.setCharAt(i, '+');
       }
        double end1 = System.currentTimeMillis();
       System.out.println(end - start);
       System.out.println(end1 - start1);
    }
    
}

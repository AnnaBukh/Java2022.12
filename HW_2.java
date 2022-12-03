package HW_1;
// Вывести все простые числа от 1 до 1000

public class HW_2 {
    
    public static void main(String[] args) {
        for (int i = 2; i < 998; i++){
            boolean k = true;

            for (int j = 2; j < i; j ++){
                if(i % j == 0){
                    k = false;
                    break;
                }
            }
            if (k){
                System.out.print(i + " ");
            }  
        }
    }
}


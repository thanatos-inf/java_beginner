package practice.P1;

public class task_1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        int c = 2;
        int d = 1;
        int res = 0;
        int count1 = 0;
        int count2 = 0;
        
        while (a < b){
            res = a;
            a = a * c;
            count1 +=1;
        if (a > b){
            while(res < b){
                res += d;
                count2 += 1;
            }
        for (int i = 0; i < (count1 - 1); i++){
            System.out.print("K1");
        }
        for (int i = 0; i <(count2); i++){
            System.out.print("K2");
        }        
        }
        }
    }
}

    

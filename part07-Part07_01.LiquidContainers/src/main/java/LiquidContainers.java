
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 =0, container2 =0;
        System.out.println("First: " + container1 + "/100");
        System.out.println("Second: " + container2 + "/100");
        while (true) {
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }else{
                String[] parts = input.split(" ");
                String userInput = parts[0];
                int amount = Integer.valueOf(parts[1]);
                
                if(userInput.equals("add")){
                    if(amount >0){
                        container1 += amount;
                    }
                    if(container1 > 100){
                        container1 = 100;
                    }
                    System.out.println("First: " + container1 + "/100");
                    System.out.println("Second: " + container2 + "/100");
                }else{
                    if(userInput.equals("move")){
                       if(amount > 0){
                               if(amount < container1){
                                   container1 -= amount;
                                   container2 += amount;
                               }else{
                                   container2 += container1;
                                   container1 =0;
                               }
                           }
                           if(container2 >100){
                               container2 =100;
                           }else{
                           if(container1 <0){
                               container1 =0;
                           }
                           }
                            
                        System.out.println("First: " + container1 + "/100");
                        System.out.println("Second: " + container2 + "/100");
                    
                    }else{
                        if(userInput.equals("remove")){
                            if(amount >0){
                                container2 -= amount;
                            }
                            if(container2 <0){
                                container2 =0;
                            }
                            System.out.println("First: " + container1 + "/100");
                            System.out.println("Second: " + container2 + "/100");
                        }
                    }
                } 
            }
        }
    }
}




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heals
 */
import java.util.Scanner;

public class UI {
    private Scanner scan;
    private Container first;
    private Container second;
    
    public UI (Scanner scan, Container first, Container second){
        this.scan = scan;
        this.first = first;
        this.second = second;
    }
    
    public void start(){
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        while (true) {
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }else{
                String[] parts = input.split(" ");
                String userInput = parts[0];
                int amount = Integer.valueOf(parts[1]);
                if(userInput.equals("add")){
                    this.first.add(amount);
                    System.out.println("First: " + first);
                    System.out.println("Second: " + second);
                }else{
                    if(userInput.equals("remove")){
                        second.remove(amount);
                        System.out.println("First: " + first);
                        System.out.println("Second: " + second);
                    }else{
                        if(userInput.equals("move")){
                            if(amount > 0){
                                if(amount < first.contains()){
                                first.remove(amount);
                                second.add(amount); 
                            }else{
                                second.add(first.contains());
                                first.remove(first.contains());
                            }
                            System.out.println("First: " + first);
                            System.out.println("Second: " + second);
                           
                           }
                        }
                    }
                }
            }
        }
    }
}


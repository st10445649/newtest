/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decisionstwo;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class DecisionsTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Program to calculate speed
        //declare variables
        int speed;
        Scanner kb = new Scanner(System.in);
        
       
        System.out.println("Welcome to speed calculator, please enter speed:");
        speed = kb.nextInt();
        
        if (speed <= 80) {
            System.out.println("Pension mode");
        } else if (speed >= 81 && speed <=139){
            System.out.println("Between");
        }
        else {
            System.out.println("You're going to die");
        }
        
    }
    
}

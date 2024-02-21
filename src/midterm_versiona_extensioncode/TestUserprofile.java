/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author arman
 */
public class TestUserprofile {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Available genres:");
        String[] genres =  {"Comedy", "Drama", "Action", "Mystery"};
        for(String genre : genres){
            System.out.println(genre);
        }
        
        System.out.println("Enter your Userid");
        String user_id = input.nextLine();
        
        System.out.print("Enter your genre");
        String genre_selected = input.nextLine();
        
        
        boolean match = false;
        for(String genre: genres){
            if(genre.equals(genre_selected)){
                match = true;
                break;
            }
        }
        
        if(match){
           //Userprofile user1 = new Userprofile(user_id,genre_selected );
           System.out.println("userProfile is created.");
        }else{
           System.out.println("useProfile not created."); 
        }
        
    }
}

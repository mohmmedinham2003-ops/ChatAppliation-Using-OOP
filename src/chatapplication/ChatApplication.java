/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatapplication;

/**
 *
 * @author Inham
 */
public class ChatApplication {

 
    public static void main(String[] args) {

        ChatRoom room = new ChatRoom();

        User user1 = new Sender("John");
        User user2 = new Sender("Sarah");

        room.addUser(user1);
        room.addUser(user2);

        room.sendMessage(user1, "Hello everyone!");
        room.sendMessage(user2, "Hi John!");
        
        room.displayMessage();
    
    }
}
    

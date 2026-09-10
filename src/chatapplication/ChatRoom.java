/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapplication;

import java.util.ArrayList;

/**
 *
 * @author Inham
 */
class ChatRoom {

    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Message> messages = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void sendMessage(User user, String text) {
        user.sendMessage(text);
        Message message = new Message(user, text);
        messages.add(message);
    }
    
    public void displayMessage(){
        for(Message message : messages){
            message.displayMessage();
        }
    }
    
}

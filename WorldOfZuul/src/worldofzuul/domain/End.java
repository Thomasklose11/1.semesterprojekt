
package worldofzuul.domain;

public class End {
    
    public static void end(){
        if(Rooms.getCurrentRoom() == Rooms.getEndRoom() && Rooms.getEndRoom().hasItems == false){
            
            SendMail.mail();
            Game.endGame();
            
        }
            
    }
    
    
}

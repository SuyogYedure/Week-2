import java.util.Scanner;
class Rockpaper{
  public static void main(String args[]) {
    
    
    Scanner s = new Scanner(System.in);
    char player,computer;
    
        
    System.out.println("Make a move! (rock/paper/scissors)");
    String playerMove = s.nextLine();
      
    
    int num;
    int number = num.nextInt();
        
    String computerMove;
    if (num == 0) {
        computerMove = "rock";
    } else if (num == 1) {
        computerMove = "paper";
    } else {
        computerMove = "scissors";
    }
    System.out.println("Computer chose " + computerMove + "!");
  
    
    if (playerMove.equals(computerMove)) {
        System.out.println("It's a draw!");
    } 
    else if (playerWins(playerMove, computerMove)) {
        System.out.println("Player wins!");
    }
    else {
        System.out.println("Computer wins!");
    }
  
 }
}

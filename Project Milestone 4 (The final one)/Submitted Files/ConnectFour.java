public class ConnectFour{
 
 
 public static void main(String[] args){
  
  //Create new board object
  Board a=new Board(6,7);
  //Set player tokens for player 1 and player 2
  a.setPlayerOne('X');
  a.setPlayerTwo('O');
 
  Player p1 = new HumanPlayer(1,6,7);
  Player p2 = new HumanPlayer(2,6,7); //comment this line when testing AIPlayer
  
  //Player p2 = new AIPlayer(2,6,7); //uncomment this line when testing AIPlayer
  
  CFGUI connect4=new CFGUI(a, ChipColor.RED, ChipColor.BLACK);
  a.setPlayerOne('X');
  a.setPlayerTwo('O');
  
 
  while((a.isFinished()!=1) && (a.isFinished()!=2) && a.canPlay()==true){
   a.play(p1.getPlayerID(),p1.playToken());
   connect4.redraw();
   if(a.isFinished()==1){
    connect4.gameOver(1);
    connect4.close();
    break;
   }
   a.play(p2.getPlayerID(),p2.playToken());
   connect4.redraw();
   if(a.isFinished()==2){
    connect4.gameOver(2);
    connect4.close();
    break;
   }
  }

 }
 
}
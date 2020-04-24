public class HumanPlayer implements Player{
//do not change the line above 
 
 //Define your fields here
 private int playerID;
 private int row;
 private int col;
 private int[][] arr;
 private int lastRow;
 private int lastCol;
 
 

 public HumanPlayer(int playerID, int row, int col){
  this.playerID=playerID;
  this.row=row;
  this.col=col;
  this.arr=new int[row][col];
 }
 
 public void lastMove(int c) {
  this.lastCol=c;
  for(int i=1;i<this.row;i++){
   if(arr[i][c]!=0){
    lastRow=i-1;
    arr[i-1][c]=this.playerID+1;
    break;
   }
   else if(i==this.row-1){
    lastRow=i;
    arr[i][c]=playerID+1;
    break;
   }
  } 
 }
 
 public int playToken(){
  int token=GIO.readInt(this.playerID+"  Which column do you want to place?");
  while(token>=this.col||token<0||arr[0][token]!=0){
   token=GIO.readInt("Error! Which column do you want to place?");
  }
  for(int i=arr.length-1;i>=0;i--){
   if(arr[i][token]==0){
    arr[i][token]=this.playerID;
    break;
   }
  }
  return token;
 }
 
 //get this player's id
 public int getPlayerID(){
  return this.playerID;
 }
 
 //resets the state of the player in preparation for a new game
 public void reset(){
  this.row=0;
  this.col=0;
  this.playerID=0;
  this.arr=null;
  this.lastRow=0;
  this.lastCol=0;
 }
}
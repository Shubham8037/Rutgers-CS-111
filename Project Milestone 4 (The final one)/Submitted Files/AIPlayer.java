
public class AIPlayer implements Player{
	
    private int playerID;
    private int row;
    private int col;
    private int[][] arr;
    private int random;
    
    public AIPlayer(int playerID, int row, int col){
        this.playerID=playerID;
        this.row=row;
        this.col=col;
        arr=new int[row][col];
    }
    
  
    public void lastMove(int c) {

		for(int i=row-1;i>=0;i--){
			if(arr[i][c]==0){
				if(playerID==1){
					arr[i][c]=2;
					break;
				}
				if(playerID==2){
					arr[i][c]=1;
					break;
				}
			}
		}
    }
    
    //returns column of where to play a token
    public int playToken(){
		//H
        for(int i=0;i<=col-4;i++){
            if(arr[row-1][i]==arr[row-1][i+1]&&arr[row-1][i+1]==arr[row-1][i+2]&&arr[row-1][i]!=0){
                if(arr[row-1][i+3]==0){
                    return i+3;
                }
                
            }
        }
		//H
		for(int i=1;i<=col-4;i++){
        	if(arr[row-1][i]==arr[row-1][i+1]&&arr[row-1][i+1]==arr[row-1][i+2]&&arr[row-1][i]!=0){
        		if(arr[row-1][i-1]==0){
        			return i-1;
        		}
        	}
        }
		//H
        for(int i=0;i<=col-1;i++){
            for(int j=row-1;j>=3;j--){
                if(arr[j][i]==arr[j-1][i]&&arr[j-1][i]==arr[j-2][i]&&arr[j-3][i]==0&&arr[j][i]!=0){
                    arr[j-3][i]=playerID;
                    return i;
                }
            }
        }    
        //H
        for(int i=0;i<=row-2;i++){
        	for(int j=0;j<=col-4;j++){
        		if(arr[i][j]==arr[i][j+1]&&arr[i][j+1]==arr[i][j+2]&&arr[i][j]!=0){
        				if(arr[i][j+3]==0&&arr[i+1][j+3]==0){
        					return j+3;
        				}
        			}
        	}
        }
		//V
        for(int i=0;i<=row-2;i++){
        	for(int j=1;j<=col-4;j++){
        		if(arr[i][j]==arr[i][j+1]&&arr[i][j+1]==arr[i][j+2]&&arr[i][j]!=0){
        				if(arr[i][j-1]==0&&arr[i+1][j-1]==0){
        					return j-1;
        				}
        			}
        	}
        }
        random=(int)(Math.random()*col);
        while(arr[0][random]!=0){
        	random=(int)(Math.random()*col);
        }
        for(int i=row-1;i>=0;i--){
        	if(arr[i][0]==0){
        		if(playerID==1){
        			arr[i][0]=1;
        		}
        		if(playerID==2){
        			arr[i][0]=2;
        		}
        	}
        }
        return random;
    }
    
    //get this player's id
    public int getPlayerID(){
        return playerID;
    }
    
   
    public void reset(){
        for(int i=0;i<=row-1;i++){
            for(int j=0;j<=col-1;j++){
                arr[i][j]=0;
            }
        }
    }
}
public class Board {
	private int row=0;
	private int column=0;
	private char one;
	private char two;
	private char[][] board;

	
	Board()
   {
		row=6;column=7;
		this.board= new char[6][7];
		for(int i=0;i<6;i++){
			for(int j=0;j<7;j++)
         {
				board[i][j]=' ';
			}
		}
	} 
	Board(int r, int c){
		if(r<0 || c<0)
      {
      row=6;column=7;
		this.board= new char[6][7];
		for(int i=0;i<6;i++)
      {
			for(int j=0;j<7;j++)
         {
				board[i][j]=' ';
			}
		}
      }
		else{row=r;column=c;
		this.board= new char[r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				board[i][j]=' ';
			}
		}
      }
		} 

	public int getNumRows(){return this.row;} 
	public int getNumCols(){return this.column;} 

	public char getPlayerOne(){return one;} 
	public char getPlayerTwo(){return two;} 

	public void setPlayerOne(char o){one = o;} 
	public void setPlayerTwo(char t){two = t;} 

	public char getToken(int row, int col){
		if(row>=0&&row<this.row&&col>=0&&col<column){return board[row][col];}
		else{return '\0';}
	} 

	public boolean canPlay(){
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				if(board[i][j]==' '){return true;}
			}
		}
		return false;
	} 

	public boolean play(int p, int c){
		if(c>=column|c<0){return false;}
		else if(p==1){
			for(int i=row-1;i>=0;i--){
				if(board[i][c]==' '){
					board[i][c]=one;
					return true;
				}
			}
		}
		else if(p==2){
			for(int i=row-1;i>=0;i--){
				if(board[i][c]==' '){
					board[i][c]=two;
					return true;
				}
			}
		}
		return false;
	} 

	public int isFinished(){
		if(this.canPlay()==false){
			return 0;
		}
		int count = 0;
		for(int i=0;i<row;i++){
		for(int j=0;j<column;j++){
			if(count==4){
				return 1;
			}
			else if(board[i][j]==one){
				count++;
			}
			else {count=0;}
		}
	}
		for(int i=0;i<column;i++){
			for(int j=0;j<row;j++){
				if(count==4){
					return 1;
				}
				else if(board[j][i]==one){
					count++;
				}
				else {count=0;}
			}
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				if(count==4){
					return 2;
				}
				else if(board[i][j]==two){
					count++;
				}
				else {count=0;}
			}
		}
			for(int i=0;i<column;i++){
				for(int j=0;j<row;j++){
					if(count==4){
						return 2;
					}
					else if(board[j][i]==two){
						count++;
					}
					else {count=0;}
				}
			}
			for(int i=0;i<row;i++){
				for(int j=0;j<column;j++){
					if(j<row-3&&i<row-3){if(board[i][j]==one&&board[i+1][j+1]==one&&board[i+2][j+2]==one&&board[i+3][j+3]==one){
						return 1;
					}}
				}
			}
			for(int i=0;i<row;i++){
				for(int j=0;j<column;j++){
					if(j>=3&&i<row-3){if(board[i][j]==one&&board[i+1][j-1]==one&&board[i+2][j-2]==one&&board[i+3][j-3]==one){
						return  1;
					}}
				}
			}


			for(int i=0;i<row;i++){
				for(int j=0;j<column;j++){
					if(j<row-3&&i<row-3){if(board[i][j]==two&&board[i+1][j+1]==two&&board[i+2][j+2]==two&&board[i+3][j+3]==two){
						return 2;
					}}
				}
			}
			
			for(int i=0;i<row;i++){
				for(int j=0;j<column;j++){
					if(j>=3&&i<row-3){if(board[i][j]==two&&board[i+1][j-1]==two&&board[i+2][j-2]==two&&board[i+3][j-3]==two){
						return 2;
					}}
				}
			}
		return -1;
	} 
public void printBoard(){
	for(int i=0;i<=this.getNumRows()-1;i++){
		for(int j=0;j<=this.getNumCols()-1;j++){
			System.out.print(this.board[i][j]+" ");
		}
		System.out.println("");
	}
}
}
package first;
import java.util.Scanner;


public class TicTac {
	// array to hold x or o in each space (default value is "_")
	public static char[] place={'_','_','_','_','_','_','_','_','_'};
	//variavle to hold x or o;
	public static char team = '_';
	public static char opp = '_';
	public static String usrStr;
	public static void main(String args[]){
		System.out.println("welcome to tic tac toe!");
		setup();
	}
	public static void drawBoard(){
		// draw the game baord
		System.out.println("\n\t   A   B   C");
		System.out.println("\t  .-----------.");
		System.out.println("\t1 |_"+TicTac.place[0]+"_|_"+TicTac.place[1]+"_|_"+TicTac.place[2]+"_|\n");
		System.out.println("\t2 |_"+TicTac.place[3]+"_|_"+TicTac.place[4]+"_|_"+TicTac.place[5]+"_|\n");
		System.out.println("\t3 |_"+TicTac.place[6]+"_|_"+TicTac.place[7]+"_|_"+TicTac.place[8]+"_|");
		System.out.println("\t  '-----------'");
	}
	public static void setup(){
		//loop to reset the baord/game
		for(int i=0;i<9;i++){
			TicTac.place[i]='_';
		}
		drawBoard();
		while((TicTac.team != 'X') && (TicTac.team != 'O')){
			System.out.println("\n\nselect your team enter X or O below");
			System.out.print("Enter your selection:");
			Scanner input=new Scanner(System.in);
			TicTac.usrStr=input.next();
			if(TicTac.usrStr.toUpperCase().equals("X")){
				TicTac.team='X';
				TicTac.opp='O';
			}
			else if(TicTac.usrStr.toUpperCase().equals("O")){
				TicTac.team='O';
				TicTac.opp='X';
			}
			else{
				System.out.println("You entered :"+usrStr);{
					System.out.println("this is not a valid optiuon plase enter either X or O to continue");
				}
			}
			
		}
		System.out.println("you are team"+TicTac.team);
		game();
	}
	public static void game(){
		boolean loop = true;
		System.out.println("its your turn");
		drawBoard();
		do{
			System.out.println("\n\n choose a coloumn and row to place an "+TicTac.team+":Example A1\n");
			System.out.print("enter your selection");
			Scanner input=new Scanner(System.in);
			TicTac.usrStr=input.next().toUpperCase();
			
			
			
			switch(TicTac.usrStr){
			case "A1" : if(TicTac.place[0]=='_'){
					TicTac.place[0] = TicTac.team;
					System.out.println("\n you placed an "+TicTac.team +"in A1");
					
					oppmove();
					loop=false;
				}
					else if(TicTac.place[0]==TicTac.team){
							System.out.print("\nthere is an" +TicTac.team+"there already");
							
					}
					else if(TicTac.place[0]==TicTac.opp){
							System.out.println("\nthis space is already taken by the opponent");
					};
					break;
			
			case "B1" :if(TicTac.place[1]=='_'){
				TicTac.place[1] = TicTac.team;
				System.out.println("\n you placed an "+TicTac.team +"in B1");
				oppmove();
				loop=false;
			}
				else if(TicTac.place[1]==TicTac.team){
						System.out.print("\nthere is an" +TicTac.team+"there already");
						
				}
				else if(TicTac.place[1]==TicTac.opp){
						System.out.println("\nthis space is already taken by the opponent");
				};
				break;
		

				case "C1" :if(TicTac.place[2]=='_'){
					TicTac.place[2] = TicTac.team;
					System.out.println("\n you placed an "+TicTac.team +"in A1");
					oppmove();
					loop=false;
				}
					else if(TicTac.place[2]==TicTac.team){
							System.out.print("\nthere is an" +TicTac.team+"there already");
							
					}
					else if(TicTac.place[0]==TicTac.opp){
							System.out.println("\nthis space is already taken by the opponent");
					};
					break;
				
				case "A2" :if(TicTac.place[3]=='_'){
					TicTac.place[3] = TicTac.team;
					System.out.println("\n you placed an "+TicTac.team +"in A2");
					oppmove();
					loop=false;
				}
					else if(TicTac.place[3]==TicTac.team){
							System.out.print("\nthere is an" +TicTac.team+"there already");
							
					}
					else if(TicTac.place[0]==TicTac.opp){
							System.out.println("\nthis space is already taken by the opponent");
					};
					break;
				
				case "B2" :if(TicTac.place[4]=='_'){
					TicTac.place[4] = TicTac.team;
					System.out.println("\n you placed an "+TicTac.team +"in B2");
					oppmove();
					loop=false;
				}
					else if(TicTac.place[4]==TicTac.team){
							System.out.print("\nthere is an" +TicTac.team+"there already");
							
					}
					else if(TicTac.place[4]==TicTac.opp){
							System.out.println("\nthis space is already taken by the opponent");
					};
					break;
				
				case "C2" : if(TicTac.place[5]=='_'){
					TicTac.place[5] = TicTac.team;
					System.out.println("\n you placed an "+TicTac.team +"in C2");
					oppmove();
					loop=false;
				}
					else if(TicTac.place[5]==TicTac.team){
							System.out.print("\nthere is an" +TicTac.team+"there already");
							
					}
					else if(TicTac.place[5]==TicTac.opp){
							System.out.println("\nthis space is already taken by the opponent");
					};
					break;
				
				case "A3" :if(TicTac.place[6]=='_'){
					TicTac.place[6] = TicTac.team;
					System.out.println("\n you placed an "+TicTac.team +"in A3");
					oppmove();
					loop=false;
				}
					else if(TicTac.place[6]==TicTac.team){
							System.out.print("\nthere is an" +TicTac.team+"there already");
							
					}
					else if(TicTac.place[6]==TicTac.opp){
							System.out.println("\nthis space is already taken by the opponent");
					};
					break;
				
				case "B3" :if(TicTac.place[7]=='_'){
					TicTac.place[0] = TicTac.team;
					System.out.println("\n you placed an "+TicTac.team +"in B3");
					oppmove();
					loop=false;
				}
					else if(TicTac.place[7]==TicTac.team){
							System.out.print("\nthere is an" +TicTac.team+"there already");
							
					}
					else if(TicTac.place[7]==TicTac.opp){
							System.out.println("\nthis space is already taken by the opponent");
					};
					break;
				
				
				case "C3" :if(TicTac.place[8]=='_'){
					TicTac.place[8] = TicTac.team;
					System.out.println("\n you placed an "+TicTac.team +"in C3");
					oppmove();
					loop=false;
				}
					else if(TicTac.place[8]==TicTac.team){
							System.out.print("\nthere is an" +TicTac.team+"there already");
							
					}
					else if(TicTac.place[8]==TicTac.opp){
							System.out.println("\nthis space is already taken by the opponent");
					};
					break;
		}
		
		
		
	}
		while(loop);
			
		checkWin();
				
	}
	public static void oppmove(){
		while(true){
			if((TicTac.place[0]=='_') || (TicTac.place[1]=='_')|| (TicTac.place[2]=='_')||(TicTac.place[3]=='_')||(TicTac.place[4]=='_')||(TicTac.place[5]=='_')||(TicTac.place[6]=='_')||(TicTac.place[7]=='_')||(TicTac.place[8]=='_')){
				float rn=(float) Math.random();
				float m=rn*8;
				int x=Math.round(m);
				if(TicTac.place[x]=='_'){
					TicTac.place[x]=TicTac.opp;
					break;
				}
			}
			else{
				checkWin();
				break;
			}
		}
	}
	public static void checkWin(){
		if((TicTac.place[0]=='X') && (TicTac.place[1]=='X') &&(TicTac.place[2]=='X') ){
			System.out.println(" \n\n\n\t X wins");
			drawBoard();
			playAgain();
			System.out.println("\n\n\n");
			
		}
		else if((TicTac.place[3]=='X') && (TicTac.place[4]=='X') &&(TicTac.place[5]=='X') ){
			System.out.println(" \n\n\n\t X wins");
			drawBoard();
			playAgain();
			System.out.println("\n\n\n");
			
		}
		else if((TicTac.place[6]=='X') && (TicTac.place[7]=='X') &&(TicTac.place[8]=='X') ){
			System.out.println(" \n\n\n\t X wins");
			drawBoard();
			playAgain();
			System.out.println("\n\n\n");
			
		}else if((TicTac.place[0]=='X') && (TicTac.place[3]=='X') &&(TicTac.place[6]=='X') ){
			System.out.println(" \n\n\n\t X wins");
			drawBoard();
			playAgain();
			System.out.println("\n\n\n");
			
		}else if((TicTac.place[0]=='X') && (TicTac.place[4]=='X') &&(TicTac.place[8]=='X') ){
			System.out.println(" \n\n\n\t X wins");
			drawBoard();
			playAgain();
			System.out.println("\n\n\n");
			
		}else if((TicTac.place[2]=='X') && (TicTac.place[4]=='X') &&(TicTac.place[6]=='X') ){
			System.out.println(" \n\n\n\t X wins");
			drawBoard();
			playAgain();
			System.out.println("\n\n\n");
			
		}
		// now for o
		if((TicTac.place[0]=='O') && (TicTac.place[1]=='O') &&(TicTac.place[2]=='O') ){
			System.out.println(" \n\n\n\t O wins");
			drawBoard();
			playAgain();
			System.out.println("\n\n\n");
			
		}
		else if((TicTac.place[3]=='O') && (TicTac.place[4]=='O') &&(TicTac.place[5]=='O') ){
			System.out.println(" \n\n\n\t O wins");
			drawBoard();
			playAgain();
			System.out.println("\n\n\n");
			
		}
		else if((TicTac.place[6]=='O') && (TicTac.place[7]=='O') &&(TicTac.place[8]=='O') ){
			System.out.println(" \n\n\n\t O wins");
			drawBoard();
			playAgain();
			System.out.println("\n\n\n");
			
		}else if((TicTac.place[0]=='O') && (TicTac.place[3]=='O') &&(TicTac.place[6]=='O') ){
			System.out.println(" \n\n\n\t O wins");
			drawBoard();
			playAgain();
			System.out.println("\n\n\n");
			
		}else if((TicTac.place[0]=='O') && (TicTac.place[4]=='O') &&(TicTac.place[8]=='X') ){
			System.out.println(" \n\n\n\t O wins");
			drawBoard();
			playAgain();
			System.out.println("\n\n\n");
			
		}else if((TicTac.place[2]=='O') && (TicTac.place[4]=='O') &&(TicTac.place[6]=='O') ){
			System.out.println(" \n\n\n\t O wins");
			drawBoard();
			playAgain();
			System.out.println("\n\n\n");
			
		}
		else if((TicTac.place[0]!='_') && (TicTac.place[1]!='_') && (TicTac.place[2]!='_') && (TicTac.place[3]!='_') && (TicTac.place[4]!='_') && (TicTac.place[5]!='_') && (TicTac.place[6]!='_') && (TicTac.place[7]!='_') && (TicTac.place[8]!='_'))
		{
			System.out.println("\n\n\n TIE GAME!!!!!");
			drawBoard();
			playAgain();
			System.out.println("\n\n\n");
		}
		else{
			game();
		}
		
	}
	public static void playAgain(){
		System.out.println("\n\n Play again ? [y/n]:\n");
		
		Scanner input=new Scanner(System.in);
		TicTac.usrStr=input.next().toLowerCase();
		if(usrStr.equals("y")){
			TicTac.team='_';
			TicTac.opp='_';
			setup();
		}
		else{
			System.exit(0);
		}
	}
}

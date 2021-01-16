import java.util.Scanner;

public class game {
    private static String[][] Board = new String [8][8];
    
    private static String player1="B";
    private static String player2="R";
    private static String currentPlayer=player1;
    
    
    public static void main(String[] args){
        
        initializeBoard(Board);
        while(checkWin(Board)==""){
            displayBoard(Board);

            if(movenormalPiece(currentPlayer)){
                if(currentPlayer==player1){
                    currentPlayer=player2;
                } 
                else{
                    currentPlayer=player1;
                }
            }
        }


        displayBoard(Board);

        System.out.print(checkWin(Board));
        System.out.print(" won the game");
        System.out.println("");
        System.exit(0);
    }
    
//==============================================================================
    
    public static void initializeBoard(String Board[][]){
        
        for(int column=0; column<8; column++){
            for(int row=0; row<8; row++){
                
                if((row==0 && column==0) || (row==2 && column==0) || (row==4 && column==0) || (row==6 && column==0)){
                    Board[column][row]="□";
                }
                if((row==1 && column==1) || (row==3 && column==1) || (row==5 && column==1) || (row==7 && column==1)){
                    Board[column][row]="□";
                }
                if((row==0 && column==2) || (row==2 && column==2) || (row==4 && column==2) || (row==6 && column==2)){
                    Board[column][row]="□";
                }
                if((row==1 && column==3) || (row==3 && column==3) || (row==5 && column==3) || (row==7 && column==3)){
                    Board[column][row]="□";
                }
                if((row==0 && column==4) || (row==2 && column==4) || (row==4 && column==4) || (row==6 && column==4)){
                    Board[column][row]="□";
                }
                if((row==1 && column==5) || (row==3 && column==5) || (row==5 && column==5) || (row==7 && column==5)){
                    Board[column][row]="□";
                }
                if((row==0 && column==6) || (row==2 && column==6) || (row==4 && column==6) || (row==6 && column==6)){
                    Board[column][row]="□";
                }
                if((row==1 && column==7) || (row==3 && column==7) || (row==5 && column==7) || (row==7 && column==7)){
                    Board[column][row]="□";
                }
            }
        }
        for(int column=0; column<8; column++){
            for(int row=0; row<8; row++){
                    
                if((row==1 && column==0) || (row==3 && column==0) || (row==5 && column==0) || (row==7 && column==0)){
                    Board[column][row]="R";
                }
                if((row==0 && column==1) || (row==2 && column==1) || (row==4 && column==1) || (row==6 && column==1)){
                    Board[column][row]="R";
                }
                if((row==1 && column==2) || (row==3 && column==2) || (row==5 && column==2) || (row==7 && column==2)){
                    Board[column][row]="R";
                }
                if((row==0 && column==3) || (row==2 && column==3) || (row==4 && column==3) || (row==6 && column==3)){
                    Board[column][row]="■";
                }
                if((row==1 && column==4) || (row==3 && column==4) || (row==5 && column==4) || (row==7 && column==4)){
                    Board[column][row]="■";
                }
                if((row==0 && column==5) || (row==2 && column==5) || (row==4 && column==5) || (row==6 && column==5)){
                    Board[column][row]="B";
                }
                if((row==1 && column==6) || (row==3 && column==6) || (row==5 && column==6) || (row==7 && column==6)){
                    Board[column][row]="B";
                }
                if((row==0 && column==7) || (row==2 && column==7) || (row==4 && column==7) || (row==6 && column==7)){
                    Board[column][row]="B";
                }
            }
        }
    }
    
//==============================================================================
    
    public static void displayBoard(String Board[][]){
        
        for(int column=0; column<8; column++){
            for(int row=0; row<8; row++){
                System.out.print(Board[column][row]);
            }
            System.out.println("");
        }
        
    }
    
//==============================================================================

public static boolean movenormalPiece(String currentPlayer){
    
        Scanner input=new Scanner(System.in);
        
        int column=0;
        int row=0;
        int column2=0;
        int row2=0;
        
        int x, y;
        
        System.out.println("");
        
        System.out.print("Enter column of piece to move(0,1,2,3,4,5,6,7): ");
        row=input.nextInt();
        
        System.out.print("Enter row of piece to move (0,1,2,3,4,5,6,7): ");
        column=input.nextInt();
        
        System.out.print("Enter column of location to move (0,1,2,3,4,5,6,7): ");
        row2=input.nextInt();
        
        System.out.print("Enter row of location to move (0,1,2,3,4,5,6,7): ");
        column2=input.nextInt();
        
        System.out.println(Board[column][row]);
        System.out.println(Board[column2][row2]);
 
        if(column<column2){
            
            
        }
        else if(column>column2){
            
        }
        else if(row<row2){
            
        }
        else if(row<row2){
            
        }

        //======================================================================
        
        if(Board[column][row].equals("□") || Board[column2][row2].equals("□")){
            System.out.println("Input is invalid - enter viable column and row values");
        }
        
         if((column>=0 && column<8) && (row>=0 && column<8) && (column2>=0 && column2<8) && (row2>=0 && column2<8)){
            if(currentPlayer==player1 && Board[column][row].equals("B")){
                if(column>column2){
                    if(Board[column2][row2].equals("■")){
                        Board[column2][row2] = "B";
                        Board[column][row] = "■";
                    }
                    else if(Board[column2][row2].equals("□")){
                        System.out.println("Input is invalid - enter viable column and row values");
                    }
                }
                else if(column<column2){
                    if(Board[column2][row2].equals("■")){
                        Board[column2][row2] = "B";
                        Board[column][row] = "■";
                    }
                    else if(Board[column2][row2].equals("□")){
                        System.out.println("Input is invalid - enter viable column and row values");
                    }
                }
            }
            if(currentPlayer==player2 && Board[column][row].equals("B")){
                if(column>column2){
                    if(Board[column2][row2].equals("■")){
                        Board[column2][row2] = "R";
                        Board[column][row] = "■";
                    }
                    else if(Board[column2][row2].equals("□")){
                        System.out.println("Input is invalid - enter viable column and row values");
                    }
                }
                else if(column<column2){
                    if(Board[column2][row2].equals("■")){
                        Board[column2][row2] = "R";
                        Board[column][row] = "■";
                    }
                    else if(Board[column2][row2].equals("□")){
                        System.out.println("Input is invalid - enter viable column and row values");
                    }
                }
            }
         }
}
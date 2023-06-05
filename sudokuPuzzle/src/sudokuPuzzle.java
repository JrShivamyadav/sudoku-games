
    public class sudokuPuzzle {

        protected String[][] board;
        private final int ROWS;
        private final int COLUMNS;
        private final int BOXWIDTH;
        private final int BOXHEIGHT;
        private final String[] VALIDVALUE;

        public sudokuPuzzle(int rows,int columns,int boxWidth,int boxHeight,String[] validvalue);
        this.ROWS = rows;
        this.COLUMNS = columns;
        this.BOXWIDTH = boxWidth;
        this.BOXHEIGHT = boxHeight;
        this.VALIDVALUE = validvalue;
        this.board = new String[ROWS][COLUMNS];
        initializeBoard();



        public int getROWS() {
            return ROWS;
        }

        public int getCOLUMNS() {
            return COLUMNS;
        }

        public int getBOXWIDTH() {
            return BOXWIDTH;
        }

        public int getBOXHEIGHT() {
            return BOXHEIGHT;
        }

        public String[] getVALIDVALUE() {
            return VALIDVALUE;
        }

        @Override
        public String toString(){
            String str = "Game Board \n";
            for int row = 0; row <this.ROWS; row++){
                for (int col = 0; col < this.COLUMNS; col++) {
                    str += this.board[row][col] + " ";
                }
                str += "\n";
            }
            return str+ "\n";
        }

        public void makeMove(int row,int col,String value){
this.board[row][col]=value;
        }
public boolean numInRow(int row, String value){
            if (row <= this.ROWS){
                for (int col =0; col <this.COLUMNS;col++){
                    if(this.board[row][col].equals(value)){
                        return  true ;
                    }
                }

            }

            return false;
        }
        public boolean numInCol(int col, String value){
            if (col <= this.COLUMNS){
                for (int row =0; row <this.ROWS;row++){
                    if(this.board[row][col].equals(value)){
                        return  true ;
                    }
                }

            }

            return false;
        }
        public boolean numInBox(int row , int col, String value){
            if (inRange(row, col)){
                int boxRow = row/this.BOXHEIGHT;
                int boxCol = col/this.BOXWIDTH;
                 int startingRow = boxRow *this.BOXHEIGHT;
                 int startingCol = boxCol * this.BOXWIDTH;
                 for (int i =startingRow; i<=(startingRow + this.BOXHEIGHT)-1;i++){
                     for (int c = startingCol;c<=(startingCol + this.BOXWIDTH)-1;c++){
                         if (this.board[i][c].equals(value)){
                             return true;
                         }
                     }
                 }
            }
            return false;
        }
        private boolean inRange(int row, int col){
            return row<= this.ROWS && col <= this.getCOLUMNS() && row >= 0 && col >=0;
        }

}

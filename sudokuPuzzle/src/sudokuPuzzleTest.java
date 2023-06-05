import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class sudokuPuzzleTest {
    private sudokuPuzzle puzzle;
    @Before
    public void setUp(){
        String[][] board = new String[][]{
                {"0", "0", "8", "3", "4", "2", "9", "0", "0"},
                {"0", "0", "8", "0", "0", "0", "9", "0", "0"},
                {"4", "0", "0", "0", "0", "0", "9", "0", "3"},
                {"0", "0", "6", "4", "7", "3", "9", "0", "0"},
                {"0", "3", "0", "0", "0", "0", "9", "1", "0"},
                {"0", "0", "2", "8", "5", "1", "9", "0", "0"},
                {"7", "0", "0", "0", "0", "0", "9", "0", "8"},
                {"0", "0", "4", "0", "0", "0", "9", "0", "0"},
                {"0", "0", "3", "6", "9", "7", "9", "0", "0"}
        };
        puzzle = new sudokuPuzzleForTesting(board);
    }
    @Test
            public void testNumInRow() {
        Assert.assertTrue(puzzle.numInRow(0, "9"));
        Assert.assertTrue(puzzle.numInRow(1, "7"));
        Assert.assertFalse(puzzle.numInRow(8,"1"));
    }
    @Test
    public void testNumInCol() {
        Assert.assertTrue(puzzle.numInCol(0, "4"));
        Assert.assertTrue(puzzle.numInCol(5, "2"));
        Assert.assertFalse(puzzle.numInCol(8,"1"));
    }

    @Test
    public void testNumInBox() {
        Assert.assertTrue(puzzle.numInBox(6, 0, "4"));
        Assert.assertFalse(puzzle.numInBox(4,4,"2"));
        Assert.assertTrue(puzzle.numInBox(4,4, "8"));
    }
    private class sudokuPuzzleForTesting  extends sudokuPuzzle{
        public sudokuPuzzleForTesting(String[][] board){
            super(9,9,3, 3, new String[] {"1","2","3","4","5","6","7","8","9"});
            this.board =board;
        }
    }
}

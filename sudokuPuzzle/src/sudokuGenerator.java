import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class sudokuGenerator {
    public static sudokuPuzzle generateRandomSudoku(sudokuPuzzleType puzzleType){
       sudokuPuzzle puzzle = new sudokuPuzzle(puzzleType.getRows(),puzzleType.getColumns(),
        puzzleType.getBoxWidth(),puzzleType.getBoxHeight(), puzzleType.getValidvalue());

        Random randomGenerator = new Random();
        List<String> notUsedValidValues = new ArrayList<>(Arrays.asList(puzzle.getVALIDVALUE()));
        for (int i=0;i<puzzle.getROWS();i++){
            int randomValue = randomGenerator.nextInt(notUsedValidValues.size());
            puzzle.makeMove(i,0,notUsedValidValues.get(randomValue));
            notUsedValidValues.remove(randomValue);

        }


return puzzle;
}}

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> hash = new HashSet<>();
        for(int i =0 ; i < 9 ;   i++)
        {
            hash.clear();
            for(int j = 0 ; j< 9 ; j++)
                {
                    if(board[i][j] == '.')
                        continue;
                    if(!hash.contains(board[i][j]) )
                        {
                            hash.add(board[i][j]);
                        }
                    else
                       { return false;}

                }
        }
         for(int i =0 ; i < 9 ;   i++)
        {
            hash.clear();
            for(int j = 0 ; j< 9 ; j++)
                {
                     if(board[j][i] == '.')
                        continue;
                    if(!hash.contains(board[j][i]))
                        {
                            hash.add(board[j][i]);
                        }
                    else
                        return false;

                }



        }
           for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                hash.clear();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char current = board[boxRow + i][boxCol + j];
                        if (current == '.') continue;
                        if (!hash.contains(current)) {
                            hash.add(current);
                        } else {
                            return false; // Duplicate found in sub-box
                        }
                    }
                }
            }
        }
        return true;
    }
}
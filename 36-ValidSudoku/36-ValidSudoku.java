// Last updated: 03/07/2026, 11:40:48
class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=9;
        HashSet<Character>[] row = new HashSet[n];
        HashSet<Character>[] col = new HashSet[n];
        HashSet<Character>[] box = new HashSet[n];
        for (int i = 0; i < n; i++) {
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }    
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] == '.') {
                    continue;
                }
                char value = board[r][c];
                int boxIndex = (r / 3) * 3 + (c / 3);
                if (row[r].contains(value) || col[c].contains(value) || 
                box[boxIndex].contains(value)) {
                    return false;
                }
                row[r].add(value);
                col[c].add(value);
                box[boxIndex].add(value);
            }
        }

        return true;  
    }
}
package day17;

public class Task1 {
    public static void main(String[] args) {

        String[] chess = new String[8];
        chess[0] = ChessPiece.PAWN_WHITE.getChessPiece();
        chess[1] = ChessPiece.PAWN_WHITE.getChessPiece();
        chess[2] = ChessPiece.PAWN_WHITE.getChessPiece();
        chess[3] = ChessPiece.PAWN_WHITE.getChessPiece();
        chess[4] = ChessPiece.ROOK_BLACK.getChessPiece();
        chess[5] = ChessPiece.ROOK_BLACK.getChessPiece();
        chess[6] = ChessPiece.ROOK_BLACK.getChessPiece();
        chess[7] = ChessPiece.ROOK_BLACK.getChessPiece();

        for (String n: chess) {
            System.out.print(n);
        }

    }
}
package day17;

public class ChessBoard {

    ChessPiece[][] chessArray;

    public ChessBoard(ChessPiece[][] chessArray) {
        this.chessArray = chessArray;
    }

    public void print(){

        for (int i = 0; i < this.chessArray.length; i++) {  //идём по строкам
            for (int j = 0; j < this.chessArray[i].length; j++) {//идём по столбцам
                System.out.print(this.chessArray[i][j].getChessPiece()); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
    }

}

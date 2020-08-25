public class PaintFill {

  enum Color {R, G, B}

  public static class Board {
      Color[][] board = null;
      final int LENGTH = 8;
      private Board() {
        board = new Color[LENGTH][LENGTH];
      }

      public Board getInstance(){
        if (board == null) {
          board = new Board();
        }
        return board;
      }

      public void printBoard(){
        for (int i = 0; i < LENGTH ; i++) {
          
        }
      }
  }







}// the end of class

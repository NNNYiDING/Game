
public class ChessBoard2 {
    public void initUi(board1 board) {
        StdDraw.setXscale(0, 20);
        StdDraw.setYscale(0, 20);
        StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
        StdDraw.filledRectangle(9.5, 9.5, 9.5, 9.5);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.001);
        for (int i = 0; i <= 19; i++) {
            StdDraw.line(0, i, 19, i);
            StdDraw.line(i, 0, i, 19);
        }
    }
}

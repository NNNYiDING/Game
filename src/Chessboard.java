
public class Chessboard {
    public void initUi(board board){
        StdDraw.setXscale(0, 18);
        StdDraw.setYscale(0,18);
        StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
        StdDraw.filledRectangle(8.5,8.5,8.5,8.5);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.001);
        for (int i =0; i <= 17; i++) {
            StdDraw.line(0, i, 17, i);
            StdDraw.line(i, 0, i, 17);
        }
    }
}

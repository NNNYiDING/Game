import java.awt.*;

public class choosePattern {
    public choosePattern(){

    }
    public static void pattern(){
        Chessboard chessBoard2=new Chessboard();
        board board=new board();
//        chessBoard2.initUi(board);
//        StdDraw.setPenColor(StdDraw.BLACK);
        //新加的人人对战和人机对战
        StdDraw.picture(9,9,"980.jpg");
//        StdDraw.setPenColor(Color.WHITE);
//        StdDraw.filledRectangle(9,4,4,2);
//        StdDraw.filledRectangle(9,14,4,2);
        StdDraw.setPenColor(Color.black);
        StdDraw.text(9,4,"player vs player");
        StdDraw.text(9,14,"player vs computer");
        StdDraw.text(9,9,"exit game");
        boolean d = true;
        Chessboard chessBoard3=new Chessboard();
        chess chess=new chess(board);
        while (true) {
            if(StdDraw.isMousePressed()){
                if(StdDraw.mouseX()>=8&&StdDraw.mouseX()<=10&&StdDraw.mouseY()>=3&&StdDraw.mouseY()<=5){
                    chooseBoard.board();
                }
                if(StdDraw.mouseX()>=8&&StdDraw.mouseX()<=10&&StdDraw.mouseY()>=13&&StdDraw.mouseY()<=15){
                    chooseBoard2.board();
                }
                if(StdDraw.mouseX()>=8&&StdDraw.mouseX()<=10&&StdDraw.mouseY()>=8&&StdDraw.mouseY()<=10){
                    System.exit(0);
                }
            }
        }
    }
}

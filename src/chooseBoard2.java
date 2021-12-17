import java.awt.*;

public class chooseBoard2 {
        public chooseBoard2(){

        }
        public static void board(){
            board board=new board();
            board1 board1=new board1();
            StdDraw.picture(9.,9,"980.jpg");
            StdDraw.setPenColor(Color.black);
            StdDraw.text(9,6,"17*17");
            StdDraw.text(9,12,"19*19");
            boolean d = true;
            Chessboard chessBoard3=new Chessboard();
            ChessBoard2 chessBoard2=new ChessBoard2();
            chess chess=new chess(board);
            chess2 chess2=new chess2(board1);
            while (true) {
                if(StdDraw.isMousePressed()){
                    if(StdDraw.mouseX()>=8&&StdDraw.mouseX()<=10&&StdDraw.mouseY()>=5&&StdDraw.mouseY()<=7){
                        StdDraw.clear();
                        chessBoard3.initUi(board);
                        pvc pvc=new pvc(board);
                        pvc.versus(board);
                    }
                    if(StdDraw.mouseX()>=8&&StdDraw.mouseX()<=10&&StdDraw.mouseY()>=11&&StdDraw.mouseY()<=13){
                        StdDraw.clear();
                        chessBoard2.initUi(board1);
                        pvc2 pvc2=new pvc2(board1);
                        pvc2.versus(board1);
                    }
                }
            }
        }
    }



import java.awt.*;

public class pvc {
    public pvc(board board1){

    }
    public void versus(board board1){
        int[][]board=new int[19][19];
        outer:while(true) {
            if (StdDraw.isMousePressed()) {
                StdDraw.setPenColor(Color.WHITE);
                StdDraw.filledRectangle(9,17.5,9,0.5);
                int xpos = 0;
                int ypos = 0;
                int x = 0, y = 0, z = 0, w = 0, m = 0;
                xpos = (int) Math.round(StdDraw.mouseX());
                ypos = (int) Math.round(StdDraw.mouseY());
                if (board[xpos][ypos] != 0) {
                    StdDraw.setPenColor(Color.RED);
                    StdDraw.text(3, 17.5, "wrong place!");
                    continue outer;
                } else {
                    board[xpos][ypos] = 1;
                }
                try {
                    if (board[xpos - 1][ypos] == 0 && board[xpos][ypos] == board[xpos + 1][ypos] && board[xpos + 1][ypos] == board[xpos + 2][ypos] && board[xpos + 3][ypos] == 0) {
                        if (board[xpos][ypos] == 1) {
                            x = 1;
                        }
                    }
                    if (board[xpos][ypos] == board[xpos - 1][ypos] && board[xpos][ypos] == board[xpos + 1][ypos] && board[xpos - 2][ypos] == 0 && board[xpos + 2][ypos] == 0) {
                        if (board[xpos][ypos] == 1) {
                            x = 1;
                        }
                    } else if (board[xpos][ypos] == board[xpos - 1][ypos] && board[xpos - 1][ypos] == board[xpos - 2][ypos] && board[xpos + 1][ypos] == 0 && board[xpos - 3][ypos] == 0) {
                        if (board[xpos][ypos] == 1) {
                            x = 1;
                        }
                    }
                    if (board[xpos][ypos - 1] == 0 && board[xpos][ypos] == board[xpos][ypos + 1] && board[xpos][ypos + 1] == board[xpos][ypos + 2] && board[xpos][ypos + 3] == 0) {
                        if (board[xpos][ypos] == 1) {
                            y = 1;
                        }
                    }
                    if (board[xpos][ypos] == board[xpos][ypos - 1] && board[xpos][ypos] == board[xpos][ypos + 1] && board[xpos][ypos - 2] == 0 && board[xpos][ypos + 2] == 0) {
                        if (board[xpos][ypos] == 1) {
                            y = 1;
                        }
                    }
                    if (board[xpos][ypos] == board[xpos][ypos - 1] && board[xpos][ypos - 1] == board[xpos][ypos - 2] && board[xpos][ypos + 1] == 0 && board[xpos][ypos - 3] == 0) {
                        if (board[xpos][ypos] == 1) {
                            y = 1;
                        }
                    }
                    if (board[xpos - 1][ypos - 1] == 0 && board[xpos][ypos] == board[xpos + 1][ypos + 1] && board[xpos + 1][ypos + 1] == board[xpos + 2][ypos + 2] && board[xpos + 3][ypos + 3] == 0) {
                        if (board[xpos][ypos] == 1) {
                            z = 1;
                        }
                    }
                    if (board[xpos][ypos] == board[xpos - 1][ypos - 1] && board[xpos][ypos] == board[xpos + 1][ypos + 1] && board[xpos - 2][ypos - 2] == 0 && board[xpos + 2][ypos + 2] == 0) {
                        if (board[xpos][ypos] == 1) {
                            z = 1;
                        }
                    } else if (board[xpos][ypos] == board[xpos - 1][ypos - 1] && board[xpos - 1][ypos - 1] == board[xpos - 2][ypos - 2] && board[xpos + 1][ypos + 1] == 0 && board[xpos - 3][ypos - 3] == 0) {
                        if (board[xpos][ypos] == 1) {
                            z = 1;
                        }
                    }
                    if (board[xpos - 1][ypos + 1] == 0 && board[xpos][ypos] == board[xpos + 1][ypos - 1] && board[xpos + 1][ypos - 1] == board[xpos + 2][ypos - 2] && board[xpos + 3][ypos - 3] == 0) {
                        if (board[xpos][ypos] == 1) {
                            w = 1;
                        }
                    }
                    if (board[xpos][ypos] == board[xpos - 1][ypos + 1] && board[xpos][ypos] == board[xpos + 1][ypos - 1] && board[xpos - 2][ypos + 2] == 0 && board[xpos + 2][ypos - 2] == 0) {
                        if (board[xpos][ypos] == 1) {
                            w = 1;
                        }
                    } else if (board[xpos][ypos] == board[xpos - 1][ypos + 1] && board[xpos - 1][ypos + 1] == board[xpos - 2][ypos + 2] && board[xpos + 1][ypos - 1] == 0 && board[xpos - 3][ypos + 3] == 0) {
                        if (board[xpos][ypos] == 1) {
                            w = 1;
                        }
                    }
                    m = x + y + z + w;
                    if (m >= 2) {
                        StdDraw.setPenColor(Color.RED);
                        StdDraw.text(7, 17.5, "Forbid!");
//                            StdDraw.rectangle(7, 7, 7, 2);
                        board[xpos][ypos] = 0;
                        continue outer;
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {

                }
                if (m < 2) {
                    StdDraw.setPenColor(Color.black);
                    StdDraw.filledCircle(xpos, ypos, 0.4);
                    StdDraw.pause(100);
                    board[xpos][ypos] = 1;
                    int q = (int) (17 * Math.random());
                    int n = (int) (17 * Math.random());
                    StdDraw.setPenColor(Color.WHITE);
                    if (board[q][n] != 1) {
                        StdDraw.filledCircle(q, n, 0.4);
                        board[q][n] = -1;
                    }
                }
                for (int i = 0; i <= 17; i++) {
                    for (int j = 0; j <= 13; j++) {
                        if(board[i][j]==1&&board[i][j]==board[i][j+1]&&board[i][j]==board[i][j+2]&&board[i][j]==board[i][j+3]&&board[i][j]==board[i][j+4]) {
                            StdDraw.pause(100);
                            StdDraw.setPenColor(Color.BLACK);
                            StdDraw.text(6,17.5,"Black wins");
                            StdDraw.text(2,17.5,"Game over");
                            StdDraw.text(10,17.5,"another round");
                            StdDraw.text(16,17.5,"exit");
                            break outer;
                        } else if(board[i][j]==-1&&board[i][j]==board[i][j+1]&&board[i][j]==board[i][j+2]&&board[i][j]==board[i][j+3]&&board[i][j]==board[i][j+4]){
                            StdDraw.setPenColor(Color.BLACK);
                            StdDraw.pause(100);
                            StdDraw.text(6,17.5,"Black wins");
                            StdDraw.text(2,17.5,"Game over");
                            StdDraw.text(10,17.5,"another round");
                            StdDraw.text(16,17.5,"exit");
                         break outer;

                        }
                    }
                }

                for(int j=0;j<=17;j++){
                    for(int i=0;i<=13;i++){
                        if(board[i][j]==1&&board[i][j]==board[i+1][j]&&board[i+1][j]==board[i+2][j]&&board[i+2][j]==board[i+3][j]&&board[i+3][j]==board[i+4][j]){
                            StdDraw.setPenColor(Color.BLACK);
                            StdDraw.pause(100);
                            StdDraw.text(6,17.5,"Black wins");
                            StdDraw.text(2,17.5,"Game over");
                            StdDraw.text(10,17.5,"another round");
                            StdDraw.text(16,17.5,"exit");
                           break outer;
                        }else if (board[i][j]==-1&&board[i][j]==board[i+1][j]&&board[i+1][j]==board[i+2][j]&&board[i+2][j]==board[i+3][j]&&board[i+3][j]==board[i+4][j]){
                            StdDraw.setPenColor(Color.BLACK);
                            StdDraw.pause(100);
                            StdDraw.text(6,17.5,"Black wins");
                            StdDraw.text(2,17.5,"Game over");
                            StdDraw.text(10,17.5,"another round");
                            StdDraw.text(16,17.5,"exit");
                           break outer;
                        }
                    }
                }
                for(int i=0;i<=13;i++){
                    for(int j=0;j<=13;j++){
                        if(board[i][j]==1&&board[i][j]==board[i+1][j+1]&&board[i+1][j+1]==board[i+2][j+2]&&board[i+2][j+2]==board[i+3][j+3]&&board[i+3][j+3]==board[i+4][j+4]){
                            StdDraw.setPenColor(Color.BLACK);
                            StdDraw.pause(100);
                            StdDraw.text(6,17.5,"Black wins");
                            StdDraw.text(2,17.5,"Game over");
                            StdDraw.text(10,17.5,"another round");
                            StdDraw.text(16,17.5,"exit");
                            break outer;
                        }else if (board[i][j]==-1&&board[i][j]==board[i+1][j+1]&&board[i+1][j+1]==board[i+2][j+2]&&board[i+2][j+2]==board[i+3][j+3]&&board[i+3][j+3]==board[i+4][j+4]){
                            StdDraw.setPenColor(Color.BLACK);
                            StdDraw.pause(100);
                            StdDraw.text(6,17.5,"Black wins");
                            StdDraw.text(2,17.5,"Game over");
                            StdDraw.text(10,17.5,"another round");
                            StdDraw.text(16,17.5,"exit");
                            break outer;

                        }
                    }
                }
                for(int i=0;i<=14;i++){
                    for(int j=17;j>=3;j--){
                        if(board[i][j]==1&&board[i][j]==board[i+1][j-1]&&board[i+1][j-1]==board[i+2][j-2]&&board[i+2][j-2]==board[i+3][j-3]&&board[i+3][j-3]==board[i+4][j-4]){
                            StdDraw.setPenColor(Color.BLACK);
                            StdDraw.pause(100);
                            StdDraw.text(6,17.5,"Black wins");
                            StdDraw.text(2,17.5,"Game over");
                            StdDraw.text(10,17.5,"another round");
                            StdDraw.text(16,17.5,"exit");
                            break outer;
                        }else if (board[i][j]==-1&&board[i][j]==board[i+1][j-1]&&board[i+1][j-1]==board[i+2][j-2]&&board[i+2][j-2]==board[i+3][j-3]&&board[i+3][j-3]==board[i+4][j-4]){
                            StdDraw.setPenColor(Color.BLACK);
                            StdDraw.pause(100);
                            StdDraw.text(6,17.5,"Black wins");
                            StdDraw.text(2,17.5,"Game over");
                            StdDraw.text(10,17.5,"another round");
                            StdDraw.text(16,17.5,"exit");
                            break outer;
                        }
                    }
                }
            }
        }
        while (true){
            if (StdDraw.isMousePressed()){
                if(StdDraw.mouseX()>=9&&StdDraw.mouseX()<=11&&StdDraw.mouseY()>=17&&StdDraw.mouseY()<=18){
                    StdDraw.clear();
                    Chessboard chessboard3=new Chessboard();
                    chessboard3.initUi(board1);
                    board1=new board();
                    chessboard3.initUi(board1);
                    pvc pvc=new pvc(board1);
                    pvc.versus(board1);
                }else if(StdDraw.mouseX()>=15&&StdDraw.mouseX()<=17&&StdDraw.mouseY()>=17&&StdDraw.mouseY()<=18){
                    System.exit(0);
                }
            }
        }
    }
}


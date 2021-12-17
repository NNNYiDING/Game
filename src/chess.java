import java.awt.*;
import java.util.Date;

public class chess {
        public int[][]board=new int[19][19];
        public boolean isTure=false;
        public int count = 1, xpos, ypos;

        private Date blackStart=new Date();
        private Date whiteStart=new Date();

        public chess(board board) {

        }
        public void initUi(board board1) {
            Date startShow=new Date();
            long endTime = 100;

            outer:while (true) {
                long dateNow=new Date().getTime();
                long midTime = (dateNow - startShow.getTime()) / 1000;
                midTime=endTime - midTime;
                if(midTime<=0){
                    isTure=true;
                    StdDraw.setPenColor(Color.BLACK);
                    StdDraw.pause(100);
                    StdDraw.text(2,17.5,"turn over,lose the game");
                    StdDraw.text(10,17.5,"another round");
                    StdDraw.text(16,17.5,"exit");
                    break outer;
                }
                long hh = midTime / 60 / 60 % 60;
                long mm = midTime / 60 % 60;
                long ss = midTime % 60;
                String gameHavetime = String.format("%2d:%02d:%02d", hh, mm, ss);
                String singleMsg=gameHavetime;
                if(count==1){//黑子
                    int timeHave= (int) ( (dateNow-blackStart.getTime())/1000);
                    timeHave=15-timeHave;
                    singleMsg=singleMsg+"   黑棋剩余时间:"+timeHave+"s";
                    if (timeHave <=0){
                        isTure=true;
                        StdDraw.setPenColor(Color.BLACK);
                        StdDraw.pause(100);
                        StdDraw.text(2,17.5,"turn over, white win");
                        StdDraw.text(10,17.5,"another round");
                        StdDraw.text(16,17.5,"exit");
                        break outer;
                    }
                }else if(count==-1){//白子
                    int timeHave= (int) ( (dateNow-whiteStart.getTime())/1000);
                    timeHave=15-timeHave;
                    singleMsg=singleMsg+"   白棋剩余时间:"+timeHave+"s";
                    if( timeHave<=0){
                        isTure=true;
                        StdDraw.setPenColor(Color.BLACK);
                        StdDraw.pause(100);
                        StdDraw.text(2,17.5,"no time left, black win");
                        StdDraw.text(10,17.5,"another round");
                        StdDraw.text(16,17.5,"exit");
                        break outer;
                    }
                }

                int x = 0, y = 0, z = 0, w = 0, m = 0;
                if (StdDraw.isMousePressed()) {
                    StdDraw.setPenColor(Color.WHITE);
                    StdDraw.filledRectangle(9,17.5,9,0.5);
                    xpos = (int) Math.round(StdDraw.mouseX());
                    ypos = (int) Math.round(StdDraw.mouseY());
                    if (board[xpos][ypos] !=0) {
                        StdDraw.setPenColor(Color.RED);
                        StdDraw.text(3, 17.5, "wrong place!");
                        continue outer;
                    } else if (count==1){
                        board[xpos][ypos]=1;
                    }else if (count==-1){
                        board[xpos][ypos]=-1;
                    }
                    try {
                        if (board[xpos - 1][ypos] == 0 && board[xpos][ypos] == board[xpos + 1][ypos] && board[xpos + 1][ypos] == board[xpos + 2][ypos] && board[xpos + 3][ypos] == 0) {
                            if (board[xpos][ypos] ==1) {
                                x = 1;
                            }
                        }
                        if (board[xpos][ypos] == board[xpos - 1][ypos] && board[xpos][ypos] == board[xpos + 1][ypos] && board[xpos - 2][ypos] == 0 && board[xpos + 2][ypos] == 0) {
                            if (board[xpos][ypos] ==1) {
                                x = 1;
                            }
                        } else if (board[xpos][ypos] == board[xpos - 1][ypos] && board[xpos - 1][ypos] == board[xpos - 2][ypos] && board[xpos + 1][ypos] == 0 && board[xpos - 3][ypos] == 0) {
                            if (board[xpos][ypos] ==1) {
                                x = 1;
                            }
                        }
                        if (board[xpos][ypos - 1] == 0 && board[xpos][ypos] == board[xpos][ypos + 1] && board[xpos][ypos + 1] == board[xpos][ypos + 2] && board[xpos][ypos + 3] == 0) {
                            if (board[xpos][ypos] ==1) {
                                y = 1;
                            }
                        }
                        if (board[xpos][ypos] == board[xpos][ypos - 1] && board[xpos][ypos] == board[xpos][ypos + 1] && board[xpos][ypos - 2] == 0 && board[xpos][ypos + 2] == 0) {
                            if (board[xpos][ypos] ==1) {
                                y = 1;
                            }
                        }
                        if (board[xpos][ypos] == board[xpos][ypos - 1] && board[xpos][ypos - 1] == board[xpos][ypos - 2] && board[xpos][ypos + 1] == 0 && board[xpos][ypos - 3] == 0) {
                            if (board[xpos][ypos] ==1) {
                                y = 1;
                            }
                        }
                        if (board[xpos - 1][ypos - 1] == 0 && board[xpos][ypos] == board[xpos + 1][ypos + 1] && board[xpos + 1][ypos + 1] == board[xpos + 2][ypos + 2] && board[xpos + 3][ypos + 3] == 0) {
                            if (board[xpos][ypos] ==1) {
                                z = 1;
                            }
                        }
                        if (board[xpos][ypos] == board[xpos - 1][ypos - 1] && board[xpos][ypos] == board[xpos + 1][ypos + 1] && board[xpos - 2][ypos - 2] == 0 && board[xpos + 2][ypos + 2] == 0) {
                            if (board[xpos][ypos] ==1) {
                                z = 1;
                            }
                        } else if (board[xpos][ypos] == board[xpos - 1][ypos - 1] && board[xpos - 1][ypos - 1] == board[xpos - 2][ypos - 2] && board[xpos + 1][ypos + 1] == 0 && board[xpos - 3][ypos - 3] == 0) {
                            if (board[xpos][ypos] ==1) {
                                z = 1;
                            }
                        }
                        if (board[xpos - 1][ypos + 1] == 0 && board[xpos][ypos] == board[xpos + 1][ypos - 1] && board[xpos + 1][ypos - 1] == board[xpos + 2][ypos - 2] && board[xpos + 3][ypos - 3] == 0) {
                            if (board[xpos][ypos] ==1) {
                                w = 1;
                            }
                        }
                        if (board[xpos][ypos] == board[xpos - 1][ypos + 1] && board[xpos][ypos] == board[xpos + 1][ypos - 1] && board[xpos - 2][ypos + 2] == 0 && board[xpos + 2][ypos - 2] == 0) {
                            if (board[xpos][ypos] ==1) {
                                w = 1;
                            }
                        } else if (board[xpos][ypos] == board[xpos - 1][ypos + 1] && board[xpos - 1][ypos + 1] == board[xpos - 2][ypos + 2] && board[xpos + 1][ypos - 1] == 0 && board[xpos - 3][ypos + 3] == 0) {
                            if (board[xpos][ypos] ==1) {
                                w = 1;
                            }
                        }
                        m = x + y + z + w;
                        if (m >= 2) {
                            StdDraw.setPenColor(Color.RED);
                            StdDraw.text(7, 17.5, "Forbid!");
//                            StdDraw.rectangle(7, 7, 7, 2);
                            board[xpos][ypos]=0;
                            continue outer;
                        }
                    } catch (ArrayIndexOutOfBoundsException ignored) {

                    }
                    if (count == 1 && m < 2) {
                        count++;
                        StdDraw.setPenColor(Color.black);
                        StdDraw.filledCircle(xpos, ypos, 0.4);
                        StdDraw.pause(100);
                        board[xpos][ypos] = 1;
                    } else if (count == 2 & m < 2) {
                        StdDraw.setPenColor(Color.WHITE);
                        StdDraw.filledCircle(xpos, ypos, 0.4);
                        StdDraw.pause(100);
                        count--;
                        board[xpos][ypos] = -1;
                    }
                    for (int i = 0; i <= 17; i++) {
                        for (int j = 0; j <= 13; j++) {
                            if(board[i][j]==1&&board[i][j]==board[i][j+1]&&board[i][j]==board[i][j+2]&&board[i][j]==board[i][j+3]&&board[i][j]==board[i][j+4]) {
                                isTure=true;
                                StdDraw.pause(100);
                                StdDraw.setPenColor(Color.BLACK);
                                StdDraw.text(6,17.5,"Black wins");
                                StdDraw.text(2,17.5,"Game over");
                                StdDraw.text(10,17.5,"another round");
                                StdDraw.text(16,17.5,"exit");
                                break outer;
                                
                            } else if(board[i][j]==-1&&board[i][j]==board[i][j+1]&&board[i][j]==board[i][j+2]&&board[i][j]==board[i][j+3]&&board[i][j]==board[i][j+4]){
                                isTure=true;
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
                                isTure=true;
                                StdDraw.setPenColor(Color.BLACK);
                                StdDraw.pause(100);
                                StdDraw.text(6,17.5,"Black wins");
                                StdDraw.text(2,17.5,"Game over");
                                StdDraw.text(10,17.5,"another round");
                                StdDraw.text(16,17.5,"exit");
                                break outer;
                            }else if (board[i][j]==-1&&board[i][j]==board[i+1][j]&&board[i+1][j]==board[i+2][j]&&board[i+2][j]==board[i+3][j]&&board[i+3][j]==board[i+4][j]){
                                isTure=true;
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
                                isTure=true;
                                StdDraw.setPenColor(Color.BLACK);
                                StdDraw.pause(100);
                                StdDraw.text(6,17.5,"Black wins");
                                StdDraw.text(2,17.5,"Game over");
                                StdDraw.text(10,17.5,"another round");
                                StdDraw.text(16,17.5,"exit");
                                break outer;
                            }else if (board[i][j]==-1&&board[i][j]==board[i+1][j+1]&&board[i+1][j+1]==board[i+2][j+2]&&board[i+2][j+2]==board[i+3][j+3]&&board[i+3][j+3]==board[i+4][j+4]){
                                isTure=true;
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
                        for(int j=17;j>3;j--){
                            if(board[i][j]==1&&board[i][j]==board[i+1][j-1]&&board[i+1][j-1]==board[i+2][j-2]&&board[i+2][j-2]==board[i+3][j-3]&&board[i+3][j-3]==board[i+4][j-4]){
                                isTure=true;
                                StdDraw.setPenColor(Color.BLACK);
                                StdDraw.pause(100);
                                StdDraw.text(6,17.5,"Black wins");
                                StdDraw.text(2,17.5,"Game over");
                                StdDraw.text(10,17.5,"another round");
                                StdDraw.text(16,17.5,"exit");
                                break outer;
                            }else if (board[i][j]==-1&&board[i][j]==board[i+1][j-1]&&board[i+1][j-1]==board[i+2][j-2]&&board[i+2][j-2]==board[i+3][j-3]&&board[i+3][j-3]==board[i+4][j-4]){
                                isTure=true;
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
                        chess chess=new chess(board1);
                        chess.initUi(board1);
                    }else if(StdDraw.mouseX()>=15&&StdDraw.mouseX()<=17&&StdDraw.mouseY()>=17&&StdDraw.mouseY()<=18){
                        System.exit(0);
                    }
                }
            }
        }
    }


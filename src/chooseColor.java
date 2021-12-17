import java.awt.*;

public class chooseColor {
    public chooseColor(board board1){
    }
    public void color(board board1){
        StdDraw.setPenColor(Color.pink);
        StdDraw.filledRectangle(2,2,1,1);
        StdDraw.filledRectangle(13,2,1,1);
        StdDraw.setPenColor(Color.blue);
        StdDraw.text(7,7,"choose your color");
        StdDraw.text(2,2,"black");
        StdDraw.text(13,2,"white");
        int count=0;
        while (true){
            if (StdDraw.isMousePressed()){
                if(StdDraw.mouseX()>1&&StdDraw.mouseX()<3&&StdDraw.mouseY()>1&&StdDraw.mouseY()<3){
                    count=1;
                    pvc pvc=new pvc(board1);
                    pvc.versus(board1);
                }else if(StdDraw.mouseX()>12&&StdDraw.mouseX()<14&&StdDraw.mouseY()>1&&StdDraw.mouseY()<3){
                    count=0;
                    pvc pvc=new pvc(board1);
                    pvc.versus(board1);
                }
            }
        }

    }
}

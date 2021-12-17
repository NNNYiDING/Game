import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI {
    public static void main(String[] args) {
        StdDraw.setXscale(0, 18);
        StdDraw.setYscale(0, 18);
        StdDraw.picture(9, 9, "980.jpg");
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(9, 6, "开始游戏");
        StdDraw.setPenColor(StdDraw.BLACK);
        while (true){
            if(StdDraw.isMousePressed()){
                StdDraw.clear();
                choosePattern.pattern();
            }
        }
    }
}



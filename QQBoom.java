import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class QQBoom {
    public static void main(String[] args)throws AWTException {
        Robot robot = new Robot();
        robot.delay(2000);

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your sentence:");
        String msg = scan.next();
        System.out.println("Please input the number that you want loop:");
        int n = scan.nextInt();
        // 获取系统剪切板
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        for(int i = 0;i<n;i++){
            //重新封装内容
            StringSelection text = new StringSelection(msg);
            //把文本内容设置到剪贴板
            clip.setContents(text,null);
            //ctrl
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_ENTER);
        }
    }
}

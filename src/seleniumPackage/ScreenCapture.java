package seleniumPackage;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ScreenCapture {

	public static void main(String[] args) throws AWTException, IOException {
			Robot rb=new Robot();
			Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle re=new Rectangle(d);
			BufferedImage bf=rb.createScreenCapture(re);
			String path=System.getProperty("user.dir");
			System.out.println(path);
			ImageIO.write(bf, "png", new File("path"));
	}
}
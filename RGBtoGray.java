import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.awt.*;
import java.math.*;
public class RGBtoGray extends Frame
{
 int rgb,r,g,b,gray;
 Color c1;
 BufferedImage buff,buffgray;
 public RGBtoGray() throws Exception
 {
  setVisible(true);
  setLayout(null);
  setTitle("Image Tester");
  buff=ImageIO.read(new File("image.png"));
  setSize(buff.getWidth(),buff.getHeight());
 }
 public void grayScaleConvert()
 {
  int i,j;
  for(i=0;i<buff.getWidth();i++)
  {
   for(j=0;j<buff.getHeight();j++)
   {
    rgb=buff.getRGB(i,j);
    c1=new Color(rgb);
    r=c1.getRed();
    g=c1.getGreen(); 
    b=c1.getBlue();
    gray=(int)Math.floor((r+g+b)/3);
    buff.setRGB(i,j,new Color(gray,gray,gray).getRGB());
   }
  }
  repaint();
 }
 public void paint(Graphics g)
 {
  g.drawImage(buff,0,0,this);
 }
 public static void main(String args[]) throws Exception
 {
  RGBtoGray img1=new RGBtoGray();
  img1.grayScaleConvert();
 }
}

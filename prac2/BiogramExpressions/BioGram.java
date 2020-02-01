import java.awt.*;
import java.awt.image.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 * Iteratively apply a transformation and give a diagram coloured according to 
 * the number of iterations
 * 
 * @author Steven Bradley 
 */
public class BioGram
{
    
    private BufferedImage bimg;
    
    public BioGram(int width, int height){
        Canvas c=new Canvas("BioGram", width, height);
        c.setVisible(true);
        JFrame f=c.getFrame();
        bimg=(BufferedImage)f.createImage(width,height);
        Pixel p=new Pixel(0,0,0);
        for(int i=0; i<width; i++){
            for(int j=0; j<height; j++){   
                int count=0;
                CountExpr counter=new CountExpr(i,j);
                while(count<6 && !counter.finished()){
                    count++;
                    counter.doOnce();
                }
		//                System.out.println("x "+i+" y "+j+" count "+count);
                if(count<=2){
                    p.B=255;
                }
                else{
                    p.B=0;
                }
                if(count>=2 && count<=4){
                    p.G=255;
                }
                else{
                    p.G=0;
                }
                if(count>=4){
                    p.R=255;
                }
                else{
                    p.R=0;
                }
                bimg.setRGB(i,j,p.toRGB());
            }
        }       
        c.drawImage(bimg,0,0);
    }

	public static void main (String[] args){
	if(args.length==2){
		new BioGram(new Integer(args[0]), new Integer(args[1]));
	}	
	else{
		new BioGram(200,200);
	}
	}

}




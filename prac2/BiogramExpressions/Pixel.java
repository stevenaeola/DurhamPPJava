
/**
 * RGB, alpha data for a single pixel.
 * 
 * @author Steven Bradley 
 */
public class Pixel
{
    public int R;
    public int G;
    public int B;
    public int alpha;
    
    

    /**
     * Constructor for objects of class Pixel
     */
    public Pixel()
    {
        alpha=255;
    }
    
    /* create from image data */
    public Pixel(int d){
        alpha=(d>>24) & 0xFF;
        R=(d>>16) & 0xFF;
        G=(d>>8) & 0xFF;
        B=d & 0xFF;
    }
    
    /* create from RGB, assume alpha 255 */
    public Pixel(int R, int G, int b){
        this.R=R;
        this.G=G;
        this.B=B;
        this.alpha=255;
    }
    
    public int toRGB(){
        return ((alpha <<24) &0xFF000000)
               |((R << 16) & 0xFF0000)
               |((G << 8 ) & 0xFF00)
               |(B & 0xFF);
    }
}

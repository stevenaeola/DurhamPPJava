
/**
 * A simple class to apply a transformation iteratively
 * 
 * @author Steven Bradley
 */
public class CountExpr
{
  
    private double x;
    public double y;
    
    public CountExpr(int startx, int starty){
         x=startx/10.0;
        y=starty/10.0;
    }
    
    public void doOnce(){
        y=(x-25)*Math.tan(y/3) - (y-30)*Math.tan(x/3);
    }
    
    public boolean finished(){
            return x+y>100; 
    }
}

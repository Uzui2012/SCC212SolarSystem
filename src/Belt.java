import java.util.Random;

public class Belt extends Planet
{
    /**
     * Array of Planet objects.
     * Used as there is no reason to rewrite objectively similar code for "objects that move around a star".
     */
    private Planet[] bodies;
    /**
     * Double value of an arbitrary ratio between Star object size, width, and a constant.
     * Used when establishing the number of individual planet objects on instantiation.
     */
    private double ratio;
    /**
     * Double value of the width the belt should spread from source point.
     */
    private double width;

    /**
     * Belt Constructor method.
     * Create a Belt.
     * Must be drawn via the Draw method to be rendered.
     * 
     * @param distance Double value of the distance the source point of an asteroid belt.
     * @param incrementSpeed Double value of the incremental speed of which the ring is to rotate around the Star.
     * @param width Double value of the width the belt should spread from source point. 
     * @param colour String color value the individual belt particles should be.
     * @param parentStarDiameter  Double value of the parent star diameter.
     */
    public Belt(double distance, double incrementSpeed, double width, String colour, Double parentStarDiameter) {
        super(distance, 0, 1, incrementSpeed, colour);
        this.width = width;
        this.ratio = parentStarDiameter * width * 0.2;
        Random rand = new Random();
        bodies = new Planet[(int)ratio];
        for(int i = 0; i < bodies.length; i++) {
            bodies[i] = new Planet(rand.nextDouble()*width + distance,
                                   360-(rand.nextDouble()*360),
                                   1,
                                   incrementSpeed*rand.nextDouble()*5, colour);
        }
    }

    
    /** 
     * Draw method for Belt objects.
     * After initialising a large number of small Planet objects, each is drawn per frame.
     * Would be especially better for performance to implement the use of Threads to this process.
     * @param solSys Target SolarSystem object to draw belt to.
     */
    @Override
    public void Draw(SolarSystem solSys) {
        for (Planet body : bodies) {
            body.Draw(solSys);
            body.incrementAngle();
        }
    }

    /**
     * Getter method of the width value of the asteroid belt in pixels.
     * @return Double value of Belt object's width.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Setter method of the width value of the asteroid belt in pixels.
     * @param width Double value of Belt object's width is to be set to.
     */
    public void setWidth(double width) {
        this.width = width;
    }
    

}

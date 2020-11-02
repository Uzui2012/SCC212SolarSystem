import java.util.Random;

public class Ring extends Moon
{
    /**
     * Array of Moon objects.
     * Used as there is no reason to rewrite objectively similar code for "objects that move around a planet".
     */
    private Moon[] bodies;

    /**
     * Double value of an arbitrary ratio between Planet object size and width
     * Used when establishing the number of individual Moon objects on instantiation..
     */
    private double ratio;

    /**
     * Double value of the width the ring should spread from source point.
     */
    private double width;

    /**
     * Ring Constructor method.
     * Creates a ring of which rotates around a planet as it orbits a star.
     * Must be drawn via the Draw method to be rendered.
     * 
     * @param distance
     * @param incrementSpeed
     * @param width
     * @param colour
     * @param parentPlanet
     */
    public Ring(double distance, double incrementSpeed, double width, String colour, Planet parentPlanet) {
        super(distance, 0, 1, incrementSpeed, colour, parentPlanet);
        this.width = width;
        this.ratio = parentPlanet.getDiameter() * width;
        Random rand = new Random();
        bodies = new Moon[(int)ratio];
        for(int i = 0; i < bodies.length; i++) {
            bodies[i] = new Moon(rand.nextDouble()*width + distance, 360-(rand.nextDouble()*360), 1, incrementSpeed*rand.nextDouble()*5, colour, parentPlanet);
        }
    }
    
    
    /** 
     * Draw method for Ring objects. 
     * After initialising a large number of small Moon objects, each is drawn per frame.
     * Would be especially better for performance to implement the use of Threads to this process.
     * @param solSys Target SolarSystem object to draw belt to.
     */
    @Override
    public void Draw(SolarSystem solSys) {
        for (Moon body : bodies) {
            body.Draw(solSys);
            body.incrementAngle();
        }
    }

    /**
     * Getter method of the width value of the planet ring in pixels.
     * @return Double value of Ring object's width.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Setter method of the width value of the planet ring in pixels.
     * @param width Double value of Ring object's width is to be set to.
     */
    public void setWidth(double width) {
        this.width = width;
    }
    
    
}

public class Planet extends Star
{
    /**
     * Double value of angle - used to represent the polar coordinate angle off of 
     */
    private double angle;

    /**
     * Double value of distance from planet to star.
     */
    private double distance;

    /**
     * Double value of the incremental speed of the planet's orbit.
     */
    private double speed;

    /**
     * Planet Constructor method.
     * Create a Planet. 
     * Must be drawn via the Draw method to be rendered.
     * 
     * @param distance Double value of the distance between the planet and the star.
     * @param angle Double value of the angle offset in the polar coordinate system.
     * @param diameter Double value of the diameter of this planet.
     * @param speed Double value of the incremental speed of the planet's orbit.
     * @param colour String value of the color this planet is to be.
     */
    public Planet(double distance, double angle, double diameter, double speed, String colour) {
        super(diameter, colour);
        this.angle = angle;
        this.distance = distance;
        this.speed = speed;
    }

    /**
     * Increments angle by the preset speed of the object.
     * NOT to be used outside this object by outer scope - as automatic incrementation takes place within the Draw method.
     */
    public void incrementAngle() {
        this.angle = this.angle + this.speed;
    }
    
    /** 
     * Draw method for Planet objects.
     * Automatically increments the angle after rendering.
     * @param solSys Target SolarSystem object on which to draw the object to.
     */
    public void Draw(SolarSystem solSys) {
        solSys.drawSolarObject(distance, angle, this.getDiameter(), this.getColour());
        incrementAngle();
    }
    
    /**
     * Getter method of the angle of the planet in pixels.
     * @return Double value of Planet object's angle.
     */
    public double getAngle() {
        return angle;
    }

    
    /** 
     * Setter method of the angle of the planet in the polar coordinates.
     * @param angle Double value of the angle of which to set the planet to.
     */
    public void setAngle(double angle) {
        this.angle = angle;
    }

    
    /**
     * Getter method of the distance of the planet to the parent star in pixels.
     * @return Double value of planet object's distance.
     */
    public double getDistance() {
        return distance;
    }

    
    /** 
     * Setter method of the distance of the planet to the parent star in pixels.
     * @param distance Double value of which to set the planet distance to.
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }
}

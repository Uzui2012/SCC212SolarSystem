public class Star implements Body
{
    /**
     * Double value of the star diameter in pixels.
     */
    private double diameter;

    /**
     * String value of the star colour.
     */
    private String colour;
    
    /**
     * Star Constructor method.
     * Create a Star.
     * @param diameter
     * @param colour
     */
    public Star(double diameter, String colour) {
        this.diameter = diameter;
        this.colour = colour;
    }

    /** 
     * Draw method for Star objects.
     * @param solSys Target SolarSystem object on which to draw the object to.
     */
    public void Draw(SolarSystem solSys) {
        solSys.drawSolarObject(0, 0, this.diameter, this.colour);
    }
    
    /** 
     * Getter method of the object's diameter.
     * @return double value of the object diameter
     */
    public double getDiameter() {
        return diameter;
    }
    
    /** 
     * Setter method of the object's diameter.
     * @param diameter Double value of which to set the object diameter.
     */
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    
    /** 
     * Getter method of the object's color.
     * @return String value of the object's color.
     */
    public String getColour() {
        return colour;
    }
    
    /** 
     * Setter method of the object's color.
     * @param colour String value of which to set the object color.
     */
    public void setColour(String colour) {
        this.colour = colour;
    }
}

public class Sun implements Body
{    
    private double diameter;
    private String colour;
    
    public Sun(double diameter, String colour) {
        this.diameter = diameter;
        this.colour = colour;
    }

    public void Draw(SolarSystem solSys) {
        solSys.drawSolarObject(0, 0, this.diameter, this.colour);
    }
    
    /** 
     * @return double
     */
    public double getDiameter() {
        return diameter;
    }
    
    /** 
     * @param diameter
     */
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    
    /** 
     * @return String
     */
    public String getColour() {
        return colour;
    }
    
    /** 
     * @param colour
     */
    public void setColour(String colour) {
        this.colour = colour;
    }
}

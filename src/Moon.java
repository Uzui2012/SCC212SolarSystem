public class Moon extends Planet
{
    /**
     * Planet object that holds parent planet data.
     */
    private Planet parentPlanet;
    
    /**
     * Moon object Constructor.
     * Creates a Moon.
     * Must be drawn via the Draw method to be rendered.
     * 
     * @param distance Double value of the distance Moon object is from target Planet object.
     * @param angle Double value of the angle offset in the polar Coordinate system.
     * @param diameter Double value of the diameter of the Moon object when drawn.
     * @param incrementSpeed Double value of the increment speed of the Moon object around a planet.
     * @param colour String value of the Moon color.
     * @param parentPlanet Planet object of the parent planet this moon is to orbit.
     */
    public Moon(double distance, double angle, double diameter, double incrementSpeed, String colour, Planet parentPlanet) {
        super(distance, angle, diameter, incrementSpeed, colour);
        this.parentPlanet = parentPlanet;
    }

    
    /** 
     * Draws moon object using SolarSystem class' drawSolarObjectAbout method. 
     * @param solSys SolarSystem object this Moon is drawn onto.
     */
    @Override
    public void Draw(SolarSystem solSys) {
        solSys.drawSolarObjectAbout(this.getDistance(), this.getAngle(), this.getDiameter(),
                                    this.getColour(), this.parentPlanet.getDistance(),
                                    this.parentPlanet.getAngle());
        incrementAngle();
    }

    /**
     * Getter method to get the parent Planet object of this Moon.
     * @return Planet object
     */
    public Planet getParentPlanet() {
        return parentPlanet;
    }

    /**
     * Setter method to get the parent Planet object of this Moon.
     * @param parentPlanet Planet object to set this moon to.
     */
    public void setParentPlanet(Planet parentPlanet) {
        this.parentPlanet = parentPlanet;
    }
}
import java.util.Random;

public class Ring extends Moon{
    private Moon[] bodies;
    private double ratio;
    
    public Ring(double distance, double incrementSpeed, double width, String colour, Planet parentPlanet) {
        super(distance, 0, 1, incrementSpeed, colour, parentPlanet);
        this.ratio = parentPlanet.getDiameter() * 100;
        Random rand = new Random();
        bodies = new Moon[(int)ratio];
        for(int i = 0; i < bodies.length; i++) {
            bodies[i] = new Moon(rand.nextDouble()*width + distance, 360-(rand.nextDouble()*360), 1, incrementSpeed*rand.nextDouble()*5, colour, parentPlanet);
        }
    }
    
    @Override
    public void Draw(SolarSystem solSys) {
        for (Moon body : bodies) {
            body.Draw(solSys);
            body.incrementAngle();
        }
    }
    
    
}

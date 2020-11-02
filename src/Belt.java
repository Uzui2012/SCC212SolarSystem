import java.util.Random;

public class Belt extends Planet {
    private Planet[] bodies;
    private double ratio;

    public Belt(double distance, double incrementSpeed, double width, String colour, Sun parentSun) {
        super(distance, 0, 1, incrementSpeed, colour);
        this.ratio = parentSun.getDiameter() * 50;
        Random rand = new Random();
        bodies = new Planet[(int)ratio];
        for(int i = 0; i < bodies.length; i++) {
            bodies[i] = new Planet(rand.nextDouble()*width + distance, 360-(rand.nextDouble()*360), 1, incrementSpeed*rand.nextDouble()*5, colour);
        }
    }

    @Override
    public void Draw(SolarSystem solSys) {
        for (Planet body : bodies) {
            body.Draw(solSys);
            body.incrementAngle();
        }
    }

}

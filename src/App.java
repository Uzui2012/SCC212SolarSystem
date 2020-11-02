public class App {
    private static SolarSystem ss;

    public static void main(String[] args) {
        ss = new SolarSystem(1920, 1080);
        Sun[] suns = new Sun[1];
        Planet[] planets = new Planet[8];
        Moon[] moons = new Moon[9];
        Belt[] belts = new Belt[1];
        Ring[] rings = new Ring[1];
        addSolSystem(suns, planets, moons, belts, rings);
        while (true) {
            move(suns, planets, moons, belts, rings);
        }
    }

    
    /** 
     * @param suns
     * @param planets
     * @param moons
     * @param belts
     * @param rings
     */
    public static void move(Sun[] suns, Planet[] planets, Moon[] moons, Belt[] belts, Ring[] rings) {
        // for loop over sun objects
        for(Sun sun : suns) {
            sun.Draw(ss);
        }
        // for loop over planet objects
        for (Planet planet : planets) {
            planet.Draw(ss);
            planet.incrementAngle();
        }
        // for loop over moon objects
        for (Moon moon : moons) {
            moon.Draw(ss);
            moon.incrementAngle();
        }
        // for loop over all belt objects
        for (Belt belt : belts) {
            belt.Draw(ss);
        }
        // for loop over all ring objects
        for (Ring ring : rings) {
            ring.Draw(ss);
        }
        ss.finishedDrawing();
    }

    
    /** 
     * @param suns
     * @param planets
     * @param moons
     * @param belts
     * @param rings
     */
    private static void addSolSystem(Sun[] suns, Planet[] planets, Moon[] moons, Belt[] belts, Ring[] rings) {
        double earthSpeed = 2;
        suns[0] = new Sun(50, "YELLOW");
        planets[0] = new Planet(60, 0, 5, earthSpeed*1.59, "GREY"); //Mercury
        planets[1] = new Planet(80, 0, 10, earthSpeed*1.18, "#BA961F"); //Venus
        planets[2] = new Planet(100, 0, 10, earthSpeed, "BLUE"); //Earth
        planets[3] = new Planet(120, 0, 8, earthSpeed*0.808, "RED"); //Mars
        planets[4] = new Planet(220, 0, 30, earthSpeed*0.439, "#F0741F"); //Jupiter
        planets[5] = new Planet(300, 0, 25, earthSpeed*0.325, "#F3AD2B"); //Saturn
        planets[6] = new Planet(400, 0, 20, earthSpeed*0.228, "#1F67F0"); //Uranus
        planets[7] = new Planet(500, 0, 23, earthSpeed*0.182, "#38ABDD"); //Neptune
        moons[0] = new Moon(10, 0, 2, 0.0343, "GREY", planets[2]); //Luna
        moons[1] = new Moon(10, 0, 2, 3, "GREY", planets[3]);
        moons[2] = new Moon(10, 0, 2, 3, "GREY", planets[3]);
        moons[3] = new Moon(5 + planets[4].getDiameter(), 0, 4, 4, "GREY", planets[4]);
        moons[4] = new Moon(10 + planets[4].getDiameter(), 0, 4, 5, "GREY", planets[4]);
        moons[5] = new Moon(15 + planets[4].getDiameter(), 0, 4, 2, "GREY", planets[4]);
        moons[6] = new Moon(20 + planets[4].getDiameter(), 0, 3, 3, "GREY", planets[4]);
        moons[7] = new Moon(5 + planets[5].getDiameter(), 0, 2, 4, "GREY", planets[5]);
        moons[8] = new Moon(10 + planets[5].getDiameter(), 0, 2, 3, "GREY", planets[5]);
        belts[0] = new Belt(150, 1, 10, "GREY", suns[0]);
        rings[0] = new Ring(20, 1, 8, "ORANGE", planets[5]);
    }
}
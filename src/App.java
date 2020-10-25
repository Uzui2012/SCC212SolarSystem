public class App {
    private static SolarSystem ss;

    public static void main(String[] args) {
        ss = new SolarSystem(1920, 1080);
        Sun[] suns = new Sun[1];
        Planet[] planets = new Planet[8];
        Moon[] moons = new Moon[9];
        addSolSystem(suns, planets, moons);
        while (true) {
            move(suns, planets, moons);
        }
    }
    public static void move(Sun[] suns, Planet[] planets, Moon[] moons) {
        // forloop over sun objects
        for(Sun sun : suns) {
            sun.Draw(ss);
        }
        // forloop over planet objects
        for (Planet planet : planets) {
            planet.Draw(ss);
            planet.incrementAngle();
        }
        // forloop over moon objects
        for (Moon moon : moons) {
            moon.Draw(ss);
            moon.incrementAngle();
        }
        ss.finishedDrawing();
    }

    private static void addSolSystem(Sun[] suns, Planet[] planets, Moon[] moons) {
        suns[0] = new Sun(50, "YELLOW");
        planets[0] = new Planet(60, 0, 5, 5, "GREY");
        planets[1] = new Planet(80, 45, 10, 4, "#BA961F");
        planets[2] = new Planet(100, 50, 10, 4, "BLUE");
        planets[3] = new Planet(120, 60, 8, 3, "RED");
        planets[4] = new Planet(200, 120, 30, 2, "#F0741F");
        planets[5] = new Planet(250, 145, 25, 1, "#F3AD2B");
        planets[6] = new Planet(350, 180, 20, 1, "#1F67F0");
        planets[7] = new Planet(500, 250, 23, 1, "#38ABDD");
        moons[0] = new Moon(10, 0, 2, 3, "GREY", planets[2]);
        moons[1] = new Moon(10, 0, 2, 3, "GREY", planets[3]);
        moons[2] = new Moon(10, 180, 2, 3, "GREY", planets[3]);
        moons[3] = new Moon(40, 0, 4, 4, "GREY", planets[4]);
        moons[4] = new Moon(40, 45, 4, 5, "GREY", planets[4]);
        moons[5] = new Moon(50, 180, 4, 3, "GREY", planets[4]);
        moons[6] = new Moon(50, 135, 3, 3, "GREY", planets[4]);
        moons[7] = new Moon(50, 0, 2, 3, "GREY", planets[5]);
        moons[8] = new Moon(50, 160, 2, 3, "GREY", planets[5]);
    }
}
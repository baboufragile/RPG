public class Hero {
    public HealthPoints healthPoints = new HealthPoints();
    public Lvl Lvl = new Lvl();
    
    private boolean isLiving(boolean Living){
        Living.isLiving = Living;
        return Living.isLiving;
    }
    public Object attack(Hero hero, Points point, Hero hero2){
        int points = hero.healthPoints.changeHealthPoints(new Points(hero2.Lvl.number * point.point), new Type("attack"));

        if(points <= 0){
            hero.health.points = 0;

            hero.isLiving(false);

            return "lvl main hero: "
                    + hero.Lvl.levelUpdate(new Type("down"))+
                    "\n"+
                    "The second hero has lvl: " + hero2.Lvl.levelUpdate(new Type("up"));
        }
        return points;
    }
}

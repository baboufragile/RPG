public class Main {

    public static void main(String args[]) {

      
        Hero hero1 = new Hero();

        System.out.println("Hero 1 health -> " +  hero1.healthPoints.healthPoints);
        System.out.println("Hero 1 level -> " +  hero1.Lvl.number);


        Hero hero2 = new Hero();
        System.out.println("Hero 2 health  -> " +  hero2.healthPoints.healthPoints);
        System.out.println("Hero 2 level -> " +  hero2.Lvl.number);


        System.out.println("Hero1 attack Hero2: " +  hero1.attack(hero2, new Points(950), hero1));
        System.out.println("Hero2 health: " + hero2.Lvl.number);


        hero1.treat(hero1, 950, hero1);
        System.out.println("Hero2 health: " + hero2.healthPoints.healthPoints);


        System.out.println("Hero1 attack Hero2: " + hero1.attack(hero2, new Points(1100), hero1));
        System.out.println("Hero2 health: " + hero2.healthPoints.healthPoints);

        System.out.println(hero1.attack(hero2, new Points(1100), hero1));
        

    }
}
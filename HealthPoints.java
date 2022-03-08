public class HealthPoints {
    int healthPoints = 1000;

        public int changeHealthPoints(Health num, Type type){
            if(type.type.equals("attack")){
                healthPoints -=num.num;
            }
            if(type.type.equals("heal")){
                healthPoints +=num.num;
            }
            return healthPoints;
        }
        
}



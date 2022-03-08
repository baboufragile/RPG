public class Lvl {

    public int number = 1;

    public int levelUpdate(Type type) {

        if (type.type.equals("up")) {
            number++;
        }


        if (number > 0 && type.type.equals("down")) {
            number--;
        }


        return number;
    }
}
package SierraBeits.IO13.GameSaver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GameSaverTest {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50,"Elf", new String[]{"bow","sword","brass knuckles"});
        GameCharacter two = new GameCharacter(200,"Troll", new String[]{"naked hands","giant axe"});
        GameCharacter three = new GameCharacter(50,"Elf", new String[]{"spell","brass knuckles"});

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        one = null;
        two = null;
        three = null;

        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();
            GameCharacter threeRestore = (GameCharacter) is.readObject();

            System.out.println("First type: " + oneRestore.getType());
            System.out.println("Second type: " + twoRestore.getType());
            System.out.println("Third type: " + threeRestore.getType());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

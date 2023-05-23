import Cofee.*;

import java.util.ArrayList;
import java.util.List;

public class CoffeMash implements CoffeMashin {
   CoffeeRoom coffies = CoffeeRoom.getCoffeeRoom();

    @Override
    public Coffie creatCoffe(CoffeEnum tupe,  int watter, int milk) {
        Coffie coffie1 = null;
        if (tupe.equals(CoffeEnum.AMERICANO)) {
            System.out.println("Американо готов");
            coffie1=new Americano( 50,100);
        } else if (tupe.equals(CoffeEnum.CAPUCHINO)) {
            System.out.println("Капучино готов");
            coffie1=new Capuchino( 150,100);
        } else if (tupe.equals(CoffeEnum.LATTE)) {
            System.out.println("Латте готов");
            coffie1=new Latte( 50,150);
        } else if (tupe.equals(CoffeEnum.ESPRESSO)) {
            System.out.println("Эспрессо готов");
            coffie1=new Espresso( 50,200);
        }
       coffies.getCoffieList().add(coffie1);

        return coffie1;
    }


    @Override
    public String toString() {
        return "CoffeMash{" +
                "coffies=" + coffies +
                '}';
    }
}


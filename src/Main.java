import Cofee.Coffie;

public class Main {
    public static void main(String[] args) {
        CoffeMash coffeMash=new CoffeMash();
        CoffeeRoom coffeeRoom=CoffeeRoom.getCoffeeRoom();
        Coffie coffie=  coffeMash.creatCoffe(CoffeEnum.AMERICANO, 1,1);
        coffie.addSugar(5);
        Coffie coffie1 = coffeMash.creatCoffe(CoffeEnum.CAPUCHINO,2,3);
        Coffie coffie2 = coffeMash.creatCoffe(CoffeEnum.ESPRESSO,2,3);
        Coffie coffie3 = coffeMash.creatCoffe(CoffeEnum.LATTE,2,3);
        System.out.println(coffeeRoom);

    }
}
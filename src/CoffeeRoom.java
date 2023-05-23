import Cofee.Coffie;

import java.util.ArrayList;
import java.util.List;

public class CoffeeRoom {
    private static  CoffeeRoom coffeeRoom;
    private List<Coffie> coffieList=new ArrayList<>();

    private CoffeeRoom(){

    }
    public static CoffeeRoom getCoffeeRoom(){
        if (coffeeRoom==null){
            coffeeRoom=new CoffeeRoom();
        }
        return  coffeeRoom;
    }

    public List<Coffie> getCoffieList() {
        return coffieList;
    }

    public void setCoffieList(List<Coffie> coffieList) {
        this.coffieList = coffieList;
    }

    @Override
    public String toString() {
        return "CoffeeRoom{" +
                "coffieList=" + coffieList +
                '}';
    }
}

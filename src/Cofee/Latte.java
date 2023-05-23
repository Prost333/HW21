package Cofee;

public class Latte implements Coffie{
    private  int water;
    private  int milk;
    private  int sugar;

    public Latte(int water, int milk) {
        this.water = water;
        this.milk = milk;
    }
    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    @Override
    public void addSugar(int i) {
        sugar += i;
        System.out.println(" В Латте сахара "+i+" куска");

    }

    @Override
    public String toString() {
        return "Latte{" +
                "water=" + water +
                ", milk=" + milk +
                ", sugar=" + sugar +
                '}';
    }
}

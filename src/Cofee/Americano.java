package Cofee;

public class Americano implements Coffie {
    private int water;
    private int milk;
    private int sugar;

    public Americano(int water, int milk) {
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
        System.out.println(" В американо сахара "+i+" куска");
    }

    @Override
    public String toString() {
        return "Americano{" +
                "water=" + water +
                ", milk=" + milk +
                ", sugar=" + sugar +
                '}';
    }
}

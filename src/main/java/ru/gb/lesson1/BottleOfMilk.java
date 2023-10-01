package ru.gb.lesson1;

public class BottleOfMilk extends Product { // класс-наследник класса Product, обязательно нужно указать extends
    private double volume;
    private int fat;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public BottleOfMilk(String name, String brand, double price, double volume, int fat) {
        super(brand, name, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    public String displayInfo() {
        return String.format("[молоко] %s - %s - %.2f - объём: %.2f; жирность: %d", brand, name, price, volume, fat);
    }

}

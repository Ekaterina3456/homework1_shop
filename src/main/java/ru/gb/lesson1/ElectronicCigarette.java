package ru.gb.lesson1;

public class ElectronicCigarette extends Product {

    private int nicotine;
    private int puffs;

    public int getNicotine() {
        return nicotine;
    }

    public void setNicotine(int nicotine) {
        this.nicotine = nicotine;
    }
    public int getPuffs() {
        return puffs;
    }
    public void setPuffs(int puffs) {
        this.puffs = puffs;
    }

    public ElectronicCigarette(String name, String brand, double price, int nicotine, int puffs){
        super(name, brand, price);
        this.nicotine = nicotine;
        this.puffs = puffs;
    }

    @Override
    public String displayInfo() {
        return String.format("[Электронная сигарета] %s - %s - %.2f - содержание никотина в процентах: %d; количество затяжек: %d", brand, name, price, nicotine, puffs);
    }
}

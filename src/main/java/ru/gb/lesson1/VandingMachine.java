package ru.gb.lesson1;

import java.util.List;

public class VandingMachine {

    private List<Product> products;

    public VandingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfMilk getBottleOfMilk(double volume, int fat) {
        for (Product product : products) {
            if (product instanceof BottleOfMilk) {
                BottleOfMilk bottleOfMilk = (BottleOfMilk) product;
                if (bottleOfMilk.getVolume() == volume && bottleOfMilk.getFat() == fat) {
                    return bottleOfMilk;
                }
            }
        }
        return null;
    }

    public ElectronicCigarette getElectronicCigarette (int nicotine, int puffs) {
        for (Product product : products) {
            if (product instanceof ElectronicCigarette) {
                ElectronicCigarette electronicCigarette = (ElectronicCigarette) product;
                if (electronicCigarette.getNicotine() == nicotine && electronicCigarette.getPuffs() == puffs) {
                    return electronicCigarette;
                }
            }
        }
        return null;
    }
}

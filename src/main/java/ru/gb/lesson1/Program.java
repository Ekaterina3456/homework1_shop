package ru.gb.lesson1;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Product product1 = new Product();
//        product1.name = "Электронная сигарета";
//        product1.brand = "Iqos";
//        product1.price = 799;

        System.out.println(product1.displayInfo());

        BottleOfMilk bottleOfMilk =
                new BottleOfMilk("Бутылка с молоком", "ООО Источник", 250, 0.5, 3);
        System.out.println(bottleOfMilk.displayInfo());

        Product bottleOfWater =
                new BottleOfWater("Бутылка с водой", "ООО Источник", 200, 1.5);
        System.out.println(bottleOfWater.displayInfo());

        ArrayList<Product> products = new ArrayList<>();
        products.add(bottleOfMilk);
        products.add(bottleOfWater);

        VandingMachine vandingMachine = new VandingMachine(products);

        BottleOfMilk bottleOfMilk1 = vandingMachine.getBottleOfMilk(0.5, 3);
        if (bottleOfMilk1 == null) {
            System.out.println("нет такой бутылки");
        }
        else {
            System.out.println("вы купили");
            System.out.println(bottleOfMilk1.displayInfo());
        }

        System.out.println("-".repeat(60));

        ElectronicCigarette electronicCigarette1 =
                new ElectronicCigarette("Электронная сигарета со вкусом манго", "Iqos", 799, 2, 2000);
        System.out.println(electronicCigarette1.displayInfo());

        ElectronicCigarette electronicCigarette2 =
                new ElectronicCigarette("Электронная сигарета со вкусом зелёного чая", "Iqos", 799, 0, 4000);
        System.out.println(electronicCigarette2.displayInfo());

        ElectronicCigarette electronicCigarette3 =
                new ElectronicCigarette("Электронная сигарета со вкусом голубики", "Iqos", 799, 0, 500);
        System.out.println(electronicCigarette3.displayInfo());

        ElectronicCigarette electronicCigarette4 =
                new ElectronicCigarette("Электронная сигарета со вкусом бабл гам", "Iqos", 799, 4, 1000);
        System.out.println(electronicCigarette4.displayInfo());

        ElectronicCigarette electronicCigarette5 =
                new ElectronicCigarette("Электронная сигарета со вкусом зелёного чая", "Iqos", 799, 3, 800);
        System.out.println(electronicCigarette5.displayInfo());

        ArrayList<Product> cigarettes = new ArrayList<>();
        products.add(electronicCigarette1);
        products.add(electronicCigarette2);
        products.add(electronicCigarette3);
        products.add(electronicCigarette4);
        products.add(electronicCigarette5);

        ElectronicCigarette electronicCigarette = vandingMachine.getElectronicCigarette(0, 500);
        if (electronicCigarette == null) {
            System.out.println("Такой электронной сигареты нет");
        } else {
            System.out.println("Вы купили:");
            System.out.println(electronicCigarette.displayInfo());
        }
    }
}

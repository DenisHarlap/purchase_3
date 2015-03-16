import com.exadel.lab.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*
        * Создание массива покупок из 6 товаров
        */
        Commodity uniqueCommodity = new Commodity("Pencil",45);
        AbstractPurchase [] listPurchase = {
                new RealPurchase(uniqueCommodity,200,500),
                new RealPurchase(uniqueCommodity,100,350),
                new CheapPurchase(uniqueCommodity,135,15),
                new CheapPurchase(uniqueCommodity,180,20),
                new GoodPurchase(uniqueCommodity,150,23.4),
                new GoodPurchase(uniqueCommodity,5,45.3)
        };
        /*
         * Печать созданного списка на консоль
         */
        System.out.println("Print the array content to the console ");
        for (AbstractPurchase iterator : listPurchase) {
            System.out.println(iterator);
        }
        /*
         * Сортировка списка и вывод на консоль
         */
        System.out.println("");
        System.out.println("Sort an array on the cost decreasing");
        Arrays.sort(listPurchase);
        for (AbstractPurchase iterator : listPurchase) {
            System.out.println(iterator);
        }
        /*
         * Определим  товар в списке с наименьшей стоимостью
         */
        int minCost = listPurchase[0].getCost(),number = 0;
        System.out.println("");
        System.out.println("Print purchase with minimum cost");
        for (int i = 1; i < listPurchase.length; i++) {
            if (listPurchase[i].getCost() < minCost) {
                minCost = listPurchase[i].getCost();
                number = i;
            }
        }
        System.out.println(listPurchase[number]);
    }
}

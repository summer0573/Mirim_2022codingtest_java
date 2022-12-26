package codingtest1;

import java.util.Arrays;
import java.util.Comparator;

class Main {
    public static void main(String[] args){
        Coffee[] coffees = new Coffee[]{
                new Coffee("아메리카노", 2500),
                new Coffee("아샷추", 3000),
                new Coffee("딸기라떼", 3500),
                new Coffee("초코라떼", 4000)
                };
        Arrays.sort(coffees, new Comparator<Coffee>() {
            @Override
            public int compare(Coffee c1, Coffee c2) {
                return Integer.compare(c1.getPriceAsInteger(), c2.getPriceAsInteger());
            }
        });
        for(Coffee coffee : coffees) {
            System.out.println(coffee.toString());
        }
    }
}

package strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat[] a = {new Cat(3, 3), new Cat(6, 1), new Cat(1, 2)};
        Dog[] d = {new Dog(6), new Dog(16), new Dog(1)};

        Sorter.SelectSort(a, new CatHeightComparator());
        System.out.println(Arrays.toString(a));

        Sorter.SelectSort(a, new CatWeightComparator());
        System.out.println(Arrays.toString(a));

        Sorter.SelectSort(d, new DogComparator());
        System.out.println(Arrays.toString(d));
    }
}

package sorting;

public class Main {
    public static void main(String[] args) {
        //create and initialize array
        SalesRepresentative[] reps = new SalesRepresentative[]{
                new SalesRepresentative("Anne", 4, 800),
                new SalesRepresentative("Brian", 3, 1500),
                new SalesRepresentative("Camilla", 4, 1000),
                new SalesRepresentative("Dan", 2, 1500),
                new SalesRepresentative("Erick", 10, 80)
        };

        ArrayBubbleSort arraySorting = new ArrayBubbleSort();
        SalesRepresentative[] sortedReps = arraySorting.sort(reps);
    }
}

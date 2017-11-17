package sorting;

public class ArrayBubbleSort {
    SalesRepresentative[] sortedReps;

    /**
     * This method will return the sorted list of the sales representatives, in descending order, based on the amount of revenue generated via sales.
     * Sorting is done using the optimized bubble sort method.
     * @param reps the list of sales representatives that will be sorted
     * @return
     */
    public SalesRepresentative[] sort(SalesRepresentative[] reps) {
        sortedReps = new SalesRepresentative[reps.length];
        SalesRepresentative tempReps = new SalesRepresentative(null, 0, 0);
        boolean change;

        //create a copy for sorted array
        for (int i = 0; i < reps.length; i++) {
            sortedReps[i] = reps[i];
        }

        //sort array
        int i = 0;
        do {
            change = false;
            for (int j = 1; j < sortedReps.length - i; j++) {
                if ((sortedReps[j - 1].salesNumber * sortedReps[j - 1].saleQuota) > (sortedReps[j].salesNumber * sortedReps[j].saleQuota)) {
                    tempReps = sortedReps[j - 1];
                    sortedReps[j - 1] = sortedReps[j];
                    sortedReps[j] = tempReps;
                    change = true;
                }
            }
            i++;

            // print array while sorting
            System.out.println("---------------- Begining of the array printing --------------");
            for (int k = 0; k < sortedReps.length; k++) {
                System.out.println(sortedReps[k].name + " " + sortedReps[k].salesNumber + " " + sortedReps[k].saleQuota +
                        " Are vanzare totala in valoare de: " + sortedReps[k].salesNumber*sortedReps[k].saleQuota);
            }
            System.out.println("---------------- Ending of the array printing --------------");

        } while ((i < sortedReps.length) && (change));

          /*
          //sort array
          for(i=0; i<sortedReps.length; i++){
            for (j=1; j<sortedReps.length-i; j++) {
                if ((sortedReps[j-1].salesNumber*sortedReps[j-1].saleQuota) > (sortedReps[j].salesNumber*sortedReps[j].saleQuota)) {
                    tempReps = sortedReps[j-1];
                    sortedReps[j-1] = sortedReps[j];
                    sortedReps[j] = tempReps;
                }
            }
        } */

        return sortedReps;
    }
}

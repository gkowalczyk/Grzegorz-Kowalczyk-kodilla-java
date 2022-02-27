package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {

    private String[][] workers = {
            {"67032906720", "John", "Smith"},
            {"62081612187", "Ivone", "Novak"},
            {"75021310799", "Jessie", "Pinkman"},
            {"75012200766", "Walter", "White"},
            {"75073006831", "Clara", "Lanson"}};

    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00};

    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}

 //   public static void main(String[] args) {
     //   String[][] workers = {
       //         {"67032906720", "John", "Smith"},
         //       {"62081612187", "Ivone", "Novak"},
            //    {"75021310799", "Jessie", "Pinkman"},
         //       {"75012200766", "Walter", "White"},
         //       {"75073006831", "Clara", "Lanson"}};

      //  for (int rzad = 0; rzad < workers.length; rzad++) {
           // System.out.println(workers.length);
        //    for (int kolumna = 0; kolumna < workers[rzad].length; kolumna++) {
            //    System.out.println(workers[rzad].length);
             //  System.out.println(workers[rzad][0]);
                //System.out.println(workers.length);
          //  }
          //  System.out.println();
       // }
    //}
 //  }
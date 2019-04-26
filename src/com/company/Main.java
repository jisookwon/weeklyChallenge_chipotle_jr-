package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> rice   = new ArrayList<>();
        ArrayList<String> meat   = new ArrayList<>();
        ArrayList<String> beans  = new ArrayList<>();
        ArrayList<String> salsa  = new ArrayList<>();
        ArrayList<String> veggies = new ArrayList<>();

        rice.add("white rice");
        rice.add("brown rice");
        rice.add("no rice");

        meat.add("chicken");
        meat.add("steak");
        meat.add("carnidas");
        meat.add("chorizo");
        meat.add("sofritas");
        meat.add("no meat");

        beans.add("pinto bean");
        beans.add("black bean");
        beans.add("no beans");

        salsa.add("mild salsa");
        salsa.add("medium salsa");
        salsa.add("hot salsa");
        salsa.add("no salsa");
        salsa.add("all");

        veggies.add("lettuce");
        veggies.add("fajita veggies");
        veggies.add("no veggies");
        veggies.add("all");

        int[] lenIng = {3,6,3,5,4};
        int x,y,z=0;

        String str="";
        Random r = new Random();
        Random rr= new Random();
        String[] ingredient = {"rice", "meat", "beans", "salsa","veggies"};

        String[] extraIngre={"Cheese", "Guac", "Queso", "Sour_cream"};


        for (int i=1; i<26; i++) {
            int count = 5;
            double price =0;
            System.out.print("burrito " + i + ": ");
            for (int j = 0; j < 5; j++) {
                x = lenIng[j];
                y = r.nextInt(x);
                switch (j) {
                    case 0:
                        str=rice.get(y);
                        System.out.print(rice.get(y)+", ");
                        break;
                    case 1:
                        str=meat.get(y);
                        System.out.print(meat.get(y)+", ");
                        break;
                    case 2:
                        str=beans.get(y);
                        System.out.print(beans.get(y)+", ");
                        break;
                    case 3:
                        str=salsa.get(y);
                        if (str=="all") {
                            for (int m = 0; m < (salsa.size() - 2); m++) {
                                System.out.print(salsa.get(m) + ", ");
                            }
                            count=count+2;
                        }
                        else{
                                System.out.print(salsa.get(y)+", ");
                        }
                        break;
                    case 4:
                        str=veggies.get(y);
                        if (str=="all") {
                            for (int n = 0; n < (veggies.size() - 2); n++) {
                                System.out.print(veggies.get(n) + ", ");
                            }
                            count=count+1;
                        }
                        else {
                            System.out.print(veggies.get(y) + ", ");
                        }
                        break;
                    default:
                        break;
                }

                if (str.substring(0,2).equals("no")) {
                    count=count-1;
                }
            }
            for (int k=0;k<4;k++) {
                z = rr.nextInt(2);
                if (z==1) {
                    System.out.print(extraIngre[k] +", ");
                    count++;
                }
            }

            price = 3 + (count*0.5);

            System.out.println("\b\b"+ " (" + (count) +") ==> Price : $" + String.format("%.2f",price));





        }
    }
}

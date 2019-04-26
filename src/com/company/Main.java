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

        veggies.add("lettuce");
        veggies.add("fajita veggies");
        veggies.add("no veggies");

        int[] lenIng = {3,6,3,4,3};
        int x,y,z=0;

        String str="";
        Random r = new Random();
        Random rr= new Random();
        String[] ingredient = {"rice", "meat", "beans", "salsa","veggies"};

        String[] extraIngre={"Cheese", "Guac", "Queso", "Sour_cream"};


        for (int i=1; i<26; i++) {
            int count = 0;
            double price =0;
            System.out.print("burrito " + i + ": ");
            for (int j = 0; j < 5; j++) {
                x = lenIng[j];
                y = r.nextInt(x);
                switch (j) {
                    case 0:
                        str=rice.get(y);
                        break;
                    case 1:
                        str=meat.get(y);
                       // System.out.print(meat.get(y));
                        break;
                    case 2:
                        str=beans.get(y);
                      //  System.out.print(beans.get(y));
                        break;
                    case 3:
                        str=salsa.get(y);
                      //  System.out.print(salsa.get(y));
                        break;
                    case 4:
                        str=veggies.get(y);
                      //  System.out.print(veggies.get(y));
                        break;
                    default:
                        break;
                }
                System.out.print(str + ", ");
                if (str.substring(0,2).equals("no")) {
                    count=count-1;
                    //System.out.print("count is "+count );
                }
            }
            for (int k=0;k<4;k++) {
                z = rr.nextInt(2);
                if (z==1) {
                    System.out.print(extraIngre[k] +", ");
                    count++;
                    //System.out.print(count);
                }
            }

               // System.out.println(count + str.substring(0,2));

            price = 3 + (count*0.5);
            if (price<3){
                price=3;
            }
            System.out.println("\b\b"+ " (" + (count+5) +") ==> Price : $" + String.format("%.2f",price));





        }
    }
}

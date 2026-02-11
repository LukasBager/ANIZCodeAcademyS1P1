package Lesson07.Array.MiniPojects.Flower;

public class FlowerShop {

    public static void main(String[] args) {

        /*Flower[] flowers = new Flower[4];
        flowers[0] = new Flower("Rose", "Red");
        flowers[1] = new Flower();
        flowers[2] = new Flower("Tulip", "Green");
        flowers[3] = new Flower("Amaryllis", "Red");
         */

        Flower[] flowers = {
                new Flower("Rose", "Red"),
                new Flower(),
                new Flower("Tulip","Green"),
                new Flower("Amaryllis", "Red")
        };

        for (Flower flower : flowers) {
            System.out.println(flower);
        }

        System.out.println("Traverse array of flowers:");
        int redFlowersCount = 0;
        for (int i = 0; i < flowers.length; i++) {
            System.out.println("Index " + i + ": " + flowers[i]);
            System.out.println("- color: " + flowers[i].getColor());
            System.out.println("- sort: " + flowers[i].getSort());

            if (flowers[i].getColor().equals("Red")) {
                redFlowersCount++;
            }
        }

        System.out.println(redFlowersCount);

        flowers[1].setSort("Lily");
        flowers[1].setColor("White");

        for (Flower flower : flowers) {
            System.out.println(flower);
        }

    }

}

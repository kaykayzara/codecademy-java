public class madLibs {
    public static void main (String[] args) {

        /* 
        This is a Mad Libs game code.
        Created my Zara's Kay
        August 19, 2025
        */

       String name1 = "Steven";

       String adjective1 = "cold";
       String adjective2 = "barren";
       String adjective3 = "full";

       String verb1 = "sew";

       String noun1 = "potatoes";
       String noun2 = "balls";
       String noun3 = "socks";
       String noun4 = "shoes";
       String noun5 = "spoon";
       String noun6 = "scissors";

       String name2 = "Stephanie";
       
       int number = 5;

       String place1 = "Mars";

        String story = name1 + " decided to visit " + place1 + " on a very " + adjective1 + " morning. "
                 + "Carrying a bag full of " + noun1 + "s, " + name1 + " met " + name2 
                 + " who was trying to " + verb1 + " while balancing a " + noun2 + ". "
                 + "Suddenly, a " + adjective2 + " noise came from the " + noun3 
                 + ", making all the " + noun4 + "s start to dance in a " + adjective3 + " way. "
                 + "In the chaos, " + name1 + " slipped on a " + noun5 
                 + " and landed right in front of " + name2 + ". "
                 + "Everyone laughed until the year " + number 
                 + ", when the " + noun6 + "s finally took over the world!";

        System.out.println(story);

    }
}
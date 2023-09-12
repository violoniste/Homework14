public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", getRandom(), getRandom(), getRandom(), getRandom(), getRandom());
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", getRandom(), getRandom(), getRandom(), getRandom(), getRandom());
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", getRandom(), getRandom(), getRandom(), getRandom(), getRandom());

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", getRandom(), getRandom(), getRandom(), getRandom(), getRandom(), getRandom(), getRandom());
        Slytherin grahamMontague = new Slytherin("Graham Montague", getRandom(), getRandom(), getRandom(), getRandom(), getRandom(), getRandom(), getRandom());
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", getRandom(), getRandom(), getRandom(), getRandom(), getRandom(), getRandom(), getRandom());

        Hufflepuff zachariahSmith = new Hufflepuff("Zachariah Smith", getRandom(), getRandom(), getRandom(), getRandom(), getRandom());
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", getRandom(), getRandom(), getRandom(), getRandom(), getRandom());
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", getRandom(), getRandom(), getRandom(), getRandom(), getRandom());

        Ravenclaw zhouChang = new Ravenclaw("Zhou Chang", getRandom(), getRandom(), getRandom(), getRandom(), getRandom(), getRandom());
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", getRandom(), getRandom(), getRandom(), getRandom(), getRandom(), getRandom());
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", getRandom(), getRandom(), getRandom(), getRandom(), getRandom(), getRandom());

        harryPotter.print();
        hermioneGranger.print();
        dracoMalfoy.print();

        harryPotter.compareWithGryffindor(hermioneGranger);
        harryPotter.compareCommon(dracoMalfoy);
    }

    static private int getRandom() {
        return (int) (Math.random() * 100);
    }


}
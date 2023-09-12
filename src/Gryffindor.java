public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int courage;

    public Gryffindor(String name, int magicPower, int transgress, int nobility, int honor, int courage) {
        super(name, magicPower, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public void compareWithGryffindor(Gryffindor other) {
        int sum = getSum();
        int otherSum = other.getSum();

        Gryffindor winner = sum > otherSum ? this : other;
        Gryffindor loser = sum > otherSum ? other : this;

        System.out.println(winner.getName() + " лучший Гриффиндорец, чем " + loser.getName());
    }

    private int getSum() {
        return nobility + honor + courage;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                ", name='" + getName() + '\'' +
                ", magicPower=" + getMagicPower() +
                ", transgress=" + getTransgress() +
                '}';
    }
}

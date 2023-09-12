public class Ravenclaw extends Hogwarts {
    private final int smart;
    private final int wise;
    private final int witty;
    private final int creativity;

    public Ravenclaw(String name, int magicPower, int transgress, int smart, int wise, int witty, int creativity) {
        super(name, magicPower, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public void compareWithGryffindor(Ravenclaw other) {
        int sum = getSum();
        int otherSum = other.getSum();

        Ravenclaw winner = sum > otherSum ? this : other;
        Ravenclaw loser = sum > otherSum ? other : this;

        System.out.println(winner.getName() + " лучший Когтевранец, чем " + loser.getName());
    }

    private int getSum() {
        return smart + wise + witty + creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity +
                ", name='" + getName() + '\'' +
                ", magicPower=" + getMagicPower() +
                ", transgress=" + getTransgress() +
                '}';
    }
}
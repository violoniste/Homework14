public class Hufflepuff extends Hogwarts {
    private final int hardworking;
    private final int loyal;
    private final int honest;

    public Hufflepuff(String name, int magicPower, int transgress, int hardworking, int loyal, int honest) {
        super(name, magicPower, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public void compareWithGryffindor(Hufflepuff other) {
        int sum = getSum();
        int otherSum = other.getSum();

        Hufflepuff winner = sum > otherSum ? this : other;
        Hufflepuff loser = sum > otherSum ? other : this;

        System.out.println(winner.getName() + " лучший Пуффендуец, чем " + loser.getName());
    }

    private int getSum() {
        return hardworking + loyal + honest;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                ", name='" + getName() + '\'' +
                ", magicPower=" + getMagicPower() +
                ", transgress=" + getTransgress() +
                '}';
    }
}
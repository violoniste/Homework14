public class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstForPower;

    public Slytherin(String name, int magicPower, int transgress, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public void compareWithGryffindor(Slytherin other) {
        int sum = getSum();
        int otherSum = other.getSum();

        Slytherin winner = sum > otherSum ? this : other;
        Slytherin loser = sum > otherSum ? other : this;

        System.out.println(winner.getName() + " лучший Гриффиндорец, чем " + loser.getName());
    }

    private int getSum() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                ", name='" + getName() + '\'' +
                ", magicPower=" + getMagicPower() +
                ", transgress=" + getTransgress() +
                '}';
    }
}
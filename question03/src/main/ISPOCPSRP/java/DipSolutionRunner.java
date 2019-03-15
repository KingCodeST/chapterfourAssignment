public class DipSolutionRunner implements DipSoccerplayer{

    private final int maxEnergy;
    private int currentEnergy;
    private int Strenght;

    public DipSolutionRunner(final int maxEnergy)
    {
        this.maxEnergy =maxEnergy;
        currentEnergy =maxEnergy;
    }

    public void speed()
    {
        Strenght++;
        currentEnergy++;

    }
}

public class DipVoilationRunner {

    private final int maxEnergy;
    private int currentEnergy;
    private int Strenght;

    public DipVoilationRunner(final int maxEnergy)
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

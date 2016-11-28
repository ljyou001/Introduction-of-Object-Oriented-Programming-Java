public class TeamLeader extends ProductionWorker
{
    private double mBonus;
    private int trainingHour;
    private int attendedTrainingHour;
    public TeamLeader(String name, String id, int shift, double hourlyPayRate, double mBonus, int trainingHour, int attendedTrainingHour)
    {
        super(name, id, shift, hourlyPayRate);
        this.mBonus = mBonus;
        this.trainingHour = trainingHour;
        this.attendedTrainingHour = attendedTrainingHour;
    }
    public double getMBonus()
    {
        return mBonus;
    }
    public int getTrainingHour()
    {
        return trainingHour;
    }
    public int getAttendedTrainingHour()
    {
        return attendedTrainingHour;
    }
    public void setMBonus(double mBonus)
    {
        this.mBonus = mBonus;
    }
    public void setTrainingHour(int trainingHour)
    {
        this.trainingHour = trainingHour;
    }
    public void setAttendedTrainingHour(int attendedTrainingHour)
    {
        this.attendedTrainingHour = attendedTrainingHour;
    }
}
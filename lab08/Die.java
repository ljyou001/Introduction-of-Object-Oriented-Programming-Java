import java.util.Random;
public class Die
{
    private int value;
    private int faces;
    public Die(int faces)
    {
        this.faces = faces;
    }
    public int value()
    {
        return value;
    }
    public int returnNum(){
        int tmp = ((int)(faces*Math.random()))+1;
        return tmp;
    }
}

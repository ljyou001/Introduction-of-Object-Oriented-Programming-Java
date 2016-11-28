import java.util.*;
public class SortSimpleFractionArray implements Comparator<SimpleFraction>
{
    public boolean ascend;
    public int compare(SimpleFraction a, SimpleFraction b)
    {        if(ascend == true){
            if(a.getValue() < b.getValue()) {  
                return -1;
            } else if(b.getValue() < a.getValue()){
                return 1;
            } else {
                return 0;
            }   
        } else {
            if(a.getValue() < b.getValue()) {  
                return 1;
            } else if(b.getValue() < a.getValue()){
                return -1;
            } else {
                return 0;
            }   
        }
    }
}

import java.lang.Math;
import java.util.ArrayList;

public class DistinctPowers {

    public static void main(String[] args) {
    
        double tempPower = 0;
        
        ArrayList<Double> distinctTerms = new ArrayList<Double>();
        
        for(int a = 2; a <= 100; a++) {
        
            for(int b = 2; b <=100; b++) {
            
                tempPower = Math.pow(a,  b);
                
                if(distinctTerms.contains(tempPower) == false) {
                    distinctTerms.add(tempPower);
                }
            }
        }
        System.out.println(distinctTerms.size());
    }
}

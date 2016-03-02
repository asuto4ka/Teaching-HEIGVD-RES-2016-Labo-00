package ch.heigvd.res.lab00;
import java.util.ArrayList;
import java.util.List;

public class Orchestra {
   
 public  int getNumberOfInstruments() {
       return numberOfInstruments.size();   
   }
   
  public void addInstrument(IInstrument instrument){
      numberOfInstruments.add(instrument);
   }
   
   
   public List<String>  makeMusic() {
      for (IInstrument t : numberOfInstruments)
          sounds.add(t.play());
     
    return sounds;
   }

   private List<IInstrument> numberOfInstruments= new ArrayList<>();
    List<String> sounds = new ArrayList<>();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Anastasia
 */
public class Flute implements IInstrument {

   int fluteVolume = 1;
   String son = "trilili";
     
   @Override
   public String play() {
         return son;
   }

   @Override
   public int getSoundVolume() {
      return fluteVolume;     
   }

   @Override
   public String getColor() {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }
   
}

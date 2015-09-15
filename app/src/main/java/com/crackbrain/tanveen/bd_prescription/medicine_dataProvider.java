package com.crackbrain.tanveen.bd_prescription;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Al on 9/11/2015.
 */
public class medicine_dataProvider
{
  public static   HashMap<String, List<String>> getInfo() {

      HashMap<String, List<String>> diseaseDetails = new HashMap<String, List<String>>();


     List<String> Cardiology = new ArrayList<String>();
      Cardiology.add("Acute Miocardial Infarction(AMI)");
      Cardiology.add("A");
      Cardiology.add("B");
      Cardiology.add("C");
      Cardiology.add("D");
      Cardiology.add("E");
      Cardiology.add("F");
      Cardiology.add("G");
      Cardiology.add("H");
      Cardiology.add("I");
      Cardiology.add("J");





      List<String> Hepatologyv = new ArrayList<String>();
      Hepatologyv.add("Viral Hepatitis");
      Hepatologyv.add("k");
      Hepatologyv.add("l");
      Hepatologyv.add("m");
      Hepatologyv.add("n");
      Hepatologyv.add("o");
      Hepatologyv.add("p");
      Hepatologyv.add("q");
      Hepatologyv.add("r");
      Hepatologyv.add("s");
      Hepatologyv.add("T");

      List<String> nephrology = new ArrayList<String>();
      nephrology.add("Nephritic Syndrome");


      List<String> neurology= new ArrayList<String>();
      neurology.add("Migrane");

      List<String> Paediatrics = new ArrayList<String>();
      Paediatrics.add("Febrile Convulsion");

      List<String> Phychaiatry = new ArrayList<String>();
      Phychaiatry.add("Depressive Illness");


      List<String> Skin_VD = new ArrayList<String>();
      Skin_VD.add("Scabies");


      diseaseDetails.put("Cardiology",Cardiology);
      diseaseDetails.put("Hepatologyv",Hepatologyv);
      diseaseDetails.put("Neurology",neurology);
      diseaseDetails.put("Paediatrics",Paediatrics);
      diseaseDetails.put("Phychaiatry",Phychaiatry);
      diseaseDetails.put("Skin_VD",Skin_VD);


      return  diseaseDetails;

  }



}

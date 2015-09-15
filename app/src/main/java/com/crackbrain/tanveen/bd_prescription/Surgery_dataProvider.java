package com.crackbrain.tanveen.bd_prescription;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Al on 9/11/2015.
 */
public class Surgery_dataProvider
{
  public static   HashMap<String, List<String>> getInfo() {

      HashMap<String, List<String>> diseaseDetails = new HashMap<String, List<String>>();

      List<String> ent = new ArrayList<String>();
      ent.add("Allergic rhinitis");
      ent.add("A");
      ent.add("B");
      ent.add("C");
      ent.add("D");
      ent.add("E");
      ent.add("F");
      ent.add("G");
      ent.add("H");
      ent.add("I");
      ent.add("J");





      List<String> Eye = new ArrayList<String>();
      Eye.add("viral_hepatitis");
      Eye.add("k");
      Eye.add("l");
      Eye.add("m");
      Eye.add("n");
      Eye.add("o");
      Eye.add("p");
      Eye.add("q");
      Eye.add("r");
      Eye.add("s");
      Eye.add("T");

      List<String> general_surgery = new ArrayList<String>();
      general_surgery.add("viral_hepatitis");





      diseaseDetails.put("Ent",ent);
      diseaseDetails.put("Eye",Eye);
      diseaseDetails.put("General Surgery",general_surgery);



      return  diseaseDetails;

  }



}

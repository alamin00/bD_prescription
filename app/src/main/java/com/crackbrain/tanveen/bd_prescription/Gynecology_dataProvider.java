package com.crackbrain.tanveen.bd_prescription;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Al on 9/11/2015.
 */
public class Gynecology_dataProvider
{
  public static   HashMap<String, List<String>> getInfo() {

      HashMap<String, List<String>> diseaseDetails = new HashMap<String, List<String>>();

      List<String> Gynecology = new ArrayList<String>();
      Gynecology.add("Pregnancy Followup");
      Gynecology.add("Pv Bleeding With Pregnancy");
      Gynecology.add("B");
      Gynecology.add("C");
      Gynecology.add("D");
      Gynecology.add("E");
      Gynecology.add("F");






      List<String> G_A = new ArrayList<String>();

      G_A.add("k");
      G_A.add("l");
      G_A.add("m");
      G_A.add("n");
      G_A.add("o");
      G_A.add("p");
      G_A.add("q");
      G_A.add("r");
      G_A.add("s");
      G_A.add("T");




      diseaseDetails.put("Gynecology",Gynecology);
      diseaseDetails.put("Gynecoloy_A",G_A);


      return  diseaseDetails;

  }



}

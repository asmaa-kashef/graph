/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asmaa
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import static java.util.stream.Collectors.toList;
public class SortCities {
       CitiesOpenCSV open= new CitiesOpenCSV();
       List<CitiesPojo> CitiesName=new ArrayList<>();
       public  List<CitiesPojo> Filter(String fileName ,String country){
       List<CitiesPojo> cities= open.opencsv(fileName);
       for(CitiesPojo i:cities){
           if((i.getcountry_name()).equals(i.getcountry_name())){
              CitiesName.add(i);
           
           }
        return CitiesName;
       // List<CitiesPojo> CitiesName = cities.stream().filter(b -> b.getcountry_name()== Country).collect(toList());
     
      }
   
    
}
}
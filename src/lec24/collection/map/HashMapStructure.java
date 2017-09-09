package lec24.collection.map;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapStructure {
  
    public static void main(String[] args) {
          
        Country india=new Country("India",1000);
        Country japan=new Country("Japan",10000);
          
        Country france=new Country("France",2000);
        Country russia=new Country("Russia",20000);
        
        Country aa=new Country("aa",20000);
        Country bb=new Country("bb",20000);
        Country cc=new Country("cc",20000);
        Country dd=new Country("dd",20000);
        Country ee=new Country("ee",20000);
        Country ff=new Country("ff",20000);
        Country gg=new Country("gg",20000);
        Country hh=new Country("hh",20000);
        Country ii=new Country("ii",20000);
        Country jj=new Country("jj",20000);
        Country kk=new Country("kk",20000);
        Country ll=new Country("ll",20000);
        Country mm=new Country("mm",20000);
        Country nn=new Country("nn",20000);
          
        HashMap<Country,String> countryCapitalMap=new HashMap<>();
        countryCapitalMap.put(india,"Delhi");
        countryCapitalMap.put(japan,"Tokyo");
        countryCapitalMap.put(france,"Paris");
        countryCapitalMap.put(russia,"Moscow");
        
        countryCapitalMap.put(aa,"AA");
        countryCapitalMap.put(bb,"BB");
        countryCapitalMap.put(cc,"CC");
        countryCapitalMap.put(dd,"DD");
        countryCapitalMap.put(ee,"EE");
        countryCapitalMap.put(ff,"FF");
        countryCapitalMap.put(gg,"GG");
        countryCapitalMap.put(hh,"HH");
        countryCapitalMap.put(ii,"II");
        countryCapitalMap.put(jj,"JJ");
        countryCapitalMap.put(kk,"KK");
        countryCapitalMap.put(ll,"LL");
        countryCapitalMap.put(mm,"MM");
        countryCapitalMap.put(nn,"NN");
          
        System.out.println("size before iteration " + countryCapitalMap.size());
        
        Iterator<Country> countryCapitalIter=countryCapitalMap.keySet().iterator();//put debug point at this line
        while(countryCapitalIter.hasNext())
        {
            Country countryObj=countryCapitalIter.next();
            String capital=countryCapitalMap.get(countryObj);
            System.out.println(countryObj.getName()+"----"+capital);
            }
        }
  
  
} 
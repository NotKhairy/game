package game.engine.dataloader;
import java.io.BufferedReader;

import java.io.IOException;
import java.util.HashMap;
import java.io.FileReader;

import game.engine.titans.TitanRegistry;

import java.io.IOException;
import java.util.HashMap;

import game.engine.titans.TitanRegistry;
import game.engine.weapons.WeaponRegistry;

public class DataLoader {
  private String  TITANS_FILE_NAME;
  private String  WEAPONS_FILE_NAME;
  
  
  
  public static HashMap<Integer, TitanRegistry> readTitanRegistry() throws IOException{
	  String csvFile = "TITANS_FILE_NAME.csv";
	  try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
          String line;
          while ((line = br.readLine()) != null) {
              String[] parts = line.split(","); 
              int id = Integer.parseInt(parts[0].trim());
              String name = parts[1].trim();

             
              TitanRegistry titan = new TitanRegistry(id, name);

             
              registryMap.put(id, titan);
          }
      }

      return registryMap;
  }
  
  public static HashMap<Integer, WeaponRegistry> readWeaponRegistry() throws IOException{
	  
  }
}

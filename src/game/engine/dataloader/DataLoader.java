package game.engine.dataloader;
import java.io.BufferedReader;

import java.io.IOException;
import java.util.HashMap;
import java.io.FileReader;

import game.engine.titans.TitanRegistry;
import game.engine.weapons.WeaponRegistry;

public class DataLoader {
  private final String  TITANS_FILE_NAME;
  private final String  WEAPONS_FILE_NAME;
  
  
  
  public static HashMap<Integer, TitanRegistry> readTitanRegistry() throws IOException{
	  String csvFile = "TITANS_FILE_NAME.csv";
	  HashMap<Integer, TitanRegistry> registryMap = new HashMap<>();

      try (BufferedReader br = new BufferedReader(new FileReader("titans.csv"))) {
          String line;
          while ((line = br.readLine()) != null) {
              String[] parts = line.split(","); 
              int code = Integer.parseInt(parts[0].trim());
              int baseHealth = Integer.parseInt(parts[1].trim());
              int baseDamage = Integer.parseInt(parts[2].trim());
              int heightInMeters = Integer.parseInt(parts[3].trim());
              int speed = Integer.parseInt(parts[4].trim());
              int resourcesValue = Integer.parseInt(parts[5].trim());
              int dangerLevel = Integer.parseInt(parts[6].trim());

              TitanRegistry titan = new TitanRegistry(code, baseHealth, baseDamage, heightInMeters, speed, resourcesValue, dangerLevel);

              registryMap.put(code, titan);
          }
      }

      return registryMap;
  }
	  
   
  
  

  public static HashMap<Integer, WeaponRegistry> readWeaponRegistry() throws IOException {
      HashMap<Integer, WeaponRegistry> registryMap = new HashMap<>();

      try (BufferedReader br = new BufferedReader(new FileReader("weapons.csv"))) {
          String line;
          while ((line = br.readLine()) != null) {
              String[] parts = line.split(","); 
              int code = Integer.parseInt(parts[0].trim());
              int price = Integer.parseInt(parts[1].trim());
              int damage = Integer.parseInt(parts[2].trim());
              String name = parts[3].trim();
              int minRange = Integer.parseInt(parts[4].trim());
              int maxRange = Integer.parseInt(parts[5].trim());

              WeaponRegistry weapon = new WeaponRegistry(code, price, damage, name, minRange, maxRange);

              registryMap.put(code, weapon);
          }
      }

      return registryMap;
  }

  }


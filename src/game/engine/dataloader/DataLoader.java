package game.engine.dataloader;
import java.io.BufferedReader;

import java.io.IOException;
import java.util.HashMap;
import java.io.FileReader;

import game.engine.titans.TitanRegistry;
import game.engine.weapons.WeaponRegistry;



public class DataLoader{
	private final static String TITANS_FILE_NAME = "titans.csv";
	private final static String WEAPONS_FILE_NAME = "weapons.csv";
	
	
	public static HashMap<Integer, TitanRegistry> readTitanRegistry() throws IOException{
		HashMap<Integer, TitanRegistry> Map = new HashMap<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(TITANS_FILE_NAME))){
			String s;
			while((s = br.readLine())!=null){
				String [] parts = s.split(",");
				int code = Integer.parseInt(parts[0].trim());
				int baseHealth = Integer.parseInt(parts[1].trim());
				int baseDamage = Integer.parseInt(parts[2].trim());
				int heightInMeters = Integer.parseInt(parts[3].trim());
				int speed = Integer.parseInt(parts[4].trim());
				int resourcesValue = Integer.parseInt(parts[5].trim());
				int dangerLevel = Integer.parseInt(parts[6].trim());
				
				TitanRegistry titan = new TitanRegistry(code, baseHealth, baseDamage, heightInMeters, speed, resourcesValue, dangerLevel);
				Map.put(code, titan);
						
			}
		}
		return Map;
		
	}
	
	
	public static HashMap<Integer, WeaponRegistry> readWeaponRegistry() throws IOException{
		HashMap<Integer, WeaponRegistry> Map = new HashMap<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(WEAPONS_FILE_NAME))){
			String s;
			while((s = br.readLine())!=null) {
				String [] parts = s.split(",");
				int code = Integer.parseInt(parts[0].trim());
				int price = Integer.parseInt(parts[1].trim());
				int damage = Integer.parseInt(parts[2].trim());
				String name = parts[3].trim();
				int minRange = Integer.parseInt(parts[4].trim());
				int maxRange = Integer.parseInt(parts[5].trim());
				
				WeaponRegistry weapon = new WeaponRegistry(code, price, damage, name, minRange, maxRange);
				
				Map.put(code, weapon);


			}
		}
		return Map;
	}
	
	
}
package dao;

import java.util.List;

import metier.entities.Aeroport;
import metier.entities.Equipement;


public interface IAeroportDao {
	public Aeroport save(Aeroport a); 
	public List<Aeroport> aeroports(); 
	public Aeroport update(Aeroport a1, Aeroport a2); 
	public void deleteAeroport(String nomAeroport);
	public Aeroport getAeroport(String NA);
	
	
	
}

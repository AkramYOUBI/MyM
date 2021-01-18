package dao;

import java.util.List;


import metier.entities.Projet;


public interface IProjetDao {
	public Projet save(Projet p); 
	public List<Projet> projets(); 
	public Projet update(Projet p1, Projet p2);
	public void deleteProjet(String nomProjet);  
	public Projet getProjet(String NP);
	
	
}

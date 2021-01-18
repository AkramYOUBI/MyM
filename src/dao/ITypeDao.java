package dao;

import java.util.List;

import metier.entities.Aeroport;
import metier.entities.Ttype;


public interface ITypeDao {
	public Ttype save(Ttype a); 
	public List<Ttype> types(); 
	public Ttype update(Ttype t1, Ttype t2); 
	public void deleteType(String type); 
	public Ttype getType(String TT);
	
	
}

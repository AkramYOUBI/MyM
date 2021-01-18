package dao;

import java.util.List;

import metier.entities.Equipement;

public interface IEquipementDao {
	public Equipement save(Equipement e); /*ajouter et enregistrer les equipement et retourn l'equip ajouter*/
	public List<Equipement> equipementsParNS(String ns ); /*chercher et affiche une liste d'equipement*/
	public Equipement getEquipement(String MC); /*consulter un equipement par son Numero de Serie(mc)*/
	public Equipement update(Equipement e); /*mise a jours des equipements*/
	public void deleteEquipement(String numero_serie); /*supp un equipement*/ 
	public List<Equipement> equipementsParRP(String nom_aeroport, String nom_projet, String id_terminal, String nom_zone, String id_comptoir, String model);
	public Equipement getEquipementRP(String nom_aeroport, String nom_projet, String id_terminal, String nom_zone, String id_comptoir, String model);
}

package main;

import sn.isi.dao.ClientImpl;
import sn.isi.dao.IClient;
import sn.isi.entities.Client;

public class ClientControler {
	public static void main(String[] args) {

		// ajouter un client
		
		Client client = new Client();
		IClient cdao = new ClientImpl();
		
//		client.setAdresse("Dakar");
//		client.setTelephone("784059330");
//		client.setPrenom("Moustapha");
//		client.setNom("Diagne");
//		int resultAdd = cdao.add(client);
//		System.out.println(resultAdd);
		
		//modifier un client
		
		client = cdao.get(1, client);
		client.setAdresse("Dakar");
		client.setTelephone(784059330);
		client.setPrenom("Moustapha");
		client.setNom("Diagne");

		int resultUpdate = cdao.update(client);
		
		System.out.println(resultUpdate);
		
		// supprimer un client
		
//		int resultDelete = cdao.delete(1, client);
		
//		// lister les client
		
		cdao.list(client).stream()
		.forEach(u->System.out.println("ID : " + u.getId() + " , Prenom : " + u.getPrenom() + " , Nom : " + u.getNom()));;

	}
}

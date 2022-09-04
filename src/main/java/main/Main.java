package main;

import sn.isi.dao.IRole;
import sn.isi.dao.IUser;
import sn.isi.dao.RoleImpl;
import sn.isi.dao.UserImpl;
import sn.isi.entities.Role;
import sn.isi.entities.User;

public class Main {
	public static void main(String[] args) {

		User user = new User();
		user.setPassword("passer");
		user.setEmail("malickcoly@gmail.com");
		user.setPrenom("Malick");
		user.setNom("Coly");
		user.setIdentifiant("MA78667");
		user.setEtat("Actif");

		IUser udao = new UserImpl();
		
		int result = udao.add(user);
		System.out.println(result);
//		user = udao.get(1);
//		System.out.print(user.getNom());
//		user.setPassword("passer");
//		user.setUsername("cerv");
//		user.setPrenom("Malick");
//		user.setNom("Coly");

//		boolean result = udao.update(user);
		
//		Role role = new Role();
//		role.setNom("ROLE_GESCLIENTELE");
//		
//		IRole rdao = new RoleImpl();
//
//		int resultAddRole = rdao.add(role);
//		role = rdao.get(1, role);
//		role.setNom("ROLE_ADMIN");
//		int resultUpdateRole = rdao.update(role);
//		role = rdao.add(role)
//		role.setRoleName("SCRUM_MASTER");
		
//		boolean resultRole = rdao.update(role);
		
//		udao.addUserToRoles(user.getId(), role.getId());
		//System.out.println(result);
		//udao.delete(8L);
		//udao.update(user);
		udao.list(user).stream()
		.forEach(u->System.out.println("ID : " + u.getId() + " , Nom : " + u.getNom()));;

	}
}

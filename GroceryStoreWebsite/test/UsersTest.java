import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.grocerystore.entity.Users;

public class UsersTest {

	public static void main(String[] args) {
		Users user1 = new Users();
		user1.setEmail("Krish@concordia.ca");
		user1.setFullname("Krish Desineni");
		user1.setPassword("heyworld");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("GroceryStoreWebsite");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		entityManager.persist(user1);
		entityManager.getTransaction().commit();
		entityManager.close();

entityManagerFactory.close();
System.out.println("A user object is persisted");
	}

}

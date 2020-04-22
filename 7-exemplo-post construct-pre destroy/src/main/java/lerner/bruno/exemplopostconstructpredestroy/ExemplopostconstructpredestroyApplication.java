package lerner.bruno.exemplopostconstructpredestroy;

import lerner.bruno.exemplopostconstructpredestroy.dao.ClientDAO;
import lerner.bruno.exemplopostconstructpredestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Bruno Lerner
 * @version 1.0
 * @since 16/04/2020 09:53
 */
@SpringBootApplication
public class ExemplopostconstructpredestroyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemplopostconstructpredestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Bruno Lerner"));

		System.out.println("Objeto ClientDAO: " + clientDAO);
		System.out.println("Objeto Cliente: " + clientDAO.getClient());
	}
}

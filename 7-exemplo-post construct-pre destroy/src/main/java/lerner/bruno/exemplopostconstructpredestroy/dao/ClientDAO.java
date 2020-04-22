package lerner.bruno.exemplopostconstructpredestroy.dao;

import lerner.bruno.exemplopostconstructpredestroy.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Bruno Lerner
 * @version 1.0
 * @since 16/04/2020 09:53
 */
@Component
@Getter @Setter
public class ClientDAO {

    @Autowired
    private Client client;

    @PostConstruct
    public void postConstructor() {
        System.out.println("Objeto criado");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Objeto Finalizado");
    }
}

package lerner.bruno.exemplopostconstructpredestroy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author Bruno Lerner
 * @version 1.0
 * @since 16/04/2020 09:53
 */
@Component
@Getter @Setter
@AllArgsConstructor
@ToString
public class Client {

    private String name;

    public Client() {
        System.out.println("Classe cliente!");
    }
}

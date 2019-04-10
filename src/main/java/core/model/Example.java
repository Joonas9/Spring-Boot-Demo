package core.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Example {

    @Id
    @GeneratedValue(strategy=IDENTITY)
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String message;

}

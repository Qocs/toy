package qocs.toyshop.domain.toy;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("S")
@Getter
@Setter
public class Sword extends Toy {

    @Id
    @GeneratedValue
    private Long id;

    private String warrior;

}

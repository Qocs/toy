package qocs.toyshop.domain.toy;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("G")
@Getter
@Setter
public class Gun extends Toy {

    private String host;

    private String isbn; //총기번호
}

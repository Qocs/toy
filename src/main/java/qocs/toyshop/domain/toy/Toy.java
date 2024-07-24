package qocs.toyshop.domain.toy;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
@Getter
@Setter
public abstract class Toy {

    @Id
    @GeneratedValue
    @Column(name = "toy_id")
    private Long id;

    private String name;

    private int price;

    private int stockQuantity;




}

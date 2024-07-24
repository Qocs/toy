package qocs.toyshop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import qocs.toyshop.domain.toy.Toy;

@Entity
@Getter
@Setter
@Table(name = "order_toy")
public class OrderToy {

    @Id
    @GeneratedValue
    @Column(name = "order_toy_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "toy_id")
    private Toy toy;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private int orderPrice;

    private int count;
}

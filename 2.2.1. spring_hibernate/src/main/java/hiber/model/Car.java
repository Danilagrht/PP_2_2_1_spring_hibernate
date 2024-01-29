package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    private long id;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private String series;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private User user;
}

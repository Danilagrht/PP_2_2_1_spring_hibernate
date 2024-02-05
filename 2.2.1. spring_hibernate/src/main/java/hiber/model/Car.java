package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private int series;

    /*@OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;*/

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public Car() {
    }

    public long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    /*public User getUser() {
        return user;
    }*/

    public void setId(long id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    /*public void setUser(User user) {
        this.user = user;
    }*/
}

package entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="costumer")
@Data
public class Costumer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "costumer_fname")
    private String costumer_fname;

    @Column(name = "costumer_lname")
    private String costumer_lname;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

}

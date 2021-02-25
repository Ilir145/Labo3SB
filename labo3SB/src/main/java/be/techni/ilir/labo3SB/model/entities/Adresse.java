package be.techni.ilir.labo3SB.model.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Embeddable;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Embeddable
public class Adresse {

    String street;
    Integer number;
    String zip;
    String city;
    String country;
}

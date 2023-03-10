package docrob.demo2.models;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Puppy implements Serializable {
    private String name;

}

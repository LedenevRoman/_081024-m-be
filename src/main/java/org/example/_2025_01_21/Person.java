package org.example._2025_01_21;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private LocalDate dateBirth;

    public Person(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public int getAge() {
        return Period.between(dateBirth, LocalDate.now()).getYears();
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Person)) {
            return false;
        }
        Person p = (Person) object;
        return this.dateBirth.equals(p.dateBirth);
    }
}

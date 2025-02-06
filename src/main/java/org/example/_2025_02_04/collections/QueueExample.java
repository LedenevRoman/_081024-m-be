package org.example._2025_02_04.collections;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Patient patient1 = new Patient(LocalDateTime.of(2025, 2, 6, 10,15));
        Patient patient2 = new Patient(LocalDateTime.of(2025, 2, 7, 10,15));
        Patient patient3 = new Patient(LocalDateTime.of(2025, 2, 8, 10,15));
        Patient patient4 = new Patient(LocalDateTime.of(2025, 2, 9, 10,15));
        Patient patient5 = new Patient(LocalDateTime.of(2025, 2, 6, 11,15));
        Patient patient6 = new Patient(LocalDateTime.of(2025, 2, 6, 10,30));

        Comparator patientComparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Patient patient1 = (Patient) o1;
                Patient patient2 = (Patient) o2;
                return patient1.getTime().compareTo(patient2.getTime());
            }
        };

        Queue queue = new PriorityQueue(patientComparator);
        queue.add(patient1);
        queue.add(patient2);
        queue.add(patient3);
        queue.add(patient4);
        queue.add(patient5);
        queue.add(patient6);

        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

/*        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());*/

        System.out.println(queue);

    }
}

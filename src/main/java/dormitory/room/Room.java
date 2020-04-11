package dormitory.room;

import dormitory.Cockroach;
import dormitory.Student;
import dormitory.overhaul.CommonOverhaul;
import dormitory.overhaul.DamnOverhaul;
import dormitory.overhaul.LuxuryOverhaul;
import dormitory.overhaul.Overhaul;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private final String number;
    private Overhaul overhaul;
    private List<Student> students;
    private List<Cockroach> cockroaches;

    public Room(String number,
                Overhaul overhaul) {
        this.number   = number;
        this.overhaul = overhaul;

        students = new ArrayList<>();
        students.add(new Student("Вася", 18, "P31XX"));
        students.add(new Student("Петя", 18, "N31XX"));

        cockroaches = new ArrayList<>();
    }

    // some methods here...
}

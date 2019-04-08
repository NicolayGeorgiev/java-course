package ru.spsuace.course.lesson2.classwork.patterns.creational.factory.abstracts;

/**
 * OrcArmy
 */
public class OrcArmy implements Army {

    static final String DESCRIPTION = "This is the Orc Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

package com.levi;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BattleshipActionsTest {
    private BattleshipActions actionsTest = new BattleshipActions();
    private List<String> locations1 = new ArrayList<>();
    private List<String> locations2 = new ArrayList<>();

    @Test
    public void removeLocation() {
        locations1.add("b1");
        locations1.add("b2");
        locations1.add("b3");

        locations2.add("c1");
        locations2.add("c2");
        locations2.add("c3");

        actionsTest.setLocations1(locations1);
        actionsTest.setLocations2(locations2);

        actionsTest.removeLocation(1, "c2");
        actionsTest.removeLocation(2, "b2");
        System.out.println(locations1 + " - " + actionsTest.getLocations(2));
        System.out.println(locations2 + " - " + actionsTest.getLocations(1));

        Assert.assertFalse(locations1.equals(actionsTest.getLocations(2)));
        Assert.assertFalse(locations2.equals(actionsTest.getLocations(1)));

    }

    @Test
    public void getLocations() {
        locations1.add("b1");
        locations1.add("b2");
        locations1.add("b3");

        locations2.add("c1");
        locations2.add("c2");
        locations2.add("c3");

        actionsTest.setLocations1(locations1);
        actionsTest.setLocations2(locations2);

        System.out.println(locations1 + " - " + actionsTest.getLocations(2));
        System.out.println(locations2 + " - " + actionsTest.getLocations(1));

        Assert.assertTrue(locations1.equals(actionsTest.getLocations(2)));
        Assert.assertTrue(locations2.equals(actionsTest.getLocations(1)));
    }
}
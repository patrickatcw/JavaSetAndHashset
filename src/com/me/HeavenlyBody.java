package com.me;

import java.util.HashSet;
import java.util.Set;

//step 1 class
//step 2 make final class
public final class HeavenlyBody {

    //step 3 fields or variables
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    //step 4 constructor for name and orbital period
    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        //step 5 initialize Set<HeavenlyBody> satellites; manually
        this.satellites = new HashSet<HeavenlyBody>();
    }

}

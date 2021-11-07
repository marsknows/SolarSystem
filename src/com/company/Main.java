package com.company;

public class Main {

    public static void main(String[] args) {

        SolarSystem andromeda = new SolarSystem();
        andromeda.Sun=1;
        andromeda.planet=2;
        andromeda.moon=4;

        SunFeature sonSun = new SunFeature();
        sonSun.color="green";
        sonSun.heat=9251990;
        sonSun.temp="4071995 ºF";
        sonSun.radius="19901995";

        Mars mars1 = new Mars();
        mars1.size=92590;
        mars1.color="red";
        mars1.type="terrestrial";

        Venus venus1 = new Venus();
        venus1.color="pink";
        venus1.type="vapor";

        Moon2 moon2 = new Moon2();
        moon2.color="white";
        moon2.name="Lunar";

    }
}

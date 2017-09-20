package com.mihk.ch10;

import java.util.ArrayList;
import java.util.List;

public class GreenhouseController {
    public static void main(String[] args) {
        GreenHouseControls gc = new GreenHouseControls();
        gc.addEvent(gc.new Bell(900));
        List<Event> eventList = new ArrayList<>();
        eventList.add(gc.new ThermostatNight(0));
        eventList.add(gc.new LightOn(200));
        eventList.add(gc.new LightOff(400));
        eventList.add(gc.new WaterOn(600));
        eventList.add(gc.new WaterOff(800));
        eventList.add(gc.new ThermostatDay(1400));
        gc.addEvent(gc.new Restart(2000,eventList));
        if (args.length == 1){
            gc.addEvent(new GreenHouseControls.Terminate(new Integer(args[0])));

        }
        gc.run();
    }
}

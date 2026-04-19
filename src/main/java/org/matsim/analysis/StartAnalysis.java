package org.matsim.analysis;

import org.matsim.core.events.EventsUtils;

public class StartAnalysis {

    public static void main(String[] args) {

        var handler = new Intersectioncounterhandler();
        var forhistogramHandler = new LinkEventoHandler();
        var manager = EventsUtils.createEventsManager();
        manager.addHandler(handler);
        manager.addHandler(forhistogramHandler);
        EventsUtils.readEvents(manager, "scenarios/serengeti-park-v1.0/output/output-serengeti-park-v1.0-run1/serengeti-park-v1.0-run1.output_events.xml.gz");

        System.out.println(handler.counter);

        for (var stringIntegerEntry : forhistogramHandler.histogram.entrySet()){
            System.out.println(stringIntegerEntry.getKey() + ": " + stringIntegerEntry.getValue());
        }
    }
}

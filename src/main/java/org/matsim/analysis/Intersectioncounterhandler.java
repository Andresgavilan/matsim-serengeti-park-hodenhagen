package org.matsim.analysis;

import org.matsim.api.core.v01.events.LinkEnterEvent;
import org.matsim.api.core.v01.events.handler.LinkEnterEventHandler;

public class Intersectioncounterhandler implements LinkEnterEventHandler {

    public int counter = 0;

    @Override
    public void handleEvent(LinkEnterEvent event) {
        counter++;
    }
}

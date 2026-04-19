package org.matsim.analysis;

import org.matsim.api.core.v01.events.LinkLeaveEvent;
import org.matsim.api.core.v01.events.handler.LinkLeaveEventHandler;

import java.util.HashMap;
import java.util.Map;

public class LinkEventoHandler implements LinkLeaveEventHandler {

    public Map<String, Integer> histogram= new HashMap<>();

//    public static final  Id<Link> linkOfInterest = Id.createLinkId("3622817520002r");
//
//    private final Map<String, Integer> volumes = new HashMap<>();
//
//    Map<String, Integer> getVolumes(){
//        return volumes;
//    }

    @Override
    public void handleEvent(LinkLeaveEvent linkLeaveEvent) {

        var time = linkLeaveEvent.getTime();
        var key = createKey(time);
        histogram.merge(key, 1, Integer::sum);
    }
    private String createKey(double time){
        if (time < 11 * 3600) {
            return "10-11";
        }
        else if (time < 12 * 3600) {
            return "11 - 12";
        }
        else if (time < 13 * 3600) {
            return "12-13";
        }
        else if (time < 14 * 3600) {
            return "13-14";
        }
        else if (time < 15 * 3600) {
            return "14-15";
        }
        else{
            return ">15";
        }
        }
    }

//    private String getKey(double time) {
//        return Integer.toString((int) (time/3600));
//    }
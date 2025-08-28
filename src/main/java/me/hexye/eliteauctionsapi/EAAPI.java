package me.hexye.eliteauctionsapi;

import com.google.common.eventbus.EventBus;

public class EAAPI {
    private static final EventBus EVENT_BUS = new EventBus("EliteAuctionsEventBus");

    public static EventBus getEventBus() {
        return EVENT_BUS;
    }
}

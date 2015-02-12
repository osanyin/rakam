package org.rakam.plugin.realtime;

import com.google.auto.service.AutoService;
import com.google.inject.Binder;
import com.google.inject.multibindings.Multibinder;
import org.rakam.plugin.RakamModule;
import org.rakam.server.http.HttpService;

/**
 * Created by buremba <Burak Emre Kabakcı> on 02/02/15 13:34.
 */
@AutoService(RakamModule.class)
public class RealTimeModule extends RakamModule {

    @Override
    protected void setup(Binder binder) {
        Multibinder<HttpService> multiBinder = Multibinder.newSetBinder(binder, HttpService.class);
        multiBinder.addBinding().to(RealTimeHttpService.class);
//        Multibinder<EventProcessor> eventMappers = Multibinder.newSetBinder(binder, EventProcessor.class);
//        eventMappers.addBinding().to(RealTimeEventProcessor.class);
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public void onDestroy() {

    }
}
package biz.netcentric.simple.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.ComponentContext;
import biz.netcentric.simple.MyService;

@Component(service = { MyService.class })
@Designate(ocd = MyServiceImplConfiguration.class)
public class MyServiceImpl
        implements MyService {

    private MyServiceImplConfiguration configuration;

    public void printHelloWorld() {
        if (configuration.booleanConfiguration()) {
            // output hello world

        }
    }

    /** @see OSGi Compendium 6, 112.5.8 */
    @Activate
    protected void activate(final MyServiceImplConfiguration configuration) {
        this.configuration = configuration;
    }

    /** @see OSGi Compendium 6, 112.5.14 */
    @Deactivate
    protected void deactivate(ComponentContext context) {
    }
}
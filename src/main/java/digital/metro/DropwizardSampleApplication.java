package digital.metro;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import digital.metro.resources.SampleResource;

public class DropwizardSampleApplication extends Application<DropwizardSampleConfiguration> {
    public static void main(String[] args) throws Exception {
        new DropwizardSampleApplication().run(args);
    }

    @Override
    public String getName() {
        return "dropwizard-gradle-sample";
    }

    @Override
    public void initialize(Bootstrap<DropwizardSampleConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(DropwizardSampleConfiguration configuration, Environment environment) {
        final SampleResource resource = new SampleResource();
        environment.jersey().register(resource);
    }

}
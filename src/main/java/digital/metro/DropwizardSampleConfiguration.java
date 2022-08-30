package digital.metro;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

public class DropwizardSampleConfiguration extends Configuration {
    private String databaseURI;

    @JsonProperty
    public String getDatabaseURI() {
        return databaseURI;
    }

    @JsonProperty
    public void setDatabaseURI(String uri) {
        this.databaseURI = uri;
    }
}
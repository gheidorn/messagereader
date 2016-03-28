package demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties()
public class ActiveMQConnectionFactoryProperties {
    private String brokerUrl = "tcp://192.168.99.100:61616";
    private boolean inMemory = true;
    private boolean pooled = false;
    public String getBrokerUrl() {
        if (this.inMemory) {
            return "vm://localhost";
        } else {
            return this.brokerUrl;
        }
    }
}

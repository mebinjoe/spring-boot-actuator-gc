package app.components;

import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.web.WebEndpointResponse;
import org.springframework.boot.actuate.endpoint.web.annotation.EndpointWebExtension;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.boot.actuate.health.HealthStatusHttpMapper;
import org.springframework.stereotype.Component;

@Component
@EndpointWebExtension(endpoint = HealthEndpoint.class)
public class HealthEndpointWebExtension {

    private HealthEndpoint healthEndpoint;
    private HealthStatusHttpMapper statusHttpMapper;

    @ReadOperation
    public WebEndpointResponse<Health> health() {
        Health health = this.healthEndpoint.health();
        Integer status = getStatus(health);
        return new WebEndpointResponse<>(health, status);
    }

    private Integer getStatus(Health health) {
        return this.statusHttpMapper.mapStatus(health.getStatus());
    }

}

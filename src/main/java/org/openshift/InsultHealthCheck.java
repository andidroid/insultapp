package org.openshift;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;
import org.eclipse.microprofile.health.Readiness;

@Health
@Readiness
@Liveness
@ApplicationScoped
public class InsultHealthCheck implements HealthCheck {
    public HealthCheckResponse call() {
        return HealthCheckResponse.named("successful-check").up().build();
    }
}

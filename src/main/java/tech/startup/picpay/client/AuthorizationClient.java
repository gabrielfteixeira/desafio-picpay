package tech.startup.picpay.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import tech.startup.picpay.client.dto.AuthorizationResponse;

@FeignClient(
        url="${client.authorization-service.url}"
)
public interface AuthorizationClient{

    @GetMapping
    ResponseEntity<AuthorizationResponse> isAuthorized();
}

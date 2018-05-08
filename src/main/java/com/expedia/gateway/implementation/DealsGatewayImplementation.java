package com.expedia.gateway.implementation;

import com.expedia.gateway.DealsGateway;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
public class DealsGatewayImplementation implements DealsGateway {
    private static final String SERVICE_URL = "https://offersvc.expedia.com";
    private static final String SERVICE_PATH = "/offers/v2/getOffers";

    @Override
    public String getAllDeals(String userId) {
        return new RestTemplate().getForObject(uri(userId), String.class);
    }

    private URI uri(String userId) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(SERVICE_URL)
                .path(SERVICE_PATH)
                .queryParam("scenario", "deal-finder")
                .queryParam("page", "foo")
                .queryParam("uid", userId)
                .queryParam("productType", "Hotel");
        return builder.build().toUri();
    }
}

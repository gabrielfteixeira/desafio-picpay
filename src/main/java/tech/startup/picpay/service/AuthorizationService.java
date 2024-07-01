package tech.startup.picpay.service;

import tech.startup.picpay.client.AuthorizationClient;
import tech.startup.picpay.entity.Transfer;
import tech.startup.picpay.exception.PicPayException;

public class AuthorizationService {

    private final AuthorizationClient authorizationClient;

    public AuthorizationService(AuthorizationClient authorizationClient){
        this.authorizationClient = authorizationClient;
    }

    public boolean isAuthorized(Transfer transfer){
        var resp = authorizationClient.isAuthorized();

        if(resp.getStatusCode().isError()){
            throw new PicPayException();
        }

        return resp.getBody().authorized()

    }
}

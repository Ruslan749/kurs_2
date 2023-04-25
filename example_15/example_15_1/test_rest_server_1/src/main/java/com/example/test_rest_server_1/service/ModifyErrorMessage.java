package com.example.test_rest_server_1.service;


import com.example.test_rest_server_1.model.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("ModifyErrorMessage")
public class ModifyErrorMessage implements MyModifyService{


    @Override
    public Response modify(Response response) {
        response.setErrorMessage("Что то сломалось");
        return response;
    }
}

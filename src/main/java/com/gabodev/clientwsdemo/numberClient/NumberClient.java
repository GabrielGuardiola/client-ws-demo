package com.gabodev.clientwsdemo.numberClient;

import com.gabodev.clientwsdemo.ws.client.NumberToDollars;
import com.gabodev.clientwsdemo.ws.client.NumberToDollarsResponse;
import com.gabodev.clientwsdemo.ws.client.NumberToWords;
import com.gabodev.clientwsdemo.ws.client.NumberToWordsResponse;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberClient extends WebServiceGatewaySupport {
    public NumberToDollarsResponse getNumberToDollarsConverter(BigDecimal dnum) {
        NumberToDollars request = new NumberToDollars();
        request.setDNum(dnum);

        return (NumberToDollarsResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public NumberToWordsResponse getNumberToWordsConverter(BigInteger ubinum) {
        NumberToWords request = new NumberToWords();
        request.setUbiNum(ubinum);

        return (NumberToWordsResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }
}

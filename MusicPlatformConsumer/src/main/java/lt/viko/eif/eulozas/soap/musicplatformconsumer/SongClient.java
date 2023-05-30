package lt.viko.eif.eulozas.soap.musicplatformconsumer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.example.songs.wsdl.GetSongRequest;
import com.example.songs.wsdl.GetSongResponse;

public class SongClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(SongClient.class);

    public GetSongResponse getSong(String song) {

        GetSongRequest request = new GetSongRequest();
        request.setName(song);

        log.info("Requesting location for " + song);

        GetSongResponse response = (GetSongResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/songs", request,
                        new SoapActionCallback(
                                "http://example.com/songs/GetSongRequest"));

        return response;
    }

}
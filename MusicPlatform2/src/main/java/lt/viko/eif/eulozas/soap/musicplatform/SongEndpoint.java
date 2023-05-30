package lt.viko.eif.eulozas.soap.musicplatform;


import com.example.songs.GetSongResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.songs.GetSongRequest;
import com.example.songs.GetSongResponse;

@Endpoint
public class SongEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/songs";

    private SongRepository songRepository;

    @Autowired
    public SongEndpoint(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSongRequest")
    @ResponsePayload
    public GetSongResponse getSong(@RequestPayload GetSongRequest request) {
        GetSongResponse response = new GetSongResponse();
        response.setSong(songRepository.findSong(request.getName()));

        return response;
    }
}
package lt.viko.eif.eulozas.soap.musicplatformconsumer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.songs.wsdl.GetSongResponse;

@SpringBootApplication
public class ConsumingWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingWebServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(SongClient quoteClient) {
		return args -> {
			String song = "Cool";

			if (args.length > 0) {
				song = args[0];
			}
			GetSongResponse response = quoteClient.getSong(song);
			System.err.println(response.getSong().getGenre());
		};
	}

}
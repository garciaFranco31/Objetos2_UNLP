package ar.edu.info.unlp.ejercicio5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class MediaPlayerTest {
	Media mediaAudio;
	Media mediaVideo;
	VideoStreamAdapter mediaVideoStream;
	
	@BeforeEach
	void setUp() throws Exception {
		mediaAudio = new Audio();
		mediaVideo = new VideoFile();
		mediaVideoStream = new VideoStreamAdapter();
	}
	
    @Test
    public void testReproductor() {
        assertEquals("Playing Audio", mediaAudio.play());
        assertEquals("Playing Video", mediaVideo.play());
        assertEquals("Playing Video Stream", mediaVideoStream.play());
    }
}

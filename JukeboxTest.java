package snhu.jukebox.playlist.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import music.artist.*;
import snhu.jukebox.playlist.Song;

String username = System.getenv("USERNAME");
String password = System.getenv("PASSWORD");

public class JukeboxTest {

	@Test
	public void testGetBeatlesAlbumSize() throws NoSuchFieldException, SecurityException {
		 TheBeatles theBeatlesBand = new TheBeatles();
		 ArrayList<Song> beatlesTracks = new ArrayList<Song>();
		 beatlesTracks = theBeatlesBand.getBeatlesSongs();
		 assertEquals(2, beatlesTracks.size());
	}
	
	@Test
	public void testGetImagineDragonsAlbumSize() throws NoSuchFieldException, SecurityException {
		 ImagineDragons imagineDragons = new ImagineDragons();
		 ArrayList<Song> imagineDragonsTracks = new ArrayList<Song>();
		 imagineDragonsTracks = imagineDragons.getImagineDragonsSongs();
		 assertEquals(3, imagineDragonsTracks.size());
	}
	
	@Test
	public void testGetAdelesAlbumSize() throws NoSuchFieldException, SecurityException {
		 Adele adele = new Adele();
		 ArrayList<Song> adelesTracks = new ArrayList<Song>();
		 adelesTracks = adele.getAdelesSongs();
		 assertEquals(3, adelesTracks.size());
	}
	
	@Test
	public void testGetSlipknotAlbumSize() throws NoSuchFieldException, SecurityException {
		Slipknot slipknot = new Slipknot();
		ArrayList<Song> SlipknotTracks = new ArrayList<Songs>();
		slipknotTracks = slipknot.getSlipknotSongs();
		assertEquals(2, slipknotTracks.size());
	}
	
	@Test
	public void testGetEminemAlbumSize() throws NoSuchFieldException, SecurityException {
		Eminem eminem = new Eminem();
		ArrayList<Song> EminemTracks = new ArrayList<Songs>();
		eminemTracks = eminem.getEminemSongs();
		assertEquals(3, eminemTracks.size());
	}
	
		
	@Test
	public void testGetACDCAlbumSize() throws NoSuchFieldException, SecurityException {
		ACDC acdc = new ACDC();
		ArrayList<Song> ACDCTracks = new ArrayList<Songs>();
		acdcTracks = acdc.getACDCSongs();
		assertEquals(3, acdcTracks.size());
	}

}

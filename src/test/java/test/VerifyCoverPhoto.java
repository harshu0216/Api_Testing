package test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtilities.CoverPhotos;

public class VerifyCoverPhoto extends CoverPhotos{
	@Test
public void Testget() {
	CoverPhotos P1=new CoverPhotos();
	P1.getMethod();
}
	@Test
public void Testpost() throws FileNotFoundException {
	CoverPhotos P2=new CoverPhotos();
	P2.postMethod();
}
	@Test
public void Testput() throws FileNotFoundException {
	CoverPhotos P3=new CoverPhotos();
	P3.putMethod();
}
	@Test
public void Testdelete() {
	CoverPhotos P4=new CoverPhotos();
	P4.deleteMethod();
}
}

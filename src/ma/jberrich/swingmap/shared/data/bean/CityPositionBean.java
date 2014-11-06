package ma.jberrich.swingmap.shared.data.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CityPositionBean implements Serializable {
	
	private double latitude;
	private double longitude;
	
	public double getLatitude() {
		return latitude;
	}
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

}

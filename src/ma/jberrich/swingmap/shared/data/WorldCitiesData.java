package ma.jberrich.swingmap.shared.data;

import java.util.List;

public interface WorldCitiesData {

	public List<String> getCountryList();
	public List<String> getCityList(String country);
	public double[] getPosition(String country, String city);
	
}

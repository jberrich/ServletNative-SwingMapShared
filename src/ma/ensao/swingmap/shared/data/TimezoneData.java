package ma.ensao.swingmap.shared.data;

import java.util.Date;

public interface TimezoneData {

	public String getClientId();
	public void setClientId(String id);
	public Date getDateTimeZoneSystem(double latitude, double longitude);

}

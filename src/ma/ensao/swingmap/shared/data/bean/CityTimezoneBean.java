package ma.ensao.swingmap.shared.data.bean;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class CityTimezoneBean implements Serializable {
	
	private Date datetime;

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

}

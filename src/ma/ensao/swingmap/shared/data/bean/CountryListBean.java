package ma.ensao.swingmap.shared.data.bean;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class CountryListBean implements Serializable {
	
	private List<String> data = null;

	public List<String> getData() {
		return data;
	}

	public void setData(List<String> data) {
		this.data = data;
	}

}

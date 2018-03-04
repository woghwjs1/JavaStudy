package Chapter13;

public class Address {
	//주소 클래스
	private String country;
	private String city;
	
	public Address(String country, String city) {
		this.country = country;
		this.city = city;
	}
	
	public String getCountry() {return country;}
	public String getCity() {return city;}
}

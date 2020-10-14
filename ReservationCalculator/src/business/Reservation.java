package business;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import ui.ReservationCalcApp;
import ui.console.Console;

public class Reservation extends ReservationCalcApp {

	
	private LocalDate arrivalDate;
	private LocalDate departureDate;
	
	
	public Reservation() {
		super();
	}


	public Reservation(LocalDate arrivalDate, LocalDate departureDate) {
		super();
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}


	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}


	public LocalDate getDepartureDate() {
		return departureDate;
	}


	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}
	
	public String getArrivalDateFormatted(){
		String arriveM = "Enter arrival month (1-12) : "+Console.getInt("");
		String arriveD = "Enter arrivial day (1-31) : "+Console.getInt("");
		String arriveY = "Enter arrival year: "+Console.getInt("");
		String arrive = arriveM+"\n"+arriveD+"\n"+ arriveY;
		return getArrivalDateFormatted();
}
	public String getDepartureDateFormatted() {
		String departM = "Enter departure month (1-12) : "+Console.getInt("");
		String departD = "Enter departure day (1-31) : "+Console.getInt("");
		String departY = "Enter departure year: "+Console.getInt("");
		String depart = departM+"\n"+ departD+"\n"+ departY;
		return depart;
	}
	public int getNumberOfNights() {
	int NumberOfNights = (int)ChronoUnit.DAYS.between(getArrivalDate(),getDepartureDate());	
	return NumberOfNights;
		
	}
	public String getPricePerNights() {
		String pricePerNights = "Price: $145.00 per night";
				return pricePerNights;
		
	}
	public double getTotalPrice() {
		double totalprice = 145.00 * getNumberOfNights();
		return totalprice;
	}
	public String getTotalPriceFormatted() {
		String tpf = "Total Price: "+getTotalPrice()+"for "+getNumberOfNights()+"number of nights";
		return tpf; 
	}
	
	
	
	
}

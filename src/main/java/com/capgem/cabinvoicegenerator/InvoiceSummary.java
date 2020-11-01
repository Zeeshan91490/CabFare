package com.capg.cabinvoicegenerator;

public class InvoiceSummary {

	private int numOfRides;
	private double totalFare;
	private double averageFare;

	public InvoiceSummary(int numOfRides, double totalFare) {
		this.numOfRides = numOfRides;
		this.totalFare = totalFare;
		this.averageFare = totalFare / numOfRides;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceSummary other = (InvoiceSummary) obj;
		if (Double.doubleToLongBits(averageFare) != Double.doubleToLongBits(other.averageFare))
			return false;
		if (numOfRides != other.numOfRides)
			return false;
		if (Double.doubleToLongBits(totalFare) != Double.doubleToLongBits(other.totalFare))
			return false;
		return true;
	}
}

Ride [ZEESHAN]edit : edited to match the new requirements of normal and premium customer.

package com.capg.cabinvoicegenerator;

public class Ride {
	public double distance;
	public final int time;
	public CabRide cabRide;

	public Ride(CabRide cabRide, double distance, int time) {
		this.distance = distance;
		this.time = time;
		this.cabRide = cabRide;
	}
}




class MeterCentimeter
{
	private int meter;
	private float centimeter;
	
	MeterCentimeter()
	{
		meter = 0;
		centimeter = 0;
	}
	
	void setMeters(int meter)
	{
		this.meter = meter;
	}
	
	void setCentimeters(float centimeter)
	{
		if (centimeter >= 100)
		{
			int temp =(int)(centimeter / 100);
			centimeter = centimeter - (temp * 100);
			meter += temp;
		}
		this.centimeter = centimeter;
	}
	
	
	void setDistance(int meter, float centimeter)
	{
		setMeters(meter);
		setCentimeters(centimeter);		
	}
	
	
	int getMeters(){return meter;}
	float getCentimeters(){return centimeter;}
	
	void show()
	{
		System.out.println("Meters      : " + meter);
		System.out.println("Centimeters : " + centimeter);
		System.out.println();
	}
}
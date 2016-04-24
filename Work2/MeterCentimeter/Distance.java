class Distance
{
	private  int meter;
	private  float centimeter;
	
	Distance()
	{
		meter=0;
		centimeter=0;
	}
	
	void setMeter(int meter)
	{
		
			this.meter=meter;
	}
	
	void setCentimeter(float centimeter)
	{
		if(centimeter>=100)
		{
			int m=(int)(centimeter/100);
			centimeter=centimeter-(m*100);
			meter+=m;
		}
		this.centimeter=centimeter;
	}
	
	int getMeter()
	{
		return meter;
	}
	
	float getCentimeter()
	{
		return centimeter;
	}
	
	void getDistance(int meter,float centimeter)
	{
		setMeter(meter);
		setCentimeter(centimeter);
	}
	
	void show()
	{
		System.out.println("Meter : "+getMeter());
		System.out.println("Centimeter:"+getCentimeter());
	}
}
class FootInch
{
	private  int foot;
	private float inch;
	
	void setFoot(int foot)
	{
		this.foot=foot;
	}
	
	void setInch(float inch)
	{
		if(inch>=12)
		{
			int f=(int)(inch/12);
			inch=inch-(f*12);
			foot+=f;
		}
		this.inch=inch;
	}
	
	int getFoot()
	{
		return foot;
		
	}
	
	float getInch()
	{
		return inch;
	}
	
	void setDistance(int foot,float inch)
	{
		setFoot(foot);
		setInch(inch);
	}
	
	void show()
	{
		System.out.println("Foot : "+getFoot());
		System.out.println("Inch : "+getInch());
		}
	}

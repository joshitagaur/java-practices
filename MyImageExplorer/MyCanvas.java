import java.awt.*;

class MyCanvas extends Canvas
{
	private String imageFileName;
	
	MyCanvas()
	{
		setBackground(Color.LIGHT_GRAY);
		imageFileName = null;
	}
	
	void showImage(String imageFileName)
	{
		this.imageFileName = imageFileName;
		repaint();
	}
	
	public void paint(Graphics g)
	{
		if (imageFileName != null)
		{
			int canvasWidth = getSize().width;
			int canvasHeight = getSize().height;
			
			Image img = Toolkit.getDefaultToolkit().getImage(imageFileName);
			int imgWidth = img.getWidth(this);
			int imgHeight = img.getHeight(this);
			
			int x = 0;
			int y = 0;
			
			int width = canvasWidth;
			int height = canvasHeight;
			
			
			if (imgWidth <= canvasWidth && imgHeight <= canvasHeight)
			{
				width = imgWidth;
				height = imgHeight;
			}
			else if (imgWidth > canvasWidth)
			{
				height = (canvasWidth * imgHeight) / imgWidth;
				width = canvasWidth;
				if (height > canvasHeight)
				{
					width = (canvasHeight * imgWidth) / imgHeight;
					height = canvasHeight;
				}
			}
			else if (imgHeight > canvasHeight)
			{
				width = (canvasHeight * imgWidth) / imgHeight;
				height = canvasHeight;
				if (width > canvasWidth)
				{
					height = (canvasWidth * imgHeight) / imgWidth;
					width = canvasWidth;
				}
			}
			
			x = (canvasWidth - width) / 2;
			y = (canvasHeight - height) / 2;
			
			g.drawImage(img, x, y, width, height, this);
		}
	}
}
package xirui.Practices;

public class Location {
	public int row;
	public int column;
	public double maxValue;
	
	
	public static Location locateLargest(double[][] a){
		Location location = new Location();
		int i=0,j=0;
		double temp = 0;
		for(i = 0;i<a.length;i++)
			for(j = 0;j<a[i].length;j++)
				if(a[i][j] >= temp){
					temp = a[i][j];
					location.row = i+1;
					location.column = j+1;
				}
				
		location.maxValue = temp; 
		
		return location;
	}
}

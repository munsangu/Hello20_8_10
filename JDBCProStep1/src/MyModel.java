import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.table.AbstractTableModel;

public class MyModel extends AbstractTableModel 
{
	Object [][]data;
	String []columnName;
	
	int rows,cols;
	
	
	public int getRowCount() 
	{
		// TODO Auto-generated method stub
		return data.length;
	}

	public String getColumnName(int column) 
	{
		// TODO Auto-generated method stub
		return columnName[column];
	}


	public int getColumnCount() 
	{
		// TODO Auto-generated method stub
		return columnName.length;
	}

	
	public Object getValueAt(int rowIndex, int columnIndex) 
	{
		// TODO Auto-generated method stub
		return data[rowIndex][columnIndex];
	}
	public void setData(ResultSet rs) 
	{
		try 
		{
			ResultSetMetaData rsmd = null;
			cols=rsmd.getColumnCount();
			columnName=new String[cols];
			for(int i=0;i<cols;i++) 
			{
				columnName[i]=rsmd.getColumnName(i+1);
				data = new Object[rows][cols];
				int r=0, c;
				while(rs.next()) 
				{
					for(c=0;c<cols;c++) 
					{
						data[r][c]=rs.getObject(c+1);
					}
					r++;
				}
			}
			rs.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}

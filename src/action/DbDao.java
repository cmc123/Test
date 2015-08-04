package action;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class DbDao {
	private Connection conn;
	private String driver;
	private String url;
	private String username;
	private String pass;
	
	public DbDao(){}
	public DbDao(String driver,String url,String username,String pass)
	{
		this.driver=driver;
		this.url=url;
		this.username=username;
		this.pass=pass;
	}
	public void setDriver(String driver)
	{
		this.driver=driver;
	}
	public String gerDriver()
	{
		return this.driver;
	}
	public void setUrl(String url)
	{
		this.url=url;
	}
	public String getUrl()
	{
		return this.url;
	}
	public void setUsername(String username)
	{
		this.username=username;
	}
	public String getUsername()
	{
		return this.username;
	}
	public void setPass(String pass)
	{
		this.pass=pass;
	}
	public String getPass()
	{
		return this.pass;
	}
	
	//获取数据库连接
	public Connection getConnection()throws Exception
	{
		if(conn==null)
		{
			Class.forName(this.driver);
			conn=(Connection) DriverManager.getConnection(url,username,this.pass);
		}
		return conn;
	}
	
	//插入记录
	public boolean insert(String sql,Object...args)throws Exception
	{
		PreparedStatement pstmt=(PreparedStatement) getConnection().prepareStatement(sql);
		for(int i=0;i<args.length;i++)
		{
			pstmt.setObject(i+1, args[i]);
		}
		if(pstmt.executeUpdate()!=1)
		{
			return false;
		}
		return true;
	}
	
	//执行查询
	public ResultSet query(String sql,Object...args)throws Exception
	{
		PreparedStatement pstmt=(PreparedStatement) getConnection().prepareStatement(sql);
		for(int i=0;i<args.length;i++)
		{
			pstmt.setObject(i+1, args[i]);
		}
		return pstmt.executeQuery();
	}
	
	//执行修改
	public void modify(String sql,Object...args)throws Exception
	{
		PreparedStatement pstmt=(PreparedStatement) getConnection().prepareStatement(sql);
		for(int i=0;i<args.length;i++)
		{
			pstmt.setObject(i+1, args[i]);
		}
		pstmt.executeUpdate();
		pstmt.close();
	}
	
	//关闭数据库
	public void closeconn()throws Exception
	{
		if(conn!=null&&conn.isClosed())
		{
			conn.close();
		}
	}
}

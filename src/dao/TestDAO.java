package dao;

import java.sql.SQLException;

import beans.Test;

public interface TestDAO {

	public Test getTestById(int idTest) throws SQLException;

}

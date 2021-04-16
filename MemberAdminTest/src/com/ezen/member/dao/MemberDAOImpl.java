package com.ezen.member.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ezen.member.dto.MemberVO;

public class MemberDAOImpl implements MemberDAO {

	private JdbcTemplate jdbcTemplate;

	/*DataSourcefmf 주입*/
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List selectAllMembers() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVO selectMember(String memberid) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertMember(MemberVO member) throws DataAccessException {
		// TODO Auto-generated method stub
	}

	@Override
	public void updateMember(MemberVO member) throws DataAccessException {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteMember(String memberid) throws DataAccessException {
		// TODO Auto-generated method stub
	}

}

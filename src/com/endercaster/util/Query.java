package com.endercaster.util;

import java.util.HashMap;

import com.endercaster.util.impl.QueryInterface;

public class Query implements QueryInterface {

	private StringBuffer where;
	private int limit;
	private int offset;
	private HashMap<String, Integer> orderBy;
	private String indexBy;
	private boolean emulateExecution = false;

	@Override
	public String all() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String one() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public QueryInterface indexBy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QueryInterface where() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QueryInterface andWhere() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QueryInterface orWhere() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QueryInterface filterWhere() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QueryInterface andFilterWhere() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QueryInterface orFilterWhere() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QueryInterface limit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QueryInterface offset() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRawCommand() {
		// TODO Auto-generated method stub
		return null;
	}

}

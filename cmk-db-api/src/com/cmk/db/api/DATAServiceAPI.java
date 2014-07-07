package com.cmk.db.api;

/**
 * @author Life2014
 * 
 */
public interface DATAServiceAPI {
	/**
	 * ------------------------------------------<br>
	 * 1.查询列表数据<br>
	 * 2.查询单条数据<br>
	 * 3.统计列表条数<br>
	 */
	/**
	 * 查询列表数据
	 * 
	 * @param datasource
	 * @param sql
	 */
	void query(String datasource, String sql);

	/**
	 * 查询单条数据<
	 * 
	 * @param datasource
	 * @param sql
	 */
	void queryOne(String datasource, String sql);

	/**
	 * 统计列表条数
	 * 
	 * @param datasource
	 * @param sql
	 */
	void count(String datasource, String sql);

	/**
	 * ------------------------------------------<br>
	 * 1.执行单条SQL<br>
	 * 2.执行多条SQL<br>
	 * 3.执行预编译SQL<br>
	 */
	void execute(String datasource, String sql);

	/**
	 * @param datasource
	 * @param sql
	 */
	void execute(String datasource, String... sql);

	/**
	 * @param datasource
	 * @param sql
	 * @param placeValue
	 */
	void execute(String datasource, String sql, Object[] placeValue);
}

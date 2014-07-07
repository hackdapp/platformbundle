package com.cmk.db.api;

import java.util.List;

import com.cmk.db.api.model.Column;
import com.cmk.db.api.model.Constraint;
import com.cmk.db.api.model.TableDefine;

/**
 * @author Life2014
 * 
 */
public interface DBServiceAPI {
	/**
	 * ************************************************************ <br>
	 * * �ӿ�˵�� * <br>
	 * ************************************************************ <br>
	 * 1.��ӱ�<br>
	 * 
	 * 2.�޸ı�<br>
	 * 
	 * 3.ɾ����<br>
	 * 
	 * 4.��ձ�����<br>
	 * 
	 * 5.���ڿ����?<br>
	 * 
	 * 6.��ѯ��ṹ <br>
	 */

	/**
	 * ������ṹ
	 * 
	 * @param tableCode
	 * @param comment
	 * @param constraint
	 * @param itemList
	 */
	void createTable(String tableCode, String comment, Constraint[] constraint,
			List<Column> itemList);

	/**
	 * �޸ı�ע��
	 * 
	 * @param tableCode
	 * @param comment
	 */
	void commentTable(String tableCode, String comment);

	/**
	 * ɾ����
	 * 
	 * @param tableCode
	 */
	void dropTable(String tableCode);

	/**
	 * ��ձ�����
	 * 
	 * @param tableCode
	 */
	void truncateTable(String tableCode);

	/**
	 * ���ݿ����Ƿ���ڴ˱�?
	 * 
	 * @param tableCode
	 * @return
	 */
	boolean hasTable(String tableCode);

	/**
	 * ��ѯ��ṹ
	 * 
	 * @param tableCode
	 * @return
	 */
	TableDefine queryTable(String tableCode);

	/**
	 * --------------------------------------------------- <br>
	 * 1.������ͼ<br>
	 * 
	 * 2.�޸���ͼ<br>
	 * 
	 * 3.ɾ����ͼ<br>
	 * 
	 * 4.������ͼ<br>
	 * 
	 * 5.��ͼ�ڿ����? <br>
	 */
	/**
	 * ������ͼ
	 * 
	 * @param viewCode
	 * @param sql
	 */
	void createView(String viewCode, String sql);

	/**
	 * �޸���ͼ
	 * 
	 * @param viewCode
	 * @param sql
	 */
	void alterView(String viewCode, String sql);

	/**
	 * ɾ����ͼ
	 * 
	 * @param viewCode
	 */
	void dropView(String viewCode);

	/**
	 * ������ͼ
	 * 
	 * @param viewCode
	 */
	void complieView(String viewCode);

	/**
	 * ��ͼ�ڴ˿����Ƿ����?
	 * 
	 * @param viewCode
	 */
	void hasView(String viewCode);

	/**
	 * ��ѯ��ͼ����
	 * 
	 * @param viewCode
	 * @return
	 */
	String queryView(String viewCode);

	/**
	 * --------------------------------------------------- <br>
	 * 1.����ֶ�<br>
	 * 
	 * 2.�޸��ֶ�<br>
	 * 
	 * 3.ɾ���ֶ�<br>
	 * 
	 * 4.�޸��ֶ�ע��<br>
	 * 
	 * 5.�޸��ֶ�����<br>
	 * 
	 * 6.�ֶ��ڱ��д��ڣ�<br>
	 * 
	 * 7.��ѯ�ֶνṹ <br>
	 * 
	 * 8.��ѯ���ֶ��б�<br>
	 */
	/**
	 * ��ӱ��ֶ�
	 * 
	 * @param tableCode
	 * @param column
	 */
	void addColumn(String tableCode, Column... column);

	/**
	 * �޸ı��ֶ�
	 * 
	 * @param tableCode
	 * @param column
	 */
	void alterColumn(String tableCode, Column column);

	/**
	 * ɾ�����ֶ�
	 * 
	 * @param tableCode
	 * @param columnCode
	 */
	void dropColumn(String tableCode, String... columnCode);

	/**
	 * �޸ı��ֶ�ע��
	 * 
	 * @param tableCode
	 * @param columnCode
	 * @param comment
	 */
	void commentColumn(String tableCode, String columnCode, String comment);

	/**
	 * ���������ֶα���
	 * 
	 * @param tableCode
	 * @param oldColumnCode
	 * @param newColumnCode
	 */
	void reNameColumn(String tableCode, String oldColumnCode,
			String newColumnCode);

	/**
	 * ���ֶ��ڱ����Ƿ����?
	 * 
	 * @param tableCode
	 * @param columnCode
	 * @return
	 */
	boolean hasColumn(String tableCode, String columnCode);

	/**
	 * ��ѯ���ֶζ���
	 * 
	 * @param tableCode
	 * @param columnCode
	 * @return
	 */
	Column queryColumn(String tableCode, String columnCode);

	/**
	 * ��ѯ���ֶ��б�
	 * 
	 * @param tableCode
	 * @return
	 */
	List<Column> queryColumns(String tableCode);

	/**
	 * -------------------------------------------------- <br>
	 * 1.���Լ������<br>
	 * 
	 * 2.�޸�Լ������<br>
	 * 
	 * 3.ɾ��Լ������ <br>
	 * 
	 * 4.��ѯԼ������<br>
	 * 
	 * 5.��ѯԼ�������б�<br>
	 * -------------------------------------------------- <br>
	 */
	/**
	 * ���Լ������
	 * 
	 * @param tableCode
	 *            �����
	 * @param constraint
	 *            Լ����������
	 * @see
	 */
	void addConstraint(String tableCode, Constraint... constraint);

	/**
	 * �޸�Լ������
	 * 
	 * @param tableCode
	 * @param constraintCode
	 * @param constraint
	 */
	void alterConstraint(String tableCode, String constraintCode,
			Constraint constraint);

	/**
	 * ɾ��Լ������
	 * 
	 * @param tableCode
	 *            �����
	 * @param constraintName
	 *            Լ������
	 * @see
	 */
	void dropConstraint(String tableCode, String constraintCode);

	/**
	 * ��ѯԼ������
	 * 
	 * @param tableCode
	 * @param constraintCode
	 * @return
	 */
	Constraint queryConstraint(String tableCode, String constraintCode);

	/**
	 * ��ѯԼ�������б�
	 * 
	 * @param tableCode
	 *            �����
	 * @return TODO
	 * @see
	 */
	Constraint[] queryConstraint(String tableCode);

}

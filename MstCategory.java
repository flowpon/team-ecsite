
package jp.co.internous.team2504.model.domain;

import java.io.Serializable;

/**
 * mst_categoryのドメイン
 * @author インターノウス
 *
 */
public class MstCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String categoryName;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
